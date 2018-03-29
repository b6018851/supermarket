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
<formset>
<legend>Search for Employees(Simple)</legend>
<g:form action="results">
<label for="full_name">Employee Name</label>
<g:textField name="full_name"/>
<g:submitButton name="search" value="Search" />
</g:form>
</formset>
</div>
</body>
</html>
