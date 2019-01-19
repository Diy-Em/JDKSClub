package be.ifosup.menu;

import java.util.ArrayList;
import java.util.List;

public class MenuService {

    private static List<Menu> menus = new ArrayList<>();

    static {
        menus.add(new Menu("Diy-EM", "Marbais SC", "Football"));
        menus.add(new Menu("Kevin", "Boitsfort SC", "Basketball"));
        menus.add(new Menu("Saad" , "Louvain-La-Neuve SC", "Volleyball"));
        menus.add(new Menu("Josiane","Uccle SC", "Natation" ));
    }

    public List<Menu> recupereTodo(){
        return menus;
    }

    public void ajouteMenu( Menu menu) {
        menus.add(menu);
    }

    public static void supprime( Menu menu) {
        menus.remove(menu);
    }
}