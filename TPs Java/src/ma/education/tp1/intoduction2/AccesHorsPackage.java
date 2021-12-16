package ma.education.tp1.intoduction2;

import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle {
	public void afficher(Salle s) {
		//System.out.println(s.id ); //par reference
		//System.out.println(s.nom );//par reference
		System.out.println(id);
		System.out.println(nom);
	}
}
