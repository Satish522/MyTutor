<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>My Tutor | Dashboard</title>
<!-- Date Picker -->
<link rel="stylesheet"
	href="<c:url value="/resources/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css" />">
<!-- Daterange picker -->
<link rel="stylesheet" href="<c:url value="/resources/bower_components/bootstrap-daterangepicker/daterangepicker.css" />">
	<!-- daterangepicker -->
<script src="<c:url value="/resources/bower_components/moment/min/moment.min.js"/>"></script>
<script
	src="<c:url value="/resources/bower_components/bootstrap-daterangepicker/daterangepicker.js" />"></script>
<!-- datepicker -->
<script
	src="<c:url value="/resources/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js" />"></script>
<!-- SlimScroll -->
<script
	src="<c:url value="/resources/bower_components/jquery-slimscroll/jquery.slimscroll.min.js" />"></script>
<script>
	$(document).ready(function() {
		$('.sidebar-menu').tree()
	})
</script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<!-- Site wrapper -->
	<div class="wrapper">
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					Dashboard <small>Control panel</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="dashboard.html"><i class="fa fa-dashboard"></i> Home</a></li>
					<li class="active">Dashboard</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">
				<div class="row">
					<!-- Left col -->
					<div class="col-md-4">
						<!-- TO DO List -->
						<div class="box box-primary">
							<div class="box-header">
								<i class="ion ion-clipboard"></i>

								<h3 class="box-title">To Do List</h3>

								<div class="box-tools pull-right">
									<ul class="pagination pagination-sm inline">
										<li><a href="#">&laquo;</a></li>
										<li><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">&raquo;</a></li>
									</ul>
								</div>
							</div>
							<!-- /.box-header -->
							<div class="box-body">
								<!-- See dist/js/pages/dashboard.js to activate the todoList plugin -->
								<ul class="todo-list">
									<li>
										<!-- drag handle --> <span class="handle"> <i
											class="fa fa-ellipsis-v"></i> <i class="fa fa-ellipsis-v"></i>
									</span> <!-- checkbox --> <input type="checkbox" value=""> <!-- todo text -->
										<span class="text">Design a nice theme</span> <!-- Emphasis label -->
										<small class="label label-danger"><i
											class="fa fa-clock-o"></i> 2 mins</small> <!-- General tools such as edit or delete-->
										<div class="tools">
											<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
										</div>
									</li>
									<li><span class="handle"> <i
											class="fa fa-ellipsis-v"></i> <i class="fa fa-ellipsis-v"></i>
									</span> <input type="checkbox" value=""> <span class="text">Make
											the theme responsive</span> <small class="label label-info"><i
											class="fa fa-clock-o"></i> 4 hours</small>
										<div class="tools">
											<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
										</div></li>
									<li><span class="handle"> <i
											class="fa fa-ellipsis-v"></i> <i class="fa fa-ellipsis-v"></i>
									</span> <input type="checkbox" value=""> <span class="text">Let
											theme shine like a star</span> <small class="label label-warning"><i
											class="fa fa-clock-o"></i> 1 day</small>
										<div class="tools">
											<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
										</div></li>
									<li><span class="handle"> <i
											class="fa fa-ellipsis-v"></i> <i class="fa fa-ellipsis-v"></i>
									</span> <input type="checkbox" value=""> <span class="text">Let
											theme shine like a star</span> <small class="label label-success"><i
											class="fa fa-clock-o"></i> 3 days</small>
										<div class="tools">
											<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
										</div></li>
									<li><span class="handle"> <i
											class="fa fa-ellipsis-v"></i> <i class="fa fa-ellipsis-v"></i>
									</span> <input type="checkbox" value=""> <span class="text">Check
											your messages and notifications</span> <small
										class="label label-primary"><i class="fa fa-clock-o"></i>
											1 week</small>
										<div class="tools">
											<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
										</div></li>
									<li><span class="handle"> <i
											class="fa fa-ellipsis-v"></i> <i class="fa fa-ellipsis-v"></i>
									</span> <input type="checkbox" value=""> <span class="text">Let
											theme shine like a star</span> <small class="label label-default"><i
											class="fa fa-clock-o"></i> 1 month</small>
										<div class="tools">
											<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
										</div></li>
								</ul>
							</div>
							<!-- /.box-body -->
							<div class="box-footer clearfix no-border">
								<button type="button" class="btn btn-default pull-right">
									<i class="fa fa-plus"></i> Add item
								</button>
							</div>
						</div>
						<!-- /.box -->
					</div>
					<div class="col-md-4">
						<!-- Calendar -->
						<div class="box box-solid bg-green-gradient">
							<div class="box-header">
								<i class="fa fa-calendar"></i>

								<h3 class="box-title">Calendar</h3>
								<!-- tools box -->
								<div class="pull-right box-tools">
									<!-- button with a dropdown -->
									<div class="btn-group">
										<button type="button"
											class="btn btn-success btn-sm dropdown-toggle"
											data-toggle="dropdown">
											<i class="fa fa-bars"></i>
										</button>
										<ul class="dropdown-menu pull-right" role="menu">
											<li><a href="#">Add new event</a></li>
											<li><a href="#">Clear events</a></li>
											<li class="divider"></li>
											<li><a href="#">View calendar</a></li>
										</ul>
									</div>
									<button type="button" class="btn btn-success btn-sm"
										data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
									<button type="button" class="btn btn-success btn-sm"
										data-widget="remove">
										<i class="fa fa-times"></i>
									</button>
								</div>
								<!-- /. tools -->
							</div>
							<!-- /.box-header -->
							<div class="box-body no-padding">
								<!--The calendar -->
								<div id="calendar" style="width: 100%"></div>
							</div>
							<!-- /.box-body -->
							<div class="box-footer text-black">
								<div class="row">
									<div class="col-sm-6">
										<!-- Progress bars -->
										<div class="clearfix">
											<span class="pull-left">Task #1</span> <small
												class="pull-right">90%</small>
										</div>
										<div class="progress xs">
											<div class="progress-bar progress-bar-green"
												style="width: 90%;"></div>
										</div>

										<div class="clearfix">
											<span class="pull-left">Task #2</span> <small
												class="pull-right">70%</small>
										</div>
										<div class="progress xs">
											<div class="progress-bar progress-bar-green"
												style="width: 70%;"></div>
										</div>
									</div>
									<!-- /.col -->
									<div class="col-sm-6">
										<div class="clearfix">
											<span class="pull-left">Task #3</span> <small
												class="pull-right">60%</small>
										</div>
										<div class="progress xs">
											<div class="progress-bar progress-bar-green"
												style="width: 60%;"></div>
										</div>

										<div class="clearfix">
											<span class="pull-left">Task #4</span> <small
												class="pull-right">40%</small>
										</div>
										<div class="progress xs">
											<div class="progress-bar progress-bar-green"
												style="width: 40%;"></div>
										</div>
									</div>
									<!-- /.col -->
								</div>
								<!-- /.row -->
							</div>
						</div>
						<!-- /.box -->
					</div>
					<!-- /.col -->
					<!-- Right col -->
					<div class="col-md-4">
						<!-- Info Boxes Style 2 -->
						<div class="box box-danger">
							<div class="box-header with-border">
								<h3 class="box-title">Latest Members</h3>

								<div class="box-tools pull-right">
									<span class="label label-danger">8 New Members</span>
									<button type="button" class="btn btn-box-tool"
										data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
									<button type="button" class="btn btn-box-tool"
										data-widget="remove">
										<i class="fa fa-times"></i>
									</button>
								</div>
							</div>
							<!-- /.box-header -->
							<div class="box-body no-padding">
								<ul class="users-list clearfix">
									<li><img src="${pageContext.request.contextPath}/resources/dist/img/user1-128x128.jpg"
										alt="User Image"> <a class="users-list-name" href="#">Alexander
											Pierce</a> <span class="users-list-date">Today</span></li>
									<li><img src="${pageContext.request.contextPath}/resources/dist/img/user8-128x128.jpg"
										alt="User Image"> <a class="users-list-name" href="#">Norman</a>
										<span class="users-list-date">Yesterday</span></li>
									<li><img src="${pageContext.request.contextPath}/resources/dist/img/user7-128x128.jpg"
										alt="User Image"> <a class="users-list-name" href="#">Jane</a>
										<span class="users-list-date">12 Jan</span></li>
									<li><img src="${pageContext.request.contextPath}/resources/dist/img/user6-128x128.jpg"
										alt="User Image"> <a class="users-list-name" href="#">John</a>
										<span class="users-list-date">12 Jan</span></li>
									<li><img src="${pageContext.request.contextPath}/resources/dist/img/user2-160x160.jpg"
										alt="User Image"> <a class="users-list-name" href="#">Alexander</a>
										<span class="users-list-date">13 Jan</span></li>
									<li><img src="${pageContext.request.contextPath}/resources/dist/img/user5-128x128.jpg"
										alt="User Image"> <a class="users-list-name" href="#">Sarah</a>
										<span class="users-list-date">14 Jan</span></li>
									<li><img src="${pageContext.request.contextPath}/resources/dist/img/user4-128x128.jpg"
										alt="User Image"> <a class="users-list-name" href="#">Nora</a>
										<span class="users-list-date">15 Jan</span></li>
									<li><img src="${pageContext.request.contextPath}/resources/dist/img/user3-128x128.jpg"
										alt="User Image"> <a class="users-list-name" href="#">Nadia</a>
										<span class="users-list-date">15 Jan</span></li>
								</ul>
								<!-- /.users-list -->
							</div>
							<!-- /.box-body -->
							<div class="box-footer text-center">
								<a href="javascript:void(0)" class="uppercase">View All
									Users</a>
							</div>
							<!-- /.box-footer -->
						</div>
						<!--/.box -->

						<!-- DIRECT CHAT -->
						<div class="box box-warning direct-chat direct-chat-warning">
							<div class="box-header with-border">
								<h3 class="box-title">Direct Chat</h3>

								<div class="box-tools pull-right">
									<span data-toggle="tooltip" title="3 New Messages"
										class="badge bg-yellow">3</span>
									<button type="button" class="btn btn-box-tool"
										data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
									<button type="button" class="btn btn-box-tool"
										data-toggle="tooltip" title="Contacts"
										data-widget="chat-pane-toggle">
										<i class="fa fa-comments"></i>
									</button>
									<button type="button" class="btn btn-box-tool"
										data-widget="remove">
										<i class="fa fa-times"></i>
									</button>
								</div>
							</div>
							<!-- /.box-header -->
							<div class="box-body">
								<!-- Conversations are loaded here -->
								<div class="direct-chat-messages">
									<!-- Message. Default to the left -->
									<div class="direct-chat-msg">
										<div class="direct-chat-info clearfix">
											<span class="direct-chat-name pull-left">Alexander
												Pierce</span> <span class="direct-chat-timestamp pull-right">23
												Jan 2:00 pm</span>
										</div>
										<!-- /.direct-chat-info -->
										<img class="direct-chat-img"
											src="${pageContext.request.contextPath}/resources/dist/img/user1-128x128.jpg"
											alt="message user image">
										<!-- /.direct-chat-img -->
										<div class="direct-chat-text">Is this template really
											for free? That's unbelievable!</div>
										<!-- /.direct-chat-text -->
									</div>
									<!-- /.direct-chat-msg -->

									<!-- Message to the right -->
									<div class="direct-chat-msg right">
										<div class="direct-chat-info clearfix">
											<span class="direct-chat-name pull-right">Sarah
												Bullock</span> <span class="direct-chat-timestamp pull-left">23
												Jan 2:05 pm</span>
										</div>
										<!-- /.direct-chat-info -->
										<img class="direct-chat-img"
											src="${pageContext.request.contextPath}/resources/dist/img/user3-128x128.jpg"
											alt="message user image">
										<!-- /.direct-chat-img -->
										<div class="direct-chat-text">You better believe it!</div>
										<!-- /.direct-chat-text -->
									</div>
									<!-- /.direct-chat-msg -->

									<!-- Message. Default to the left -->
									<div class="direct-chat-msg">
										<div class="direct-chat-info clearfix">
											<span class="direct-chat-name pull-left">Alexander
												Pierce</span> <span class="direct-chat-timestamp pull-right">23
												Jan 5:37 pm</span>
										</div>
										<!-- /.direct-chat-info -->
										<img class="direct-chat-img"
											src="${pageContext.request.contextPath}/resources/dist/img/user1-128x128.jpg"
											alt="message user image">
										<!-- /.direct-chat-img -->
										<div class="direct-chat-text">Working with AdminLTE on a
											great new app! Wanna join?</div>
										<!-- /.direct-chat-text -->
									</div>
									<!-- /.direct-chat-msg -->

									<!-- Message to the right -->
									<div class="direct-chat-msg right">
										<div class="direct-chat-info clearfix">
											<span class="direct-chat-name pull-right">Sarah
												Bullock</span> <span class="direct-chat-timestamp pull-left">23
												Jan 6:10 pm</span>
										</div>
										<!-- /.direct-chat-info -->
										<img class="direct-chat-img"
											src="${pageContext.request.contextPath}/resources/dist/img/user3-128x128.jpg"
											alt="message user image">
										<!-- /.direct-chat-img -->
										<div class="direct-chat-text">I would love to.</div>
										<!-- /.direct-chat-text -->
									</div>
									<!-- /.direct-chat-msg -->

								</div>
								<!--/.direct-chat-messages-->

								<!-- Contacts are loaded here -->
								<div class="direct-chat-contacts">
									<ul class="contacts-list">
										<li><a href="#"> <img class="contacts-list-img"
												src="${pageContext.request.contextPath}/resources/dist/img/user1-128x128.jpg" alt="User Image">

												<div class="contacts-list-info">
													<span class="contacts-list-name"> Count Dracula <small
														class="contacts-list-date pull-right">2/28/2015</small>
													</span> <span class="contacts-list-msg">How have you been?
														I was...</span>
												</div> <!-- /.contacts-list-info -->
										</a></li>
										<!-- End Contact Item -->
										<li><a href="#"> <img class="contacts-list-img"
												src="${pageContext.request.contextPath}/resources/dist/img/user7-128x128.jpg" alt="User Image">

												<div class="contacts-list-info">
													<span class="contacts-list-name"> Sarah Doe <small
														class="contacts-list-date pull-right">2/23/2015</small>
													</span> <span class="contacts-list-msg">I will be waiting
														for...</span>
												</div> <!-- /.contacts-list-info -->
										</a></li>
										<!-- End Contact Item -->
										<li><a href="#"> <img class="contacts-list-img"
												src="${pageContext.request.contextPath}/resources/dist/img/user3-128x128.jpg" alt="User Image">

												<div class="contacts-list-info">
													<span class="contacts-list-name"> Nadia Jolie <small
														class="contacts-list-date pull-right">2/20/2015</small>
													</span> <span class="contacts-list-msg">I'll call you back
														at...</span>
												</div> <!-- /.contacts-list-info -->
										</a></li>
										<!-- End Contact Item -->
										<li><a href="#"> <img class="contacts-list-img"
												src="${pageContext.request.contextPath}/resources/dist/img/user5-128x128.jpg" alt="User Image">

												<div class="contacts-list-info">
													<span class="contacts-list-name"> Nora S. Vans <small
														class="contacts-list-date pull-right">2/10/2015</small>
													</span> <span class="contacts-list-msg">Where is your
														new...</span>
												</div> <!-- /.contacts-list-info -->
										</a></li>
										<!-- End Contact Item -->
										<li><a href="#"> <img class="contacts-list-img"
												src="${pageContext.request.contextPath}/resources/dist/img/user6-128x128.jpg" alt="User Image">

												<div class="contacts-list-info">
													<span class="contacts-list-name"> John K. <small
														class="contacts-list-date pull-right">1/27/2015</small>
													</span> <span class="contacts-list-msg">Can I take a look
														at...</span>
												</div> <!-- /.contacts-list-info -->
										</a></li>
										<!-- End Contact Item -->
										<li><a href="#"> <img class="contacts-list-img"
												src="${pageContext.request.contextPath}/resources/dist/img/user8-128x128.jpg" alt="User Image">

												<div class="contacts-list-info">
													<span class="contacts-list-name"> Kenneth M. <small
														class="contacts-list-date pull-right">1/4/2015</small>
													</span> <span class="contacts-list-msg">Never mind I
														found...</span>
												</div> <!-- /.contacts-list-info -->
										</a></li>
										<!-- End Contact Item -->
									</ul>
									<!-- /.contatcts-list -->
								</div>
								<!-- /.direct-chat-pane -->
							</div>
							<!-- /.box-body -->
							<div class="box-footer">
								<form action="#" method="post">
									<div class="input-group">
										<input type="text" name="message"
											placeholder="Type Message ..." class="form-control">
										<span class="input-group-btn">
											<button type="button" class="btn btn-warning btn-flat">Send</button>
										</span>
									</div>
								</form>
							</div>
							<!-- /.box-footer-->
						</div>
						<!--/.direct-chat -->
					</div>
					<!-- /.col -->
				</div>
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->
	</div>
	<!-- ./wrapper -->

</body>
</html>
