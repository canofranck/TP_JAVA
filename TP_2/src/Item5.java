public class Item5 {

    public static void main(String[] args) {
        System.out.println("Racine carre de 4 = " + Math.sqrt(4));
        System.out.println("Cosinus de 4 = " + Math.cos(4));
        System.out.println("PI ~= " + Math.PI);
        System.out.println("4 x 4 = " + Math.multiplyExact(4,4));
        System.out.println("nombre entiers aleatoires compris entre 1 et 10 ");
        for (int i = 1 ; i <=5 ; i++){
            System.out.println((int)(Math.random()*11));
        }
    }
}
