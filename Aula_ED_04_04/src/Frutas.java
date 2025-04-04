public class Frutas {
    private String nome;
    private String genero;
    private int id;

    public Frutas(){}
    
    public Frutas(String nome, String genero, int id) {
        this.nome = nome;
        this.genero = genero;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
