import java.util.*;
import org.jdom.*;
import org.jdom.input.SAXBuilder;
public class Sample {
	public static void main(String[] args) throws Exception {
			SAXBuilder ssb = new SAXBuilder();
			Document doc = ssb.build(Sample.class.getClassLoader().getResourceAsStream("test.xml"));
			Element root = doc.getRootElement();//获取根元素
			List list = root.getChildren("disk");
			for(int i=0;i<list.size();i++) {
				Element element = (Element)list.get(i);
				String name = element.getAttributeValue("name");
				String capacity = element.getChildText("capacity");
				String directories = element.getChildText("directories");
				String files = element.getChildText("files");
				System.out.println("磁盘信息：");
				System.out.println("分区盘符："+name);
				System.out.println("分区容量："+capacity);
				System.out.println("目录数"+directories);
				System.out.println("文件数"+files);
				System.out.println("-------------------------------------------------");
			}
	}
}
