import java.util.Scanner;

public class ConditionalStatements {
    public static void main (String[] args){

        //Sınav Notu Hesaplayıcı

        Scanner scanner = new Scanner(System.in);
        System.out.println("Not giriniz : ");
        int puan = scanner.nextInt();

        if (puan > 50) {
            System.out.println("Başarılı");
        }else {
            System.out.println("Başarısız");
        }

       // Dört İşlem Hesaplayıcı
        System.out.println("1. Sayıyı Giriniz : ");
        int numOne = scanner.nextInt();
        System.out.println("2. Sayıyı Giriniz : ");
        int numTwo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("İşlem seçiniz : ");
        String process = scanner.nextLine();

        switch (process) {
            case "+":
                System.out.println("Toplama : " + (numOne + numTwo) );
                break;

            case "-":
                System.out.println("Çıkarma : " + (numOne - numTwo));
                break;

            case "*":
                System.out.println("Çarpma : " + (numOne * numTwo));
                break;
            case "/":
                System.out.println("Bölme : " + (numOne / numTwo));
                break;
            default:
                System.out.println("Geçersiz İşlem");
        }

      //  Haftanın Günleri

        System.out.println("Gün sayısı Giriniz : ");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz Gün sayısı");
        }
       // Ürün İndirim Hesaplayıcı

        System.out.println("Ürün fiyatı : ");
        int urunFiyati = scanner.nextInt();
        System.out.println("İndirim Miktarı : ");
        int indirim = scanner.nextInt();
        double indirimMiktari = (double) indirim / 100 ;

        double yapilacakIndirim = urunFiyati * indirimMiktari;
        double sonFiyat = urunFiyati - yapilacakIndirim;

        int gerekenTutar = 100;

        if (urunFiyati > gerekenTutar){
            System.out.println(" İndirimli Sepet Tutarı : " + sonFiyat );
        }else {
            System.out.println("İndirimsiz Sepet Tutarı : " + urunFiyati);
        }


    }
}
