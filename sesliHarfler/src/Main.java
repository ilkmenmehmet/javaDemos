public class Main {
    public static void main(String[] args) {
        char harf = 'Ü';

        char[] inceKarakterler = new char[4];
        char[] kalinKarakterler = new char[4];
        kalinKarakterler[0] = 'A';
        kalinKarakterler[1] = 'I';
        kalinKarakterler[2] = 'O';
        kalinKarakterler[3] = 'U';
        inceKarakterler[0] = 'E';
        inceKarakterler[1] = 'İ';
        inceKarakterler[2] = 'Ö';
        inceKarakterler[3] = 'Ü';

        System.out.println(kalinKarakterler);
        System.out.println(inceKarakterler);

        for (char inceMi : inceKarakterler) {
            if (harf == inceMi) {
                System.out.println("Harfiniz İnce ünlü Bir Harftir : " + harf);
                break;

            }

        }
        for (char kalinMi : kalinKarakterler) {
            if (harf == kalinMi) {
                System.out.println("Harfiniz Kalın Ünlü Bir Harftir :  " + harf);

            }
        }

        // Engin hocanın yaptığı..
        char harf1 = 'A';

        switch (harf1) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }


    }
}