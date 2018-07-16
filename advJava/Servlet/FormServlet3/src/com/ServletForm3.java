package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletForm3
 */
public class ServletForm3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForm3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Enumeration en=request.getParameterNames();
		while(en.hasMoreElements())
		{
			Object obj=en.nextElement();
			String paramName=(String)obj;
			out.println("<br>Parameter Name is "+ paramName);
			String[] paramValues=request.getParameterValues(paramName);
			if(paramValues.length==1)
			{
				String paramValue=paramValues[0];
				if(paramValue.length()==0)
				{
					out.print("<i><b>No values</b></i>");
				}
				else
				{
					out.print("Parameter value is "+paramValue);
				}
			}
			else
			{
				if(paramValues.length!=0)
				{
					out.println(paramValues.length);
				out.print("<UL>");
				out.print("<br>Multiple parameter values");
				for(int i=0;i<paramValues.length;i++)
				{
					out.print("<li>"+paramValues[i]+"\n");
				}
				out.println("</ul>");
				}
				else
				{
					out.println("You have no skills");
				}
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
