<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Final Invoice</title>
    <style>
        /* Modern Reset & Foundation */
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; }
        
        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 20px;
        }

        /* The Receipt Card */
        .receipt-card {
            background: white;
            width: 100%;
            max-width: 420px;
            padding: 40px;
            border-radius: 24px;
            box-shadow: 0 20px 50px rgba(0,0,0,0.3);
            position: relative;
        }

        h2 {
            text-align: center;
            color: #333;
            text-transform: uppercase;
            letter-spacing: 2px;
            margin-bottom: 30px;
            border-bottom: 2px dashed #eee;
            padding-bottom: 15px;
        }

        /* Item Rows */
        .bill-item {
            display: flex;
            justify-content: space-between;
            margin-bottom: 18px;
            color: #555;
            font-size: 1.1rem;
        }

        /* Total Calculation Area */
        .total-section {
            margin-top: 25px;
            padding-top: 20px;
            border-top: 3px solid #f0f0f0;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .total-label {
            font-size: 1.2rem;
            font-weight: 700;
            color: #222;
        }

        .total-amount {
            font-size: 1.6rem;
            font-weight: 800;
            color: #764ba2;
        }

        /* Action Buttons */
        .btn-print {
            display: block;
            width: 100%;
            text-align: center;
            background: #764ba2;
            color: white;
            padding: 14px;
            border-radius: 10px;
            text-decoration: none;
            margin-top: 30px;
            font-weight: 600;
            transition: all 0.3s ease;
            box-shadow: 0 4px 15px rgba(118, 75, 162, 0.3);
        }

        .btn-print:hover {
            background: #5a3a7e;
            transform: translateY(-2px);
        }

        /* Navigation Links Styling */
        .nav-links {
            margin-top: 25px;
            display: flex;
            justify-content: space-between;
            gap: 15px;
            border-top: 1px solid #eee;
            padding-top: 20px;
        }

        .nav-links a {
            flex: 1;
            text-align: center;
            text-decoration: none;
            font-size: 0.9rem;
            font-weight: 600;
            padding: 10px;
            border-radius: 8px;
            transition: 0.2s;
        }

        .link-home {
            background-color: #f1f5ff;
            color: #667eea;
        }

        .link-home:hover {
            background-color: #e2e9ff;
        }

        .link-logout {
            background-color: #fff1f1;
            color: #e53e3e;
        }

        .link-logout:hover {
            background-color: #ffe5e5;
        }

        /* Print Media Query */
        @media print {
            .btn-print, .nav-links { display: none; }
            body { background: white; }
            .receipt-card { box-shadow: none; border: 1px solid #eee; }
        }
    </style>
</head>
<body>

    <div class="receipt-card">
        <h2>Invoice</h2>

        <% 
            String[] items = (String[]) request.getAttribute("selectedItems");
            if (items != null && items.length > 0) {
                for (String item : items) {
                    int price = 0;
                    String displayName = "";
                    
                    if(item.equalsIgnoreCase("iphone")) { price = 70000; displayName = "iPhone"; }
                    else if(item.equalsIgnoreCase("ipod")) { price = 50000; displayName = "iPod"; }
                    else if(item.equalsIgnoreCase("macBook")) { price = 100000; displayName = "MacBook"; }
        %>
            <div class="bill-item">
                <span><%= displayName %></span>
                <span>₹<%= price %></span>
            </div>
        <% 
                }
            } else {
        %>
            <p style="text-align:center; color:#999;">No items to display.</p>
        <% } %>

        <div class="total-section">
            <span class="total-label">Total Bill</span>
            <span class="total-amount">₹<%= request.getAttribute("totalBill") != null ? request.getAttribute("totalBill") : 0 %></span>
        </div>

        <a href="javascript:window.print()" class="btn-print">Print Receipt</a>

        <div class="nav-links">
            <a href="login.html" class="link-home">Home</a>
            <a href="logout.jsp" class="link-logout">Logout</a>
        </div>
    </div>

</body>
</html>