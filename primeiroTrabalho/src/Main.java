public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 70, 1.75);
        Atleta atleta = new Atleta("Maria", 65, 1.70, "Natação");


        System.out.println(pessoa.getNome() + " tem IMC: " + String.format("%.2f", pessoa.calcularIMC()));
        System.out.println(atleta.getNome() + " (Atleta de " + atleta.getEsporte() + ") tem IMC ajustado: " + String.format("%.2f", atleta.calcularIMC()));
    }
}
