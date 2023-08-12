public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);
        // metnin uzunluğu .length
        System.out.println("Karakter sayısı = " + mesaj.length());
        // belirli bir karakteri sayı ile bulmak .charAt(1)
        System.out.println("5. Karakter : " + mesaj.charAt(4));
        // iki metini birleştirme .concat
        System.out.println(mesaj.concat(", Yaşasın!"));
        // metinin başındaki karakteri sorgulama True veya False döndürür. Büyük küçük harflere duyarlı
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("l"));
        //Harfleri getir
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        // kaçıncı harf olduğunu söyler ve 0 dan başlar. .indexOf() ilk bulduğunu verir.
        System.out.println(mesaj.indexOf("av"));
        // üsttekinin tersten başladığı versiyonu.
        System.out.println(mesaj.lastIndexOf("e"));


    }
}