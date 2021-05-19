public class Testes {
    public static void main(String[] args) {
        int[] arrayteste = {9,8,7,6,5,4,3,2,1};
        for (int i = 0; i < arrayteste.length / 2; i++) {
            int other = arrayteste.length - i - 1;
            int temp = arrayteste[i];
            arrayteste[i] = arrayteste[other];
            arrayteste[other] = temp;
        }
        for (int i : arrayteste) {
            System.out.print(i+",");
        }
        System.out.println();
    }
}
