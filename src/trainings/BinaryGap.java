package trainings;

public class BinaryGap {
    public int solution (int N){
        String[] s = Integer.toBinaryString(N).substring(0, Integer.toBinaryString(N).lastIndexOf('1') ).split("1");
        int i = 0;
        int j = 0;

        while(i < s.length){
            j = Math.max(j, s[i].length());
            i++;
        }
        return j;
    };
}
