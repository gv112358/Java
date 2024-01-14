// dati i seguenti due vettori
// contare quante volte il corrispondente numero
// del secondo vettore è maggiore di quello del primo
// 31 > 3: conta 1
// 12 > 2: conta 2
// ...
// e stampare il risultato
public class es02 {
    public static void main (String [] args) {
    int[] v1 = { 3, 2, 7, 5, 9, 1, 3, 4, 90, 87 };
    int[] v2 = { 31, 12, 47, 25, 9, 11, 1, 4, 88, 32 };
    int min = Integer.MIN_VALUE;
    int counter = 0;
    for (int i=0; i<10; i++){
        if (v2[i]>v1[i]){
            counter++;

        }
        
    }System.out.println(counter);
    }

    

    }
    
}
