<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${categories}" var="categori">
    <tr>
        <li role="presentation"><a href="${categori.category_id}">${categori.title}</a></li>
    </tr>
</c:forEach>


