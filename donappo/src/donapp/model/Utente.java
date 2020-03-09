package donapp.model;

public class Utente {
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private String email;
	
	
	//TO STRING
	@Override
	public String toString() {
		return "Utente\n[username=" + username + ",\npassword=" + password + ",\nnome=" + nome + ",\ncognome=" + cognome
				+ ",\nemail=" + email + "]\n";
	}

	//COSTRUTTORE SENZA PARAMETRI
	public Utente() {
		
	}
	
	//COSTRUTTORE CON PARAMETRI
	public Utente(String username, String password, String nome, String cognome, String email) {
		super();
		this.username = username;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}
	//GETTER E SETTER
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
