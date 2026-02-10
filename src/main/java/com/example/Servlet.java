package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchServlet", urlPatterns = {"/search"})
public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
                
        String keyword = request.getParameter("searchName");
        if (keyword == null) {
            keyword = "";
        }
        ProductDAO dao = new ProductDAO();
        List<Product> results = dao.searchProducts(keyword);
        request.setAttribute("productList", results);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}