import org.junit.Assert;
import org.junit.Test;

public class RoomTest {
    @Test
    public void witinPlanTest() {
        Room room = new Room();
        room.setDaysTempRange(10, 30);
        HeatingPlan plan = new HeatingPlan(new TempRange(10, 30));

        Assert.assertEquals(room.withinPlan(plan), true);

    }
}
