package be.ifosup.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletLogin", urlPatterns = {"/"})
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // récupération des deux paramètres transmis par le formulaire
        String nom = request.getParameter("nom");
        String pass = request.getParameter("pass");

        // test avec la méthode de validation
        if (nom.equals("goupyl") && pass.equals("1234")) {
            request.getSession().setAttribute("nom", nom);
            request.getSession().setAttribute("nav", 1);

            // redirection vers le servlet todo
            response.sendRedirect("todo");
        } else {
            // retour a la page login.jsp
            request.getSession().setAttribute("nav", 0);
            request.setAttribute("errorMessage", "Login invalide");
            request.getRequestDispatcher("/vues/login.jsp").forward(request, response);
        }
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        request.getSession().setAttribute("nav", 0);
        request.getRequestDispatcher("/vues/login.jsp").forward(request, response);
    }
}
