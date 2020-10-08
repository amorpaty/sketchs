<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>Huindung-i Sketch</title>
	<link rel="stylesheet" type="text/css" href="/resources/js/lib/jQuery/jquery-ui-1.12.1.css">
	<link rel="stylesheet" type="text/css" href="/resources/js/lib/openLayers/ol.css">
	<link rel="stylesheet" type="text/css" href="/resources/css/common.css">
	
	<script type="text/javascript" src="/resources/js/lib/jQuery/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="/resources/js/lib/jQuery/jquery-ui-1.12.1.js"></script>
	<script type="text/javascript" src="/resources/js/lib/openLayers/ol.js"></script>
	<script type="text/javascript" src="/resources/js/lib/jsZIP/jszip.js"></script>
	
	<script type="text/javascript">
		var _contextPath = '<c:url value="/"/>';
	
		var ajax = new $.ajax({
			contextPath : _contextPath
		});
	</script>
	<script type="text/javascript" src="/resources/js/sub/main.js"></script>
</head>
<body>
	<div class="menuBarCotainer noDisPlay">
	</div>
	
	<div id="header">
	 	<header>
	 		<div id="rightMenu">
	 			<ul>
	 				<li><a href="">회원가입</a></li>
	 				<li><a href="">장바구니</a></li>
	 				<li><img id="search" alt="검색" src="/resources/image/search.png">검색</li>
	 			</ul>
	 		</div>
	 		<div id="leftMenuBar">
	 			<div id="imgContainer">
	 				<img id="menuBar" alt="메뉴바" src="/resources/image/menubar.png">
	 			</div>
	 		</div>
	 		<div id="title">
	 			<a href="/">
	 				<h1>Huindung-i Sketch</h1>
	 			</a>
	 		</div>
	 	</header>
	 </div>
	<section>	 
		 <div id="mainContainer">
	 		<c:import url="./main.jsp"/>	 	
		 </div>
	</section>
 </body>
</html>
