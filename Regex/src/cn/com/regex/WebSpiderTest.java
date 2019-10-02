package cn.com.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebSpiderTest {
    //网络爬虫取链接
    public static String getURLContent(String urlStr,String charset) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(urlStr);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), Charset.forName(charset)));
            String tmp;
            while((tmp = reader.readLine()) != null) {
                sb.append(tmp+"\n");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    public static List<String> getMatherSubstrs(String destStr,String regexStr) {
        Pattern p = Pattern.compile(regexStr);
        Matcher m = p.matcher(destStr);
        List<String> result = new ArrayList<>();

        while(m.find()) {
//            System.out.println(m.group());
//            System.out.println(m.group(1));
            result.add(m.group(1));
        }
        return result;
    }
    public static void main(String[] args) {
        String destStr = getURLContent("http://163.com","gb2312");
//        System.out.println(destStr);
        //取得超链接的整个的内容
//        Pattern p = Pattern.compile("<a[\\s\\S]+?</a>]");
        List<String> result = getMatherSubstrs(destStr,"href=\"([\\w\\s./:]+?)\"");
        for (String str:result) {
            System.out.println(str);
        }
    }
}
