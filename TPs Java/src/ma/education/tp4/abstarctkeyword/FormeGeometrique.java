package ma.education.tp4.abstarctkeyword;

public abstract class FormeGeometrique {
	public double surface;
	public abstract double calculerSurface();
	public void afficherSurface() {
		System.out.println(this.surface);
		
		
	}

}
