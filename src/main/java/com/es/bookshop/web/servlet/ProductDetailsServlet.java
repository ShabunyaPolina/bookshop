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

public class ProductDetailsServlet extends HttpServlet {
    private ProductDAO productDAO;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        productDAO = ProductStorageDAO.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productIdStr = request.getParameter("id");
        Long productId = Long.valueOf(productIdStr);

        Product product = productDAO.get(productId);

        request.setAttribute("product", product);

        request.getRequestDispatcher("/WEB-INF/pages/productDetails.jsp").forward(request, response);
    }
}
