import java.util.Scanner;

public class exercio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int  n = 0;
		int m = 0;
		
		while (n <=3) {
		System.out.println("digite um numero");
		m = leitor.nextInt(); 
		n++;
		 if(n > m)
		m = n;
		 
		}
		 

		 
	}

}
