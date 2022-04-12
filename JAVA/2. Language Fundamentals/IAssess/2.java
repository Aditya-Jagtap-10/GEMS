import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int greatest = ( a > b ) ? (a > c ? a : c) : ( b > c ? b : c);
        System.out.println(greatest+" is the greatest number");
        sc.close();
	}

}
