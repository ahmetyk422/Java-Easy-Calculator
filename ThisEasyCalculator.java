package Calculator;

import java.util.Scanner;

public class Calculator2 {

  public static void main(String[] args) {
    
 int sayi1,sayi2,secim;
		    
		 Scanner scanner = new Scanner(System.in);	    	    
		    
		    do {
		    	
		    	System.out.println("TOPLAMA İŞLEMİ(1)" + "\nÇIKARMA İŞLEMİ(2)" + "\nÇARPMA İŞLEMİ(3)" + "\nBÖLME İŞLEMİ(4)"+ "\nProgramı Sonlandır(0)");
			    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
			    secim = scanner.nextInt();	
		    	
		    	switch (secim) {
		          case 1:
		            System.out.println("Toplama islemini sectiniz !!");
		            System.out.print("Birinci sayi :");
		            sayi1 = scanner.nextInt();
		            System.out.print("Ikinci sayi :");
		            sayi2 = scanner.nextInt();
		            System.out.println("Sonuç :" + (sayi1 + sayi2)+"\n");
		            break;

		          case 2:
		            System.out.println("Cikarma islemini sectiniz !!");
		            System.out.print("Birinci sayi :");
		            sayi1 = scanner.nextInt();
		            System.out.print("\nIkinci sayi :");
		            sayi2 = scanner.nextInt();
		            System.out.println("\nSonuç :" + (sayi1 - sayi2)+"\n");
		            break;

		          case 3:
		            System.out.println("Carpma islemini sectiniz !!");
		            System.out.print("Birinci sayi :");
		            sayi1 = scanner.nextInt();
		            System.out.print("\nIkinci sayi :");
		            sayi2 = scanner.nextInt();
		            System.out.println("\nSonuç :" + (sayi1 * sayi2)+"\n"); 
		            break;

		          case 4:
		            System.out.println("Bolme islemini sectiniz !!");
		            System.out.print("Birinci sayi :");
		            sayi1 = scanner.nextInt();
		            System.out.print("\nIkinci sayi :");
		            sayi2 = scanner.nextInt();
		            System.out.println("\nSonuç :" + ((float)sayi1 /(float)sayi2)+"\n");  
		            break;

		          default:
		          System.out.println("\nYanlis sayiyi tusladiniz !!!\n");
		        } // finish switch-case
		    
		    }while(secim!=0);
    

  }// finish main method
}// finish class 
