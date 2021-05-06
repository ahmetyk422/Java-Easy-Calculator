package Calculator;

import java.util.Scanner;

public class Calculator2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Yapmak istediğiniz işlemi seçiniz :");
    System.out.print(
        "TOPLAMA İŞLEMİ(1)" + "\nÇIKARMA İŞLEMİ(2)" + "\nÇARPMA İŞLEMİ(3)" + "\nBÖLME İŞLEMİ(4)");
    int secim = scanner.nextInt();
    switch (secim) {
      case 1:
        System.out.println("Toplama islemini sectiniz !!");
        break;

      case 2:
        System.out.println("Cikarma islemini sectiniz !!");
        break;

      case 3:
        System.out.println("Carpma islemini sectiniz !!");
        break;

      case 4:
        System.out.println("Bolme islemini sectiniz !!");
        break;

      default:
        System.out.println("Yanlis sayiyi tusladiniz !!!");
    }

    if (secim == 1) {
      System.out.print("Birinci sayi :");
      int sayi1 = scanner.nextInt();
      System.out.print("Ikinci sayi :");
      int sayi2 = scanner.nextInt();
      System.out.println("Sonuç :" + (sayi1 + sayi2));
    }
    else if(secim == 2) {
      System.out.print("Birinci sayi :");
      int sayi1 = scanner.nextInt();
      System.out.print("\nIkinci sayi :");
      int sayi2 = scanner.nextInt();
      System.out.println("\nSonuç :" + (sayi1 - sayi2));
    }
    else if(secim == 3) {
      System.out.print("Birinci sayi :");
      int sayi1 = scanner.nextInt();
      System.out.print("\nIkinci sayi :");
      int sayi2 = scanner.nextInt();
      System.out.println("\nSonuç :" + (sayi1 * sayi2));      
    }
    else if(secim == 4) {
      System.out.print("Birinci sayi :");
      int sayi1 = scanner.nextInt();
      System.out.print("\nIkinci sayi :");
      int sayi2 = scanner.nextInt();
      System.out.println("\nSonuç :" + ((float)sayi1 /(float)sayi2));      
    }
  }
}
