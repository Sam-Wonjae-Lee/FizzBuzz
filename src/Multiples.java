public class Multiples {
    public static void main(String[] args) {
        int multipleOf3 = 0;
        int multipleOf5 = 0;
        
        for (int n = 1; n < 1000; n++) {
            if (n % 3 == 0) {
                multipleOf3++;

            } else if (n % 5 == 0) {
                multipleOf5++;
                
            }
        }
        System.out.println("Number of multiples of 3: " + multipleOf3);
        System.out.println("Number of multiples of 5: " + multipleOf5);

    }
}
