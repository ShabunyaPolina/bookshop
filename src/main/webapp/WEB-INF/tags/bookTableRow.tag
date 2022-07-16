<%@ tag trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<%@ attribute name="product" required="true" type="com.es.bookshop.product.book.Book" %>

<form>
    <tr>
        <td>
            <img src="<c:url value='${product.imageUrl}'/>" alt="product">
        </td>
        <td class="description-td">
            <table>
                <tr>
                    <td> Name:</td>
                    <td>
                        <a href="${pageContext.servletContext.contextPath}/books/${product.code}?id=${product.id}">
                            ${product.name} 
                        </a>
                    </td>
                </tr>
                <tr>
                    <td> Author:</td>
                    <td> ${product.author} </td>
                </tr>
                <tr>
                    <td> Language:</td>
                    <td> ${product.language} </td>
                </tr>
                <tr>
                    <td> Publishing house:</td>
                    <td> "${product.publishingHouse}"</td>
                </tr>
                <tr>
                    <td> Number of pages:</td>
                    <td> ${product.numberOfPages} </td>
                </tr>
            </table>
            <p> ${product.description} </p>
        </td>
        <td> ${product.price.value} <span> </span> ${product.price.currency} </td>
    </tr>
</form>

</html>
