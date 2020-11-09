//Bu programın amacı 0'dan başlayıp 2000'e kadar olan sayılardan 3,5,7 ve 53'e tam bölünen sayıları toplayıp ortalamasını ekrana yazdırmaktır.

public class Main {
    public static void main(String[] args) {
    
       double toplam=0,ortalama=0;
       int sayac = 0;
       
        for (int i = 0; i <= 2000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0) && (i % 53 == 0)) {
                toplam += i;
                sayac++;
            }
        }
        
        ortalama = toplam / sayac;
        System.out.println("Ortalama :"+ortalama);
    }
}
