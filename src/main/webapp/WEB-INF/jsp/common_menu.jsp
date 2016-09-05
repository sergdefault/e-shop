<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${categories}" var="categori">
    <tr>
        <li role="presentation"><a href="#">${categori.title}</a></li>
    </tr>
</c:forEach>
<%--<li role="presentation"><a href="#">Home</a></li>--%>
<%--<li role="presentation"><a href="#">Profile</a></li>--%>
<%--<li role="presentation"><a href="#">Messages</a></li>--%>
<%--<li role="presentation"><a href="#">Messages</a></li>--%>
<%--<li role="presentation"><a href="#">Messages</a></li>--%>

