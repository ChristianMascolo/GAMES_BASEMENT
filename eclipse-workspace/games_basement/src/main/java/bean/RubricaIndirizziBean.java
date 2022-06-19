package bean;

public class RubricaIndirizziBean implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3948556415938913893L;
	private int idIndirizzo;
	private String idUtente,idCitt�,indirizzo;
	
	
	public RubricaIndirizziBean() {
		// TODO Auto-generated constructor stub
	}

	public RubricaIndirizziBean(int idIndirizzo,String idUtente,String idCitt�,String indirizzo) {
		this.idIndirizzo=idIndirizzo;
		this.idUtente=idUtente;
		this.idCitt�=idCitt�;
		this.indirizzo=indirizzo;
	}
	
	public int getIdIndirizzo() {
		return idIndirizzo;
	}


	public void setIdIndirizzo(int idIndirizzo) {
		this.idIndirizzo = idIndirizzo;
	}


	public String getIdUtente() {
		return idUtente;
	}


	public void setIdUtente(String idUtente) {
		this.idUtente = idUtente;
	}


	public String getIdCitt�() {
		return idCitt�;
	}


	public void setIdCitt�(String idCitt�) {
		this.idCitt�= idCitt�;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "RubricaIndirizziBean [idIndirizzo=" + idIndirizzo + ", idUtente=" + idUtente + ", idCitt�=" + idCitt�
				+ ", indirizzo=" + indirizzo + "]";
	}

	
	
}
