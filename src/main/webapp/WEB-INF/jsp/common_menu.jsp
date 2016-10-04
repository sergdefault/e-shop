<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:forEach items="${categories}" var="categori">
    <tr>
        <%--<li role="presentation"><a href="/page/${categori.title}">${categori.title}</a></li>--%>
        <li role="presentation"><a href="<c:url value="/${categori.category_id}.html"/> ">${categori.title}</a></li>
    </tr>
</c:forEach>


