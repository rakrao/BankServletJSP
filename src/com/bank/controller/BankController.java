package com.bank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bank.pojo.Customer;
import com.bank.service.BankService;
import com.bank.service.BankServiceImpl;

/**
 * Servlet implementation class BankController
 */
@WebServlet("*.app")
public class BankController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Amount = null;
       
 
    public BankController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		Customer cust=new Customer();
		switch(action) {
		case "/AddNewAccount.app":
			response.sendRedirect("AddNewAccount.jsp");
			break;
			
		case "/Withdraw.app":
			response.sendRedirect("Withdraw.jsp");
			break;
			
		case "/wd.app":
			BankService service = new BankServiceImpl();
			double balance=Double.parseDouble(request.getParameter("Amount"));	
			double res=service.addWithdrawDetails(balance);
			cust.setCurrentBalance(res);
			session.setAttribute("Balance", res);
		RequestDispatcher dispatcher = request.getRequestDispatcher("wd.jsp");
		dispatcher.forward(request, response);
		break;
		
		case "/Deposit.app":
			response.sendRedirect("deposit.jsp");
			break;
			
		case "/dp.app":
			BankService service1 = new BankServiceImpl();
			double balance1=Double.parseDouble(request.getParameter("Amount"));	
			double res1=service1.addWithdrawDetails(balance1);
			//cust.setCurrentBalance(res1);
			session.setAttribute("Balance1", res1);
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("dp.jsp");
		dispatcher1.forward(request, response);
		break;
		
		case "/Fund.app":
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("fundTransfer.jsp");
			dispatcher2.forward(request, response);
		
		case "/saveFundTransfer.app":
			BankService service2 = new BankServiceImpl();
			int fromAccNum = Integer.parseInt(request.getParameter("fromAccNo"));
			int toAccNum = Integer.parseInt(request.getParameter("toAccNo"));
			int balTransfer = Integer.parseInt(request.getParameter("amount"));
			double retrieveBalance = service2.addWithdrawDetails(balTransfer);
			if(retrieveBalance >= 0) {
				double accBal = service2.deposit(balTransfer);
				if(accBal != 0) {
					request.setAttribute("retrievedBalance", retrieveBalance);
					request.setAttribute("accBal", accBal);
					request.setAttribute("fromAccNum", fromAccNum);
					request.setAttribute("balTransfer", balTransfer);
					RequestDispatcher dispatcher3=request.getRequestDispatcher("SuccessFundTransfer.jsp");
					dispatcher3.forward(request,response);
				}
			}
			break;
		}
		
		
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
