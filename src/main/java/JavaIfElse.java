import java.util.*;

public class JavaIfElse {
    static final String NOT_WEIRD = "Not Weird";
    static final String WEIRD = "Weird";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("scanned: " + getStringFromInt(N));
        scanner.close();
    }

    static String getStringFromInt(final int n) {
        return (n % 2 == 0 && !(n >= 6 && n <= 20)) ? NOT_WEIRD : WEIRD;
    }
}
