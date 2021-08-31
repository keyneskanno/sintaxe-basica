
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.90;
		
		//casting para forçar o tipo
		int valor = (int)salario;
				
		System.out.println(valor);
		
		long numeroGrande = 229323232329l; //insere a letra l para aceitar como long
		System.out.println(numeroGrande);
		
		short valorPequeno = 22228;
		byte b = 111;
		System.out.println(b);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2; 
		System.out.println(total); //0.30000000000000004
		
		float pontoFlutuante = 3.14f; //tem que colocar um f para entender que é um float ou colocar o cast
		
		
	}
}
