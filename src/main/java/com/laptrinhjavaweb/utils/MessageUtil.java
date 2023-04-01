package com.laptrinhjavaweb.utils;

import javax.servlet.http.HttpServletRequest;

public class MessageUtil {
	public static void showMessage(HttpServletRequest request) {
		//request.getParameter("message") lay data tu 
		//window.location.href = "${NewURL}?type=edit&id="+result.id+"&message=insert_success"; len
		if (request.getParameter("message") != null) {
			String messageResponse = "";
			String alert = "";
			String message = request.getParameter("message");
			if (message.equals("insert_success")) {
				messageResponse = "Insert success";
				alert = "success";
			} else if (message.equals("update_success")) {
				messageResponse = "Update success";
				alert = "success";
			} else if (message.equals("delete_success")) {
				messageResponse = "Delete success";
				alert = "success";
			} else if (message.equals("error_system")) {
				messageResponse = "Error system";
				alert = "danger";
			}
			//setAttribute day data xuong view
			request.setAttribute("messageResponse", messageResponse);
			request.setAttribute("alert", alert);
		}
	}
}
