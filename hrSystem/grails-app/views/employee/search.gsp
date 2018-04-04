<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Manager Employee Search Supermarket</title>
</head>
<body>
<div class="row">
<h1>Employee Search</h1>
<formset>
<legend>Search for Employees</legend>
<table>
<g:form action="results">
<tr>
<td>Name</td>
<td><g:textField name="fullname"/></td>
</tr>
<tr>
<td>Employee ID</td>
<td><g:textField name="employeeid"/></td>
</tr>
<tr>
<td>Tax Code</td>
<td><g:textField name="taxcode"/></td>
</tr>
<tr>
 <td>Query Type:</td>
 <td><g:radioGroup name="queryType" labels="['And','Or','Not']"
values="['and','or','not']" value="and" >
${it.radio} ${it.label}
 </g:radioGroup>
 </td>
 </tr>
<tr>
 <td/>
 <td>
 <g:submitButton name="search" value="Search"/></td>
 </tr>
 </g:form>
 </table>
 </formset>
</div>
 </body>
</html>
