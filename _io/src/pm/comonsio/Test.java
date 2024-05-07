package pm.comonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 包
        FileUtils.copyFile(new File("_io/demo.txt"), new File("_io/demo1.txt"));
    }
}
