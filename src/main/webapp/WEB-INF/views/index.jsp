<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/global.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/calendar.css" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	
	<script src="../assets/framework/jquery/jquery-3.2.1.min.js"></script>
	<script src="../assets/framework/popper/popper.min.js"></script>
	
	<link rel="stylesheet" href="../assets/framework/bootstrap/css/bootstrap.css">
	<script src="../assets/framework/bootstrap/js/bootstrap.min.js"></script>
	<script src="../assets/js/calendar.js"></script>
	<script>
		function my() {
		}

		function logout() {
			window.location="logout.do";
		}

		function login() {
			window.location="<%=request.getContextPath()%>/login.jsp";
		}
		
		$(document).ready(function() {
			
		// 查询支出类型
 		$("#expenseClassHead").click(function() {
			$.ajax({
				type : "POST",
				url : "../expense/queryUserExpenseClass.do",
				async : true,
				dataType:"json",
				success: function(results) {
					var options = "";
					for (var i =0; i<results.length; i++) {
						/* options += "<option value='" + results[i].id + "'>" + results[i].name + "</option>" */
						options += "<a href='#' class='list-group-item list-group-item-action expenseClassItem'>"+results[i].name+"</a>"
					}
					$("#expenseClass").html(options);
				},
				error: function() {
				}
			});
		});
		$(".expenseClassItem").click(function(){
			alert(this.innerHTML);
		});
			
		var accountObj=[];
		// 查询账户
		$("#account").focus(function() {
			$.ajax({
				type : "POST",
				url : "../account/queryUserAccount.do",
				async : true,
				dataType:"json",
				success: function(results) {
					var options = "";
					for (var i =0; i<results.length; i++) {
						options += "<option value='" + results[i].id + "'>" + results[i].name + "</option>"
						accountObj.push(results[i]);
					}
					$("#account").html(options);
				},
				error: function() {
				}
			});
		});
		
		//改变币种
		$("#account").click(function() {
			});
			
		});
		
		
	</script>
	<title>Insert title here</title>
</head>
<body>
	<header>
		<p id="logInfo">
			<span>你好！${sessionScope.currentUser.userName}</span>
			<c:if test="${empty sessionScope.currentUser.userName}"><button class="btn btn-info" type="button" onclick="login()">登录</button></c:if>
			<c:if test="${!empty sessionScope.currentUser.userName}"><button class="btn btn-secondary" type="button" onclick="logout()">登出</button></c:if>
		</p>
	</header>
	<secetion id="toolbar">
		<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#expense">
			添加支出
		</button>
		<div class="modal fade" id="expense" tabindex="-1" role="dialog" aria-labelledby="expenseLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">添加支出</h5>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<form action="../expense/addExpense.do" class="">
						<div class="modal-body">
							<div class="form-group">
								<label for="">项目</label>
								<input type="text" placeholder="输入支出内容" class="form-control">
							</div>
							<div class="form-group">
								<label for="expenseClass">支出类型</label><button type="button" class="btn btn-info btn-sm">编辑类型</button>
								<div class="card">
									<a href="#expenseClass" class="card-body" id="expenseClassHead" data-toggle="collapse" aria-expanded="false" aria-controls="expenseClass">
										选择支出类型
									</a>
									<div class="list-group list-group-flush">
										<div id="expenseClass" class="collapse" role="tabpanel" aria-labelledby="expenseClassHead" data-parent="#addExpense">
											<a href="#" class="list-group-item list-group-item-action">1</a>
											<a href="#" class="list-group-item list-group-item-action">2</a>
											<a href="#" class="list-group-item list-group-item-action">3</a>
										</div>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="account">账户</label><button type="button" class="btn btn-info btn-sm">编辑账户</button>
								<select name="account" id="account" class="form-control">
									<option value="0"></option>
									<option value=""></option>
									<option value=""></option>
									<option value=""></option>
								</select>
							</div>
							<div class="form-group">
								<label for="">金额</label>
								<div class="input-group">
									<span class="input-group-addon" id="currency">$</span>
									<input type="text" class="form-control" placeholder="" aria-label="currency" aria-describedby="currency">
								</div>
							</div>
							<div class="form-group">
								<label for="">备注</label>
								<textarea class="form-control"></textarea>
							</div>
						</div>
						<div class="modal-footer">
							<button type="submit" class="btn btn-primary">保存</button>
							<button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
						</div>
					</form>
				</div>
			</div>
		</div>
		<button type="button" class="btn btn-success" data-toggle="modal" data-target="#income">
			添加收入
		</button>
	</secetion>
	<secetion id="calendar">
		<table class="w-100 p-3 bg-light text-gray-dark">
			<thead>
				<tr><th colspan="8" class="p-3 mb-2 bg-dark text-white text-center" id="month"></th></tr>
			</thead>
			<tbody>
				<tr>
					<td></td>
					<td class="text-center text-danger">日</td>
					<td class="text-center">一</td>
					<td class="text-center">二</td>
					<td class="text-center">三</td>
					<td class="text-center">四</td>
					<td class="text-center">五</td>
					<td class="text-center text-info">六</td>
				</tr>
				<tr id="day">
					<td></td>
				</tr>
				<tr>
					<td>收 入</td>
				</tr>
				<tr>
					<td>支 出</td>
				</tr>
				<tr>
					<td>每日小计</td>
				</tr>
				<tr>
					<td>资产结余</td>
				</tr>
			</tbody>
		</table>
	</secetion>
	<footer>
		@pearl finance
	</footer>
</body>
</html>