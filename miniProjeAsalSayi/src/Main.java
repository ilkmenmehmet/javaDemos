public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            boolean asalMi = true;
            for (int bolen = 2; bolen <= i / 2; bolen++) {
                if (i % bolen == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi && i > 1) {
                System.out.println("Sayınız Asal sayıdır: " + i);
            }


        }

        //Engin hocanın yaptığı

        int number = 0;
        int remainder = number % 2;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayınız Asal Sayı Değildir!");
            return;
        }

        if (number < 2) {
            System.out.println("Geçersiz Sayı!");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;

            }
        }

        if (isPrime) {
            System.out.println("Sayınız Asal Sayıdır !");

        }

        else {
            System.out.println("Sayınız Asal Sayı Değildir !");
        }


    }
}