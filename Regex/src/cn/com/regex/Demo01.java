package cn.com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo01 {
    //测试正则表达式的基本用法
    public static void main(String[] args) {
        //在这个字符串：adsfghs12346789gsfdh1sgsgf243，是否符合正则表达式
        //正则表达式对象
        Pattern p = Pattern.compile("\\w+");
        //创建匹配对象
        Matcher m = p.matcher("adsfghs12346789&&gsfdh1sgsgf243");
//        boolean flag = m.matches(); //尝试将整个字符序列与该模式匹配
//        System.out.println(flag);

//        boolean flag2 = m.find(); //该方法扫描输入的序列，查找与该模式匹配的下一个子序列
//        System.out.println(flag2);
//        System.out.println(m.find());
//        System.out.println(m.find());
//        System.out.println(m.find());
//        System.out.println(m.find());
//        System.out.println(m.find());
//        System.out.println(m.group());
//
//        System.out.println(m.find());
//        System.out.println(m.group());
        while(m.find()) {
            System.out.println(m.group()); //group和group(0)匹配整个表达式的字符串
            System.out.println(m.group(0));
        }
    }
}
