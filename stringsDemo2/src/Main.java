public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);
        // metinde mevcut olan harfi belirlediğimiz bir harfle değiştirir .replace()
        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        // bir metinin içerisinden parçayı almak. .substring() ya da belirli bir kısmı almak
        System.out.println(mesaj.substring(2, 4));
        // bir metini belirli bir karakter dizisini ele alarak parçalamaya yarar .split
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        // Metini küçük harfe çevirir
        System.out.println(mesaj.toLowerCase());
        // Metini büyük harfe çeviir
        System.out.println(mesaj.toUpperCase());
        // başındaki ve sonundaki boşlukları almak
        System.out.println(mesaj.trim());

    }
}