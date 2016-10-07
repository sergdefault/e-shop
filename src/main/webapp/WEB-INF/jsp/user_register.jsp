<%--
  Created by IntelliJ IDEA.
  User: Цымбалюк Сергей
  Date: 07.10.2016
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ include file="/WEB-INF/layout/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>

    <taglib uri="http://tiles.apache.org/tags-tiles" prefix="spring"/>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>title</title>
</head>
<body>
<div class="container">
    <%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>


    <!-- Static navbar -->
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="<spring:url value="/"/>">e-shop</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="${current == 'index' ? 'active' :''}"><a href="<spring:url value="/"/> ">Home</a></li>
                    <li class="${current == 'about' ? 'active' :''}"><a href="<spring:url value="/about.html"/>">About</a></li>
                    <li class="${current == 'register' ? 'active' :''}"><a href="<spring:url value="/register.html"/>">Register</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
    </nav>

<form:form commandName="user" cssClass="form-horizontal">

    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">Name:</label>
        <div class="col-sm-10">
            <form:input path="name" cssClass="form-control"></form:input>
        </div>
    </div>

    <div class="form-group">
        <label for="email" class="col-sm-2 control-label">Email:</label>
        <div class="col-sm-10">
            <form:input path="email" cssClass="form-control"></form:input>
        </div>
    </div>

    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">Password:</label>
        <div class="col-sm-10">
            <form:password path="password" cssClass="form-control"></form:password>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-10">
            <input type="submit" value="Save" class="btn btn-lg btn-primary"/>
        </div>
    </div>

</form:form>
        </div>

        </body>
</html>