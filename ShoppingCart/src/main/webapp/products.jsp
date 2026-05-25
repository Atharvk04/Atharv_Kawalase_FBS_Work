<%@ page import="java.util.*, com.shop.model.Product, com.shop.model.CartItem, com.shop.model.User" %>
<html>
<head>
    <title>Products ElectroHub</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/style.css">
</head>
<%
List<CartItem> cartItems = (List<CartItem>) session.getAttribute("cart");
int cartCount = (cartItems != null) ? cartItems.size() : 0;
User user = (User) session.getAttribute("user");
String role = (user != null) ? user.getRole().toUpperCase() : "";

String toastRaw = (String) session.getAttribute("toast");
session.removeAttribute("toast");
String toastAttr = (toastRaw != null) ? " data-toast=\"" + toastRaw.replace("\"", "&quot;") + "\"" : "";
%>
<body<%= toastAttr %>>

<div class="navbar">
    <h2>&#128722; ElectroHub</h2>
    <div class="navbar-right">
        <% if("ADMIN".equals(role)) { %>
            <a href="admin-dashboard.jsp" class="btn-back">&#8592; Dashboard</a>
        <% } else { %>
            <a href="viewCart" class="cart-btn">
                &#128722; Cart
                <% if(cartCount > 0) { %><span class="cart-badge"><%= cartCount %></span><% } %>
            </a>
            <a href="logout" class="btn-logout">Logout</a>
        <% } %>
    </div>
</div>

<h2 class="page-title">
    <% if("ADMIN".equals(role)) { %>&#9881; Manage Products<% } else { %>&#128230; Our Products<% } %>
</h2>

<div class="product-grid">
<%
List<Product> list = (List<Product>) request.getAttribute("productList");
if(list != null && !list.isEmpty()) {
    for(Product p : list) {
%>
<div class="product-card">
    <img src="<%= p.getImage() %>" alt="<%= p.getName() %>">
    <div class="card-body">
        <h3><%= p.getName() %></h3>
        <p><%= p.getDescription() %></p>
        <div class="price">Rs. <%= p.getPrice() %></div>

        <% if("ADMIN".equals(role)) { %>
        <div class="admin-actions">
            <a href="editProduct?id=<%= p.getProductId() %>" class="btn-edit">&#9999; Edit</a>
            <a href="#" class="btn-delete"
               data-confirm-title="Delete Product?"
               data-confirm-msg="Are you sure you want to delete &quot;<%= p.getName() %>&quot;? This cannot be undone."
               data-confirm-ok="Delete"
               data-confirm-icon="&#128465;"
               data-confirm-danger="true"
               data-confirm-href="deleteProduct?id=<%= p.getProductId() %>">
               &#128465; Delete
            </a>
        </div>
        <% } else { %>
        <form action="addToCart" method="post">
            <input type="hidden" name="id"    value="<%= p.getProductId() %>">
            <input type="hidden" name="name"  value="<%= p.getName() %>">
            <input type="hidden" name="price" value="<%= p.getPrice() %>">
            <input type="hidden" name="image" value="<%= p.getImage() %>">
            <div class="qty-row">
                <label>Qty:</label>
                <input type="number" name="quantity" value="1" min="1" class="qty-input">
            </div>
            <button type="submit" class="btn-cart">&#128722; Add to Cart</button>
        </form>
        <% } %>
    </div>
</div>
<% } } else { %>
<div class="no-products">&#128274; No products available.</div>
<% } %>
</div>

<script src="<%= request.getContextPath() %>/JS/toast-modal.js"></script>
</body>
</html>