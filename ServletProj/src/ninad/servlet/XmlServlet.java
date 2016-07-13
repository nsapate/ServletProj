package ninad.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res){
		System.out.println("xml servlet response on console");
		String userName = req.getParameter("userName");

		try {
			res.getWriter().append("XMLServlet\t").append(userName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res){
		
		System.out.println("xml servlet response on console");
		String userName = req.getParameter("userName");
		String fullName = req.getParameter("fullName");
		String IQ = req.getParameter("IQ");
		String[] location = req.getParameterValues("location");

		try {
			res.getWriter().append("XMLServlet\t").append("From the post method\t")
			.append(userName).append("\n Full name is\t"+fullName)
			.append("\n Really? Are you" +IQ).append("\n You are at ");
			
			for(String s : location){
				res.getWriter().append(s+"\t");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
