package cc.before30.algex.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {

    @Test
    public void searchInsert() {
        SearchInsertPosition position = new SearchInsertPosition();

        int[] input1 = {1, 3, 5, 6};
        int[] input2 = {1,3,5,6};
        int[] input3 = {1,3,5,6};
        int[] input4 = {1,3,5,6};

        Assert.assertEquals(2, position.searchInsert(input1, 5));
        Assert.assertEquals(1, position.searchInsert(input1, 2));
        Assert.assertEquals(4, position.searchInsert(input1, 7));
        Assert.assertEquals(0, position.searchInsert(input1, 0));

    }
}