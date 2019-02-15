package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExcelSheetColumnNumberTest {

    @Test
    public void titleToNumber() {
        ExcelSheetColumnNumber excel = new ExcelSheetColumnNumber();

        Assert.assertEquals(1, excel.titleToNumber("A"));
        Assert.assertEquals(28, excel.titleToNumber("AB"));
        Assert.assertEquals(2, excel.titleToNumber("B"));
        Assert.assertEquals(26, excel.titleToNumber("Z"));
        Assert.assertEquals(701, excel.titleToNumber("ZY"));

    }
}