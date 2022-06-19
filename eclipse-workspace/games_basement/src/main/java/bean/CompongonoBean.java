package bean;

public class CompongonoBean implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8327016825696622708L;
	private String codiceArticoli,numOrdine;
	private int quantit�;
	private double prezzo_storico;
	
	public CompongonoBean() {
		// TODO Auto-generated constructor stub
	}

	public CompongonoBean(String codiceArticoli,String numOrdine,int quantit�,double prezzo_storico){
		this.codiceArticoli=codiceArticoli;
		this.numOrdine=numOrdine;
		this.quantit�=quantit�;
		this.prezzo_storico=prezzo_storico;
	}

	public String getCodiceArticoli() {
		return codiceArticoli;
	}


	public void setCodiceArticoli(String codiceArticoli) {
		this.codiceArticoli = codiceArticoli;
	}


	public String getNumOrdine() {
		return numOrdine;
	}


	public void setNumOrdine(String numOrdine) {
		this.numOrdine = numOrdine;
	}


	public int getQuantit�() {
		return quantit�;
	}


	public void setQuantit�(int quantit�) {
		this.quantit�= quantit�;
	}

	public double getPrezzo_storico() {
		return prezzo_storico;
	}

	public void setPrezzo_storico(double prezzo_storico) {
		this.prezzo_storico = prezzo_storico;
	}

	@Override
	public String toString() {
		return "CompongonoBean [codiceArticoli=" + codiceArticoli + ", numOrdine=" + numOrdine + ", quantit�="
				+ quantit�+ "]";
	}

}
