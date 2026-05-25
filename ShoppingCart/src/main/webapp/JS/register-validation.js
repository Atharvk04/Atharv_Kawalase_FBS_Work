/* ================================================================
   REGISTER FORM VALIDATION — register-validation.js
   ================================================================ */

(function () {

  var RULES = {
    name: {
      pattern: /^[A-Za-z\u0900-\u097F\s]{2,60}$/,
      message: 'Enter your full name (letters only, min 2 characters).'
    },
    email: {
      pattern: /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/,
      message: 'Enter a valid email address.'
    },
    password: {
      pattern: /^.{6,}$/,
      message: 'Password must be at least 6 characters.'
    },
    confirmPassword: {
      pattern: null, // custom check
      message: 'Passwords do not match.'
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
    var rule = RULES[name];

    if (!val) { showError(field, 'This field is required.'); return false; }

    if (name === 'confirmPassword') {
      var pw = getField('password');
      if (pw && val !== pw.value.trim()) {
        showError(field, rule.message);
        return false;
      }
    } else if (!rule.pattern.test(val)) {
      showError(field, rule.message);
      return false;
    }

    clearError(field);
    return true;
  }

  function injectErrorSpans() {
    Object.keys(RULES).forEach(function (name) {
      var field = getField(name);
      if (!field) return;
      if (!field.parentElement.querySelector('.field-error')) {
        var span = document.createElement('span');
        span.className = 'field-error';
        field.insertAdjacentElement('afterend', span);
      }
    });
  }

  function attachLiveValidation() {
    Object.keys(RULES).forEach(function (name) {
      var field = getField(name);
      if (!field) return;
      field.addEventListener('blur', function () { validateField(name); });
      field.addEventListener('input', function () {
        if (field.classList.contains('input-error')) {
          var val = field.value.trim();
          if (name === 'confirmPassword') {
            var pw = getField('password');
            if (pw && val === pw.value.trim()) clearError(field);
          } else if (val && RULES[name].pattern && RULES[name].pattern.test(val)) {
            clearError(field);
          }
        }
      });
    });
  }

  function shakeField(field) {
    var el = field.parentElement || field;
    el.classList.remove('shake');
    void el.offsetWidth;
    el.classList.add('shake');
  }

  function attachSubmit() {
    var form = document.getElementById('registerForm');
    if (!form) return;
    form.addEventListener('submit', function (e) {
      e.preventDefault();
      var allValid = true;
      var firstBad = null;
      Object.keys(RULES).forEach(function (name) {
        var ok = validateField(name);
        if (!ok) { allValid = false; if (!firstBad) firstBad = getField(name); }
      });
      if (!allValid) {
        var banner = document.getElementById('validationBanner');
        if (banner) { banner.style.display = 'flex'; setTimeout(function () { banner.style.display = 'none'; }, 4000); }
        if (firstBad) { shakeField(firstBad); firstBad.focus(); firstBad.scrollIntoView({ behavior: 'smooth', block: 'center' }); }
        return;
      }
      form.submit();
    });
  }

  document.addEventListener('DOMContentLoaded', function () {
    injectErrorSpans();
    attachLiveValidation();
    attachSubmit();
  });

})();