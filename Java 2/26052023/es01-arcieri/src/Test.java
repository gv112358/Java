import java.util.LinkedList;
import java.util.List;

public class Test {
	List<Integer> li = null;

	public Test() {
		li = new LinkedList<>();
	}

	public void executeMethod(RunMe<String> method) {
		method.doit("Ciao");
	}

}