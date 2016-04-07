package server;

import dao.CourseService;
import dao.PersonService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by eugeny on 05.04.2016.
 */
@WebServlet(name = "MainServlet", urlPatterns = {"*.html"})
public class MainServlet extends HttpServlet {
    @EJB
    PersonService ps;

    @EJB
    CourseService cs;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getServletPath().contains("/persons.html")) {
            request.setAttribute("persons", ps.findAll());
            request.getRequestDispatcher("/persons.jsp").forward(request, response);
        } else
        if (request.getServletPath().contains("/cources.html")) {
            request.setAttribute("cources", cs.findAll());
            request.getRequestDispatcher("/cources.jsp").forward(request, response);
        }
    }
}
