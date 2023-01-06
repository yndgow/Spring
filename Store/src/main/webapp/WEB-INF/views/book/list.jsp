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
    <h3>도서목록</h3>
    <a href="/BookStore">처음으로</a>
    <a href="/BookStore/book/register">도서등록</a>

    <table border="1">
        <tr>
            <th>도서번호</th>
            <th>도서명</th>
            <th>출판사</th>
            <th>가격</th>
            <th>관리</th>
        </tr>
		<c:forEach var="book" items="${books}">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.bookName}</td>
            <td>${book.publisher}</td>
            <td>${book.price}</td>
            <td>
               <a href="/BookStore/book/modify?bookId=${book.bookId}">수정</a>
               <a href="/BookStore/book/delete?bookId=${book.bookId}">삭제</a>
            </td>
        </tr>
		</c:forEach>
    </table>
</body>
</html>