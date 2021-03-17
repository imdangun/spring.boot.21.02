<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>

<div class='container'>
	<div class='row'>
		<div class='col'>
			<div class='alert alert-info'>
				<c:choose>
					<c:when test='${empty userId}'>
						<a href='loginIn'>로그인</a>
					</c:when>
					<c:otherwise>
						${userId}님, 환영합니다.
					</c:otherwise>
				</c:choose>
			</div>			
		</div>
	</div>
	<div class='row'>		
		<div class='col'>			
			<a href='article'>기사</a>
		</div>
	</div>	
</div>