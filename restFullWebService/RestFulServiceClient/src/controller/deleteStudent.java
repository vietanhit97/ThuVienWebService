package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.google.gson.Gson;

/**
 * Servlet implementation class deleteStudent
 */
@WebServlet("/deleteStudent")
public class deleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/RestFulWebService/rest/Student/deleteStudent/"+id);
		resource.accept(MediaType.APPLICATION_JSON);
		String data = resource.type(MediaType.APPLICATION_JSON).delete(String.class);
		Gson son = new Gson();
		Boolean bl = son.fromJson(data, Boolean.class);
		if(bl) {
		request.setAttribute("success", "Delete successfully!");
		}else {
		request.setAttribute("error", "Delete failed!");
		}
		request.getRequestDispatcher("loadStudent").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
