//Adelia Vivian Conscetta e Maria Eduarda Queiroz de Almeida 

package model;

public abstract class InstrumentoMusical {

    protected String nome;
    protected String material;
    protected boolean afinado;

    protected InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
        this.afinado = false; 
    }

    public abstract String tocar();

    public void afinar() {
        this.afinado = true;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Material: " + material + " | Afinado: " + (afinado ? "Sim" : "Não"));
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isAfinado() {
        return afinado;
    }
}
