<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<link href="<c:url value='/styles/main.css'/>" rel="stylesheet" type="text/css">

<h1>BOOKSHOP</h1>
<p>Hello! :)</p>

<table>
    <thead>
    <th>Book</th>
    <th>Description</th>
    <th>Price</th>
    </thead>
    <tbody>
    <tags:bookTableRow/>
    </tbody>
</table>