
public class do_while {

    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i += 2;
        } while (i < 10);
        System.out.println("Do-While döngüsü bitti.");
        
        int k = 100;
        
        do {
            System.out.println("Loglandı");
            System.out.println(k);
        } while (k < 10);
        System.out.println("Do-While döngüsü bitti.");
    }

}
