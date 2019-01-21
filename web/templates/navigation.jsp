<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <nav class="navbar navbar-expand-sm navbar-dark bg-dark mb-3">
        <a href="#" class="navbar-brand">JDKS Club</a>

        <ul class="navbar-nav mr-auto">

            <li class="nav-item">
                <!-- utilisation d'un test ternaire (voir google ) -->
                <a href="menu" class="nav-link ${nav==1 ? 'active' :    ''}">Menu</a>
            </li>
        </ul>

        <ul class="navbar-nav">
            <li class="nav-item">
                <c:choose>
                    <c:when test="${nav == 0 or nav == null}">
                        <a href="login"class="nav-link active" >Login</a>
                    </c:when>
                    <c:otherwise>
                        <a href="logout"class="nav-link">${nom} Logout</a>
                    </c:otherwise>
                </c:choose>
            </li>
        </ul>
    </nav>
</div>
</body>
</html>
