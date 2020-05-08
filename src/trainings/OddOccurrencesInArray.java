package trainings;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        int single = 0;
        for (int value : A) {
            single ^= value;
        }
        return single;
    }
}
