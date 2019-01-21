package be.ifosup.menu;

public class Menu {
    // attributs
    private String nom;
    private String club;
    private String sport;

    // constructeur

    public Menu(String nom, String club, String sport) {
        this.nom = nom;
        this.club = club;
        this.sport = sport;
    }

    // Getters & Setters


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;

        Menu menu = (Menu) o;

        return getNom() != null ? getNom().equals(menu.getNom()) : menu.getNom() == null;
    }

    @Override
    public int hashCode() {
        return getNom() != null ? getNom().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "nom='" + nom + '\'' +
                ", club='" + club + '\'' +
                ", sport='" + sport + '\'' +
                '}';
    }
}
