import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculatrice calculatrice = new Calculatrice();
        double resultat = 0;
        boolean boucleResultat = true;
        boolean bouclePrincipal = true;
        while(bouclePrincipal) {
            if (resultat != 0) {
                System.out.println("Souhaitez-vous garder votre résultat précédent ? (Y/N)");
                String option = sc.nextLine();
                while (!option.equalsIgnoreCase("Y") && !option.equalsIgnoreCase("N")) {
                    System.out.println("Mauvaise saisie. Veuillez saisir Y ou N :");
                    option = sc.nextLine();
                }
                if (option.equalsIgnoreCase("Y")) {
                    System.out.println("Nous gardons le résultat : " + resultat);
                } else if (option.equalsIgnoreCase("N")) {
                    System.out.println("L'ancien résultat est réinitialisé !");
                    resultat = 0;
                }
            }
            System.out.println("Bienvenue dans la calculatrice");
            System.out.println("Le menu est : Addition / Soustraction / multiplication / Division");
            System.out.println("Q pour quitter");
            System.out.println("Quel opération souhaitez vous faire ?");
            String saisieOperation = sc.nextLine();
            double x;
            double y;

            switch (saisieOperation.toLowerCase()) {
                case "addition":
                    if(resultat != 0){
                        System.out.println("Entrez le premier nombre :");
                        x = sc.nextDouble();
                        resultat = calculatrice.Addition(x, resultat);
                    }else{
                        System.out.println("Entrez le premier nombre :");
                        x = sc.nextDouble();
                        System.out.println("Entrez le deuxième nombre :");
                        y = sc.nextDouble();
                        resultat = calculatrice.Addition(x, y);
                    }
                    System.out.println("Le résultat est : " + resultat);
                    break;
                case "subtraction":
                    if(resultat != 0){
                        System.out.println("Entrez le premier nombre :");
                        x = sc.nextDouble();
                        resultat = calculatrice.Subtraction(x, resultat);
                    }else{
                        System.out.println("Entrez le premier nombre :");
                        x = sc.nextDouble();
                        System.out.println("Entrez le deuxième nombre :");
                        y = sc.nextDouble();
                        resultat = calculatrice.Subtraction(x, y);
                    }
                    System.out.println("Le résultat est : " + resultat);
                    break;
                case "multiplication":
                    if(resultat != 0){
                        System.out.println("Entrez le premier nombre :");
                        x = sc.nextDouble();
                        resultat = calculatrice.Multiplication(x, resultat);
                    }else{
                        System.out.println("Entrez le premier nombre :");
                        x = sc.nextDouble();
                        System.out.println("Entrez le deuxième nombre :");
                        y = sc.nextDouble();
                        resultat = calculatrice.Multiplication(x, y);
                    }
                    System.out.println("Le résultat est : " + resultat);
                    break;
                case "division":
                    if(resultat != 0){
                        System.out.println("Entrez le premier nombre :");
                        x = sc.nextDouble();
                        resultat = calculatrice.Division(x, resultat);
                    }else{
                        System.out.println("Entrez le premier nombre :");
                        x = sc.nextDouble();
                        System.out.println("Entrez le deuxième nombre :");
                        y = sc.nextDouble();
                        resultat = calculatrice.Division(x, y);
                    }
                    System.out.println("Le résultat est : " + resultat);
                    break;
                case "q":
                    System.out.println("Vous sortez de la calcultrice !");
                    bouclePrincipal = false;
                    break;

                default:
                    System.out.println("Erreure de saisie Veuillez recomencez ! ");
            }
        }
    }
}