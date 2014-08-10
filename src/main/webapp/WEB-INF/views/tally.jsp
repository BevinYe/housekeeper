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
<link href="<c:url value='/resources/infragistics/css/infragistics.theme.css'/>" rel="stylesheet" />
<link href="<c:url value='/resources/infragistics/css/infragistics.css'/>" rel="stylesheet" />
<link href="<c:url value='/resources/bootstrap-3.0.3/css/bootstrap.min.css' />"rel="stylesheet">
</head>

<body style="">
	<jsp:include page="common/navbar.jsp"></jsp:include>
	<div style="min-height:60px"></div>
	<table id="grid"></table>
	
	<script src="<c:url value='/resources/js/modernizr.2.7.1.js' />"></script>
	<script src="<c:url value='/resources/js/jquery.min.js' />"></script>
	<script src="<c:url value='/resources/js/jquery-ui.min.js'/>"></script>
	<script src="<c:url value='/resources/bootstrap-3.0.3/js/bootstrap.min.js' />"></script>

	<!-- Ignite UI Required Combined JavaScript Files -->
	<script src="<c:url value='/resources/infragistics/js/infragistics.core.js'/>"></script>
	<script src="<c:url value='/resources/infragistics/js/infragistics.lob.js'/>"></script>
	
	<script src="<c:url value='/resources/js/holder.min.js'/>"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			 $("#nav-record").addClass("active");
			 loadTallyData();
	    });
		function loadTallyData(){
			 var featuresOption = [
				                    {
				                        name: "Responsive",
				                        enableVerticalRendering: false,
				                        columnSettings: [
				                            {
				                                columnKey: "payDate",
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
				                                columnKey: "desc",
				                                configuration: {
				                                    customPhone: {
				                                       	template:"$"+"{payDate}, $"+"{desc}, $"+"{totalExpenses}"
				                                    },
				                                    customAlt: {
				                                        hidden: false
				                                    }
				                                }
				                            },
				                            {
				                                columnKey: "totalExpenses",
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
				                                columnKey: "participants",
				                                configuration: {
				                                    customPhone: {
				                                    	template:"$"+"{participants}, $"+"{payerName}, $"+"{fromDormitoryFee}"
				                                    },
				                                    customAlt: {
				                                        hidden: false
				                                    }
				                                }
				                            },
				                            {
				                                columnKey: "payerName",
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
				                                columnKey: "fromDormitoryFee",
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
				                                columnKey: "comment",
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
				                        pageSize: 10
				                    }
			 ];
			$.ajax({
				type : "POST",
				url : "getAllTallys",
				success : function(data){
					if(data.status == "success"){
						var tallys = data.data;
						$("#grid").igGrid({
			                columns: [
			                    { headerText: "消费日期", key: "payDate", dataType: "date", width: "10%" },
			                    { headerText: "内容", key: "desc", dataType: "string", width: "20%" },
			                    { headerText: "花费￥", key: "totalExpenses", dataType: "number", width: "15%" },
			                    { headerText: "小伙伴们", key: "participants", dataType: "string", width: "15%" },
			                    { headerText: "付钱人", key: "payerName", dataType: "string", width: "10%" },
			                    { headerText: "寝室费支出", key: "fromDormitoryFee", dataType: "string", width: "10%" },
			                    { headerText: "备注", key: "comment", dataType: "string", width: "20%" }
			                ],
			                autoGenerateColumns: false,
			                autofitLastColumn: false,
			                dataSource: tallys,
			                width: "100%",
			                features: featuresOption
			            });
					}
				},
				error : function(){
				}
			});
		}
	</script>
</body>
</html>