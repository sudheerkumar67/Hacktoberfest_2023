import java.util.Scanner;
public class Biggestnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");  
        int a = sc.nextInt();
        System.out.print("Enter a number: ");  
        int b = sc.nextInt();
        System.out.print("Enter a number: ");  
        int c = sc.nextInt();
        if (a>b>c){
            System.out.println(a);
        }
        if (b>a>c){
            System.out.println(b);
        }
        if (c>b>c){
            System.out.println(c);
        }
        sc.close();
    }
}
