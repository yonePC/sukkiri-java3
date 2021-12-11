package code18_06;

import java.io.*;
import java.util.Date;
import javax.servlet.http.*;


@webServlet("/HelloSevlet")
public class HelloServlet extends HttpServlet {
	protected void doGot(HttpSevletRequest req,HttpServletResponse res) throws IOException{
		Date d = new Date();
		PrintWriter w = res.getWriter();
		res.setContentType("text/html");
		w.write("<html><body>");
		w.wite("Today is" + d.toString());
		w.write("</body></html>);
	}
}
