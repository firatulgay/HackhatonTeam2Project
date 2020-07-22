<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<form name="HomeForm" action="product_details.jsp" method="post">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">TechnoMarket</a>
            </div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="#home.jsp">Home</a></li>
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#category.jsp">Category<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#category.jsp">Computer</a></li>
                        <li><a href="#category.jsp">Phone</a></li>
                        <li><a href="#category.jsp">Tablet</a></li>
                    </ul>
                </li>
                <li><a href="#login.jsp">Login</a></li>
                <li><a href="#registration.jsp">Register</a></li>
            </ul>
        </div>
    </nav>
    <div class="form-group">
        <img src="computer.jpg"  width="500" height="600"><br>
        <p>MacBook</p><br>
        <p>Computer</p><br>
        <p>1000$</p>
    </div>
    <div class="form-group">
        <img src="phone.jpg"  width="500" height="600"><br>
        <p>Apple</p><br>
        <p>Phone</p><br>
        <p>750$</p>
    </div>
    <div class="form-group">
        <img src="tablet.jpg"  width="500" height="600"><br>
        <p>Samsung</p><br>
        <p>Tablet</p><br>ğim
        <p>500$</p>
    </div>
</form>
</body>
</html>
