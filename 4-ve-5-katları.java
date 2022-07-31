import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		int i, n;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz: ");
		n = input.nextInt();
		
		System.out.println(n + " sayısından küçük 4'ün kuvveti olan sayılar:");
		for(i=1; i<=n; i*=4){
		    System.out.println(i);
		}
		
		System.out.println("        ");
		
		System.out.println(n + " sayısından küçük 5'in kuvveti olan sayılar:");
		for(i=1; i<=n; i*=5){
		    System.out.println(i);
		}
		
	}
}
