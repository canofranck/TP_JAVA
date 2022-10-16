public class Item3 {

    public static void main(String[] args) {
        //Interdit de modifier les 3 lignes suivantes

        byte c = 70;
        byte d = 70;
        byte e;

        //Mais vous pouvez modifier cette ligne
        e = (byte) (c + d);
        System.out.println("valeur de e : " + e);

    }

}
//  la ligne 11 devient : e = (byte) (c + d);

//si on remplace 50 par 70 , la valeur dépasse la valeur max d un byte qui est 127
//il deborde et reprends à partir de ca valeur miminum negative

//le resultat est donc -116