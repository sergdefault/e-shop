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
    <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
            <a href="<spring:url value="/product/${product.id}.html"/>">
                <img class="media-object" src="/img/${product.imgName}.png" alt="...">
            </a>
            <div class="caption">
                <h3>${product.title}</h3>
                <p>${product.description}</p>
                <p><a href="<spring:url value="/product/${product.id}.html"/>" class="btn btn-primary" role="button">Просмотреть</a> </p>
                <p><a href="<spring:url value="#"/>" class="btn btn-success" role="button">В Корзину</a> </p>
            </div>
        </div>
    </div>
</c:forEach>