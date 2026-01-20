import java.util.*;
public class PrimeArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the eleemnt of the array: ");
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.println("Prime numbers found: ");
        for(int num : numbers) {
            if(isPrime(num)) {
                sum += num;
                System.out.println(num);
            }
        }
        System.out.println("Sum of prime Numbers: " + sum);
        sc.close();
    }

    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
