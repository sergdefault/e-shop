<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:forEach items="${categories}" var="categori">
    <div class="col-md-4">
        <center><h1>${categori.title}</h1></center>
        <div class="media">
            <div >
                <a href="category/${categori.category_id}">
                    <img class="media-object" src="img/${categori.imgName}.png" alt="...">
                </a>
            </div>
            <div class="media-body">
                <h4 class="media-heading"> <center>${categori.description}</center></h4>
            </div>
        </div>
    </div>
</c:forEach>

