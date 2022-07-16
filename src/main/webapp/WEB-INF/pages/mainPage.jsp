<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<html>
<head>
    <link href="<c:url value='/styles/main.css'/>" rel="stylesheet" type="text/css">

    <jsp:useBean id="products" type="java.util.List" scope="request"/>

    <title>bookshop</title>
</html>

<body>
<h1>BOOKSHOP</h1>
<p>Hello! :)</p>

<table>
    <thead>
    <th>Book</th>
    <th>Description</th>
    <th>Price</th>
    </thead>
    <tbody>
    <c:forEach var="product" items="${products}">
        <tags:bookTableRow product="${product}"/>
    </c:forEach>
    </tbody>
</table>
</body>

</html>
