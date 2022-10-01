
public class Main {


    public static void main(String[] args) {
        int[] sayılar = {1,2,5,7,9,0};
        int aranacak = 55;
        
        boolean isThere = false;
        
        for (int sayı : sayılar) {
            if (aranacak == sayı) {
                isThere = true;
                break;
            }
        }
        if (isThere == true) {
            System.out.println("Sayı mevcuttur.");
        }else{
            System.out.println("Sayı mevcut değildir.");
        }
    }
    
}
