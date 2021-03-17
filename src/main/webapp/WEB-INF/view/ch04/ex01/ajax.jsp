<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<script src='http://code.jquery.com/jquery-3.5.1.min.js'></script>
<script>
function init() {
	$('#getBtn').click(() => {
		$.ajax({
			url: 'get',
			method: 'get',
			data: {
				userId: 1,
				userName: '최한석',
				birthday: '2025-01-01'
			}		
		}).done(user => console.log(user));
	});
	
	$('#postBtn').click(() => {
		$.ajax({
			url: 'post',
			method: 'post',
			data: JSON.stringify({
				userId: 2,
				userName: '한아름',
				birthday: '2025-02-02'
			}),
			contentType: 'application/json'			
		}).done(user => console.log(user));
	});
	
	$('#putBtn').click(() => {
		$.ajax({
			url: 'put',
			method: 'put',
			data: JSON.stringify({
				userId: 3,
				userName: '양승일',
				birthday: '2025-03-03'
			}),
			contentType: 'application/json',			
		}).done(user => console.log(user));
	});
	
	$('#patchBtn').click(() => {
		$.ajax({
			url: 'patch',
			method: 'patch',
			data: JSON.stringify({
				userId: 4,
				userName: '김가람',
				birthday: '2025-04-04'
			}),
			contentType: 'application/json'			
		}).done(user => console.log(user));
	});
	
	$('#deleteBtn').click(() => {
		$.ajax({
			url: 'delete',
			method: 'delete',
			data: JSON.stringify({
				userId: 5,
				userName: '박돈일',
				birthday: '2025-05-05'
			}),
			contentType: 'application/json'			
		}).done(user => console.log(user));
	});
}

$(init);
</script>
<div class='container'>
	<button type='button' class='btn btn-primary' id='getBtn'>GET</button>
	<button type='button' class='btn btn-secondary' id='postBtn'>POST</button>
	<button type='button' class='btn btn-success' id='putBtn'>PUT</button>
	<button type='button' class='btn btn-warning' id='patchBtn'>PATCH</button>
	<button type='button' class='btn btn-danger' id='deleteBtn'>DELETE</button>
</div>