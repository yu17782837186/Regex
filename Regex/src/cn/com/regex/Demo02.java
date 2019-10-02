package cn.com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo02 {
    //测试正则表达式里面获取分组
    public static void main(String[] args) {
        //表达式对象
//        Pattern p = Pattern.compile("\\w+");
        Pattern p = Pattern.compile("([a-z]+)([0-9]+)");
        //创建匹配对象
        Matcher m = p.matcher("adsfghs12346789&&gsfdh123456sgsgf243");
        while(m.find()) {
//            System.out.println(m.group());
            System.out.println(m.group(1));
//            System.out.println(m.group(2));
        }
    }
}
