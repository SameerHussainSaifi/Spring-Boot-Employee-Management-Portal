<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Login</title>
    <link rel="stylesheet" type="text/css" href="/css/adminLogin.css">
</head>
<body>
    <div class="login-container">
        <h1>Admin Login</h1>
        <form action="/admin/login" method="post" class="login-form">
            <label>Username</label>
            <input type="text" name="username" placeholder="Enter username" required/>

            <label>Password</label>
            <input type="password" name="password" placeholder="Enter password" required/>

            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>