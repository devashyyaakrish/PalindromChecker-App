public class PallendromCheckerApp {
    public static void main(String[] var0) {
    
        String input ="madam";
        System.out.println("Is it palindrome? "+checkByHalfLoop(input));
   }
    public static boolean checkByHalfLoop(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
}
