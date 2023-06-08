package secondProject;

public class Demo {

	public static void main(String[] args) {
		
		
		byte[] tbEntier = new byte[5];
		
		for (int i = 0; i < 5; i++) {
			
			tbEntier[i] = (byte)(i + 1); // Assigne les valeurs de 1 à 5
			System.out.println(tbEntier[i]); // Affiche les valeurs dans la console
		}

	}

}