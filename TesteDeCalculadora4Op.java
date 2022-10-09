/*
  teste de calculadora
 * 
 */

import java.util.Scanner;
public class TesteDeCalculadora4Op {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		char character = ' ';
		String resp = null;
		do{
			System.out.println("Digite a opera"+(character=231)+"ao: \' +, - , / , * \' ");
			String op = scan2.nextLine();
			
			System.out.print("Digite o primeiro numero: ");
			double num1 = scan.nextDouble();
			System.out.print("Digite o segundo numero: ");
			double num2 = scan.nextDouble();
			
				if( op.equals("+") ){System.out.print( "Resultado: "+ (num1 + num2)); }
				if( op.equals("-") ){System.out.print( "Resultado: "+(num1 - num2)); }
				if( op.equals("*") ){System.out.print("Resultado: "+(num1*num2));}
				if( op.equals("/") ){System.out.print("Resultado: "+(num1/num2));}
				ln();
			System.out.print("Deseja continuar? [S/N]: ");
			resp = scan2.nextLine().toLowerCase();
			}while(resp.equals("s") );
				
	}
	static void ln(){
		System.out.println();
		}
}

