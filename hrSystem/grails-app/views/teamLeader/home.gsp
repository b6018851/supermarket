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
<h3>View Employees</h3>
<p> Add a paragraph of placeholder text(e.g. lorem ipsum….)</p>
<button type="button" class="btn btn-success">
<g:link controller="employee" action="list">View Employees</g:link>
</button>
</div>


<div class="second">
<h3>View Teams</h3>
<p>Add a paragraph of placeholder text(e.g. lorem ipsum….) </p>
<button type="button" class="btn btn-success">
<g:link controller="team" action="list">View Teams</g:link>
</button>
</div>


<div class="first">
<h3>Create Task</h3>
<p> Add a paragraph of placeholder text(e.g. lorem ipsum….)</p>
<button type="button" class="btn btn-success">
<g:link controller="task" action="create">Add Task</g:link>
</button>
</div>

<div class="second">
<h3>View Tasks</h3>
<p> Add a paragraph of placeholder text(e.g. lorem ipsum….)</p>
<button type="button" class="btn btn-success">
<g:link controller="task" action="list">View Tasks</g:link>
</button>
</div>

<div class="first">
<h3>tl</h3>
<p> Add a paragraph of placeholder text(e.g. lorem ipsum….)</p>
<button type="button" class="btn btn-success">
<g:link controller="teamleader" action="create">tl</g:link>
</button>
</div>


</div>
</div>
</body>
</html>
