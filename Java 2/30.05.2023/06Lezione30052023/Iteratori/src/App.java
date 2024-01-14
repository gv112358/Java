import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Pseudo {
    int seed;
    final int a = 123121;
    final int b = 986517;
    int x;

    Pseudo(){
        seed = (int) System.nanoTime();
        x = seed;
    }

    Pseudo(int v) {
        seed = v;
        x = seed;
    }

    int next() {
        long ret = (long) a * (long) x + (long) b;
        x = (int) 
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> li = new LinkedList<>();

        Random rnd = new Random(System.nanoTime());
        for(int i=0; i<100;i++){
            li.add(rnd.nextInt());
        }
    }
}
