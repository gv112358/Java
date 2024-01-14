class Persona {
    String nome;
    String cognome;
    int eta;

    public Persona(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    int getEta(){
        return eta;
    }

    public String toString(){
        return String.format("%s, %s, %d", nome, cognome, eta);
    }

}