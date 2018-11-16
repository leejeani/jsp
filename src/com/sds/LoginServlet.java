package com.sds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = 
				response.getWriter();
		out.println(id+" 님 GET 방식 로그인");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = 
				response.getWriter();
		
		if(id.equals("ss") && 
				pwd.equals("111")) {
			out.println("로그인 성공");
			out.println(id+ "님 환영 합니다.");
		}else {
			out.println("로그인 실패");
		}
		out.close();
	}

}




