package be.ifosup;

public class Main {
    public static void main(String[] args) {
        Soul maVoiture = new Soul("essence", true, "bleu");         // boite automatique
        Soul monAutreVoiture = new Soul("diesel",false, "rouge");   // boite manuelle

        // Test voiture Automatique
        System.out.println("---------------Voiture Automatique -------------------------------");
        maVoiture.accelere(30);
        maVoiture.tourne(90);
        maVoiture.accelere(100);
        maVoiture.accelere(-30);
        System.out.println(maVoiture);

        // Test voiture boite manuelle
        System.out.println("\n -----------------Voiture Manuel -------------------------------");
        monAutreVoiture.accelere(30);
        monAutreVoiture.changeRapport(1);
        monAutreVoiture.accelere(30);
        monAutreVoiture.tourne(-45);
        monAutreVoiture.changeRapport(3);
        monAutreVoiture.accelere(100);
        System.out.println(monAutreVoiture);
    }
}