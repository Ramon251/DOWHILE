import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		float salario, altura;
		String  sexo; 
		
		do { System.out.println("digite o salario:");
		salario = leitor.nextFloat();
		}while (salario <= 5000);
		
		do { System.out.println("Digite a altura:");
		altura = leitor.nextFloat();
		}while (altura <= 3.00);
		
		
		do { System.out.println("Qual seu  sexo");
		sexo = leitor.next();
		}while
		
		

	}

}
