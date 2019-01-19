package be.ifosup.menu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletTodo_ajoute", urlPatterns = {"/add-menu"})
public class ServletMenu_ajoute extends HttpServlet {

    private MenuService todoService = new MenuService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // force l'UTF8
        request.setCharacterEncoding("UTF-8");

        // récupération du champs dans le formulaire
        String nom = request.getParameter("menu");
        String club = request.getParameter("club");
        String sport = request.getParameter("sport");

        // ajouter au todos
        todoService.ajouteMenu( new Menu(nom, club, sport));

        // redirection avec la méthode get!
        response.sendRedirect("menu");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("vues/menuAdd.jsp").forward(request, response);

    }
}
