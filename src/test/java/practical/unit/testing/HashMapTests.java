package practical.unit.testing;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.HashMap;
import java.util.Map;

@Test
public class HashMapTests {

    private Map<String, String> map;

    @BeforeMethod
    private void setUp(){
        map = new HashMap<String, String>();
    }


    public void retrieveObjectTest() {
        // arrange
        String key = "key";
        String value = "value";

        // act
        map.put(key, value);
        String result = map.get(key);

        // assert
        assertEquals(result, value);
    }

    public void replaceObjectTest() {
        // arrange
        String key = "key";
        String value1 = "value1";
        String value2 = "value2";

        // act
        map.put(key, value1);
        map.put(key, value2);
        String result = map.get(key);

        // assert
        assertEquals(result, value2);
    }

    public void clearObjectsTest() {
        // arrange
        String key1 = "key1";
        String key2 = "key2";
        String value1 = "value1";
        String value2 = "value2";

        // act
        map.put(key1, value1);
        map.put(key2, value2);
        map.clear();

        // assert
        assertEquals(map.size(), 0);
    }

    public void nullAsKeyTest() {
        // arrange
        String key = null;
        String value = "value";

        // act
        map.put(key, value);
        String result = map.get(key);

        // assert
        assertEquals(result, value);
    }

}
