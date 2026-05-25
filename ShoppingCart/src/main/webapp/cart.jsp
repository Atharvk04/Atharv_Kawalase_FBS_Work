<%@ page import="java.util.*, com.shop.model.CartItem" %>
<html>
<head>
    <title>Your Cart ElectroHub</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/style.css">
</head>
<%
String toastRaw = (String) session.getAttribute("toast");
session.removeAttribute("toast");
String toastAttr = (toastRaw != null) ? " data-toast=\"" + toastRaw + "\"" : "";
%>
<body<%= toastAttr %>>

<div class="products-topbar">
    <h2 class="topbar-title">&#128722; Your Cart</h2>
</div>

<%
List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
double total = 0;

if(cart != null && !cart.isEmpty()){
    for(CartItem item : cart){
        double sub = item.getPrice() * item.getQuantity();
        total += sub;
%>

<div class="cart-item">
    <img src="<%= item.getImage() %>" alt="<%= item.getName() %>">
    <div class="cart-item-details">
        <h3><%= item.getName() %></h3>
        <p class="cart-price">Rs. <%= item.getPrice() %></p>
        <p>Qty: <span class="qty-badge"><%= item.getQuantity() %></span></p>
        <p>Subtotal: <strong>Rs. <%= sub %></strong></p>
    </div>
    <a href="#" class="remove-btn"
       data-confirm-title="Remove Item?"
       data-confirm-msg="Remove &quot;<%= item.getName() %>&quot; from your cart?"
       data-confirm-ok="Remove"
       data-confirm-icon="&#128465;"
       data-confirm-danger="true"
       data-confirm-href="removeFromCart?id=<%= item.getProductId() %>">
        &#x2715; Remove
    </a>
</div>

<%
    }
%>

<div class="cart-summary">
    <div class="cart-total">
        <span>Total Amount</span>
        <strong>Rs. <%= total %></strong>
    </div>
    <div class="cart-actions">
        <a href="products" class="btn-secondary">&#8592; Continue Shopping</a>
        <a href="checkout.jsp" class="checkout-btn">Proceed to Checkout &#8594;</a>
    </div>
</div>

<%
} else {
%>

<div class="empty-cart">
    <div class="empty-cart-icon">&#128722;</div>
    <h3>Your cart is empty!</h3>
    <p>Looks like you haven't added anything yet.</p>
    <a href="products" class="checkout-btn">Start Shopping</a>
</div>

<%
}
%>

<script src="<%= request.getContextPath() %>/JS/toast-modal.js"></script>
</body>
</html>