package secondProject;

public class Conversion {

	// Constructeur
	Conversion(){
		
	}
	
	static char[] ConvBinaire(short valeur, byte tailleOctet){
		
		char[] tbBinaire = new char[tailleOctet * 8];
		int i;
		int temp;
		
		// Mise à '0' de toutes les cases du tableau
		for (i = 0; i < (tailleOctet * 8); i++) {
			
			tbBinaire[i] = '0';
		}
		
		// Permet d'inverser la valeur dans le tableau
		i = tailleOctet * 8 - 1;
		
		// Tant que le nombre est plus grand que 0
        while (valeur > 0){
        	
        	temp = (valeur % 2);
        	tbBinaire[i] = java.lang.Character.forDigit(temp, 2);
            valeur = (short) (valeur / 2);
            i--;
        }
        
		return tbBinaire;
	}
	 
}
