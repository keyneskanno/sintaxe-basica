
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.00;

		if (salario >= 1900.00 && salario < 2800.00) {
			System.out.println("O IR é de 7.5%. Valor da dedução é de R$142.00");
		} else if (salario > 2800 && salario <= 3750.0) {
			System.out.println("O IR é de 15%. Valor da dedução é de R$350.00");
		} else if (salario > 3751 && salario <= 4664.00) {
			System.out.println("O IR é de 22.5%. Valor da dedução é de R636.00");
		}

	}

}
