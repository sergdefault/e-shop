<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Цымбалюк Сергей
  Date: 13.10.2016
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form:form commandName="category" cssClass="form-horizontal">

    <div class="form-group">
        <label for="title" class="col-sm-2 control-label">Название:</label>
        <div class="col-sm-10">
            <form:input path="title" cssClass="form-control"></form:input>
        </div>
    </div>

    <div class="form-group">
        <label for="description" class="col-sm-2 control-label">Описание:</label>
        <div class="col-sm-10">
            <form:input path="description" cssClass="form-control"></form:input>
        </div>
    </div>


    <div class="form-group">
        <div class="col-sm-10">
            <input type="submit" value="Save" class="btn btn-lg btn-primary"/>
        </div>
    </div>

</form:form>