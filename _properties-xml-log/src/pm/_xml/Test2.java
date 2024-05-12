package pm._xml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /**
         * 如何使用程序把数据写出到 XML 文件中去
         * <?xml version="1.0" encoding="utf-8" ?>
         * <book>
         *     <name>从入门到跑路</name>
         *     <author>朴睦</author>
         *     <price>9.9</price>
         * </book>
         */

        // 使用 StringBuilder 拼接
        StringBuilder sb = new StringBuilder();
        String name = "从入门到跑路";
        String author = "朴睦";
        double price = 9.9;

        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
        // \t 是空格，\n 换行
        sb.append("<book>\n");
        sb.append("\t<name>").append(name).append("</name>\n");
        sb.append("\t<author>").append(author).append("</author>\n");
        sb.append("\t<price>").append(price).append("</price>\n");
        sb.append("</book>\n");

        // 缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("_properties-xml-log/src/pm/_xml/book.xml"));
        bw.write(sb.toString());
        bw.close();
    }
}
