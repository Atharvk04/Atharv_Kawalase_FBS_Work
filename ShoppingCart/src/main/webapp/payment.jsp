<html>
<head>
    <title>Payment ElectroHub</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>

<div class="navbar">
    <h2>&#128179; ElectroHub</h2>
    <a href="checkout.jsp" class="btn-back">&#8592; Back to Checkout</a>
</div>

<div class="form-wrapper">
    <div class="form-card">
        <h2>&#128274; Secure Payment</h2>

        <!-- Card preview -->
        <div class="payment-card-preview">
            <div style="display:flex;justify-content:space-between;font-size:12px;opacity:0.8;">
                <span id="previewName">CARD HOLDER</span>
                <span id="previewExpiry">MM/YY</span>
            </div>
        </div>

        <form action="payment" method="post" id="paymentForm" novalidate>

            <div class="field-group">
                <label for="cardNumber">Card Number <span class="req-star">*</span></label>
                <input type="text" id="cardNumber" name="cardNumber" maxlength="19" placeholder="1234 5678 9012 3456">
            </div>

            <div class="field-group">
                <label for="cardName">Name of Card <span class="req-star">*</span></label>
                <input type="text" id="cardName" name="cardName" placeholder="MasterCard">
            </div>

            <div style="display:grid;grid-template-columns:1fr 1fr;gap:12px;">
                <div class="field-group">
                    <label for="expiry">Expiry <span class="req-star">*</span></label>
                    <input type="text" id="expiry" name="expiry" maxlength="5" placeholder="MM/YY">
                </div>
                <div class="field-group">
                    <label for="cvv">CVV <span class="req-star">*</span></label>
                    <input type="password" id="cvv" name="cvv" maxlength="3" placeholder="***">
                </div>
            </div>

            <button type="submit" style="margin-top:18px;">&#128274; Pay Now</button>
        </form>
    </div>
</div>

<script src="JS/payment-validation.js"></script>
</body>
</html>