
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
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
    void temp4(){
        Stream<Integer> numStream = Stream.of(-2, -1, 0, 1, 2, 3);
//转换成字符串流
//        Stream<String> strStream = numStream.map(String::valueOf);
        Stream<Float> floatStream=numStream.map(Float::valueOf);
        floatStream.forEach(e->{
            System.out.println(e);
        });
    }

}
