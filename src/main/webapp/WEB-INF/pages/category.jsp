<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<form name="HomeForm" action="category.jsp" method="post">
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
                <li><a href="#login.htm">Login</a></li>
                <li><a href="#registration.jsp">Register</a></li>
            </ul>
        </div>
    </nav>
    <div class="form-group">
        <img src="computer.jpg"  width="500" height="600">
        <img src="phone.jpg"  width="500" height="600">
        <img src="tablet.jpg"  width="500" height="600">
    </div>
</form>
</body>
</html>
