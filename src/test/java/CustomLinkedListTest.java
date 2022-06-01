
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class CustomLinkedListTest {
    private CustomLinkedList<String> list;

    @BeforeEach
    public void setup() {
        list = new CustomLinkedList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
    }

    @Test
    public void whenGivenIndex0ReturnsFirstElement(){
        assertEquals("0", list.get(0));
    }

    @Test
    public void whenGivenLastIndexReturnsLastElement(){
        int lastIndex = list.size() - 1;
        assertEquals("4", list.get(lastIndex));
    }

    @Test
    public void whenGivenMidpointIndexReturnsMidpointElement(){
        int midpointIndex = list.size() / 2;
        assertEquals("2", list.get(midpointIndex));
    }

    @Test
    public void whenGivenNegativeIndexThrowsIndexOutOfBoundsException(){
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    public void whenGivenIndexEqualOrLargerThanSizeThrowsIndexOutOfBoundsException(){
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(list.size()));
    }

    @Test
    public void whenPerformingOperationSizeDoesNotChange(){
        int initialSize = list.size();
        list.get(0);
        assertEquals(initialSize, list.size());
    }

}