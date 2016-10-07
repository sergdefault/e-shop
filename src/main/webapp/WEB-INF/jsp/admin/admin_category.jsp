<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<table class="table table-striped">
    <tr>
        <th>ID</th>
        <th>Название</th>
    </tr>
    <c:forEach items="${categories}" var="categori">
        <tr>
            <td><a href="<spring:url value="/admin/category/${categori.category_id}.html"/>">${categori.category_id}</a></td>
            <td><a href="<spring:url value="/admin/category/${categori.category_id}.html"/>">${categori.title}</a></td>
        </tr>
    </c:forEach>
</table>


