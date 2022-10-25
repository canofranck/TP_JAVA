import java.util.Scanner;
public class Item_1 
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("Entrez une somme en € : ");
        double eurosomme = scanner.nextDouble();
        double change=0.97,dollars;
        double dollar=eurosomme*change;

        System.out.println(eurosomme + "€ = ");
        System.out.println( dollar+"$");
        System.out.println( dollar/1000+"K$");
        System.out.println( dollar/1000000+"K$");
    }
}
