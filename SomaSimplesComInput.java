import java.util.Scanner;
public class SomaSimplesComInput{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Numero 1: ");
    int a = scan.nextInt();
    System.out.print("Numero 2: ");
    int b = scan.nextInt();
    
    System.out.print("soma: "+(a+b));
  }
}
