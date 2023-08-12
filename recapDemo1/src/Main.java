public class Main {
    public static void main(String[] args) {
        int sayi1 = 4;
        int sayi2 = 5;
        int sayi3 = 3;


        if ((sayi1 > sayi2) & (sayi1 > sayi3)) {
            System.out.println("En büyük sayı : " + sayi1);
        } else if ((sayi2 > sayi1) & (sayi2 > sayi3)) {
            System.out.println("En büyük sayı : " + sayi2);
        } else if ((sayi3 > sayi1) & (sayi3 > sayi2)) {
            System.out.println("En büyük sayı : " + sayi3);
        }
        // benim yaptığım..


        int sayi4 = 211;
        int sayi5 = 25;
        int sayi6 = 29;
        int enBuyuk = sayi5;

        if (enBuyuk<sayi4) {
            enBuyuk = sayi4;

        }
        if (enBuyuk<sayi6) {
            enBuyuk = sayi6;

        }
        System.out.println("En büyük = " + enBuyuk);

        //engin hocanın yaptığı..

    }
}