package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import entity.Class;
/**
 * Servlet implementation class initClass
 */
@WebServlet("/initClass")
public class initClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public initClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/RestFulWebService/rest/Class/getList");
		String data = resource.get(String.class);
		Gson son = new Gson();
		GenericType<List<Class>> listClass = new GenericType<List<Class>>() {
		};
		List<Class> dataClass = son.fromJson(data, listClass.getType());
		Object success = request.getAttribute("success");
		if (success != null) {
			request.setAttribute("success", success);
		}
		// xu ly error
		Object error = request.getAttribute("error");
		if (error != null) {
			request.setAttribute("error", error);
		}
		request.setAttribute("data", dataClass);
		request.getRequestDispatcher("insertStudent.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
