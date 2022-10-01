
public class reCap_Demo1 {

    public static void main(String[] args) {
        int sayi = 24;

        if (sayi < 20) {
            System.out.println("Sayı 20 den küçüktir.");
        } else if (sayi == 20) {
            System.out.println("Sayı 20 ye eşittir.");
        } else {
            System.out.println("Sayı 20 den büyüktür.");
        }

        int sayi1 = 24;
        int sayi2 = 25;
        int sayi3 = 26;
        int enBuyuk = sayi1;
        
        if (sayi1 < sayi2) {
            enBuyuk = sayi2;
        }
        if (sayi1 < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayı : "+enBuyuk);
    }

}
