package web.component;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cust.Cust;
import com.cust.CustBiz;

@WebServlet({ "/CustRegisterServlet", "/cregister" })
public class CustRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    CustBiz biz;
	public CustRegisterServlet() {
        super();
        biz = new CustBiz();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
	
		Cust cust = new Cust(id, pwd, name, Integer.parseInt(age));
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out 
		= response.getWriter();
		
		String result = "";
		try {
			biz.register(cust);
			result += "<h1>REGISTER OK</h1>";
			result += id+"<h1> 님 환영합니다.</h1>";
		} catch (Exception e) {
			e.printStackTrace();
			result += "<h1>REGISTER FAIL</h1>";
		}
		out.println(result);

	}

}



