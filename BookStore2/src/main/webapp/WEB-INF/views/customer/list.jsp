<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h3>고객목록</h3>
    <a href="/BookStore">처음으로</a>
    <a href="/BookStore/customer/register">고객등록</a>

    <table border="1">
        <tr>
            <th>고객번호</th>
            <th>고객명</th>
            <th>주소</th>
            <th>휴대폰</th>
            <th>관리</th>
        </tr>
		<c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.custId}</td>
            <td>${customer.name}</td>
            <td>${customer.address}</td>
            <td>${customer.phone}</td>
            <td>
                <a href="/BookStore/customer/modify?custId=${customer.custId}">수정</a>
                <a href="/BookStore/customer/delete?custId=${customer.custId}">삭제</a>
            </td>
        </tr>
		</c:forEach>
    </table>
</body>
</html>