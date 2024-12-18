import java.util.Scanner;

public class Factoriel {


    public static long calculerFactoriel(int nombre) {

        if (nombre < 0) {
            System.out.println("Le nombre doit être positif ou nul.");
            return -1;
        }

        long factoriel = 1;
        for (int i = 1; i <= nombre; i++) {
            factoriel *= i;
        }
        return factoriel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez un nombre entier positif: ");
        int nombre = scanner.nextInt();


        long resultat = calculerFactoriel(nombre);

        if (resultat != -1) {
            System.out.println("Le factoriel de " + nombre + " est " + resultat);
        }

        scanner.close();
    }
}
