import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> primeList = new LinkedList<Integer>();
        LinkedList<Integer> prime3List = new LinkedList<Integer>();
        int sum = 0;
        int n = 100000;

        // for loop to add prime numbers from 0 to n into primeList
        for (int i = 0; i < n; i++) {
            if (isPrime(i))
                primeList.add(i);
        }
        // test if prime numbers were added correctly
        // System.out.println(primeList);

        // for loop to put prime numbers with digit 3 into prime3List
        for (int i = 0; i < primeList.size(); i++) {
            if (contains3(primeList.get(i)))
                prime3List.add(primeList.get(i));
        }
        // test if prime numbers with 3 were added correctly
        // System.out.println(prime3List);

        // finding sum of all numbers in prime3List
        for (int i = 0; i < prime3List.size(); i++) {
            sum += prime3List.get(i);
        }
        System.out.println("Sum of prime numbers with the digit 3: " + sum); // print out sum
    }

    // method to find prime numbers
    public static boolean isPrime(int num) {
        if (num <= 1) // 1 and below are not prime numbers
            return false;
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // method to find if number contains the digit 3
    public static boolean contains3(int num) {
        while (num > 0) {
            if (num % 10 == 3)
                return true;
            num /= 10;
        }
        return false;
    }




}

