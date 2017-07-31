<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13.07.2017
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet"
          href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Klienci</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Klienci</h1>
            <p>Lista klientów naszego sklepu</p>
        </div>
    </div>
</section>

<section class="container">
    <div class="row">
        <c:forEach items="${customers}" var="customer">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>${customer.name} ${customer.surname}</h3>
                        <p><b>${customer.email} PLN</b></p>
                        <p>Liczba dokonanych zamówień: ${customer.noOfOrdersMade}</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
</body>
</html>
