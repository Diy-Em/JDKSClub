package be.ifosup.menu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletMenu_supprime" , urlPatterns = {"/supMenu"})
public class ServletMenu_supprime extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // appeler la méthode supprime
        MenuService.supprime(new Menu(request.getParameter("nom"),request.getParameter("club"),request.getParameter("sport") ));

        // redirection
        response.sendRedirect("menu");

    }
}
