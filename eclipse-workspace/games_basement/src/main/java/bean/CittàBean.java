package bean;

public class CittàBean {
	private String idCittà,nomeCittà,cap;
	
	
	public CittàBean() {
		// TODO Auto-generated constructor stub
	}

	public CittàBean(String idCittà,String nomeCittà) {
		this.idCittà=idCittà;
		this.nomeCittà=nomeCittà;
	}
	
	
	public String getIdCittà() {
		return idCittà;
	}


	public void setIdCittà(String idCittà) {
		this.idCittà = idCittà;
	}


	public String getNomeCittà() {
		return nomeCittà;
	}


	public void setNomeCittà(String nomeCittà) {
		this.nomeCittà = nomeCittà;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

}
