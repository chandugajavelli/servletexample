package com.servletex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
        System.out.println("in service");
        //res.getWriter().println("hellow world");

        res.setContentType("text/html");
	
	PrintWriter out=res.getWriter();
	
	out.println("<h2><b>Hello World</h2></b>");

    }

}
