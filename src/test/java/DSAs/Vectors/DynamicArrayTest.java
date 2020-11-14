package DSAs.Vectors;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicArrayTest {
    @Test
    void DynamicArray_NotNULL_Test(){
        DynamicArray array = new DynamicArray();
        assertNotNull(array);
    }
}
