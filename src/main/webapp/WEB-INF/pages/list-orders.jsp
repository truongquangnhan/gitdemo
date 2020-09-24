<%-- 
    Document   : list-orders
    Created on : Aug 20, 2020, 8:37:21 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>JSP Page</title>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table class="table table-dark">
            <thead>
                <tr>
                    <th scope="col">OrderID</th>
                    <th scope="col">OrderDate</th>
                    <th scope="col">Customer Name</th>
                    <th scope="col">View Details</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="order" items="${listOrders}">
                
                <tr>
                    <th scope="row"><c:out value="${order.orderId}"/></th>
                    <td><c:out value="${order.orderDate}"/></td>
                    <td><c:out value="${order.customerName}"/></td>
                    <td><a href="<c:url value="order/detail?orderId=${order.orderId}"/>">ViewDetails</a></td>
                </tr>
               </c:forEach>
            </tbody>
        </table>
    </body>
</html>
