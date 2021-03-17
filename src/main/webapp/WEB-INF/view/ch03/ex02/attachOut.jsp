<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>

<div class='container'>
	<div class='row'>
		<div class='col'>
			<img src='<c:url value="/res/${fileName}"/>'/> <br>
			${title}
		</div>
	</div>
</div>