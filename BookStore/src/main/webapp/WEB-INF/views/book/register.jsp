<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <h3>도서등록</h3>
    <a href="/BookStore">처음으로</a>
    <a href="/BookStore/book/list">도서목록</a>
    <form action="/BookStore/book/register" method="post">
      <table border="1">
        <tr>
          <td>도서명</td>
          <td><input type="text" name="bookName"/></td>
        </tr>
        <tr>
          <td>출판사</td>
          <td><input type="text" name="publisher"/></td>
        </tr>
        <tr>
          <td>가격</td>
          <td><input type="text" name="price"/></td>
        </tr>
        <tr>
          <td colspan="2" align="right"><input type="submit" value="등록" /></td>
        </tr>
      </table>
    </form>
  </body>
</html>
