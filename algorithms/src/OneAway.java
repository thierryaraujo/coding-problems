public class OneAway {

    public boolean onawayChecker(String input1, String input2) {
        char[] input1Array = input1.toCharArray();
        char[] input2Array = input2.toCharArray();
        
        if(input1Array.length - 1 == input2Array.length) return oneEditInsertRemove(input1Array, input2Array);
        if(input1Array.length + 1 == input2Array.length) return oneEditInsertRemove(input2Array, input1Array);

        if(input1Array.length == input2Array.length) {
            int countDiff = 0;
            for(int i=0; i < input1Array.length; i++) {
                if (input1Array[i] != input2Array[i]) {
                    countDiff++;
                }
            }
            if(countDiff == 1) {
                return true;
            }

        }
        
        return false;
    }

    public boolean oneEditInsertRemove(char[] s1, char[] s2) {
        int id1 = 0;
        int id2 = 0;
        while (id2 < s2.length && id1 < s1.length) {
            if(s1[id1] != s2[id2]) {
                if(id1 != id2) {
                    return false;
                }
                id2++;
            } else
            id1++;
            id2++;
        }
        return true;
    }

    public static void main(String[] args) {
        OneAway oneAway = new OneAway();

        System.out.println(oneAway.onawayChecker("pale", "ple"));
        System.out.println(oneAway.onawayChecker("pales", "pale"));
        System.out.println(oneAway.onawayChecker("pale", "bale"));
        System.out.println(oneAway.onawayChecker("pale", "bake"));

        System.out.println(oneAway.onawayChecker("apple", "aple"));
        System.out.println(oneAway.onawayChecker("aple", "apple"));

    }
}
