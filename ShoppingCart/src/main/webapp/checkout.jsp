<%@ page import="java.util.*, com.shop.model.CartItem" %>

<html>
<head>
    <title>Checkout</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/style.css">
</head>
<body>

<h2>Checkout</h2>

<%
List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
double total = 0;

if(cart != null && !cart.isEmpty()){
%>

<div class="checkout-wrapper">

    <!-- Left: Order Summary -->
    <div class="checkout-left">
        <h3 class="section-title">&#128230; Order Summary</h3>

        <%
        for(CartItem item : cart){
            double sub = item.getPrice() * item.getQuantity();
            total += sub;
        %>
        <div class="checkout-item">
            <img src="<%= item.getImage() %>" alt="<%= item.getName() %>">
            <div class="checkout-details">
                <h3><%= item.getName() %></h3>
                <p>Price: <span>Rs. <%= item.getPrice() %></span></p>
                <p>Qty: <span class="qty-badge"><%= item.getQuantity() %></span></p>
            </div>
            <div class="checkout-subtotal">
                Rs. <%= sub %>
            </div>
        </div>
        <%
        }
        %>

        <div class="checkout-total-bar">
            <span>Grand Total</span>
            <strong>Rs. <%= total %></strong>
        </div>

        <a href="viewCart" class="btn-secondary">&#8592; Edit Cart</a>
    </div>

    <!-- Right: Delivery Info -->
    <div class="checkout-right">
        <h3 class="section-title">&#128205; Delivery Details</h3>

        <!-- Validation error banner -->
        <div id="validationBanner" class="validation-banner" style="display:none;">
            <span class="banner-icon">&#9888;</span>
            <span>Please fill in all required fields correctly before proceeding.</span>
        </div>

        <!-- Progress bar -->
        <div class="form-progress-wrap">
            <div class="form-progress-track">
                <div id="formProgressBar" class="form-progress-bar" style="width:0%"
                     aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"></div>
            </div>
            <span id="formProgressLabel" class="form-progress-label">0 / 6 fields completed</span>
        </div>

        <form action="checkout" method="post" class="delivery-form" novalidate>

            <div class="field-group">
                <label for="fullName">Full Name <span class="req-star">*</span></label>
                <input type="text" id="fullName" name="fullName"
                       placeholder="Rahul Sharma" autocomplete="name">
            </div>

            <div class="field-group">
                <label for="phone">Phone Number <span class="req-star">*</span></label>
                <input type="text" id="phone" name="phone"
                       placeholder="+91 98765 43210" autocomplete="tel">
            </div>

            <div class="field-group">
                <label for="email">Email Address <span class="req-star">*</span></label>
                <input type="email" id="email" name="email"
                       placeholder="rahul@example.com" autocomplete="email">
            </div>

            <div class="field-group">
                <label for="address">Street Address <span class="req-star">*</span></label>
                <input type="text" id="address" name="address"
                       placeholder="123, MG Road" autocomplete="street-address">
            </div>

            <div class="field-group">
                <label for="city">City <span class="req-star">*</span></label>
                <input type="text" id="city" name="city"
                       placeholder="Pune" autocomplete="address-level2">
            </div>

            <div class="field-group">
                <label for="pincode">Pincode <span class="req-star">*</span></label>
                <input type="text" id="pincode" name="pincode"
                       placeholder="411001" autocomplete="postal-code" maxlength="6">
            </div>

            <div class="order-total-preview">
                Total Payable: <strong>Rs. <%= total %></strong>
            </div>

            <button type="button" id="proceedBtn" class="checkout-btn full-width-btn">
                Proceed to Payment &#8594;
            </button>

        </form>
    </div>

</div>

<%
} else {
%>

<div class="empty-cart">
    <div class="empty-cart-icon">&#128722;</div>
    <h3>Cart is empty!</h3>
    <p>Add some products before checking out.</p>
    <a href="products" class="checkout-btn">Shop Now</a>
</div>

<%
}
%>

<script src="<%= request.getContextPath() %>/JS/checkout-validation.js"></script>
</body>
</html>