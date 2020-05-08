package trainings;

class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] reversed = new int[A.length];
        if (A.length == 0){
            return A;
        }
        K = K%A.length;
        for (int i=0; i<A.length; i++) {
            reversed[i] = A[(i + (A.length - K)) % (A.length)];
        }
        return reversed;
    }
}
