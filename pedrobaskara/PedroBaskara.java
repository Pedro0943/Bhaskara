package pedrobaskara;
import java.util.Scanner;

public class PedroBaskara {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Passe os valores : (a),(b) e (c) :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        Baskara b1 = new Baskara(a,b,c);
        
        b1.print();
        
        
    }
    
}
