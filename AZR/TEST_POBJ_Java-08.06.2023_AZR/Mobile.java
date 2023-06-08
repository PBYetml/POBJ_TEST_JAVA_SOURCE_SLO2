public class Mobile {
	protected double posX;
	protected double posY;
	protected double vitesseX;
	protected double vitesseY;
	protected String Vehicule;

	protected Mobile(double x, double y){
		this.posX = x;
		this.posY = y;
	}

	protected double ChoixVitesse(){
        return 0;
	}

	private boolean Run(){
		return true;
	}

}