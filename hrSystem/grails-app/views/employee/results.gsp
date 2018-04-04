<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Manager Employee Search Supermarket</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
 <div class="row">
<h1>Employee Search</h1>
<h3>Search Results</h3>
<p>
 Searched
 for employees matching <em>${term}</em>
 Found <strong>${employees.size()}</strong> employees.
</p>
<ul>
 <g:each var="employee" in="${employees}">
 <li><g:link controller="employee" action="show"
id="${employee.employeeid}">${employee.fullname}"</g:link></li>
 </g:each>
 </ul>
<g:link action='search'>Search Again</g:link>
</div>
</body>
</html>











