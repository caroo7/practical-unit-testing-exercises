package practical.unit.testing;

import static org.testng.Assert.*;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class StringReverseTest {

    @DataProvider
    private final Object[][] validStringDataProvider() {
        return new Object[][]{{"kajak", "kajak"}, {"1", "1"}, {"michal", "lahcim"}, {"kami", "imak"}};
    }

    @DataProvider
    private final Object[][] invalidStringDataProvider() {
        return new Object[][]{{null}};
    }

    @Test(dataProvider = "validStringDataProvider")
    public void validStringReverseTest(String parameter, String expectedResult) {

        // act
        String result = StringReverse.reverse(parameter);

        // assert
        assertNotNull(result);
        assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "invalidStringDataProvider", expectedExceptions = IllegalArgumentException.class)
    public void invalidStringReverseTest(String parameter) {
        // act
        String result = StringReverse.reverse(parameter);
    }

}
