package Convertisseur;
import java.lang.*;

public class Conversion {

	protected Conversion(){
	}

	public static char[] ConvBinaire(short valeur, byte tailleOctet){
		int[] tbInfoBinaire = new int[(tailleOctet*8)];
		char[] tbOut = new char[(tailleOctet*8)];

		short mask = ((Math.pow(2, (tbInfoBinaire.length))) >> 1);

		for(int i=0; i < tbInfoBinaire.length; i++){
			tbInfoBinaire[i] = (valeur & mask) >> ((tbInfoBinaire.length-1)-i);
		}

		for(int i=0; i < tbOut.length; i++){
			tbOut[i] = Character.forDigit(tbInfoBinaire[i], 2);
		}

		return tbOut;
	}
}