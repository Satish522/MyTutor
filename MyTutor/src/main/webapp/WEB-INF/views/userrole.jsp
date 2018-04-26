<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ taglib prefix="spring" uri="/WEB-INF/spring.tld" %> --%>
<!DOCTYPE html>
<html>
<head>
   
  <!-- DataTables -->
  <link rel="stylesheet" href="<c:url value="/resources/bower_components/datatables.net-bs/css/dataTables.bootstrap.min.css" />" >
  
  <!-- DataTables -->
  <script src="<c:url value="/resources/bower_components/datatables.net/js/jquery.dataTables.min.js" />"></script>
  <script src="<c:url value="/resources/bower_components/datatables.net-bs/js/dataTables.bootstrap.min.js"/>"></script>
  <script>
  $(function () {
    $('#example1').DataTable()
    $('#example2').DataTable({
      'paging'      : true,
      'lengthChange': false,
      'searching'   : false,
      'ordering'    : true,
      'info'        : true,
      'autoWidth'   : false
    })
  })
</script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        User Role
        <small>Master entry management can be done here like save , edit and delete</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">User Role</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- Default box -->
      <div class="box box-primary">
        <div class="box-header with-border">
          <h3 class="box-title">Manage User Role</h3>

          <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="tooltip"
                    title="Collapse">
              <i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove" data-toggle="tooltip" title="Remove">
              <i class="fa fa-times"></i></button>
          </div>
        </div>
        <div class="box-body">
          Hey, Do you want save User Role !!!!
            <!-- /.box-header -->
            <!-- form start -->
            <form role="form">
              <div class="box-body">
                <div class="form-group">
                  <label for="userrole">User Role</label>
                  <input type="text" class="form-control" id="userrole" placeholder="User Role">
                </div>
                <div class="form-group">
                  <label for="previlege">Previlege</label>
                  <input type="text" class="form-control" id="previlege" placeholder="Previlege">
                </div>
              </div>
              <!-- /.box-body -->
              <div class="form-group">
                <button type="submit" class="btn btn-primary">Submit</button>
              </div>
            </form>
          	
          	
        </div>
        <!-- /.box-body -->
        <div class="box-footer">
          Master Entry
        </div>
        <!-- /.box-footer-->
      </div>
      <!-- /.box -->
       <div class="row">
        <div class="col-xs-12">
		<div class="box">
            <div class="box-header">
              <h3 class="box-title">Data Table With Full Features</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example1" class="table table-bordered table-striped">
                <thead>
                <tr>
                  <th>User Role Id</th>
                  <th>User Role</th>
                  <th>Privileges</th>
                  <th>Action</th>
                  
                </tr>
                </thead>
                <tbody>
                <tr>
                  <td>2</td>
                  <td>Admin</td>
                  <td>Audit,Logs,Manage/Block user</td>
                  <td>Edit|Delete</td>
                   
                </tr>
                </tbody>
                <tfoot>
                <tr>
                   <th>User Role Id</th>
                  <th>User Role</th>
                  <th>Privileges</th>
                  <th>Action</th>
                </tr>
                </tfoot>
              </table>
           
		   </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 
 </div>
 <!-- ./wrapper -->
 
 

</body>
</html>
