<html>
<head>
    <title>Register ElectroHub</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>

<div class="form-wrapper">
    <div class="form-card">
        <h2>&#128100; Create Account</h2>

        <div id="validationBanner" class="validation-banner" style="display:none;">
            <span class="banner-icon">&#9888;</span>
            <span>Please fix the errors below before registering.</span>
        </div>

        <form action="register" method="post" id="registerForm" novalidate>

            <div class="field-group">
                <label for="name">Full Name <span class="req-star">*</span></label>
                <input type="text" id="name" name="name" placeholder="Rahul Sharma" autocomplete="name">
            </div>

            <div class="field-group">
                <label for="email">Email Address <span class="req-star">*</span></label>
                <input type="email" id="email" name="email" placeholder="rahul@example.com" autocomplete="email">
            </div>

            <div class="field-group">
                <label for="password">Password <span class="req-star">*</span></label>
                <input type="password" id="password" name="password" placeholder="Min 6 characters" autocomplete="new-password">
            </div>

            <div class="field-group">
                <label for="confirmPassword">Confirm Password <span class="req-star">*</span></label>
                <input type="password" id="confirmPassword" name="confirmPassword" placeholder="Re-enter your password">
            </div>

            <button type="submit">Create Account &#8594;</button>
        </form>

        <p class="auth-footer">Already have an account? <a href="login.jsp">Login here</a></p>
    </div>
</div>

<script src="JS/register-validation.js"></script>
</body>
</html>