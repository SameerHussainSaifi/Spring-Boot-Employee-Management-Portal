<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management Portal</title>

<link rel="stylesheet" type="text/css" href="/css/style.css">

</head>

<body>

<div class="container">

<h1>Employee Management Portal</h1>

<form action="/employee/save" method="post">

<div class="form-group">
<label>Employee ID</label>
<input type="number" name="employeeId" required>
</div>

<div class="form-group">
<label>Name</label>
<input type="text" name="name" required>
</div>

<div class="form-group">
<label>Email</label>
<input type="email" name="email" required>
</div>

<div class="form-group">
<label>Department</label>
<input type="text" name="department" required>
</div>

<div class="form-group">
<label>Designation</label>
<input type="text" name="designation" required>
</div>

<div class="form-group">
<label>Salary</label>
<input type="number" step="0.01" name="salary" required>
</div>

<div class="form-group">
<label>Phone</label>
<input type="text" name="phone" required>
</div>

<button type="submit">Save Employee</button>

</form>

</div>

</body>
</html>