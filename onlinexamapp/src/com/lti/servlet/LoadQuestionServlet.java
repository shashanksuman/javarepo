package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.exam.model.Question;
import com.lti.exam.model.QuestionBankLoader;

/**
 * Servlet implementation class LoadQuestionServlet
 */
@WebServlet("/LoadQuestionServlet")
public class LoadQuestionServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	int qNo = 0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		QuestionBankLoader qbLoader = new QuestionBankLoader();
		List<Question> questions = qbLoader.loadQuestionsOnJava();
		HttpSession session = request.getSession();
		session.setAttribute("totalNoOfQuestions",questions.size());
		Integer qNo = (Integer) session.getAttribute("qNumber");
		System.out.println(questions.size());
		if(qNo  == null)
			qNo = 0;
		if(qNo < questions.size()) {
			Question q = questions.get(qNo++);
			session.setAttribute("currentQs",q);
			session.setAttribute("qNumber",qNo);
			response.sendRedirect("showQuestion.jsp");
		}
		else 
		{
			response.sendRedirect("ShowResult.jsp");
		}
	}
}
