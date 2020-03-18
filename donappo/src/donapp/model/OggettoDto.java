package donapp.model;

public class OggettoDto {
	private Integer idOggetto;
	private String foto;
	private String nome;
	private String colore;
	private String descrizione;
	private String luogoRitiro;
	private String disponibilita;
	private String idProprietario;
	private String idPrenotante;
	private int idCategoria;
	private String nomeCat;
	
	
	//TO STRINGa
	@Override
	public String toString() {
		return "Oggetto\n[idOggetto=" + idOggetto + ",\nfoto=" + foto + ",\nnome=" + nome + ",\ncolore=" + colore
				+ ",\ndescrizione=" + descrizione + ",\nluogoRitiro=" + luogoRitiro + ",\ndisponibilita=" + disponibilita
				+ ",\nidProprietario=" + idProprietario + ",\2nidPrenotante=" + idPrenotante + ",\nidCategoria="
				+ idCategoria + "]\n";
	}

	//COSTRUTTORE SENZA PARAMETRI
	public OggettoDto() {
		
	}
	
	//COSTRUTTORE CON PARAMETRI
	public OggettoDto(Integer idOggetto, String foto, String nome, String colore, String descrizione, String luogoRitiro,
			String disponibilita, String idProprietario, String idPrenotante, int idCategoria, String nomeCat) {
		super();
		this.idOggetto = idOggetto;
		this.foto = foto;
		this.nome = nome;
		this.colore = colore;
		this.descrizione = descrizione;
		this.luogoRitiro = luogoRitiro;
		this.disponibilita = disponibilita;
		this.idProprietario = idProprietario;
		this.idPrenotante = idPrenotante;
		this.idCategoria = idCategoria;
		this.nomeCat=nomeCat;
	}
	//SETTER E GETTER
	public Integer getIdOggetto() {
		return idOggetto;
	}
	public void setIdOggetto(Integer idOggetto) {
		this.idOggetto = idOggetto;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getLuogoRitiro() {
		return luogoRitiro;
	}
	public void setLuogoRitiro(String luogoRitiro) {
		this.luogoRitiro = luogoRitiro;
	}
	public String getDisponibilita() {
		return disponibilita;
	}
	public void setDisponibilita(String disponibilita) {
		this.disponibilita = disponibilita;
	}
	public String getIdProprietario() {
		return idProprietario;
	}
	public void setIdProprietario(String idProprietario) {
		this.idProprietario = idProprietario;
	}
	public String getIdPrenotante() {
		return idPrenotante;
	}
	public void setIdPrenotante(String idPrenotante) {
		this.idPrenotante = idPrenotante;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCat() {
		return nomeCat;
	}

	public void setNomeCat(String nomeCat) {
		this.nomeCat = nomeCat;
	}
	
	

}