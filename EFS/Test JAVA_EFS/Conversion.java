// question 6 - Einar Farinas
public class Conversion
{
	public char[] ConvBinaire(short valeur, byte tailleOctet)
	{
		// Tableau de char
		char[] tbChar = new char[tailleOctet*8];
		// Pour stocker le digit  binaire
		short tempVal;
		// Pour le choix de la caise du tableau de char
		byte indexCnt = (byte) ((tailleOctet*8) - 1);
		do
		{
			tempVal = (short) (valeur % 2);
			valeur = (short) (valeur / 2);
			tbChar[indexCnt] = Character.forDigit(tempVal, 10);
			indexCnt--;
		}while(valeur != 0);
				
		return tbChar;
	}
}
