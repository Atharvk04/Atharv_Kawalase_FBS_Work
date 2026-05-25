<%@ page import="java.util.*, com.shop.model.User" %>

<html>
<head>
    <title>Customers</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/style.css">
</head>
<body>

<div class="page-header" style="display:flex;align-items:center;gap:1rem;padding:1.5rem 2rem 0.5rem;">
    <a href="admin-dashboard.jsp" class="btn-back">&#8592; Dashboard</a>
    <h2 style="margin:0;">&#128100; Registered Customers</h2>
</div>

<%
List<User> users = (List<User>) request.getAttribute("users");

// Filter: only show users with role = "Customer"
List<User> customers = new java.util.ArrayList<>();
if (users != null) {
    for (User u : users) {
        if ("Customer".equalsIgnoreCase(u.getRole())) {
            customers.add(u);
        }
    }
}

if (!customers.isEmpty()) {
%>

<div style="padding: 1rem 2rem 3rem;">
    <p class="users-count-badge">
        <strong><%= customers.size() %></strong> customer<%= customers.size() != 1 ? "s" : "" %> registered
    </p>

    <table class="users-table">
        <thead>
            <tr>
                <th>#</th>
                <th>Name</th>
                <th>Email</th>
                <th>Role</th>
            </tr>
        </thead>
        <tbody>
        <%
        int sr = 1;
        for (User u : customers) {
        %>
        <tr>
            <td><%= sr++ %></td>
            <td>
                <div class="user-name-cell">
                    <span class="user-avatar"><%= u.getName().substring(0,1).toUpperCase() %></span>
                    <%= u.getName() %>
                </div>
            </td>
            <td><%= u.getEmail() %></td>
            <td><span class="role-badge role-customer">Customer</span></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>

<% } else { %>

<div class="empty-cart" style="margin-top:3rem;">
    <div class="empty-cart-icon">&#128100;</div>
    <h3>No customers found</h3>
    <p>No users with the "Customer" role have registered yet.</p>
    <a href="admin-dashboard.jsp" class="checkout-btn">Back to Dashboard</a>
</div>

<% } %>

</body>
</html>