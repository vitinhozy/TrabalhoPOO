// Subclasse Atleta que herda de Pessoa
public class Atleta extends Pessoa {
    private String esporte;

    // Construtor
    public Atleta(String nome, double peso, double altura, String esporte) {
        super(nome, peso, altura); // chama o construtor da superclasse
        this.esporte = esporte;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }


    @Override
    public double calcularIMC() {
        double imcOriginal = super.calcularIMC();
        return imcOriginal * 0.95; // reduz 5% para atletas de alto rendimento
    }
}
