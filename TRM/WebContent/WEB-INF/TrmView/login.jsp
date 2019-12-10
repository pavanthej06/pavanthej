<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial;
  color: white;
  }

.left {
  left: 0;
 
}

.right {
  right: 0;
  
}

.split {
  height: 100%;
  width: 50%;
  position: fixed;
  z-index: 1;
  top: 0;
  overflow-x: hidden;
  padding-top: 20px;
}

.centered {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  text-align: center;
}

.box{
  background:white;
  width:300px;
  border-radius:6px;
  margin: 0 auto 0 auto;
  padding:00px 50px 70px 50px;
  padding-top: 50px;
  border:#2980b9 4px solid;
}
.email{
  background:#ecf0f1;
  border: #ccc 1px solid;
  border-bottom: #ccc 2px solid;
  padding: 8px;
  width:250px;
  color:#AAAAAA;
  margin-top:10px;
  font-size:1em;
  border-radius:4px;
}

.password{
  border-radius:4px;
  background:#ecf0f1;
  border: #ccc 1px solid;
  padding: 8px;
  width:250px;
  font-size:1em;
}

.btn{
  background:#2ecc71;
  width:125px;
  padding-top:5px;
  padding-bottom:5px;
  color:white;
  border-radius:4px;
  border: #27ae60 1px solid;
  
  margin-top:20px;
  margin-bottom:20px;
  float:left;
  margin-left:16px;
  font-weight:800;
  font-size:0.8em;
}

.btn:hover{
  background:#2CC06B; 
}

#btn2{
  float:left;
  background:#3498db;
  width:125px;  padding-top:5px;
  padding-bottom:5px;
  color:white;
  border-radius:4px;
  border: #2980b9 1px solid;
  
  margin-top:20px;
  margin-bottom:20px;
  margin-left:10px;
  font-weight:800;
  font-size:0.8em;
}

#btn2:hover{ 
background:#3594D2; 
}
.centered img {
  width: 150px;
  border-radius: 50%;
}
</style>
</head>
<body>

<div class="split left">
  <div class="centered">
    <img src="/TRM/WebContent/resources/images/html/TRM.png" style="width:350px;height:300px;">
    
   </div>
</div>

<div class="split right">
  <div class="centered">

        <form method="post" action="loginForm">
                <div class="box">
                <img src="/TRM/WebContent/resources/images/html/images.png" style="width:250px;height:50px;">
                <input type="text" name="username" placeholder="User ID" class="email" required/>
                  
                <input type="password" name="userpassword" placeholder="Password" class="email" required/>
	 <!--<input type="submit" value = "Sign In"> -->
                  
                 <a href="#"><div class="btn">Sign In</div></a> 
                
                <a href="#"><div id="btn2">Forgot password</div></a> <!-- End Btn2 -->
                </div>
                </form>
                
  </div>
</div>
     
</body>
</html> 
