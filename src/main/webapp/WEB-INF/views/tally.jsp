<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="<c:url value='/resources/image/icon/favicon.png' />">
<title>记账</title>
<link
	href="<c:url value='/resources/bootstrap-3.0.3/css/bootstrap.min.css' />"
	rel="stylesheet">
<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet">
</head>

<body style="">
	<jsp:include page="common/navbar.jsp"></jsp:include>


	<script src="<c:url value='/resources/js/jquery.min.js' />"></script>
	<script
		src="<c:url value='/resources/bootstrap-3.0.3/js/bootstrap.min.js' />"></script>
	<script src="<c:url value='/resources/js/holder.min.js'/>"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			 $("#nav-record").addClass("active");
		});
	</script>
</body>
</html>