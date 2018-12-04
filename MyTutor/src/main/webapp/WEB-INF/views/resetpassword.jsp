<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html>
<html>
<head>
<title>My Tutor | Reset Password</title>
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <a href="login"><b>My Tutor</b></a>
  </div>
  <!-- /.login-logo -->
  <div class="login-box-body">
    <p class="login-box-msg">Reset Password</p>
	<p class="login-box-msg">${msg}</p>
    <form:form action="${pageContext.request.contextPath}/login/resetpassword"  modelAttribute="resetpassword" method="POST">
      <div class="form-group has-feedback">
        <form:input path="newPassword" cssClass="form-control" placeholder="New Password" />
        
           <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      
      <div class="form-group has-feedback">
        <form:input path="confirmPassword" cssClass="form-control" placeholder="Confirm Password" />
           <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      
       <div class="form-group has-feedback">
        <form:input path="otp" cssClass="form-control" placeholder="otp" />
           <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
       <form:hidden path="mailId"/>
       
      <div class="row">
        
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">Submit</button>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <a href="login.html"><button type="button" class="btn btn-primary btn-block btn-flat">Login</button></a>
        </div>
      </div>
    </form:form>
  </div>
  <!-- /.login-box-body -->
</div>
<!-- /.login-box -->
</body>
</html>
