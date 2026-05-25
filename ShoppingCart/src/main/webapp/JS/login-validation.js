/* ================================================================
   LOGIN FORM VALIDATION — login-validation.js
   ================================================================ */

(function () {

  var RULES = {
    email: {
      pattern: /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/,
      message: 'Enter a valid email address.'
    },
    password: {
      pattern: /^.{1,}$/,
      message: 'Password is required.'
    }
  };

  function getField(id) { return document.getElementById(id); }

  function getError(field) {
    return field.parentElement.querySelector('.field-error');
  }

  function showError(field, msg) {
    field.classList.add('input-error');
    field.classList.remove('input-ok');
    var err = getError(field);
    if (err) { err.textContent = msg; err.style.display = 'flex'; }
  }

  function clearError(field) {
    field.classList.remove('input-error');
    field.classList.add('input-ok');
    var err = getError(field);
    if (err) { err.style.display = 'none'; }
  }

  function validateField(name) {
    var field = getField(name);
    if (!field) return true;
    var val = field.value.trim();
    if (!val) { showError(field, 'This field is required.'); return false; }
    if (!RULES[name].pattern.test(val)) { showError(field, RULES[name].message); return false; }
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
      field.addEventListener('input', function () {
        if (field.classList.contains('input-error') && field.value.trim()) {
          if (RULES[name].pattern.test(field.value.trim())) clearError(field);
        }
      });
    });
  }

  function attachSubmit() {
    var form = document.getElementById('loginForm');
    if (!form) return;
    form.addEventListener('submit', function (e) {
      var allValid = Object.keys(RULES).map(validateField).every(Boolean);
      if (!allValid) {
        e.preventDefault();
        var banner = document.getElementById('validationBanner');
        if (banner) { banner.style.display = 'flex'; setTimeout(function () { banner.style.display = 'none'; }, 4000); }
        var firstBad = Object.keys(RULES).map(getField).find(function (f) { return f && f.classList.contains('input-error'); });
        if (firstBad) { firstBad.focus(); }
      }
    });
  }

  document.addEventListener('DOMContentLoaded', function () {
    injectErrorSpans();
    attachLiveValidation();
    attachSubmit();
  });

})();