public class esercizio2 {
    public static void main(String[] args) throws Exception {
        prova prova1 = new prova();
        

        System.out.println("il mese corrente  è: " + prova1.mese(5));
        System.out.println("Qualche linea vuota per provare che -3 e 15 non sono associati ad alcun mese ");
        System.out.println(prova1.mese(15));
        System.out.println(prova1.mese(-3));
        System.out.println("il massimo tra i numeri inseriti è: " + prova1.max(12,16,92));
        System.out.println("Il numero di cifre di 321 è: " + prova1.numberOfDigits(321));
        System.out.println("La somma delle cifre di 321 è: " + prova1.sumOfDigits(312));
        

}
}
