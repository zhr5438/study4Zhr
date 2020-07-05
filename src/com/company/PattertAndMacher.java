package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattertAndMacher {

    public static void main(String[] args) {
        // 1.通过工厂模式获得pattern对象
        String testStr = "qqqq111bbbb";
        String regex = "^\\d+$";
        Pattern pattern = Pattern.compile(regex);
       // String[] testStrArray = pattern.split(testStr);
        //String[]  testStrArray1 = testStr.split(regex);
        System.out.println("split():");
        //System.out.println(testStrArray[0]+testStrArray[1]);//这两个是一样的
       // System.out.println(testStrArray1[0]+testStrArray1[1]);
        //2.通过pattern对需要的字符进行匹配的到Matcher
        Matcher matcher1 = pattern.matcher("2233bb");
        Matcher matcher2 = pattern.matcher("asc123");
        Matcher matcher3 = pattern.matcher("ascx1");
        System.out.println("lookAt():");
        System.out.println(matcher1.lookingAt());//这个方法只匹配开头
        System.out.println(matcher2.lookingAt());
        System.out.println("find():");//只要整体存在就返回true
        System.out.println(matcher1.find());
        System.out.println(matcher1.find());
        System.out.println(matcher1.find());
        Pattern p = Pattern.compile("(\\w+)%(\\d+)");
        Matcher m = p.matcher("ab%12-cd%34");
        System.out.println(m.groupCount());// 2

    }
}
