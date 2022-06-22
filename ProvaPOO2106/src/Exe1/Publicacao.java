package Exe1;

public class Publicacao {

	private String dataPubli;
	private String textoPubli;
	private String linkMidia;
	
	public void Publicacao(String dataPubli, String textoPubli, String linkMidia) {
		
		
	}
	
	public Publicacao(String dataPubli, String textoPubli, String linkMidia) {
		this.dataPubli = dataPubli;
		this.textoPubli = textoPubli;
		this.linkMidia = linkMidia;
	}


	public void setTextoPubli(String textoPubli) {
		this.textoPubli = textoPubli;
	}


	public void setLinkMidia(String linkMidia) {
		this.linkMidia = linkMidia;
	}


	public String getDataPubli() {
		return dataPubli;
	}

	public static double getContadorPubli() {
		return contadorPubli;
	}

	public static double setContadorPubli() {
		return contadorPubli;
	}
	
	public String getTextoPubli() {
		return textoPubli;
	}

	public String getLinkMidia() {
		return linkMidia;
	}


	public static double contadorPubli; 
	
}
