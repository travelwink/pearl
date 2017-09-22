$(document).ready(function() {
	// 获取当前系统时间
	var curSysDateTime = new Date();
	curYear = curSysDateTime.getFullYear();// 当前年份
	curMonth = curSysDateTime.getMonth();// 当前月份(0-11)
	curDate = curSysDateTime.getDate();// 当前日期
	curDay = curSysDateTime.getDay();// 当前星期(0-6)

	// 当月第一天信息
	curMonth1st = new Date(curYear, curMonth, 1);
	// 当月第一天星期
	curMonth1stDay = curMonth1st.getDay();

	// 1-星期数，获取第一行的日期
	curRow1stDay = new Date(curYear, curMonth, 1-curMonth1stDay);

	// 填入当前月份
	$("#month").append(curMonth + 1 + " 月");

	// i+当前日期-星期=填入本周周历
	for (var i = 0; i<=6; i++) {
		var curWeekDays = new Array();
		curWeekDays[i] =new Date(curYear, curMonth, i + curDate - curDay);
		if (curWeekDays[i].getDate()==curDate) {
			$("#day").append("<td class='py-5 text-center bg-info text-white'>" + curWeekDays[i].getDate() + "</td>");
		} else {
			$("#day").append("<td class='py-5 text-center'>" + curWeekDays[i].getDate() + "</td>");
		}
	}

	$("#selectExpenseClass").click(function() {
		$.ajax({
			type : "POST",
			url : "../expense/queryUserExpenseClass.do",
			async : false,
			dataType : "json"
		});
	});
});