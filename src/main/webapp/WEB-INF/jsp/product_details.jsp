<%--
  Created by IntelliJ IDEA.
  User: Цымбалюк Сергей
  Date: 04.10.2016
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="col-md-10">
    <div id="container" class="col-md-3">
        <div class="media">
            <h4 class="media-heading"> <center>${product.title}</center></h4>
            <img class="media-object" src="/img/${product.imgName}.png" alt="..."/>
        </div>

        <div class="col-md-7">
            <h4 class="media-heading"> <center>${product.description}</center></h4>
        </div>
    </div>
    <div class="col-md-10">
        <h4 class="media-heading"> <center>${product.description}</center></h4>
    </div>
</div>