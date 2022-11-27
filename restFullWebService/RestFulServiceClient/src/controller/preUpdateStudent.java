package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import entity.Class;
import entity.Student;

/**
 * Servlet implementation class preUpdateStudent
 */
@WebServlet("/preUpdateStudent")
public class preUpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public preUpdateStudent() {
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
		int id = Integer.parseInt(request.getParameter("id"));
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/RestFulWebService/rest/Student/getStudent/" + id);
		resource.accept(MediaType.APPLICATION_JSON);
		String data = resource.get(String.class);
		Gson son = new Gson();
		Student s = son.fromJson(data, Student.class);
		request.setAttribute("s", s);
		WebResource resource1 = client.resource("http://localhost:8080/RestFulWebService/rest/Class/getList");
		String dataList = resource1.get(String.class);
		GenericType<List<Class>> listClass = new GenericType<List<Class>>() {
		};
		List<Class> dataClass = son.fromJson(dataList, listClass.getType());
		Object success = request.getAttribute("success");
		if (success != null) {
			request.setAttribute("success", success);
		}
		Object error = request.getAttribute("error");
		if (error != null) {
			request.setAttribute("error", error);
		}
		request.setAttribute("data", dataClass);
		request.getRequestDispatcher("updateStudent.jsp").forward(request, response);
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
