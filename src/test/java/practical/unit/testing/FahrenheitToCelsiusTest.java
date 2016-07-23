package practical.unit.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FahrenheitToCelsiusTest {

    @DataProvider
    private final Object[][] celsiusToFahrenheitDataProvider() {
        return new Object[][] {{0, 32}, {37, 98}, {100, 212}};
    }

    @Test(dataProvider = "celsiusToFahrenheitDataProvider")
    public void shouldConvertCelsiusToFahrenheit(int celsius, int fahrenheit) {
        assertEquals(FahrenheitToCelsiusConverter.toFahrenheit(celsius), fahrenheit);
    }

    @DataProvider
    private final Object[][] fahrenheitToCelsiusDataProvider() {
        return new Object[][] {{32, 0}, {100, 37}, {212, 100}};
    }

    @Test(dataProvider = "fahrenheitToCelsiusDataProvider")
    public void shouldConvertFahrenheitToCelsius(int fahrenheit, int celsius) {
        assertEquals(FahrenheitToCelsiusConverter.toCelsius(fahrenheit), celsius);
    }

}
