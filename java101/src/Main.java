import java.util.Scanner;

public class Main {public static void main(String[] args) {
    double ürün , kDV , kDVorani;
    Scanner input = new Scanner(System.in);
    System.out.println("Ürün fiyatını giriniz");
    ürün = input.nextInt();
    System.out.println("ürünün KDV'siz fiyatı=" + ürün);
    kDVorani = (ürün < 1000 ?  0.18 : 0.08 );
    kDV = ürün * kDVorani ;
    System.out.println("Ürününüzün KDV oranı=" +kDVorani);
    System.out.println("Ürününüzün KDV'si=" + kDV);
    System.out.println("Ürününüzün KDV dahil fiyatı =" + (ürün+kDV));



}

}