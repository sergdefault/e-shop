<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <style type="text/css">
        #sidebar {
            width: 200px;
            float: left;
            padding-right: 25px;
        }

        #container {
            width: 100%;
        }
    </style>

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
    <title><tiles:getAsString name="title"/></title>
</head>
<body>
<div class="container">
    <%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>

    <tilesx:useAttribute name="current"></tilesx:useAttribute>

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
                    <li class="${current == 'index' ? 'active' :''}"><a href="<spring:url value="/"/> ">Магазин</a></li>
                    <li class="${current == 'about' ? 'active' :''}"><a href="<spring:url value="/about.html"/>">О нас</a></li>
                    <li class="${current == 'register' ? 'active' :''}"><a href="<spring:url value="/register.html"/>">Регистрация</a></li>
                    <li class="${current == 'register' ? 'active' :''}"><a href="<spring:url value="/login.html"/>">Войти</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
    </nav>
    <div class="row">
        <div class="col-md-2">
            <div id="sidebar">
                <ul class="nav nav-pills nav-stacked">
                    <tiles:insertAttribute name="admin_menu"/>
                    <br><br>
                </ul>
            </div>
        </div>
        <div class="col-md-9">
            <div id="container">
                <tiles:insertAttribute name="body"/>
                <br><br>
            </div>
        </div>

    </div>
</div>
<footer>
    <center>
        <tiles:insertAttribute name="footer"/>
    </center>
</footer>
</div>

</body>
</html>