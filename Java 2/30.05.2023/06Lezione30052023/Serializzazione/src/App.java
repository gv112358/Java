import com.fasterxml.jackson.databind.ObjectMapper;

class Studente {
    public String nome;
    public int[] voti;

    public Studente(String n, int[] v) {
        nome = n;
        voti = v;
    }
}

public class App {

    public static void main(String[] args) throws Exception {

        Studente st1 = new Studente("mario", new int[] { 10, 20, 24 });

        var classe = st1.getClass();
        var fields = classe.getDeclaredFields();
        System.out.println(fields[0].getName());
        System.out.println(fields[0].getType().getSimpleName());
        System.out.println(fields[1].getName());
        System.out.println(fields[1].getType().getSimpleName());

        {
            // Codice per serializzare un oggetto
            System.out.println("JSON Generation");

            try {
                ObjectMapper objectMapper = new ObjectMapper();
                String jsonString = objectMapper.writeValueAsString(st1);
                System.out.println(jsonString);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

