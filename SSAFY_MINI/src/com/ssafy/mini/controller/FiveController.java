package com.ssafy.mini.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssafy.mini.dao.UserDao;
import com.ssafy.mini.util.Encrypt;
import com.ssafy.mini.vo.User;

/**
 * Servlet implementation class ssafitController
 */
@WebServlet("/main")
public class FiveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDao uDao = UserDao.getInstance();
	private Encrypt ecp = new Encrypt();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		try {
			doProcess(request, response);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}
	
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NumberFormatException, SQLException {
		
		String act = request.getParameter("act");
		
		switch(act) {
		case "regist" : doRegistUser(request, response); break;
		case "login" : doLoginUser(request, response); break;
		}
		
	}

	private void doRegistUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		String ecpPassword = ecp.getEncrypt(password);
		
		User u = new User(id, ecpPassword);
		
		uDao.registUser(u);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}
	
	private void doLoginUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String ecpPassword = ecp.getEncrypt(password);
		
		User u = uDao.loginUser(id, ecpPassword);
		
		request.setAttribute("password", u.getPassword());
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
