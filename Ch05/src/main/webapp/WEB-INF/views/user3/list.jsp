<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <title>user3::list</title>
</head>
<body>
	<div class="container">
	<div class="text-center mb-3">
	    <h3>user3 목록</h3>
	    <a href="/Ch05/" role="button" class="btn btn-outline-info">메인</a>
	    <a href="/Ch05/user3/register" role="button" class="btn btn-outline-dark">user3 등록</a>
    </div>
    <table class="table col-6 text-center" border="1">
        <tr>
            <td class="col-2">uid</td>
            <td class="col-2">name</td>
            <td class="col-3">hp</td>
            <td class="col-2">age</td>
            <td class="col-3">manage</td>
        </tr>
        <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.uid}</td>
            <td>${user.name}</td>
            <td>${user.hp}</td>
            <td>${user.age}</td>
            <td>
                <a href="/Ch05/user3/modify?uid=${user.uid}">수정</a>
                <a href="/Ch05/user3/delete?uid=${user.uid}">삭제</a>
            </td>
        </tr>
        </c:forEach>
    </table>
	</div>
</body>
</html>