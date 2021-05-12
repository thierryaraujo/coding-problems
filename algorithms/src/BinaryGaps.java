import java.util.ArrayList;
import java.util.List;

public class BinaryGaps {

    public StringBuffer dec2bin(int dec) {
        int result = dec;
        StringBuffer binary = new StringBuffer();
        while (result > 0) {
            binary.append(result%2);
            result = result/2;
        }
        return binary.reverse();
    }

    public int solution(int number) {
        List<StringBuffer> gaps = new ArrayList<>();
        
        StringBuffer binary = this.dec2bin(number);
        
        StringBuffer tmp = new StringBuffer();
        for (int i=1; i < binary.length(); i++) {
            int element = Character.getNumericValue(binary.charAt(i));
            if (element == 0) {
                tmp.append(element);
            } else {
                gaps.add(tmp);
                tmp = new StringBuffer();
            }
        }

        int sizeBiggerGap = 0;
        for (StringBuffer gap : gaps) {
            if (sizeBiggerGap < gap.length()) {
                sizeBiggerGap = gap.length();
            }
        }

        return sizeBiggerGap;
    }

    public static void main(String[] args) {
        BinaryGaps db = new BinaryGaps();
        System.out.println(db.dec2bin(649));
        System.out.println(db.solution(649));
        System.out.println("--------------------------");
        System.out.println(db.dec2bin(529));
        System.out.println(db.solution(529));
    }
}
