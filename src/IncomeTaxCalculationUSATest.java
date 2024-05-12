import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxCalculationUSATest {

    IncomeTaxCalculationUSA user1 = new IncomeTaxCalculationUSA(70000, 2);
    IncomeTaxCalculationUSA user2 = new IncomeTaxCalculationUSA(65000, 2);
    IncomeTaxCalculationUSA user3 = new IncomeTaxCalculationUSA(35000,1);
    IncomeTaxCalculationUSA user4 = new IncomeTaxCalculationUSA(65000,2);

    @Test
    void user1test(){
        assertEquals(7900, user1.getTax());
    }

    @Test
    void user2test(){
        assertEquals(6650, user2.getTax());
    }

    @Test
    void user3test(){
        assertEquals(3950, user3.getTax());
    }

    @Test
    void setUser4(){
        assertEquals(6650, user4.getTax());
    }
}