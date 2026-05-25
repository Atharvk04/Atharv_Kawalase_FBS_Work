/* ================================================================
   PAYMENT FORM VALIDATION — payment-validation.js
   Live card preview + field validation
   ================================================================ */

(function () {

  // ── Live card preview ─────────────────────────────────────────

  function updatePreview() {
    var num    = document.getElementById('cardNumber');
    var name   = document.getElementById('cardName');
    var expiry = document.getElementById('expiry');

    if (num)    document.getElementById('previewNumber').textContent  = num.value.replace(/\D/g,'').replace(/(.{4})/g,'$1 ').trim() || '•••• •••• •••• ••••';
    if (name)   document.getElementById('previewName').textContent    = name.value.toUpperCase()   || 'CARD HOLDER';
    if (expiry) document.getElementById('previewExpiry').textContent  = expiry.value               || 'MM/YY';
  }

  // Auto-format card number with spaces
  function formatCardNumber(e) {
    var val = e.target.value.replace(/\D/g, '').substring(0, 16);
    e.target.value = val.replace(/(.{4})/g, '$1 ').trim();
    updatePreview();
  }

  // Auto-format expiry MM/YY
  function formatExpiry(e) {
    var val = e.target.value.replace(/\D/g, '').substring(0, 4);
    if (val.length >= 3) val = val.substring(0, 2) + '/' + val.substring(2);
    e.target.value = val;
    updatePreview();
  }

  // ── Validation rules ─────────────────────────────────────────

  var RULES = {
    cardNumber: {
      test: function (v) { return v.replace(/\s/g,'').length === 16; },
      message: 'Enter a valid 16-digit card number.'
    },
    cardName: {
      test: function (v) { return /^[A-Za-z\s]{2,50}$/.test(v); },
      message: 'Enter the name as printed on the card.'
    },
    expiry: {
      test: function (v) {
        if (!/^\d{2}\/\d{2}$/.test(v)) return false;
        var parts = v.split('/');
        var mm = parseInt(parts[0]), yy = parseInt(parts[1]);
        if (mm < 1 || mm > 12) return false;
        var now = new Date();
        var fullYear = 2000 + yy;
        return fullYear > now.getFullYear() || (fullYear === now.getFullYear() && mm >= now.getMonth() + 1);
      },
      message: 'Enter a valid expiry date (MM/YY).'
    },
    cvv: {
      test: function (v) { return /^\d{3}$/.test(v); },
      message: 'CVV must be 3 digits.'
    }
  };

  function getField(id) { return document.getElementById(id); }

  function getError(field) {
    return field.parentElement.querySelector('.field-error');
  }

  function showError(field, msg) {
    field.classList.add('input-error'); field.classList.remove('input-ok');
    var err = getError(field);
    if (err) { err.textContent = msg; err.style.display = 'flex'; }
  }

  function clearError(field) {
    field.classList.remove('input-error'); field.classList.add('input-ok');
    var err = getError(field);
    if (err) { err.style.display = 'none'; }
  }

  function validateField(name) {
    var field = getField(name);
    if (!field) return true;
    var val = field.value.trim();
    if (!val) { showError(field, 'This field is required.'); return false; }
    if (!RULES[name].test(val)) { showError(field, RULES[name].message); return false; }
    clearError(field);
    return true;
  }

  function injectErrorSpans() {
    Object.keys(RULES).forEach(function (name) {
      var field = getField(name);
      if (!field || field.parentElement.querySelector('.field-error')) return;
      var span = document.createElement('span');
      span.className = 'field-error';
      field.insertAdjacentElement('afterend', span);
    });
  }

  function attachLiveValidation() {
    Object.keys(RULES).forEach(function (name) {
      var field = getField(name);
      if (!field) return;
      field.addEventListener('blur', function () { validateField(name); });
    });
  }

  function attachSubmit() {
    var form = document.getElementById('paymentForm');
    if (!form) return;
    form.addEventListener('submit', function (e) {
      var allValid = Object.keys(RULES).map(validateField).every(Boolean);
      if (!allValid) {
        e.preventDefault();
        var firstBad = Object.keys(RULES).map(getField).find(function (f) { return f && f.classList.contains('input-error'); });
        if (firstBad) firstBad.focus();
      }
    });
  }

  document.addEventListener('DOMContentLoaded', function () {
    injectErrorSpans();
    attachLiveValidation();
    attachSubmit();

    var numField = getField('cardNumber');
    var expField = getField('expiry');
    var nameField = getField('cardName');

    if (numField)  { numField.addEventListener('input', formatCardNumber); }
    if (expField)  { expField.addEventListener('input', formatExpiry); }
    if (nameField) { nameField.addEventListener('input', updatePreview); }
  });

})();