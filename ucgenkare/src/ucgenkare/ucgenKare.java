package ucgenkare;
import java.util.Scanner;
public class ucgenKare {
	
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
 
	System.out.println("Şekli giriniz :");
	String secim = input.nextLine();
	
	
	
	if(secim.equals("Üçgen") || secim.equals("Kare") || secim.equals("üçgen") || secim.equals("kare") || secim.equals("ucgen")) {
		
		if(secim.equals("Üçgen") || secim.equals("üçgen") || secim.equals("ucgen")) {
			System.out.println("Birinci kenarı giriniz :");
			int a = input.nextInt();
			System.out.println("İkinci keanrı giriniz :");
			int b = input.nextInt();
			System.out.println("Üçüncü kenarı giriniz :");
			 int c = input.nextInt();
			 
			 int fark1  = a - b;
			 int fark2 = a - c;
			 int fark3 = b - c ;
			 if(fark1 <0) {
				 fark1 *= -1;
			 }
			 if(fark2 < 0) {
				 fark2 *= -1;
			 }
			 if(fark3 < 0) {
				 fark3 *= -1;
			 }
			 if((fark1 < c && c < (a + b)) && ((fark2 < b && b < (a + c)) && (fark3 < a && a <(b + c)))){

				 if(a == b && a == c && b == c) {
					 System.out.println("Eşkenar üçgendir");
				 }
				 else if((a == c && b != c) || (a == b && b != c) || (b == c && a != c)) {
					 System.out.println("İkizkenar üçgendir"); 
					 
				 }
				 else {
					 System.out.println("Çeşitkenar bir üçgendir");
				 }
				
			 }
			 else {
				 System.out.println("Bu bir üçgen belirtmez !"); 
			 }
		}
		else {
			System.out.println("Birinci kenarı giriniz :");
			int x = input.nextInt();
			System.out.println("İkinci kenarı girinzi :");
			int y = input.nextInt();
			System.out.println("Üçüncü kenarı giriniz :");
			int z = input.nextInt();
			System.out.println("Dördüncü kenarı giriniz :");
			int k = input.nextInt();
			
			if(x == y && x == z && z == y && k == z && k == y && k == x ) {
				System.out.println("Karedir");
			}
			else if ((x == y && k == z) || (x == z && k == y) || (k == x && y == z)  ) {
				System.out.println("Diktörtgendir");
			}
			else if(((x == y) && (k != z)) || ((k == z) && (x != y)) || ((x == z) && (k != y)) || ((x == k) &&(y != z))) {
				System.out.println("Yamuktur");
			}
			else {
				System.out.println("Dörtgendir");
			}
		}
		
	}
	else {
		System.out.println("Hatalı veri girdiniz");
	}
}
}
