package question6;

public class Conversion {
	static char[] ConvBinaire (short valeur, byte tailleOctet)
	{
		char[] tbRetour = new char[tailleOctet*8]; //Définir taille tableau à partir de tailleOctet
		char i = Character.forDigit(valeur, tailleOctet);
		if(valeur < tbRetour.length)
		{
			
		}
		return tbRetour;
	}
}
