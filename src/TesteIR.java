
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.00;

		if (salario >= 1900.00 && salario < 2800.00) {
			System.out.println("O IR � de 7.5%. Valor da dedu��o � de R$142.00");
		} else if (salario > 2800 && salario <= 3750.0) {
			System.out.println("O IR � de 15%. Valor da dedu��o � de R$350.00");
		} else if (salario > 3751 && salario <= 4664.00) {
			System.out.println("O IR � de 22.5%. Valor da dedu��o � de R636.00");
		}

	}

}
