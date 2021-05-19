public class StringCompression {

    public String compress(String input) {
        int compressedSize = calculateCompression(input);
        if(compressedSize > input.length()) return input;

        StringBuffer compressed = new StringBuffer(compressedSize);
        int countLetter  = 1;
       
        for(int i = 0; i < input.length(); i++) {
            if (i>0) {
                if(input.charAt(i) == input.charAt(i-1)) {
                    countLetter++;
                } else {
                    compressed.append(input.charAt(i-1));
                    compressed.append(countLetter);
                    countLetter=1;
                }
            }
            if(i==input.length()-1) {
                compressed.append(input.charAt(i));
                if(countLetter > 1) compressed.append(countLetter);
            }

        }
        return  compressed.toString();
    }

    public int calculateCompression(String input) {
        int countLetter  = 1;
        int countCompressed = 0;
        
        for(int i = 0; i < input.length(); i++) {
            if (i>0) {
                if(input.charAt(i) == input.charAt(i-1)) {
                    countLetter++;
                } else {
                    countCompressed += 1 + String.valueOf(countLetter).length();
                    countLetter=1;
                }
            }
            if(i==input.length()-1) {
                countCompressed += 1 + String.valueOf(countLetter).length();
            }

        }

        return countCompressed;
    }
    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        System.out.println(stringCompression.compress("abcde"));
        System.out.println(stringCompression.compress("aaabbcccccaaa"));
        System.out.println(stringCompression.compress("aabbcc"));
        System.out.println(stringCompression.compress("ttttt"));
        System.out.println(stringCompression.compress("m"));
        System.out.println(stringCompression.compress("aaaAAAbBBB"));
    }
}
