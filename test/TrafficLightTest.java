import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class    TrafficLightTest {

    TrafficLight SUT;

    @Before
    public void setup() {
        SUT = new TrafficLight();
    }

    @Test
    public void showColor_isRedColor_redReturned() {
        String result = SUT.showColor(1);
        assertThat(result, is("Red"));
    }
    @Test
    public void showColor_isOrangeColor_orangeReturned() {
        String result = SUT.showColor(2);
        assertThat(result, is("Orange"));
    }
    @Test
    public void showColor_isGreenColor_greenReturned() {
        String result = SUT.showColor(3);
        assertThat(result, is("Green"));
    }

    @Test
    public void showColor_isInvalidLightNumber_InvalidLightNumberReturned() {
        String result = SUT.showColor(0);
        assertThat(result, is("Invalid Light Number"));
    }

    @Test
    public void isPositiveNumber_isGreaterThenZero_trueReturned() {
        boolean result = SUT.isPositiveNumber(1);
        assertThat(result, is(true));
    }

    @Test
    public void isPositiveNumber_IsZero_zeroReturned() {
        assertFalse(SUT.isPositiveNumber(0));
    }

    @Test
    public void isPositiveNumber_IsLessThanZero_negativeOneReturned() {
        assertFalse(SUT.isPositiveNumber(-1));
    }

}
