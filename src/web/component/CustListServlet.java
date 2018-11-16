package web.component;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cust.Cust;
import com.cust.CustBiz;

@WebServlet({ "/CustListServlet", "/clist" })
public class CustListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    CustBiz biz;
    public CustListServlet() {
        super();
        biz = new CustBiz();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Cust> list = null;
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		String result = "";
		try {
			list = biz.get();
			result += "<table border='1'>";
			result += "<thead><tr><th>ID</th><th>NAME</th><th>AGE</th></tr></thead>";
			result += "<tbody>";
			for(Cust c:list) {
				result += "<tr>";
				result += "<td><a href='cdetail?id="+c.getId()+"'>"+c.getId()+"</a></td>";
				result += "<td>"+c.getName()+"</td>";
				result += "<td>"+c.getAge()+"</td>";
				result += "</tr>";
			}
			result += "</tbody>";
			result += "</table>";
		} catch (Exception e) {
			result += "<h1>List Fail</h1>";
			e.printStackTrace();
		}
		
		out.println(result);
		out.close();
	}
	

}


