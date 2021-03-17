<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<script src='http://code.jquery.com/jquery-3.5.1.min.js'></script>
<script src='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>

<script>
function showImg(input) {
	if(input.files[0]) {
		let reader = new FileReader();
		reader.readAsDataURL(input.files[0]);
		
		reader.addEventListener('load', () => {
			$('#previewImg').attr('src', reader.result);
		}, false);
	}
}

$(() => {
	$('input').change(function() {
		showImg(this);
	});
	
	$('button').click(() => {
		let data = new FormData($('form')[0]);
		
		$.ajax({
			method: 'post',
			data,
			processData: false,
			contentType: false,
			success: result => {
				if(result) $('#msg').text('이미지 제출을 성공했습니다.');
			},
			error: err => $('#msg').text('이미지 제출을 실패했습니다.'),
			complete: () => $('#msgModal').modal()
		});
	});
});
</script>
<div class='container'>
	<form>
		<div class='form-row'>			
			<div class='col'>
				<div>
					<input type='file' class='form-control-file' id='attachFile' name='attachFile'/>					
				</div>
			</div>
			<div class='col'>
				<button type='button' class='btn btn-primary'>제출</button>
			</div>
		</div>
	</form>
	
	<img id='previewImg'/>
</div>

<div id='msgModal' class='modal fade'>
	<div class='modal-dialog modal-sm'>
		<div class='modal-content'>
			<div class='modal-header'>
				<button type='button' class='close' data-dismiss='modal'>&times;</button>
			</div>
			<div class='modal-body'>
				<p id='msg'></p>
			</div>
			<div class='modal-footer'>
				<button type='button' class='close' data-dismiss='modal'>확인</button>
			</div>
		</div>
	</div>
</div>
