package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProjectionAreaOf3DShapesTest {

    @Test
    public void projectionArea() {
        ProjectionAreaOf3DShapes projection = new ProjectionAreaOf3DShapes();
        int[][] input1 = {{2}};
        int[][] input2 = {{1,2}, {3,4}};
        int[][] input3 = {{1,0}, {0,2}};
        int[][] input4 = {{1,1,1}, {1,0,1}, {1,1,1}};
        int[][] input5 = {{2,2,2}, {2,1,2}, {2,2,2}};

        Assert.assertEquals(5, projection.projectionArea(input1));
        Assert.assertEquals(17, projection.projectionArea(input2));
        Assert.assertEquals(8, projection.projectionArea(input3));
        Assert.assertEquals(14, projection.projectionArea(input4));
        Assert.assertEquals(21, projection.projectionArea(input5));


    }
}