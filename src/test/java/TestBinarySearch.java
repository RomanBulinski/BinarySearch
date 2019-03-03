import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBinarySearch {

    @Test
    public  void testBinarySearchTRue(){
        int[] arr = {1, 2, 3, 4};
        BinarySearch bs = new BinarySearch();
        assertTrue(  bs.binarySearch( arr,3    )   );
    }

    @Test
    public  void testBinarySearchTRue2(){
        int[] arr = {1, 2, 3, 4, 5 };
        BinarySearch bs = new BinarySearch();
        assertTrue(  bs.binarySearch( arr,4   )   );
    }

    @Test
    public  void testBinarySearchFalse(){
        int[] arr = {11,12,13,15,16};
        BinarySearch bs = new BinarySearch();
        assertFalse(  bs.binarySearch( arr,14   )   );
    }

    @Test
    public  void testBinarySearchFalse2(){
        int[] arr = {9,10,11,12,13,15,16,17};
        BinarySearch bs = new BinarySearch();
        assertFalse(  bs.binarySearch( arr,14   )   );
    }

    @Test
    public  void testBinarySearchFalse3(){
        int[] arr = {9,10,11};
        BinarySearch bs = new BinarySearch();
        assertFalse(  bs.binarySearch( arr,20  )   );
    }



}
