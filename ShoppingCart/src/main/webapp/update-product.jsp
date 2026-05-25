<%@ page import="com.shop.model.Product" %>
<%
Product p = (Product) request.getAttribute("product");
if (p == null) {
    response.sendRedirect("products");
    return;
}
%>
<html>
<head>
    <title>Edit Product ElectroHub</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/style.css">
</head>
<body>

<div class="navbar">
    <h2>&#9881; Admin Panel</h2>
    <a href="products" class="btn-back">&#8592; Products</a>
</div>

<div class="form-wrapper">
    <div class="form-card">
        <h2>&#9999; Edit Product</h2>

        <form action="updateProduct" method="post">
            <input type="hidden" name="id" value="<%= p.getProductId() %>"/>

            <div class="form-group">
                <label>Product Name</label>
                <input type="text" name="name" value="<%= p.getName() %>" required placeholder="Enter product name">
            </div>

            <div class="form-group">
                <label>Description</label>
                <input type="text" name="description" value="<%= p.getDescription() %>" required placeholder="Enter description">
            </div>

            <div class="form-group">
                <label>Price (Rs.)</label>
                <input type="number" name="price" value="<%= p.getPrice() %>" required step="0.01" placeholder="Enter price">
            </div>

            <div class="form-group">
                <label>Category</label>
                <input type="text" name="category" value="<%= p.getCategory() %>" required placeholder="Enter category">
            </div>

            <div class="form-group">
                <label>Quantity</label>
                <input type="number" name="quantity" value="<%= p.getQuantity() %>" required placeholder="Enter quantity">
            </div>

            <div class="form-group">
                <label>Image URL</label>
                <input type="text" name="image" value="<%= p.getImage() %>" required placeholder="Enter image URL">
            </div>

            <div class="btn-row">
                <button type="submit" class="btn-update">&#10003; Update Product</button>
                <a href="products" class="btn-cancel">&#10005; Cancel</a>
            </div>
        </form>
    </div>
</div>

</body>
</html>