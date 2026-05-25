/* ================================================================
   TOAST & MODAL — toast-modal.js
   1. showToast(message, type)  — slide-in notification
   2. Custom confirm modal      — replaces browser confirm()
   ================================================================ */

(function () {

  /* ── TOAST ──────────────────────────────────────────────────── */

  function createToastContainer() {
    var el = document.getElementById('toast-container');
    if (el) return el;
    el = document.createElement('div');
    el.id = 'toast-container';
    document.body.appendChild(el);
    return el;
  }

  window.showToast = function (message, type) {
    // type: 'success' | 'error' | 'cart' | 'info'
    var container = createToastContainer();
    var toast = document.createElement('div');
    toast.className = 'toast toast-' + (type || 'success');
    toast.innerHTML =
      '<span class="toast-icon">' + getIcon(type) + '</span>' +
      '<span class="toast-msg">' + message + '</span>' +
      '<button class="toast-close" onclick="this.parentElement.remove()">&#10005;</button>';
    container.appendChild(toast);

    // Trigger animation
    setTimeout(function () { toast.classList.add('toast-show'); }, 10);

    // Auto dismiss after 3.5s
    setTimeout(function () {
      toast.classList.remove('toast-show');
      setTimeout(function () { toast.remove(); }, 400);
    }, 3500);
  };

  function getIcon(type) {
    if (type === 'success') return '&#10003;';
    if (type === 'cart')    return '&#128722;';
    if (type === 'error')   return '&#10005;';
    return '&#8505;';
  }

  /* ── Read toast from data attribute (set by JSP) ─────────────── */

  document.addEventListener('DOMContentLoaded', function () {
    var body = document.body;
    var toastData = body.getAttribute('data-toast');
    if (toastData) {
      var parts = toastData.split('|');
      var type = parts[0];
      var msg  = parts.slice(1).join('|');
      // Small delay so page renders first
      setTimeout(function () { window.showToast(msg, type); }, 200);
    }
  });

  /* ── CUSTOM CONFIRM MODAL ─────────────────────────────────────── */

  function createModal() {
    if (document.getElementById('confirm-modal')) return;
    var overlay = document.createElement('div');
    overlay.id = 'confirm-modal';
    overlay.className = 'confirm-overlay';
    overlay.innerHTML =
      '<div class="confirm-box">' +
        '<div class="confirm-icon" id="confirm-icon">&#9888;</div>' +
        '<h3 class="confirm-title" id="confirm-title">Are you sure?</h3>' +
        '<p  class="confirm-msg"  id="confirm-msg"></p>' +
        '<div class="confirm-btns">' +
          '<button class="confirm-btn-cancel" id="confirm-cancel">Cancel</button>' +
          '<button class="confirm-btn-ok"     id="confirm-ok">Confirm</button>' +
        '</div>' +
      '</div>';
    document.body.appendChild(overlay);

    // Close on overlay click
    overlay.addEventListener('click', function (e) {
      if (e.target === overlay) closeModal(false);
    });
  }

  function closeModal(result) {
    var overlay = document.getElementById('confirm-modal');
    if (overlay) {
      overlay.classList.remove('confirm-open');
      setTimeout(function () { overlay.style.display = 'none'; }, 250);
    }
    if (window._confirmCallback) {
      window._confirmCallback(result);
      window._confirmCallback = null;
    }
  }

  /* 
    Usage: shopConfirm({ title, msg, okText, icon }, callback)
    callback(true)  → user clicked OK
    callback(false) → user clicked Cancel
  */
  window.shopConfirm = function (opts, callback) {
    createModal();
    var overlay = document.getElementById('confirm-modal');
    document.getElementById('confirm-title').textContent = opts.title || 'Are you sure?';
    document.getElementById('confirm-msg').textContent   = opts.msg   || '';
    document.getElementById('confirm-icon').innerHTML    = opts.icon  || '&#9888;';

    var okBtn = document.getElementById('confirm-ok');
    okBtn.textContent = opts.okText || 'Confirm';
    okBtn.className = 'confirm-btn-ok ' + (opts.danger ? 'confirm-danger' : '');

    window._confirmCallback = callback;

    overlay.style.display = 'flex';
    setTimeout(function () { overlay.classList.add('confirm-open'); }, 10);

    document.getElementById('confirm-ok').onclick     = function () { closeModal(true); };
    document.getElementById('confirm-cancel').onclick = function () { closeModal(false); };
  };

  /* ── Intercept all data-confirm links/buttons ─────────────────── */
  /*
    Usage on any element:
      data-confirm-title="Delete Product?"
      data-confirm-msg="This cannot be undone."
      data-confirm-ok="Delete"
      data-confirm-danger="true"
      data-confirm-href="/deleteProduct?id=5"   ← for links
  */

  document.addEventListener('DOMContentLoaded', function () {
    document.body.addEventListener('click', function (e) {
      var el = e.target.closest('[data-confirm-title]');
      if (!el) return;
      e.preventDefault();

      var href = el.getAttribute('data-confirm-href') || el.getAttribute('href');

      window.shopConfirm({
        title:  el.getAttribute('data-confirm-title') || 'Are you sure?',
        msg:    el.getAttribute('data-confirm-msg')   || '',
        okText: el.getAttribute('data-confirm-ok')    || 'Confirm',
        icon:   el.getAttribute('data-confirm-icon')  || '&#9888;',
        danger: el.getAttribute('data-confirm-danger') === 'true'
      }, function (confirmed) {
        if (confirmed && href) window.location.href = href;
      });
    });
  });

})();