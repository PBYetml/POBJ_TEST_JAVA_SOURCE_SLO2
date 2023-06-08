
public class Conversion {

	Conversion()
	{
		
	}
	
	static char []ConvBinaire(short Valeur,byte tailleOctet)
	{
		char[] Value;
		int nombrecase = tailleOctet * 8 ;
		int taille  = java.lang.Character.forDigit(Valeur, 2);
		
		for (int i = 0  ; i < nombrecase; i++)
		{
			if (i < taille)
			{
				Value [i] = (char) (Valeur % 2);
				Valeur = (short)(Valeur / 2);
			}
			else 
			{
				Value [i] = '0';
			}
			
		}
		return  Value;
		
	}
	
	
}
