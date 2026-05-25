<html>
<head>
    <title>Login ElectroHub</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>

<div class="form-wrapper">
    <div class="form-card">
        <h2>&#128274; Welcome Back</h2>

        <div id="validationBanner" class="validation-banner" style="display:none;">
            <span class="banner-icon">&#9888;</span>
            <span>Please fill in all fields correctly.</span>
        </div>

        <form action="login" method="post" id="loginForm" novalidate>

            <div class="field-group">
                <label for="email">Email Address <span class="req-star">*</span></label>
                <input type="email" id="email" name="email" placeholder="rahul@example.com" autocomplete="email">
            </div>

            <div class="field-group">
                <label for="password">Password <span class="req-star">*</span></label>
                <input type="password" id="password" name="password" placeholder="Enter your password" autocomplete="current-password">
            </div>

            <button type="submit">Login &#8594;</button>
        </form>

        <p class="auth-footer">Don't have an account? <a href="register.jsp">Register here</a></p>
    </div>
</div>

<script src="JS/login-validation.js"></script>
</body>
</html>