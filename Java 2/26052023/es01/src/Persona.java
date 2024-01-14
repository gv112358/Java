public class Persona {
	String cognome;
	String nome;
	int eta;
	String professione;

	public Persona() {
		cognome = null;
		nome = null;
		eta = -1;
		professione = null;
	}

	public Persona(String cognome, String nome, int eta, String professione) {
		this.cognome = cognome;
		this.nome = nome;
		this.eta = eta;
		this.professione = professione;
	}

	public int IncreaseEta() {
		return ++eta;
	}

	public void UpdateNome(String newNome) {
		nome = newNome;
	}

	public void UpdateCognome(String newCognome) {
		cognome = newCognome;
	}

	public void UpdateProfessione(String newProfessione) {
		professione = newProfessione;
	}

	public void UpdateEta(int newEta) {
		eta = newEta;
	}

}