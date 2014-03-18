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
<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet">
<link href="http://cdn-na.infragistics.com/jquery/20132/latest/css/themes/infragistics/infragistics.theme.css" rel="stylesheet" />
<link href="http://cdn-na.infragistics.com/jquery/20132/latest/css/structure/infragistics.css" rel="stylesheet" />
<link href="<c:url value='/resources/bootstrap-3.0.3/css/bootstrap.min.css' />"rel="stylesheet">
</head>

<body style="">
	<jsp:include page="common/navbar.jsp"></jsp:include>
	<div style="min-height:60px"></div>
	<table id="grid"></table>
	
	<script src="http://modernizr.com/downloads/modernizr-latest.js"></script>
	<script src="<c:url value='/resources/js/jquery.min.js' />"></script>
	<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.min.js"></script>
	<script src="<c:url value='/resources/bootstrap-3.0.3/js/bootstrap.min.js' />"></script>

	<!-- Ignite UI Required Combined JavaScript Files -->
	<script src="http://cdn-na.infragistics.com/jquery/20132/latest/js/infragistics.core.js"></script>
	<script src="http://cdn-na.infragistics.com/jquery/20132/latest/js/infragistics.lob.js"></script>
	<script src="http://igniteui.com/js-data/nw-customers-with-orders"></script>
	
	<script src="<c:url value='/resources/js/holder.min.js'/>"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			 $("#nav-record").addClass("active");
			 
			 $("#grid").igGrid({
	                columns: [
	                    { headerText: "Company Name", key: "CompanyName", dataType: "string", width: "20%" },
	                    { headerText: "Contact Name", key: "ContactName", dataType: "string", width: "15%" },
	                    { headerText: "Contact Title", key: "ContactTitle", dataType: "string", width: "20%" },
	                    { headerText: "Address", key: "Address", dataType: "string", width: "20%" },
	                    { headerText: "City", key: "City", dataType: "string", width: "10%" },
	                    { headerText: "Country", key: "Country", dataType: "string", width: "15%" }
	                ],
	                autoGenerateColumns: false,
	                autofitLastColumn: false,
	                dataSource: nwCustomersWithOrders,
	                width: "100%",
	                features: [
	                    {
	                        name: "Responsive",
	                        enableVerticalRendering: false,
	                        columnSettings: [
	                            {
	                                columnKey: "ContactName",
	                                configuration: {
	                                    customPhone: {
	                                        hidden: true
	                                    },
	                                    customAlt: {
	                                        hidden: false
	                                    }
	                                }
	                            },
	                            {
	                                columnKey: "ContactTitle",
	                                configuration: {
	                                    customPhone: {
	                                        hidden: true
	                                    },
	                                    customAlt: {
	                                        hidden: false
	                                    }
	                                }
	                            },
	                            {
	                                columnKey: "Address",
	                                configuration: {
	                                    customPhone: {
	                                        template: "$"+"{Address}, $"+"{City}, $"+"{Country}",
	                                    },
	                                    customAlt: {
	                                        hidden: false
	                                    }
	                                }
	                            },
	                            {
	                                columnKey: "City",
	                                configuration: {
	                                    customPhone: {
	                                        hidden: true
	                                    },
	                                    customAlt: {
	                                        hidden: false
	                                    }
	                                }
	                            },
	                            {
	                                columnKey: "Country",
	                                configuration: {
	                                    customPhone: {
	                                        hidden: true
	                                    },
	                                    customAlt: {
	                                        hidden: false
	                                    }
	                                }
	                            }
	                        ],
	                        responsiveModes: {
	                            customPhone: {
	                                minWidth: 0,
	                                maxWidth: 600
	                            },
	                            // alternative mode
	                            customAlt: {
	                                minWidth: 601,
	                                maxWidth: Number.MAX_VALUE
	                            }
	                        }
	                    },
	                    {
	                        name: "Paging",
	                        pageSize: 5
	                    }
	                ]
	            });
	        });
	</script>
</body>
</html>