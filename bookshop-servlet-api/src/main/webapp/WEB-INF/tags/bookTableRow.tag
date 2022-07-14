<%@ tag trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<%@ attribute name="book" required="true" type="com.es.bookshop.book.Book"%>--%>

<tr>
    <td>
        <img src="<c:url value='/images/AnnaKareninaBook.jpg'/>">
    </td>
    <td class="description-td">
        <table>
            <tr>
                <td>
                    Author:
                </td>
                <td>
                    Lev Tolstoy
                </td>
            </tr>
            <tr>
                <td>
                    Language:
                </td>
                <td>
                   Russian
                </td>
            </tr>
            <tr>
                <td>
                    Publishing house:
                </td>
                <td>
                    "Azbuka"
                </td>
            </tr>
            <tr>
                <td>
                    Number of pages:
                </td>
                <td>
                    832
                </td>
            </tr>
        </table>
        <p>Anna Karenina is the best novel about a woman written in the 19th century.
            This is a novel about the tragic love of a married lady Anna Karenina and
            a brilliant officer Alexei Vronsky against the backdrop of a happy family
            life of the nobles Konstantin Levin and Kitty Shcherbatskaya.</p>
    </td>
    <td>13 $</td>
</tr>