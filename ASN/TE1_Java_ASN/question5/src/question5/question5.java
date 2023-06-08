package question5;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] tbEntier = new byte[5];	//initialisation tableau de 5 octets
		
		for(byte i = 1; i<6;i++)
		{
			tbEntier[i-1] = i;	//Assigner valeur 1|2|3|4|5
			System.out.println(tbEntier[i-1]); //Afficher contenu tableau dans console
		}

	}

}