
public class asalMı {

    public static void main(String[] args) {
        int number = 26;
        int remainder = number % 2;
        System.out.println(remainder);
        
        
        if (number < 1) {
            System.out.println("Geçesiz sayı");
        }

        boolean isPrime = true;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
            break;
        }
        if (isPrime == false || number == 1) {
            System.out.println("Sayı asal değildir.");
        } else {
            System.out.println("Sayı asaldır.");
        }
    }

}
