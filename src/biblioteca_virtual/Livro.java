package biblioteca_virtual;

public class Livro {
    
    private String nome;
    private String autor;
    private String editora;
    private int data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Livro: " + nome + ", autor: " + autor + ", editora: " + editora + ", data: " + data;
    }
    
}
