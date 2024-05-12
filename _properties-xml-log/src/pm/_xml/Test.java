package pm._xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test {
    public static void main(String[] args) throws DocumentException {
        // 1、创建一个 DOM4j 提供的解析器对象
        SAXReader saxReader = new SAXReader();

        // 2、使用 saxReader 对象把需要解析的 XML 文件读取到程序中来
        Document document = saxReader.read("_properties-xml-log/src/pm/_xml/hello.xml");

        // 3、从文档对象中解析 XML 文件的全部数据了
        // 获取根元素
        Element rootElement = document.getRootElement();
        String name = rootElement.getName();
        System.out.println(name);
    }
}
