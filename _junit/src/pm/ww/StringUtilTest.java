package pm.ww;

import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testPrintName() {
        StringUtil.printName("朴睦");
        StringUtil.printName(null);
    }
}
