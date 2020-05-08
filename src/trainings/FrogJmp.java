package trainings;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int steps = (Y - X) / D;
        int remains = (Y - X) % D > 0 ? 1 : 0;
        return steps + remains;
    }
}
