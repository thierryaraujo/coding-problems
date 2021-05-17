public class IsUnique {

    public boolean isUnique(String input) {
        if (input.length() > 128)
            return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < input.length(); i++) {
            int charCode = input.charAt(i);
            if (char_set[charCode]) {
                return false;
            }
            char_set[charCode] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        System.out.println("IsUnique");
        System.out.println(isUnique.isUnique("abcde"));
        System.out.println(isUnique.isUnique("thierry"));
        System.out.println(isUnique.isUnique("   thierry   "));
        System.out.println(isUnique.isUnique(" a a a a a"));
        System.out.println(isUnique.isUnique(" b d e f "));
        System.out.println("End");
    }
}
