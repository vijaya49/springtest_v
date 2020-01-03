<!DOCTYPE html>
<html>
<head>
    <title>Employee</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<h2>List of Employees</h2>

<table>
    <tr>
        <th>No</th>
        <th>Name</th>
        <th>Dept</th>
        <th>Desig</th>
        <th>Loc</th>
        <th>Sal</th>
    </tr>

    <#list empList as emp>
    <tr>
        <td>${emp.empno}</td>
        <td>${emp.empname}</td>
        <td>${emp.dept}</td>
        <td>${emp.desig}</td>
        <td>${emp.loc}</td>
        <td>${emp.empsal}</td>
    </tr>
</#list>
</table>
</body>
</html>
