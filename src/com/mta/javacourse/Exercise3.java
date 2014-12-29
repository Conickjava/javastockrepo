package com.mta.javacourse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Exercise3 extends HttpServlet{
	//Exercise 3.1
	final int RADIUS = 50; //In cm
	double area = Math.PI*RADIUS*RADIUS;
	
	//Exercise 3.2
	int angleB = 30; //Degrees 
	int hypotenuse = 50; //CM
	double bRadiant = Math.toRadians(angleB);
	double oppositeLength = hypotenuse*Math.sin(bRadiant);
	
	//Exercise 3.3
	double powerResult = Math.pow(20,13); 
	String line1 = new String("<b>Calculation 1:</b> Area of a circle with radius of " + RADIUS + " is: <b>" + area + " </b>square cm");
	String line2 = new String("<b>Calculation 2:</b> Length of opposite where angle B is 30 degrees and Hypotenuse length is 50 cm is: <b>" +oppositeLength +"</b>cm");
	String line3 = new String("<b>Calculation 3:</b> Power of 20 with the exp of 13 is <b>" + powerResult + "</b>");
	String resultStr = new String(line1 + "<br>" + line2 + "<br>" + line3);
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException { 
			resp.setContentType("text/html");
			resp.getWriter().println("<h1>Exercise3</h1>"
					+ resultStr );  
	
	}
}
