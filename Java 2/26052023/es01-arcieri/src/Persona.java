public class Persona {
	String nome;
	String cognome;

	public Persona(String n, String c) {
		nome = n;
		cognome = c;
	}

	public String GetNome() {
		return nome;
	}

	public String GetCognome() {
		return cognome;
	}

	public String toString() {
		// StringBuilder sb = new StringBuilder();
		// sb.append(cognome);
		// sb.append(", ");
		// sb.append(nome);
		// return sb.toString();

		return String.format("nome: %s, cognome: %s", nome, cognome);
	}

}
