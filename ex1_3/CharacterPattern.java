public class CharacterPattern {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}