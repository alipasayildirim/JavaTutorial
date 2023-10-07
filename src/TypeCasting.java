import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        // Otomatik Tip Dönüşümü

        int firstNum = 10;
        double secondNum = 3.14;
        double sum = firstNum + secondNum;

        System.out.println(sum);

        // Zorunlu Tip Dönüşümü

        double onadalikliSayi = 3.14;
        int tamSayi = (int) onadalikliSayi;

        System.out.println(tamSayi);

        // Wrapper Sınıfları İle Tip Dönüşümü
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        String input = scanner.nextLine();

        double userNum = Double.parseDouble(input);
        int userTamSayi = (int) userNum;

        System.out.println("Sayı : " + userTamSayi);


    }
}
