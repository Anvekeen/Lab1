package be.ifosup;

public class Kia extends Voiture {
    private String modele;

    public Kia(String moteur, boolean typeBoiteVitesse, int portes, int places, String modele) {
        super("Kia", 4, moteur, typeBoiteVitesse, portes, places, "Crossover");
        this.modele = modele;
    }

    @Override
    public void tourne(int num) {
        super.tourne(num);
    }

    @Override
    public void changeRapport(int num) {
        super.changeRapport(num);
    }

    @Override
    public void accelere(int num) {
        super.accelere(num);
    }
}