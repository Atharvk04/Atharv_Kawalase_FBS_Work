<%@ page import="com.shop.model.User" %>
<%
User user = (User) session.getAttribute("user");
if(user == null || !user.getRole().equalsIgnoreCase("admin")) {
    response.sendRedirect("accessDenied.jsp");
    return;
}
String toastRaw = (String) session.getAttribute("toast");
session.removeAttribute("toast");
String toastAttr = (toastRaw != null) ? " data-toast=\"" + toastRaw.replace("\"", "&quot;") + "\"" : "";
%>
<html>
<head>
    <title>Admin Dashboard ElectroHub</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/style.css">
</head>
<body<%= toastAttr %>>

<div class="navbar">
    <h2>&#9881; Admin Panel</h2>
    <span class="navbar-user">&#128100; <%= user.getName() %></span>
    <a href="logout" class="btn-logout">&#128682; Logout</a>
</div>

<div class="dashboard-body">

    <div class="welcome-box">
        <span class="welcome-icon">&#128075;</span>
        <div>
            <h3>Welcome back, <%= user.getName() %>!</h3>
            <p>Manage your products and users from here.</p>
        </div>
    </div>

    <div class="cards-grid">

        <a href="add-product.jsp" class="dash-card card-green">
            <div class="icon">&#10133;</div>
            <h3>Add Product</h3>
            <p>Add a new product to the store</p>
        </a>

        <a href="products" class="dash-card card-blue">
            <div class="icon">&#128230;</div>
            <h3>Manage Products</h3>
            <p>Edit or delete existing products</p>
        </a>

        <a href="viewUsers" class="dash-card card-purple">
            <div class="icon">&#128101;</div>
            <h3>View Customers</h3>
            <p>See all registered customers</p>
        </a>

    </div>
</div>

<script src="<%= request.getContextPath() %>/JS/toast-modal.js"></script>
</body>
</html>