package be.ifosup.menu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletMenu_list", urlPatterns = {"/menu"})
public class ServletMenu_list extends HttpServlet {

    // Création d'un instance de TodoService
    private MenuService menuService = new MenuService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupération des todos
        request.setAttribute("menus", menuService.recupereTodo());

        // affichage de la vue todoList
        request.getRequestDispatcher("/vues/menuList.jsp").forward(request, response);
    }
}