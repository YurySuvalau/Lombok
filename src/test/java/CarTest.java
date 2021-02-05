import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTest {

    @Test
    public void carTest() {
Car car1 = Car.builder()
        .speed(300)
        .model("M3")
        .version("diesel")
        .build();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        Assert.assertEquals(car1, car2);

    }
}
