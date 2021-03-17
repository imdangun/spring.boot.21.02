<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>

<div class='container'>
	<form class='form-horizontal' method='post' action='login'>
		<div class='form-group row'>
			<label class='col-2 control-label' for='userId'>ID: </label>
			<div class='col'>
				<input type='text' class='form-control' id='userId' name='userId'/>
			</div>
		</div>
		<div class='form-group row'>
			<label class='col-2 control-label' for='userPw'>PW: </label>
			<div class='col'>
				<input type='password' class='form-control' id='userPw' name='userPw'/>
			</div>
		</div>
		<div class='form-group row'>
			<div class='col d-flex justify-content-end'>
				<button type='submit' class='btn btn-primary'>로그인</button>
			</div>
		</div>
	</form>
</div>