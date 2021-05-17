public class PalindromePermutation {

    public boolean isPalindrome(String permutation) {
        if (permutation == null || permutation.isEmpty())
            return false;
        char[] permInArray = permutation.toLowerCase().toCharArray();
        int[] alphabet = new int[256];

        for (char c : permInArray) {
            alphabet[c]++;
        }
        int countOdd = 0;
        for (int i : alphabet) {
            if (i % 2 == 1)
                countOdd++;
            if (countOdd > 1)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromePermutation pp = new PalindromePermutation();
        System.out.println("Socorram-me, subi no ônibus em Marrocos");
        System.out.println(pp.isPalindrome("Tact Coa"));
        System.out.println(pp.isPalindrome("Socorram-me em Marrocos"));
    }
}
