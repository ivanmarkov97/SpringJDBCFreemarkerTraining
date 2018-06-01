<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Add User</h1>
<form name="user" action="/add-user" method="post">
    <input type="text" name="name" placeholder="name">
    <input  type="email" name="email" placeholder="email">
    <input type="number" name="age" placeholder="18">
    <input type="submit" name="create" value="create">
</form>
<a href="/users">users</a>
</body>
</html>