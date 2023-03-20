//er
public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1
        int sumEven = 0
        while (b < 4000000) {
            if (b % 2 == 0) {
                sumEven += a
            }
            temp = b
            b = a + b
            a += temp
        }
        System.out.prinln(sumEven)
    }
}

// answer should be 4613732
