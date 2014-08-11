<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- css -->
<link rel=stylesheet href="resources/css/jquery.mobile-1.4.3.min.css">
<link rel=stylesheet href="resources/css/jquery-ui.min.css">

<!-- js -->
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/jquery-ui.min.js"></script>
<script src="resources/js/jquery.ui.datepicker.mobile.js"></script>
<script src="resources/js/jquery.mobile-1.4.3.min.js"></script>

<title>Create new records -- LUCK HOUSE Tally</title>
</head>
<body>
<div data-role="page">

  <div data-role="header">
  </div>

  <div data-role="content" class="ui-content">
  	<form method="post">
  		<div data-role="fieldcontain">		
	  		<label for="datepicker">日  期 ：</label>
	  		<input type="date" id="datepicker" name="datepicker" data-role="date" data-inline="true">
		</div>
		<div data-role="fieldcontain">	 
	  		<label for="participants">参与者 ：</label>
	  		<fieldset data-role="controlgroup" data-type="horizontal">
	  		
	  		  <label for="Hunter">Hunter</label>
		      <input type="checkbox" id="Hunter" name="participant" value="Hunter">
		      
		      <label for="Vivian">Vivian</label>
		      <input type="checkbox" id="Vivian" name="participant" value="Vivian">
		      
		      <label for="Bevin">Bevin</label>
		      <input type="checkbox" id="Bevin" name="participant" value="Bevin">
		      
		      <label for="PP">PP</label>
		      <input type="checkbox" id="PP" name="participant" value="PP">
		      
		      <label for="Hehe">Hehe</label>
		      <input type="checkbox" id="Hehe" name="participant" value="HeHe">
		      
			</fieldset>
		</div>
		<div data-role="fieldcontain">
	  		<label for="categry">类  别 ：</label>
	  		<fieldset data-role="controlgroup" data-type="horizontal">
	  		
	  		  <label for="1">吃饭</label>
		      <input type="radio" id="1" name="categry" value="吃饭">
		      
		      <label for="2">生活用品</label>
		      <input type="radio" id="2" name="categry" value="生活用品">
		      
		      <label for="3">玩</label>
		      <input type="radio" id="3" name="categry" value="玩">
		      
		      <label for="4">借钱</label>
		      <input type="radio" id="4" name="categry" value="借钱">
		      
		      <label for="5">其他</label>
		      <input type="radio" id="5" name="categry" value="其他">
		      
		      <label for="6">奢侈的去吃了寿司</label>
		      <input type="radio" id="6" name="categry" value="奢侈的去吃了寿司">
		      
			</fieldset>
		 </div>
		<div data-role="fieldcontain">	  
	  		<label for="comment">备  注 ：</label>
	  		<input type="text" name="comment">
		</div>
		<div data-role="fieldcontain">
			<label for="totalExpenses">总  额 ：</label>
	  		<input type="text" name="totalExpenses">
		</div>
		<div data-role="fieldcontain">
	  		<input type="button" value="记一笔" name="submit">
		</div>
  	</form>
  </div>

  <div data-role="footer">
  </div>

</div>
</body>
</html>
