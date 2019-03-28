public class HeatingPlan {
    private TempRange range;

    public HeatingPlan(TempRange range) {
        this.range = range;
    }

    public boolean withinRange(int low, int high) {
        return (low >= range.getLow() && high <= range.getHigh());
    }
}
