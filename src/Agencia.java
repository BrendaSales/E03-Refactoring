public class Agencia {

    private int numAgencia;
    private String gerente;

    public Agencia(int numAgencia, String gerente) {
        this.numAgencia = numAgencia;
        this.gerente = gerente;
    }

    public String toString() {
       
        return String.format("\n\n-----AGENCIA-----\n\nAg.: %d\nGerente: %s", this.numAgencia, this.gerente);
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }
}