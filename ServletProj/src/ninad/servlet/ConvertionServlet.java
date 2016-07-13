package ninad.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ninad.classes.NumberConvertion;

@WebServlet(description = "A convertion servlet", urlPatterns = { "/Convert" })
public class ConvertionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("This renders on console");
//		response.getWriter().append("Served at: ").append(request.getContextPath()).append("	Aaaaaaaaaaaaaaaaaaaaaaaa");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		
		NumberConvertion nc = new NumberConvertion();
		String convertionNumber = "";
		String convertionType;
		convertionType = request.getParameter("convertionType");
		
		switch(convertionType){
			case "binary" : convertionNumber = nc.convertBinary(request.getParameter("number"));
							break;
			case "hexa" :	convertionNumber = nc.convertHexa(request.getParameter("number"));
							break;	
			case "octal" : convertionNumber = nc.convertOctal(request.getParameter("number"));
							break;				
		    default :	
		}
		
		try {
			response.getWriter().append("The converted value is \n")
			.append(convertionNumber);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

