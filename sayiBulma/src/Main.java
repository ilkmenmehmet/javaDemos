public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;

        for (int varMi : sayilar) {
            if (aranacak == varMi) {
                System.out.println("Sayınız listede var ve sayınız : " + aranacak);
                return;
            }else {
                System.out.println("Sayınız listede yok.. ve sayınız : " + aranacak);
                return;
            }
        }
    }
}