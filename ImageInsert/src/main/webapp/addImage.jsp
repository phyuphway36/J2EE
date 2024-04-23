<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Image</title>
</head>
<body>
<h1 style=""color:red" align = "center"">Add Image Detail</h1>
<div  align = "center">
<form action="AddImage" class="form-horizontal" role="form" method = "post" enctype="multipart/form-data">
<div class="mb-3">
            <label for="major" class="form-label">Address</label>
            
                <input type="text" id="address" name ="address" placeholder="Address" class="form-control" autofocus>
           
        </div>
        
        
        <div>
	Select Image:
	<input type="file" name = "image">
	<input type="submit" value = "Add Image">
	</div>

</form>
</div>
</body>
</html>