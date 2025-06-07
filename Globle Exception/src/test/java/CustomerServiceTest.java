import edu.icet.Main;
import edu.icet.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Main.class)
public class CustomerServiceTest {
    @Autowired
    private CustomerService service;

    @Test
    public void totalCal() {
        assertEquals(20, service.cal(10, 10));
    }

}
