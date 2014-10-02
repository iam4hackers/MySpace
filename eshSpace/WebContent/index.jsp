<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome</title>
</head>
<body>


<form action="UploadDownloadFileServlet" method="post" enctype="multipart/form-data">

<% java.util.Date d = new java.util.Date(); %>
<h1>
Today's date is <%= d.toString() %> </h1>

Select File to Upload to eswa server:<input type="file" name="fileName">
<br>
<input type="submit" value="Upload">

 
</form>


</body>
</html>