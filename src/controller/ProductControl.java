package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Product;
import persistence.ProductDao;

@WebServlet("/ProductControl")
public class ProductControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			request.setAttribute("msg", new ProductDao().search());
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("msg", "Problem: "+e.getMessage());
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try{
			Product prod = new Product(null,
									   request.getParameter("name"),
									   request.getParameter("maker"),
									   new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("manufdate")),
									   Integer.parseInt(request.getParameter("qtd")),
									   Double.parseDouble(request.getParameter("price"))
			);
			new ProductDao().insert(prod);
			request.setAttribute("msg", "Product has registered.");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}		
	}
}
