public class URLify {

    public String urlify(String phrase, int trueLength) {
        char[] toChar = phrase.toCharArray();
        char[] url = new char[toChar.length];
        int urlPosition = 0;
        for (int i = 0; i < toChar.length; i++) {
            if (urlPosition < toChar.length) {
                if (toChar[i] == ' ') {
                    url[urlPosition] = '%';
                    urlPosition++;
                    url[urlPosition] = '2';
                    urlPosition++;
                    url[urlPosition] = '0';
                    urlPosition++;
                } else {
                    url[urlPosition] = toChar[i];
                    urlPosition++;
                }
            }
        }

        return String.copyValueOf(url);
    }

    public static void main(String[] args) {
        URLify urlfier = new URLify();

        System.out.println(urlfier.urlify("La casa  ", 10));
        System.out.println(urlfier.urlify("La casa de papel      ", 22));
    }
}
