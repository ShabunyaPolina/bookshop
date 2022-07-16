package com.es.bookshop.web.servlet;

import com.es.bookshop.dao.ProductDAO;
import com.es.bookshop.dao.impl.ProductStorageDAO;
import com.es.bookshop.product.Product;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MainPageServlet extends HttpServlet {
    private ProductDAO productDAO;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        productDAO = ProductStorageDAO.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Product> products = productDAO.getAll();

        request.setAttribute("products", products);

        request.getRequestDispatcher("/WEB-INF/pages/mainPage.jsp").forward(request, response);
    }
}
