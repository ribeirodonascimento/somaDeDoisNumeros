import java.util.Scanner;
public class somaDeDoisNumeros{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número.");
        int n1 = s.nextInt();
        System.out.println("Agora digite outro número.");
        int n2 = s.nextInt();
        int soma = n1 + n2;
        System.out.println("A soma dos dois números é: "+soma);
    }
}
