public class TestingRecursiveSolution {
    public static void main(String[] args) {
        // Assume RecursiveSolution class is available and correct
        RecursiveSolution rec = new RecursiveSolution();

        System.out.println("--- Testing Recursive Solutions ---");
        System.out.println("Expected values are in the comments next to the output.");
        System.out.println("---------------------------------");

        // (a) tri
        int triInput = 5;
        // Expected: 1 + 2 + 3 + 4 + 5 = 15
        System.out.println("tri(" + triInput + "): " + rec.tri(triInput) + " (Expected: 15)");

        // (b) fact
        int factInput = 5;
        // Expected: 5 * 4 * 3 * 2 * 1 = 120
        System.out.println("fact(" + factInput + "): " + rec.fact(factInput) + " (Expected: 120)");

        // (c) fib
        // Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21...
        int fibInput = 7;
        // Expected: 13
        System.out.println("fib(" + fibInput + "): " + rec.fib(fibInput) + " (Expected: 13)");

        // (d) reverseStr
        String revInput = "college";
        // Expected: egelloc
        System.out.println("reverseStr(\"" + revInput + "\"): " + rec.reverseStr(revInput) + " (Expected: egelloc)");

        // (e) hasChar
        String hasCharStr = "homework";
        char hasCharC = 'w';
        // Expected: true
        System.out.println("hasChar(\"" + hasCharStr + "\", '" + hasCharC + "'): " + rec.hasChar(hasCharStr, hasCharC) + " (Expected: true)");

        // (f) gcd
        int gcdX1 = 48, gcdX2 = 18;
        // Expected: 6
        System.out.println("gcd(" + gcdX1 + ", " + gcdX2 + "): " + rec.gcd(gcdX1, gcdX2) + " (Expected: 6)");

        // (g) countUniquePaths
        int pathN = 3, pathM = 7;
        // Expected: 28
        System.out.println("countUniquePaths(" + pathN + ", " + pathM + "): " + rec.countUniquePaths(pathN, pathM) + " (Expected: 28)");
    }
}