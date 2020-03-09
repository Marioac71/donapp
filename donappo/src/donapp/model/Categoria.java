package donapp.model;

public class Categoria {
	private int idCategoria;
	private String nome;
	
	
	
	//TO STRING
	@Override
	public String toString() {
		return "Categoria\n[idCategoria=" + idCategoria + ",\nnome=" + nome + "]\n";
	}
	//COSTRUTTORE SENZA PARAMETRI
	public Categoria() {
		
	}
	//COSTRUTTORE CON PARAMETRI
	public Categoria(int idCategoria, String nome) {
		super();
		this.idCategoria = idCategoria;
		this.nome = nome;
	}
	//GETTER E SETTER
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
