package annie470.U5_W1_D2;

import annie470.U5_W1_D2.entities.Drink;
import annie470.U5_W1_D2.entities.Ordine;
import annie470.U5_W1_D2.entities.StatusOrder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class U5W1D2ApplicationTests {

	@Test
    void prepareBill() {
        int totalPrices = 150;
        double coverCharge =2.5;
        int nPax= 4;
        double bill = totalPrices + (coverCharge * nPax);
        assertAll(
                () -> assertNotEquals(0, bill),
                () -> assertEquals(160.0, bill)
        );
    }

    @ParameterizedTest
    @CsvSource({"150, 2.5, 4, 160.0", "100, 0.0, 4, 100.0",})
    void prepareBillParam(int totalPrices, double coverCharge, int nPax, double expBill) {
        double bill = totalPrices + (coverCharge * nPax);
        assertEquals(expBill, bill);
    }

    @Test
    void getLemonadeTest() {
        Drink lemonade = new Drink("Lemonade (0.33)", 128, 1.29 );
        assertAll(
                () -> assertTrue(lemonade.getPrice() > 0),
                () -> assertInstanceOf(Drink.class, lemonade)
        );
    }

    @Test
    void sameCellMemoryTest() {
        Drink lemonade = new Drink("Lemonade (0.33)", 128, 1.29 );
        Drink cola;
        cola = lemonade;
        assertSame(cola, lemonade);
    }



    static Drink cola = new Drink("Cola (0.33)", 139, 1.29);
    static Drink lemonade = new Drink("Lemonade (0.33)", 128, 1.29 );
    static List<Drink> drinks = new ArrayList<>();
    @BeforeAll
    static void set(){
       drinks.add(lemonade);
    }
    @AfterAll
    static void afterSet() {
        drinks.clear();
    }
    @Test
  void addListTest() {
        drinks.add(cola);
        assertEquals(2, drinks.size());
    }
}
