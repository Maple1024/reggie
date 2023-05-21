import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
* Array.asList()函数的使用
* */
public class test {
    public static void testArray2List(){
        String[] strs={"aaa","bbb","ccc"};
        List<String> list= Arrays.asList(strs);//返回一个指定大小的数组
        List<String> lists=new ArrayList<String>();
        lists.addAll(list);
        lists.add("ddd");
        for (String s:lists){
            System.out.print(s);
        }
        System.out.println();
    }
    public static void testList2Array(){
        List<String> list=new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        String[] array=list.toArray(new String[list.size()]);
        for(String s:array){
            System.out.print(s);
        }
    }
    public static void main(String argc[]){
        testArray2List();
        testList2Array();
    }
}
