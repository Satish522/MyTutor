<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html>
<html>
<head>
  <title>My Tutor | Registration Page</title>
  <!-- iCheck -->
  <link rel="stylesheet" href="<c:url value="/resources/plugins/iCheck/square/blue.css"/>">
  <!-- iCheck -->
  <script src="<c:url value="/resources/plugins/iCheck/icheck.min.js"/>"></script>
  <script>
    $(function () {
      $('input').iCheck({
        checkboxClass: 'icheckbox_square-blue',
        radioClass: 'iradio_square-blue',
        increaseArea: '20%' // optional
      });
    });
  </script>
</head>
<body class="hold-transition register-page">
<div class="register-box">
  <div class="register-logo">
    <a href="login"><b>My Tutor</b></a>
  </div>

  <div class="register-box-body">
    <p class="login-box-msg">Register a new membership</p>

    <form:form action="${pageContext.request.contextPath}/home/signup"   modelAttribute="register" method="POST">
      <div class="form-group has-feedback">
        <form:input path="fullName" cssClass="form-control" placeholder="Full Name" />
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <form:input path="emailId" cssClass="form-control" placeholder="Email Id"/>
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <form:password path="password" cssClass="form-control" placeholder="Password" />
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <form:password path="confirmPassword" cssClass="form-control" placeholder="Confirm Password"/>
        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <form:radiobutton path="userType" cssClass="form-control" value="T" label="Teacher" />
        <form:radiobutton path="userType" cssClass="form-control" value="S" label="Student" />
        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
      </div>
      
      
      
      
      
     
      
    
      
      
      <div class="row">
        <div class="col-xs-8">
          <div class="checkbox icheck">
            <label>
              <input type="checkbox"> I agree to the <a href="#">terms</a>
            </label>
          </div>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">Sign Up</button>
        </div>
        <!-- /.col -->
      </div>
    </form:form>

    <div class="social-auth-links text-center">
      <p>- OR -</p>
      <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign up using
        Facebook</a>
      <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-google-plus"></i> Sign up using
        Google+</a>
    </div>

    <a href="${pageContext.request.contextPath}/login/signin.html" class="text-center">I already have a membership</a>
  </div>
  <!-- /.form-box -->
</div>
<!-- /.register-box -->

</body>
</html>
