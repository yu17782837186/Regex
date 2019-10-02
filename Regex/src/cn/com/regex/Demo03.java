package cn.com.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03 {
    //测试正则表达式字符串替换，分割操作
    public static void main(String[] args) {
//        //表达式对象
//        Pattern p = Pattern.compile("([0-9])");
//        //创建匹配对象
//        Matcher m = p.matcher("adsfghs12346789&&gsfdh123456sgsgf243");
//        //字符串替换
//        String newStr = m.replaceAll("*");
//        System.out.println(newStr);

        //字符串分割操作
//        String str = "a,b,c,d";
//        String[] arrs = str.split(",");
//        System.out.println(Arrays.toString(arrs));
        String str = "a123456cbsg154gsh2shsj122";
        String[] arrs = str.split("\\d+");
        System.out.println(Arrays.toString(arrs));
    }
}
