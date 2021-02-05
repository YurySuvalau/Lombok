import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class CarTest {

    @Test
    public void carTest() {
        Car car1 = Car.builder()
                .speed(300)
                .model("M3")
                .version("diesel")
                .build();
        Car car2 = Car.builder()
                .speed(300)
                .model("M3")
                .version("diesel")
                .build();
//        Car car3 = Car.builder()
//                .speed(58)
//                .model("MTZ")
//                .version("T800")
//                .build();
        System.out.println(car1);
        System.out.println(car2);
       // System.out.println(car3);
        log.fatal("fatal");
        log.error("error");
        log.warn("wart");
        log.info("info");
        log.debug("debug");
        log.trace("trace");
        Assert.assertEquals(car1, car2);

    }
}
