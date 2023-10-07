import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Çarpım Tablosu Boyutunu Giriniz: ");
            int boyut = scanner.nextInt();


            for (int i = 1; i <= boyut; i++) {
                for (int j = 1; j <= boyut; j++) {
                    System.out.print(i * j +    "\t");
                }
                System.out.println();
            }

            System.out.print("Başka bir çarpım tablosu oluşturmak istiyor musunuz? (evet/hayır): ");
            scanner.nextLine();
            String cevap = scanner.nextLine();

            if (!cevap.equalsIgnoreCase("evet")) {
                System.out.println("Program sonlandırıldı.");
                break;
            }
        }
    }
}
