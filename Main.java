import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    // Read Integer
    static int nextInt() throws Exception {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    // Read Long
    static long nextLong() throws Exception {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return Long.parseLong(st.nextToken());
    }

    // Read String
    static String next() throws Exception {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    static final long MOD = 1000000007;

    // Greatest Common Divisor
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // Least Common Multiple
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    // Binary Exponentiation
    static long power(long a, long b) {
        long ans = 1;

        while (b > 0) {
            if ((b & 1) == 1)
                ans *= a;

            a *= a;
            b >>= 1;
        }

        return ans;
    }

    // Reverse Array
    static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Print Array
    static void print(int[] arr) {
        for (int x : arr)
            out.print(x + " ");
        out.println();
    }

    static void solve() throws Exception {

        // Write solution here

    }

    public static void main(String[] args) throws Exception {

        int t = 1;

        // Uncomment if multiple test cases
        // t = nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}