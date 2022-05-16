package bean;


public class ArticoliBean {
	private String nome,descrizione,immagine,codiceA,tipologia;
	private int codiceC;
	private float prezzo;
	private boolean offerta;
	
	public ArticoliBean() { }
	
	public ArticoliBean(String codiceA ,int codiceC,String descrizione,float prezzo,String nome,
			           String tipologia,boolean offerta,String immagine) {
		this.codiceA=codiceA;
		this.codiceC=codiceC;
		this.descrizione=descrizione;
		this.prezzo=prezzo;
		this.descrizione=descrizione;
		this.nome=nome;
		this.tipologia=tipologia;
		this.offerta=offerta;
		this.immagine=immagine;
	}


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}


	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	/**
	 * @return the immagine
	 */
	public String getImmagine() {
		return immagine;
	}


	/**
	 * @param immagine the immagine to set
	 */
	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}


	/**
	 * @return the codiceA
	 */
	public String getCodiceA() {
		return codiceA;
	}


	/**
	 * @param codiceA the codiceA to set
	 */
	public void setCodiceA(String codiceA) {
		this.codiceA = codiceA;
	}


	/**
	 * @return the tipologia
	 */
	public String getTipologia() {
		return tipologia;
	}


	/**
	 * @param tipologia the tipologia to set
	 */
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}


	/**
	 * @return the codiceC
	 */
	public int getCodiceC() {
		return codiceC;
	}


	/**
	 * @param codiceC the codiceC to set
	 */
	public void setCodiceC(int codiceC) {
		this.codiceC = codiceC;
	}


	/**
	 * @return the prezzo
	 */
	public float getPrezzo() {
		return prezzo;
	}


	/**
	 * @param prezzo the prezzo to set
	 */
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}


	/**
	 * @return the offerta
	 */
	public boolean isOfferta() {
		return offerta;
	}


	/**
	 * @param offerta the offerta to set
	 */
	public void setOfferta(boolean offerta) {
		this.offerta = offerta;
	}
}
