/* ================================================================
   CHECKOUT FORM VALIDATION — checkout-validation.js
   Validates all delivery fields before proceeding to payment.
   ================================================================ */

(function () {

  // ── Field-level validators ──────────────────────────────────────

  const RULES = {
    fullName: {
      pattern: /^[A-Za-z\u0900-\u097F\s]{2,60}$/,
      message: "Please enter your full name (letters only, min 2 chars)."
    },
    phone: {
      pattern: /^(\+91[\s-]?)?[6-9]\d{9}$/,
      message: "Enter a valid 10-digit Indian mobile number."
    },
    email: {
      pattern: /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/,
      message: "Enter a valid email address."
    },
    address: {
      pattern: /^.{5,120}$/,
      message: "Street address must be at least 5 characters."
    },
    city: {
      pattern: /^[A-Za-z\u0900-\u097F\s]{2,40}$/,
      message: "Enter a valid city name."
    },
    pincode: {
      pattern: /^[1-9][0-9]{5}$/,
      message: "Enter a valid 6-digit Indian pincode."
    }
  };

  // ── Helpers ─────────────────────────────────────────────────────

  function getField(name) {
    return document.querySelector('.delivery-form [name="' + name + '"]');
  }

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
    if (!val) {
      showError(field, 'This field is required.');
      return false;
    }
    if (!rule.pattern.test(val)) {
      showError(field, rule.message);
      return false;
    }
    clearError(field);
    return true;
  }

  // ── Shake animation on error ─────────────────────────────────────

  function shakeElement(el) {
    el.classList.remove('shake');
    void el.offsetWidth; // reflow
    el.classList.add('shake');
  }

  // ── Inline error elements injection ─────────────────────────────

  function injectErrorSpans() {
    Object.keys(RULES).forEach(function (name) {
      var field = getField(name);
      if (!field) return;
      // Wrap label + input in a div if not already
      var wrapper = field.parentElement;
      if (!wrapper.querySelector('.field-error')) {
        var span = document.createElement('span');
        span.className = 'field-error';
        span.setAttribute('aria-live', 'polite');
        field.insertAdjacentElement('afterend', span);
      }
    });
  }

  // ── Live validation on blur ──────────────────────────────────────

  function attachLiveValidation() {
    Object.keys(RULES).forEach(function (name) {
      var field = getField(name);
      if (!field) return;

      field.addEventListener('blur', function () {
        validateField(name);
      });

      field.addEventListener('input', function () {
        // Clear error while user is typing (after first blur)
        if (field.classList.contains('input-error')) {
          var val = field.value.trim();
          if (val && RULES[name].pattern.test(val)) {
            clearError(field);
          }
        }
      });
    });
  }

  // ── Proceed-to-Payment button interception ───────────────────────

  function attachProceedButton() {
    var btn = document.getElementById('proceedBtn');
    if (!btn) return;

    btn.addEventListener('click', function (e) {
      e.preventDefault();

      var allValid = true;
      var firstInvalidField = null;

      Object.keys(RULES).forEach(function (name) {
        var ok = validateField(name);
        if (!ok) {
          allValid = false;
          if (!firstInvalidField) firstInvalidField = getField(name);
        }
      });

      if (!allValid) {
        if (firstInvalidField) {
          shakeElement(firstInvalidField.closest('.field-group') || firstInvalidField);
          firstInvalidField.focus();
          firstInvalidField.scrollIntoView({ behavior: 'smooth', block: 'center' });
        }
        // Show top banner
        var banner = document.getElementById('validationBanner');
        if (banner) {
          banner.style.display = 'flex';
          setTimeout(function () { banner.style.display = 'none'; }, 4000);
        }
        return;
      }

      // All valid — redirect to payment page (original behaviour)
      window.location.href = 'payment.jsp';
    });
  }

  // ── Progress dots (visual feedback) ─────────────────────────────

  function updateProgress() {
    var filled = 0;
    var total = Object.keys(RULES).length;
    Object.keys(RULES).forEach(function (name) {
      var field = getField(name);
      if (field && field.value.trim() && RULES[name].pattern.test(field.value.trim())) filled++;
    });
    var bar = document.getElementById('formProgressBar');
    if (bar) {
      var pct = Math.round((filled / total) * 100);
      bar.style.width = pct + '%';
      bar.setAttribute('aria-valuenow', pct);
    }
    var label = document.getElementById('formProgressLabel');
    if (label) {
      label.textContent = filled + ' / ' + total + ' fields completed';
    }
  }

  function attachProgressTracking() {
    Object.keys(RULES).forEach(function (name) {
      var field = getField(name);
      if (field) field.addEventListener('input', updateProgress);
    });
  }

  // ── Init ─────────────────────────────────────────────────────────

  document.addEventListener('DOMContentLoaded', function () {
    injectErrorSpans();
    attachLiveValidation();
    attachProceedButton();
    attachProgressTracking();
  });

})();