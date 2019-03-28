public class Room {
    private TempRange range;

    public void setDaysTempRange(int low, int high) {
        range = new TempRange(low, high);
    }

    public boolean withinPlan(HeatingPlan plan) {
        int low = daysTempRange().getLow();
        int high = daysTempRange().getHigh();
        return plan.withinRange(low, high);
    }

    private TempRange daysTempRange() {
        return range;
    }
}
