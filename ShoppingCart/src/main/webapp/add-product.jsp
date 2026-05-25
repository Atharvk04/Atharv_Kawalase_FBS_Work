<html>
<head>
    <title>Add Product ElectroHub</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>

<div class="navbar">
    <h2>&#9881; Admin Panel</h2>
    <a href="admin-dashboard.jsp" class="btn-back">&#8592; Dashboard</a>
</div>

<div class="form-wrapper">
    <div class="form-card">
        <h2>&#43; Add New Product</h2>

        <form action="addProduct" method="post">

            <div class="form-group">
                <label>Product Name</label>
                <input type="text" name="name" placeholder="e.g. Wireless Headphones" required>
            </div>

            <div class="form-group">
                <label>Description</label>
                <input type="text" name="description" placeholder="Short product description" required>
            </div>

            <div class="form-group">
                <label>Price (Rs.)</label>
                <input type="number" name="price" placeholder="e.g. 1999" required step="0.01">
            </div>

            <div class="form-group">
                <label>Category</label>
                <input type="text" name="category" placeholder="e.g. Electronics" required>
            </div>

            <div class="form-group">
                <label>Quantity</label>
                <input type="number" name="quantity" placeholder="e.g. 50" required>
            </div>

            <div class="form-group">
                <label>Image URL</label>
                <input type="text" name="image" placeholder="https://example.com/image.jpg" required>
            </div>

            <div class="btn-row">
                <button type="submit" class="btn-update">&#43; Add Product</button>
                <a href="admin-dashboard.jsp" class="btn-cancel">&#10005; Cancel</a>
            </div>

        </form>
    </div>
</div>

</body>
</html>