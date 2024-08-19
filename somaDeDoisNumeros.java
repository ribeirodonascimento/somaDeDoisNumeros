import java.util.Scanner;
public class somaDeDoisNumeros{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int soma = n1 + n2;
        System.out.println("X = "+soma);
    }
}