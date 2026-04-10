import java.util.Scanner;

public class Main {

  public void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      double principal;
      double taxadejuros;
      int vezescomposto;
      int anos;
      double quantidade;

      System.out.print("Coloque a quantidade em: (R$💵)");
     principal = sc.nextDouble();

      System.out.print("Coloque a quantidade interessada de taxa de juros (em %): ");
      taxadejuros = sc.nextDouble() /100;

      System.out.print("Coloque o numero  de vezes composto por ano: ");
      vezescomposto = sc.nextInt();

      System.out.print("Coloque a quantidade de anos  :");
      anos = sc.nextInt();

      quantidade = principal * Math.pow(1 + taxadejuros / vezescomposto, vezescomposto * anos);
      System.out.printf("A quantidade após %d anos foi de %.2f R$💵", anos, quantidade);
      sc.close();
    }
