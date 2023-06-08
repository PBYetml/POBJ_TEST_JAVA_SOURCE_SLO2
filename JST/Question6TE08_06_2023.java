
//déclaration méthode
static char ConvBinaire(short valeur, byte tailleOctet)
{
	char [] tbValBinaire = new char [tailleOctet * 8]; //1 octet * 8 = 8 cases mémoire
	
	tbValBinaire[] = {0}; //Mise a 0 de toute les cases
	
	tbValBinaire[] = java.lang.Character.forDigit(valeur, 2); //2 pour avoir en binaire
	
	return tbValBinaire[];
	
}