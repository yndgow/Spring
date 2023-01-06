<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
      crossorigin="anonymous"
    ></script>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
      crossorigin="anonymous"
    />
    <title>user3::list</title>
  </head>
  <body>
    <div class="container">
      <div class="text-center">
        <h3>user3 등록</h3>
        <a href="/Ch05/" role="button" class="btn btn-outline-info">메인</a>
        <a href="/Ch05/user3" role="button" class="btn btn-outline-dark">user3 목록</a>
      </div>
      <form action="/Ch05/user3/register" method="post" class="col-6 mx-auto">
        <div class="mb-3">
          <label for="uid" class="form-label">uid</label>
          <input type="text" name="uid" class="form-control" />
        </div>
        <div class="mb-3">
          <label for="name" class="form-label">name</label>
          <input type="text" class="form-control" name="name"/>
        </div>
        <div class="mb-3">
          <label for="hp" class="form-label">hp</label>
          <input type="text" class="form-control" name="hp" />
        </div>
        <div class="mb-3">
          <label for="age" class="form-label">age</label>
          <input type="text" class="form-control" name="age" />
        </div>
        <div class="text-center">
          <input type="submit" value="등록" class="btn btn-success" />
        </div>
      </form>
    </div>
  </body>
</html>