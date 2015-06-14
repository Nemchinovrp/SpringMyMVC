<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	<title>Your data</title>
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
</head>
<body class="body">


<p class="p1">Hello "${user.name}"</p>
<p class="p2">Your password is  "${user.password}"</p>
<p class="p3">Your are admin is ${user.admin}<p>


<form method="POST" action="uploadFile" enctype="multipart/form-data"  class="box login">
		File to upload: <input type="file" name="file" ><br /> 
		<input type="submit" value="Upload" > 
		Press here to upload the file!
	</form>
</body>
</html>
