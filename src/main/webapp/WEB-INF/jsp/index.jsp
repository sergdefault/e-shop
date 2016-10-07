<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:forEach items="${categories}" var="categori">
<div class="col-sm-6 col-md-4">
    <div class="thumbnail">
        <a href="category/${categori.category_id}.html">
            <img class="media-object" src="img/${categori.imgName}.png" alt="...">
        </a>
        <div class="caption">
            <h3>${categori.title}</h3>
            <p>${categori.description}</p>
            <p><a href="category/${categori.category_id}.html" class="btn btn-primary" role="button">Просмотреть</a> </p>
        </div>
    </div>
</div>
</c:forEach>

