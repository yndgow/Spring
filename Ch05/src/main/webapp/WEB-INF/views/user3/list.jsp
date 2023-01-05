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
    <style>
        .selector-for-some-widget {
            box-sizing: content-box;
          }
    </style>
    <title>user3::list</title>
</head>
<body>
    <h3>user3 목록</h3>
    <a href="/Ch05/">메인</a>
    <a href="/Ch05/user3/register">user3 등록</a>
    <table class="table" border="1">
        <tr>
            <td>uid</td>
            <td>name</td>
            <td>hp</td>
            <td>age</td>
            <td>manage</td>
        </tr>
        <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.uid}</td>
            <td>${user.name}</td>
            <td>${user.hp}</td>
            <td>${user.age}</td>
            <td>
                <a href="/Ch05/user3/modify?uid=">수정</a>
                <a href="/Ch05/user3/delete?uid=">삭제</a>
            </td>
        </tr>
        </c:forEach>
    </table>

</body>
</html>