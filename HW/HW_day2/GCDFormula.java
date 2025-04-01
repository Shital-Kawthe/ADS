public class GCDFormula {
    // Recursive function to generate the formula
    public static String generateGCDFormula(int n) {
        if (n == 2) {
            return "gcd(int, int)";
        }
        return "gcd(int, " + generateGCDFormula(n - 1) + ")";
    }

    public static void main(String[] args) {
        int n = 5;  // Change n to any positive integer
        System.out.println(generateGCDFormula(n));
        

    }
}