public class StringCompression {

    public String compress(String input) {
        StringBuffer sb = new StringBuffer();
        int countLetter  = 1;
        
        for(int i = 0; i < input.length(); i++) {
            if (i>0) {
                if(input.charAt(i) == input.charAt(i-1)) {
                    countLetter++;
                } else {
                    sb.append(input.charAt(i-1));
                    if(countLetter > 1) sb.append(countLetter);
                    countLetter=1;
                }
            }
            if(i==input.length()-1) {
                sb.append(input.charAt(i));
                if(countLetter > 1) sb.append(countLetter);
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        System.out.println(stringCompression.compress("abcde"));
        System.out.println(stringCompression.compress("aaabbcccccaaa"));
        System.out.println(stringCompression.compress("aabbcc"));
        System.out.println(stringCompression.compress("ttttt"));
        System.out.println(stringCompression.compress("m"));
    }
}
