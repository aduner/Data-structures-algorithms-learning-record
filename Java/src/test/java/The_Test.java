
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.io.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author Aduner
 */
public class The_Test {
    @Test
    void temp(){
        List<Integer> list=new ArrayList<>();
        final List<Integer> finalList=list;
        list.add(1);
        finalList.add(2);
        for(int i :finalList){
            System.out.println(i);
        }
        System.out.println(list == finalList);
    }

    @Test
    void temp2(){
        int a=1;
        int aa=a;
        Runnable r=()->{
            System.out.println(aa);
        };
        r.run();
    }
    @Test
    void temp3(){
        List<Integer> list=new ArrayList<>();
        final List<Integer> finalList=list;
        list.add(1);
        Runnable r = () -> {
            System.out.println(finalList);
        };
        r.run();
        list.add(1);
        System.out.println(list);
    }

    @Test
    void temp4() {
        Stream<Integer> numStream = Stream.of(-2, -1, 0, 1, 2, 3);
//转换成字符串流
//        Stream<String> strStream = numStream.map(String::valueOf);
        Stream<Float> floatStream = numStream.map(Float::valueOf);
        floatStream.forEach(e -> {
            System.out.println(e);
        });
    }

    @Test
    void temp5() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i += 5) {
            List<Integer> subList = list.subList(i, Math.min(list.size(), i + 5));
            subList.forEach(e -> {
                System.out.println(e);
            });
        }
    }

    @Test
    void temp6() {
        String date1 = "2021-07-10 00:00:00";
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
//        try {
//            Date date =simpleDateFormat.parse(date1);
//            System.out.println(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        int times = 0;
        try {
            times = (int) ((Timestamp.valueOf(date1).getTime()) / 1000);
            System.out.println(times);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (times == 0) {
            System.out.println("String转10位时间戳失败");
        }

    }

    @Test
    void temp7() throws Exception {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse("2020-02-15 17:52:17");


        // 获取当前时间
        Calendar nowTime = Calendar.getInstance();
        int nowYear = nowTime.get(Calendar.YEAR);
        int nowMonth = nowTime.get(Calendar.MONTH);
        System.out.println(nowTime.get(Calendar.DAY_OF_YEAR));
        // 获取日期一
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.YEAR, nowYear);
        calendar.set(Calendar.MONTH, nowMonth);
        Date dateOne = calendar.getTime();
        // 计算日期二
        calendar.add(Calendar.DAY_OF_YEAR, 15);
        if (calendar.get(Calendar.MONTH) != nowMonth) {
            //超过当前月份月份，就反向减少15天，15+15所以减去30天
            calendar.add(Calendar.DAY_OF_YEAR, -30);
            //2月份比较特殊，需要单独处理
            if (nowMonth == 1 && calendar.get(Calendar.MONTH) != nowMonth) {
                calendar.set(Calendar.MONTH, nowMonth);
                calendar.set(Calendar.DAY_OF_MONTH, 1);
            }
        }

        Date dateTwo = calendar.getTime();
        System.out.println(format.format(dateOne.getTime()));
        System.out.println(format.format(dateTwo.getTime()));
        System.out.println("-------");
        System.out.println(format.format((dateOne.before(dateTwo) ? dateOne : dateTwo).getTime()));
        System.out.println(format.format((dateOne.before(dateTwo) ? dateTwo : dateOne).getTime()));
    }


    @Test
    void temp10(){
        String a="";
        System.out.println(a == "");
        System.out.println(a.equals(""));
    }

    @Test
    void temp11() throws Exception{
        File file = new File("person.out");
        // 序列化
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
        Person person = new Person("Haozi", 22, "上海");
        oout.writeObject(person);
        oout.close();
        // 反序列化
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
        Object newPerson = oin.readObject();
        oin.close();
        System.out.println(newPerson);
    }

    @Test
    void temp12() {
        int a = 1;
        while (a < 10) {
            a = a << 1;
            System.out.println(a);
        }
    }

    @Test
    void temp13() {
        String a = "a";
        String b = "b";
        String c = "a" + "b";
        String d = a + b;
        System.out.println(c.equals(d));
        System.out.println(c == d);
    }
    @Test
    void temp14(){
        int a=128+1;
        Integer b=128+1;
        Long c=1L+1L;
        System.out.println(b.equals(a));
        System.out.println(b.equals(c));
        System.out.println(a == b);
    }
    @Test
    void temp15(){
        System.out.println(formatString("A%sC%sE", 7, new char[]{'B', 'D', 'F'}));
    }

    public String formatString(String A, int n, char[] arg) {
        List<Character> list=new ArrayList<>();
        int index=0;
        for(int i=0;i<A.length();i++){
            char c=A.charAt(i);
            if(c!='%'){
                list.add(c);
            }else{
                i++;
                if(i<A.length()&&A.charAt(i)=='s'){
                    list.add(arg[index++]);
                }
            }
        }
        for(;index<arg.length;index++){
            list.add(arg[index]);
        }
        StringBuilder s=new StringBuilder();
        for(char c:list){
            s.append(c);
        }
        return s.toString();
    }

    @Test
    void temp16(){
        int low=123;
        int high=321;
        System.out.println(low + (high - low) / 2 == (low + high) / 2);
    }
    @Test
    void temp17(){
        System.out.println(strToInt("123456789456789"));
    }

    public int strToInt(String str) {
        char[] c = str.trim().toCharArray();
        if(c.length == 0) return 0;
        int res = 0, bndry = Integer.MAX_VALUE / 10;
        int i = 1, sign = 1;
        if(c[0] == '-') sign = -1;
        else if(c[0] != '+') i = 0;
        for(int j = i; j < c.length; j++) {
            if(c[j] < '0' || c[j] > '9') break;
            if(res > bndry || res == bndry && c[j] > '7')
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (c[j] - '0');
        }
        return sign * res;
    }

}
