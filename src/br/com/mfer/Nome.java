package br.com.mfer;

public class Nome implements Comparable<Nome> {

    private String nome;

    public Nome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public int compareTo(Nome nome) {
        return this.nome.compareTo(nome.getNome());
    }

}
