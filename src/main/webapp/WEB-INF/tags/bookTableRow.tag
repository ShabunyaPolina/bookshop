<%@ tag trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="book" required="true" type="com.es.bookshop.product.book.Book"%>

<tr>
    <td>
        <img src="<c:url value='${book.imageUrl}'/>">
    </td>
    <td class="description-td">
        <table>
            <tr>
                <td> Name: </td>
                <td> ${book.name} </td>
            </tr>
            <tr>
                <td> Author: </td>
                <td> ${book.author} </td>
            </tr>
            <tr>
                <td> Language: </td>
                <td> ${book.language} </td>
            </tr>
            <tr>
                <td> Publishing house: </td>
                <td> "${book.publishingHouse}" </td>
            </tr>
            <tr>
                <td> Number of pages: </td>
                <td> ${book.numberOfPages} </td>
            </tr>
        </table>
        <p> ${book.description} </p>
    </td>
    <td> ${book.price.value} <span> </span> ${book.price.currency} </td>
</tr>
