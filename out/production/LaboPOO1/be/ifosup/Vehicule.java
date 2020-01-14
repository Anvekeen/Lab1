package be.ifosup;

public class Vehicule {         // Un véhicule sert au transport, ici nous le distinguerons
    private String type;        // par son type (aéronef, automobile, bateau, hippomobile, deux-roues, etc.)
    private String milieu;      // et son milieu (aquatique, spatial, terrestre,...)
    private int angleVirage;

    public Vehicule(String type, String milieu) {
        this.type = type;
        this.milieu = milieu;
        angleVirage = 0;
    }

    public int getAngleVirage() {
        return angleVirage;
    }

    // calcule l'angle de virage du véhicule
    public void tourne(int num) {
        angleVirage += num;
        if (num < 0) {
            System.out.println("Virage de la voiture à gauche de : " + Math.abs(num) + "°");
        } else {
            System.out.println("Virage de la voiture à droite de : " + num + "°");
        }
    }
}