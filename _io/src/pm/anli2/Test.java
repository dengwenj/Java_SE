package pm.anli2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws IOException {
        String str1 = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String str2 = "http://www.haoming8.cn/baobao/10881.html";
        String str3 = "http://www.haoming8.cn/baobao/7641.html";

        // 爬取数据，把网址上的所有数据拼接成一个字符串
        String familyNameStr = webCrawler(str1);
        ArrayList<String> familyName = getData(familyNameStr, "([\\u4e00-\\u9fa5]{4})(，|。)", 1);

        String bodyNameStr = webCrawler(str2);
        ArrayList<String> bodyName = getData(bodyNameStr, "([\\u4e00-\\u9fa5]{2})(、|。)", 1);

        String girlNameStr = webCrawler(str3);
        ArrayList<String> girlName = getData(girlNameStr, "(.. ){4}..", 0);

        // 姓氏
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String s : familyName) {
            for (int i = 0; i < s.length(); i++) {
                familyNameList.add(s.charAt(i) + "");
            }
        }

        // 男生名
        ArrayList<String> bodyNameList = new ArrayList<>();
        for (String s : bodyName) {
            if (!bodyNameList.contains(s)) {
                bodyNameList.add(s);
            }
        }

        // 女生名
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String s : girlName) {
            List<String> list = Arrays.stream(s.split(" ")).toList();
            girlNameList.addAll(list);
        }

        // 最终数据
        ArrayList<String> finallyData = finallyData(familyNameList, bodyNameList, girlNameList, 20, 10);

        // 把写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("_io/src/pm/anli2/name.txt"));
        for (String fd : finallyData) {
            bw.write(fd);
            // 换行
            bw.newLine();
        }
        bw.close();
    }

    public static ArrayList<String> finallyData(
        ArrayList<String> familyNameList,
        ArrayList<String> bodyNameList,
        ArrayList<String> girlNameList,
        int bodyCount,
        int girlCount
    ) {
        // 男生姓名
        HashSet<String> body = getBodyGirlName(familyNameList, bodyNameList, bodyCount);
        // 女生姓名
        HashSet<String> girl = getBodyGirlName(familyNameList, girlNameList, girlCount);

        // 拼接
        ArrayList<String> bodyList = nameSexAge(body, new int[]{18, 30}, '男');
        ArrayList<String> girlList = nameSexAge(girl, new int[]{18, 25}, '女');
        bodyList.addAll(girlList);
        // 打乱
        Collections.shuffle(bodyList);

        return bodyList;
    }

    public static ArrayList<String>  nameSexAge(HashSet<String> body, int[] range, char bOrg) {
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();

        for (String s : body) {
            int age = r.nextInt(range[1] - range[0] + 1) + range[0];
            list.add(s + "-" + bOrg + "-" + age);
        }
        return list;
    }

    public static HashSet<String> getBodyGirlName(
        ArrayList<String> familyNameList,
        ArrayList<String> nameList,
        int count
    ) {
        HashSet<String> name = new HashSet<>();
        while (name.size() != count) {
            // 打乱姓氏
            Collections.shuffle(familyNameList);
            // 打乱名字
            Collections.shuffle(nameList);
            name.add(familyNameList.get(0) + nameList.get(0));
        }
        return name;
    }

    public static ArrayList<String> getData(String data, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            list.add(matcher.group(index) );
        }

        return list;
    }

    public static String webCrawler(String str) throws IOException {
        URL url = new URL(str);
        // 连接
        URLConnection urlConnection = url.openConnection();
        // 字节流，需要转换成字符流，防止中文乱码
        InputStreamReader isr = new InputStreamReader(urlConnection.getInputStream());

        char[] chars = new char[1024 * 1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = isr.read(chars)) != -1) {
            sb.append(new String(chars, 0, len));
        }
        isr.close();
        return sb.toString();
    }
}
