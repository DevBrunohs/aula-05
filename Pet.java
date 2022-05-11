package entities;

public class Pet {

    private String nome;
    private String raca;
    private int anoNasc;
    private double peso;
    private boolean chip;
    private boolean condicao;
    private boolean apto;

    // Construtora s/ parâmetros
    public Pet() {

    }

    // Construtora c/ parâmetros
    public Pet(String nome, String raca, int anoNasc, double peso, boolean chip, boolean condicao) {
        this.nome = nome;
        this.raca = raca;
        this.anoNasc = anoNasc;
        this.peso = peso;
        this.chip = chip;
        this.condicao = condicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isCondicao() {
        return condicao;
    }

    public void setCondicao(boolean condicao) {
        this.condicao = condicao;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

//Um cachorro pode ser encaminhado para adoção se não estiver ferido e pesar mais de 5 kg.
    public void encaminha(boolean condicao, double peso) {
        if (condicao == true && peso >= 5.1) {
            System.out.println("Dog encaminhado para adoção!");
        } else {
            System.out.println("O dog não pode ser encaminhado para a adoção!");
        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", anoNasc=" + anoNasc +
                ", peso=" + peso +
                ", chip=" + chip +
                ", condicao=" + condicao +
                '}';
    }
}
