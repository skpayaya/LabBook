package com.cg.iter.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.iter.service.TrainingProgramService;

@WebServlet("/enroll")
public class enroll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=null;
		String id= request.getParameter("id");
		String name = request.getParameter("name");
		
		TrainingProgramService service = new TrainingProgramService();
		if(service.enrollSeats(id)) {
			HttpSession session=request.getSession(true);
			session.setAttribute("trainingName",name);
			rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		}
		else 
		{
			out.println("No more seats left");
		}
		

	}


}
