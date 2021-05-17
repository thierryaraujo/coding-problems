import java.util.Arrays;

public class StringPermutation {
    public boolean checkPermutation(String word1, String word2) {
        if ((word1 == null || word1.isEmpty()) || (word2 == null || word2.isEmpty()))
            return false;
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] array_w1 = word1.toCharArray();
        char[] array_w2 = word2.toCharArray();
        Arrays.sort(array_w1);
        Arrays.sort(array_w2);

        return Arrays.equals(array_w1, array_w2);
    }

    public boolean newCheckPermutation(String word1, String word2) {
        if ((word1 == null || word1.isEmpty()) || (word2 == null || word2.isEmpty()))
            return false;
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] alphabet = new char[128];
        for (char c : word1.toCharArray()) {
            alphabet[c]++;
        }

        for (char c : word2.toCharArray()) {
            alphabet[c]--;
            if (alphabet[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringPermutation sp = new StringPermutation();
        System.out.println(sp.newCheckPermutation("cada", "adac"));
        System.out.println(sp.newCheckPermutation(" cada", "adac"));
    }
}
