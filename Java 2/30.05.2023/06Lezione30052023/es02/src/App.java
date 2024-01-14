import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class App {
    
    //private static Object Persona;

    public static void main(String[] args) throws Exception {

        List<Integer> li = new LinkedList<>();
        li.addAll(Arrays.asList(new Integer[] {5, 6, 8, 7, 9, 1}));

        //Ordinamento lista
        //ordinare N elementi richiede costante*N*log(N) operazioni
        //dove il log è in base 2
        //costante >= 1 (complessità computazionale)
        System.out.println(li.toString());
        Collections.sort(li);
        System.out.println(li.toString());
        //!!!Collections sort modifica la lista
        // non può usare il for che non modifica la lista ma 
        //visualizza gli elementi

        //Creo lista di persone
        List<Persona> lp = new LinkedList<>();
        lp.add(new Persona("Mario", "Rossi", 24));
        lp.add(new Persona("Paolo", "Bianchi", 25));
        lp.add(new Persona("Giuseppe", "Verdi", 21));
        lp.add(new Persona("Antonio", "Turchese", 19));

        
        Collections.sort(lp, Comparator.comparingInt(Persona::getEta));

        lp.sort(Comparator.comparingInt(Persona::getEta)); //equivalente a sopra
        //Come posso stampare un oggetto della mia classe utilizzando il metodo
        //System.out.println()??
        //-----> aggiungendo il metodo toString()
        System.out.println(lp.toString());

        //Esempio: supponiamo che la classe persona non abbia il metodo toString
        System.out.println(new Persona("n", "c", 21));
        //La println chiamerà il metodo toString() di persona
        //ma Persona non ha il metodo toString() quindi



        //Come posso ordinare rispetto al nome o al cognome?
        //devo passare al comparatore una funzione/metodo di compare/confronto
        Comparator<Persona> comp = new Comparator<>() {
            public int compare(Persona p1, Persona p2) {
                //ordinamento per nome 
                return p1.nome.compareTo(p2.nome);
            }
        };
        



    }

    
}
