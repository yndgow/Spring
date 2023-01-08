<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <h3>고객수정</h3>
    <a href="/Store">처음으로</a>
    <a href="/Store/customer/list">고객목록</a>
    <form action="/Store/customer/modify" method="post">
      <table border="1">
        <tr>
          <td>고객번호</td>
          <td><input type="text" name="custId" value="${customer.custId}" readonly/></td>
        </tr>
        <tr>
          <td>고객명</td>
          <td><input type="text" name="name" value="${customer.name}"/></td>
        </tr>
        <tr>
          <td>주소</td>
          <td><input type="text" name="address" value="${customer.address}"/></td>
        </tr>
        <tr>
          <td>휴대폰</td>
          <td><input type="text" name="phone" value="${customer.phone}"/></td>
        </tr>
        <tr>
          <td colspan="2" align="right"><input type="submit" value="수정" /></td>
        </tr>
      </table>
    </form>
  </body>
</html>
