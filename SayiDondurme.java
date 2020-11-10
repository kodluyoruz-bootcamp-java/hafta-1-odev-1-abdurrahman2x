import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double sayi;
        String yuvarlama;

        System.out.println("Ondalıklı bir sayı girin");
        sayi = reader.nextDouble();
        reader.nextLine();
        System.out.println("Bu sayi aşağıya mı yuvarlansın yukarıya mı?");
        yuvarlama = reader.nextLine();
        if (yuvarlama.equals("asagiya")) System.out.println(Math.floor(sayi));
        else if (yuvarlama.equals("yukariya")) System.out.println(Math.round(sayi));
        else System.out.println("Hatalı seçim yaptınız");





    }
}

