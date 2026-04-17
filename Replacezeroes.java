public class Replacezeroes {
    public static void main(String[] args) {
        int num = 10000000;
        int result = 0, place = 1;

        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) digit = 1;
            result += digit * place;
            place *= 10;
            num /= 10;
        }

        System.out.println(result);
    }
}