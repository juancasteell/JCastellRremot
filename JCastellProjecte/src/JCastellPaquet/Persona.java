package JCastellPaquet;

/**
 * <h3>Classe Persona, per emmagatzemar el nom i l'edat
 * d'una persona <h2>
 * @version 03-2024
 * @author Juan Castell
 * @since 15-03-2024
 */

public class Persona {

	private String nom; 	// Nombre de la persona
	private int edat; 		// Edad de la persona

	/**
	 * Constructor de la classe Persona amb el paràmetres
	 * @param nom Nombre de la persona
	 * @param edat Edad de la persona
	 * */
	
	public Persona(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
	}
	
	/**
	 * Mètode de selecció del nom de la persona
	 * @return nom Nom de la persona
	 * */

	public String getNom() {
		return nom;
	}
	
	/**
	 * Mètode d'accés al nom de la persona
	 * @param nom Nom que se li assigna a la persona
	 * */

	public void setNom(String nom) {
		this.nom = nom;
	}

}
