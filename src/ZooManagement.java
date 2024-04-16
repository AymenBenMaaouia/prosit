import java.util.Scanner;

public class ZooManagement {
    // Déclaration des variables membres
   int nbrCages;
     String zooName;

    // Constructeur par défaut
    public ZooManagement() {
    }


    public void enterDataFromKeyboard() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide.");
            scanner.next();
        }
        nbrCages = scanner.nextInt();


        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.next();


        scanner.close();
    }


    public void displayMessage() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }


    public static void main(String[] args) {

        ZooManagement zoo = new ZooManagement();

        zoo.enterDataFromKeyboard();

        zoo.displayMessage();
    }
}
