package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.ClientResponse;
import entity.Student;

/**
 * Servlet implementation class insertStudent
 */
@WebServlet("/insertStudent")
public class insertStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public insertStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String classId = request.getParameter("classId");
		Boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		Date birthday = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			birthday = sdf.parse(request.getParameter("birthday"));
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		Student s = new Student();
		s.setFullName(name);
		s.setAddress(address);
		s.setGender(gender);
		s.setClassId(classId);
		s.setBirthday(birthday);
		Gson gson = new Gson();
		String jsonDataStudent = gson.toJson(s);
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/RestFulWebService/rest/Student/insertSutdent");
		ClientResponse clientResponse = resource.type("application/json").post(ClientResponse.class, jsonDataStudent);
		String result = clientResponse.getEntity(String.class);
		Boolean bl = gson.fromJson(result, Boolean.class);
		if (bl) {
			request.setAttribute("success", "Insert successfully!");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "Insert failed1");
			request.getRequestDispatcher("insertStudent.jsp").forward(request, response);
		}

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
