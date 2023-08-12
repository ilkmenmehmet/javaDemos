public class Main {
    public static void main(String[] args) {
        //For
        // 1 er 1 er 10 a ulaşıyor
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti!");

        // 2 şer 2 şer 10 a ulaşıyor

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti!");

        // 3 er 3 er 10 a ulaşıyor
        for (int i = 0; i <= 10; i += 3) {
            System.out.println(i);
        }

        System.out.println("For Döngüsü Bitti!");
        //for döngüsünü çeşitli varyasyonlarıyla farklı farklı algoritmalar yazabiliriz.

        //while koşul sağlanmazsa çalışmaz.
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("While Döngüsü Bitti.");

        //Do-While koşul sağlanmasa bile çalışır.
        int j = 100;
        do {
            System.out.println("Loglandı!");
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Döngüsü Bitti.");
    }
}