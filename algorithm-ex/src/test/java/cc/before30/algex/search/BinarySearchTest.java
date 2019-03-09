package cc.before30.algex.search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void search() {
        BinarySearch b = new BinarySearch();

        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int[] nums2 = {-1, 0, 3, 5, 9, 12};


        Assert.assertEquals(4, b.search(nums1, 9));
        Assert.assertEquals(-1, b.search(nums2, 2));
        Assert.assertEquals(-1, b.search(nums2, 13));
    }
}