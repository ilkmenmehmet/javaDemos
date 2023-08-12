public class Main {
    public static void main(String[] args) {
        // bir değişkeni tanımladığında o değişkeni bulunduğu tipi değiştiremezsin.
        int sayi = 12;
        sayi = 13;

        byte sayi2 = -128;
        sayi2 = 127;
        String kelime = "Ankara";
        kelime = "istanbul";

        // primative veri tiplerinin sınırları olabiliyor onları kontrol etmen gerekir.

        char karakter = 'A';
        karakter = 'B';

        // char yalnızca tek karakter tutar ve tek tırnak ('') ile tutulur..

        String sehir = "ANKARA";

        // string içerisinde kaç harf bulunuyorsa o kadar char veri tipini tutar.

        boolean varMi = true;

        // koşul ifadelerine destek veren boolean veri tipi.. sadece true veya false değerini tutar.


    }
}