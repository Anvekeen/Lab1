package be.ifosup;

public class Soul extends Kia {
    private String couleur;

    public Soul(String moteur, boolean typeBoiteVitesse, String couleur) {
        super(moteur, typeBoiteVitesse, 4, 5, "Soul");
        this.couleur = couleur;
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

    @Override
    // les "if" statements servent uniquement à rendre le texte un peu plus joli.
    public String toString() {
        String boiteVitesse;
        if (super.isTypeBoiteVitesse()) {
            boiteVitesse = "boite de vitesse automatique";
        }
        else if (super.getNumBoiteVitesse() == -1) {
            boiteVitesse = "rapport de la boite de vitesse = marche arrière";
        }
        else if (super.getNumBoiteVitesse() == 0) {
            boiteVitesse = "rapport de la boite de vitesse = position neutre";
        }
        else { boiteVitesse = "rapport de la boite de vitesse = " + super.getNumBoiteVitesse() + "e";}
        return '\n' +
        "Caractéristiques finales de la voiture :" + '\n' +
        "kilométrage = " + super.getCompteur() + "km/h" + '\n' +
        "cap = " + ( super.getAngleVirage() % 360) + "° (ou " + super.getAngleVirage() + "° au total)" + '\n' +
        boiteVitesse;
        }
}

