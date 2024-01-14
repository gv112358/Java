public class App {
    public static void main(String[] args) throws Exception {
        // Dato l'array numbers
        int[] numbers = { 5, 8, 2, 10, 3 };

        // Implementare la funzione findMaxNumber che trova il numero più grande
        // nell'array
        int maxNumber = findMaxNumber(numbers);
        System.out.println("Max number: " + maxNumber);
        
    }

    private static int findMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int x : numbers) {
            max = (max > x) ? max : x;  //operatore Ternario ?: 
            //espressione logica ? true:false
            
        }
        return 0;
    }
}
