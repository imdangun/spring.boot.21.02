<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>

<div class='container'>
	<form method='post' encType='multipart/form-data'>
		<div class='form-row'>
			<div class='col'>
				<input type='text' class='form-control' placeholder='제목' name='title'/>
			</div>
			<div class='col'>
				<div class='custom-file'>
					<input type='file' class='form-control-file' id='attachFile' name='attachFile'/>					
				</div>
			</div>
			<div class='col'>
				<button type='submit' class='btn btn-primary'>제출</button>
			</div>
		</div>
	</form>
</div>