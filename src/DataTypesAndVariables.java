import java.util.Scanner;

public class DataTypesAndVariables {
    public static void main(String[] args) {

    //Basit Hesaplamalar

    int firstNumber = 20;
    int secondNumber = 2;

    int toplama = firstNumber + secondNumber;
    int cikarma = firstNumber - secondNumber;
    int carpma = firstNumber * secondNumber;
    int bolme = firstNumber / secondNumber;
    int kalan = firstNumber % secondNumber;

    System.out.println(toplama);
    System.out.println(cikarma);
    System.out.println(carpma);
    System.out.println(bolme);
    System.out.println(kalan);

    //Üçgen Alan Hesabı
            Scanner input = new Scanner(System.in);

            System.out.println("Üçgenin Alan Formülü : Taban * Yükseklik / 2");

            System.out.println("Yükseklik Giriniz : ");
            int h = input.nextInt();

            System.out.println("Taban Giriniz : ");
            int taban = input.nextInt();

            System.out.println("Üçgenin Alanı : " + (taban*h) /2 );

            //Mantıksal İfadeler

            System.out.println("Sayı Giriniz : ");
            int sayi = input.nextInt();

            if(sayi > 0) {
                System.out.println("Sayı Pozitif");
            } else if (sayi < 0) {
                System.out.println("Sayı Negatif");
            }else {
                System.out.println("Sayı 0");
            };

            input.nextLine();

            //Kullanıcı Girişi ve Doğrulama
            String user = "alipasa";
            String userPassword = "123123";

            System.out.println("Kullanıcı Adı : ");
            String username = input.nextLine();
            System.out.println("Şifre Giriniz : ");
            String password = input.nextLine();


            if (username.equals(user) && password.equals(userPassword)){
                System.out.println("Giriş Başarılı");
            }else {
                System.out.println("Kullanıcı adı veya şifre yanlış");
            }

    }
}
