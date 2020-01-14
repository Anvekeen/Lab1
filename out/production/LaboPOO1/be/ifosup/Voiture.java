package be.ifosup;

public class Voiture extends Vehicule {
    private String marque;
    private int roues;
    private String moteur;              // essence, électrique, etc.
    private boolean typeBoiteVitesse;   // automatique - manuel
    private int portes;
    private int places;
    private String type;                // berline, coupé, SUV, etc.
    private int compteur;
    private int numBoiteVitesse;

    public Voiture(String marque, int roues, String moteur, boolean typeBoiteVitesse, int portes, int places, String type) {
        super("automobile", "terrestre");
        this.marque = marque;
        this.roues = roues;
        this.moteur = moteur;
        this.typeBoiteVitesse = typeBoiteVitesse;
        this.portes = portes;
        this.places = places;
        this.type = type;
        compteur = 0;
        numBoiteVitesse = 1;        // en 1ère au départ car cela semble plus cohérent avec les chiffres donnés dans le labo
    }

    public boolean isTypeBoiteVitesse() {
        return typeBoiteVitesse;
    }

    public int getCompteur() {
        return compteur;
    }

    public int getNumBoiteVitesse() {
        return numBoiteVitesse;
    }

    @Override
    public void tourne(int num) {
        super.tourne(num);
    }

    // calcule la position du rapport de vitesse
    public void changeRapport(int num){
        if (!typeBoiteVitesse){
                numBoiteVitesse += num;
                if (numBoiteVitesse <-1) {
                    System.out.println("Erreur : il n'y a pas de valeur de boite de vitesse correspondante !");
                    numBoiteVitesse -= num;
                } else {
                System.out.println("Passage de la boite de vitesse en : " + numBoiteVitesse + "e");
            }
        } else {
            System.out.println("Erreur : la boite de vitesse est automatique !");
        }
    }
    // calcule la vitesse de la voiture
    public void accelere(int num){
        compteur += num;
        if (compteur < 0) {
            System.out.println("Erreur compteur : Impossible de descendre plus bas que zéro !");
            compteur -= num;
        } else {
            System.out.println("Le compteur affiche : " + compteur + " km/h");
        }
    }
}