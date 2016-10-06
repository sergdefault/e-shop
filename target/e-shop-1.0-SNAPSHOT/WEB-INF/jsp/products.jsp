<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Цымбалюк Сергей
  Date: 30.09.2016
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<c:forEach items="${products}" var="product">
<div class="col-md-4">
    <center><h1>${product.title}</h1></center>
    <div class="media">
        <div >
            <a href="<spring:url value="/product/${product.id}.html"/>" >
                <img class="media-object" src="/img/${product.imgName}.png" alt="..."/>  </a>
        </div>
        <div class="media-body">
            <h4 class="media-heading"> <center>${product.description}</center></h4>
        </div>
    </div>
</div>
</c:forEach>