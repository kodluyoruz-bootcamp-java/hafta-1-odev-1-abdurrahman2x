public class Main {
    static int sayac;
    static double toplam,ortalama;

    public static void main(String[] args) {

        for (int i = 0; i <= 2000; i++) {
            if ((i % 3) == 0 && (i % 5) == 0 && (i % 7) == 0 && (i % 53) == 0) {
                toplam += i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;
        System.out.println(ortalama);

    }
}