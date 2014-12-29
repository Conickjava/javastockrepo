package com.mta.javacourse;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")

public class MyprojectServlet extends HttpServlet {
	byte num1 = 4, num2 = 3, num3 = 7;
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("<h1><i>Result of (" + num1 + "+" + num2 + ")*" + num3 + "=" + (num1+num2)*num3 + "</i></h1>");
	}
}
