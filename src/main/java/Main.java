import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite os números a ser somados: ");
    int N = sc.nextInt();
    int soma = 0;
    for (int i = N; i > 0; i--){
     System.out.println("O número a ser somado: ");
      int y = sc.nextInt();
      soma += y;
    }
    System.out.println("A soma dos números é: "+soma);

    sc.close();
  }
}