<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="" style="background: #e2e2e2;">
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex Form</h3>
						<div class="alert alert-danger" role="alert">

							<form:errors path="student.*" />

						</div>

						<form action="registerform" method="post">
							<div class="form-group">
								<label for="name">Your Name</label> <input type="text"
									class="form-control form-text text-muted" id="name"
									aria-describedby="emailHelp" placeholder="Enter Name"
									name="name"> <small id="emailHelp"
									class="form-text text-muted">We'll never share your
									email with anyone else.</small>
							</div>

							<div class="form-group">
								<label for="id">Your Id</label> <input type="text"
									class="form-control " id="id" aria-describedby="emailHelp"
									placeholder="Enter Id" name="id">

							</div>

							<div class="form-group">
								<label for="date">Your DOB</label> <input type="text"
									class="form-control " id="id" aria-describedby="emailHelp"
									placeholder="DD/MM/YYYY" name="dob">
							</div>

							<div class="form-group">
								<label for="selectList">Select Course</label> <select
									name="courses" id="courses" class="form-control" multiple>
									<option>Java</option>
									<option>Python</option>
									<option>C++</option>
									<option>Spring Framework</option>
								</select>

							</div>
							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male"> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>
							<div class="form-group">
								<label for="Type">Select Type</label> <select
									class="form-control" name="type">
									<option value="oldStudent">Old Student</option>
									<option value="normalStudent">Normal Student</option>
								</select>
							</div>

							<div class="card">
								<div class="card-body">
									<p>Your Address</p>
									<div class="form-group">
										<input type="text" class="from-control"
											placeholder="Enter Street" name="address.street">
									</div>
									<div class="form-group">
										<input type="text" class="from-control"
											placeholder="Enter City" name="address.city">
									</div>
								</div>
							</div>


							<div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>


						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>