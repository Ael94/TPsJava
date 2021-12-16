package  ma.education.tp1.introduction;

public class Salle  {
	protected long id;
	protected String nom;
	
	public Salle (){
		System.out.println("sans parametres");
	}
	public Salle (String nom){
		this.nom=nom;
		System.out.println("un seul parametre");
	}
	public Salle (long id,String nom){
		this(nom);
		this.id=id;
		System.out.println("deux parametres");
		
	}
	

}
