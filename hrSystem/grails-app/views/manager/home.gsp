<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket</title>
</head>
<body>
 <asset:stylesheet src="home.css" />   

    <div id="content" role="main">
   <div class="row">

<div class="first">
<h3>Employee Management</h3>
<p> Add a paragraph of placeholder text(e.g. lorem ipsum….)</p>
<button type="button" class="btn btn-success">
<g:link controller="employee" action="create">Add Employee</g:link>
</button>
</div>

<div class="second">
<h3>Team Leader Management</h3>
<p>Add a paragraph of placeholder text(e.g. lorem ipsum….) </p>
<button type="button" class="btn btn-success">
<g:link controller="teamleader" action="create">Add Team Leader</g:link>
</button>
</div>

<div class="first">
<h3>Team Management</h3>
<p>Add a paragraph of placeholder text(e.g. lorem ipsum….) </p>
<button type="button" class="btn btn-success">
<g:link controller="team" action="create">Add Team</g:link>
</button>
</div>

<div class="second">
<h3>Employee Management</h3>
<p> Add a paragraph of placeholder text(e.g. lorem ipsum….)</p>
<button type="button" class="btn btn-success">
<g:link controller="employee" action="create">Add Employee</g:link>
</button>
</div>

<div class="first">
<h3>Shift Management</h3>
<p> Add a paragraph of placeholder text(e.g. lorem ipsum….)</p>
<button type="button" class="btn btn-success">
<g:link controller="shift" action="create">Add Shift</g:link>
</button>
</div>

<div class="second">
<h3>Search Employee</h3>
<p> </p>
<button type="button" class="btn btn-success">
<g:link controller="employee" action="search">search for employee</g:link>
</button>
</div>


</div>
</div>
</body>
</html>
