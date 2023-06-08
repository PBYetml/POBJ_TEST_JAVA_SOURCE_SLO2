/* 	Test de POBJ sur Java 
	Miguel Santos
	08 juin 2023 */
	
/* Question 6 */
/* nom du fichier = Conversion.java */
class Conversion {
	
	static char[] ConvBinaire(short valeur, byte tailleOctet)
	{
		int tempBits;
		int nbreBits = 8 * tailleOctet;	
		
		char[] charArray = new char[nbreBits];
		
		for(int i = nbreBits; i > 0; i--)
		{
			tempBits = (valeur >> (i - 1)) & 0x01;
			
			charArray[nbreBits - i] = Character.forDigit(tempBits, 2);
		}
		
		return charArray;	
	}	
}
