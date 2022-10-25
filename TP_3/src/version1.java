import java.util.Scanner;

public class version1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nom, prenom;
        char rep;

        do {
            //SAISIE
            System.out.println("Nom du cavalier: ");
            nom = scanner.nextLine();
            System.out.println("Prenom du cavalier: ");
            prenom = scanner.nextLine();


            // INFORMATIONS SUPPLEMENTAIRES
            System.out.println("Demande d'informations supplementaires :\n " +
                    "Adresse du cavalier : ");
            String adresse = scanner.nextLine();

            System.out.println("Numero de carte de la FNTE : ");
            String numeroCarte = scanner.nextLine();

            System.out.println("Les trois chevaux preferes : ");
            String chevauxPref = scanner.nextLine();


            //PRESENTATION
            System.out.println(
                    "Cavalier no " + numeroCarte
                            + "\n\t" + prenom + " " + nom.toUpperCase()
                            + "\n\t" + adresse
                            + "\n\tchevaux ; " + chevauxPref
            );


            // MESSAGE DE FIN
            // QUESTION 2.3 - ne pas accepter reponse autre que o/n

            while (true) 
            {
                System.out.println("Voulez-vous continuer? (o/n) ?");
                rep = scanner.nextLine().charAt(0);
                if (checkFinalAnswer(rep)) {
                    break;
                } else {
                    System.out.println("Reponse non valide");
                }
            }
        } while (rep == 'o');
        scanner.close();
    }

    static boolean checkFinalAnswer(char rep)
    {
        if (rep == 'o' || rep == 'n')
        {
            return true;
        }
        return false;
    }
}
