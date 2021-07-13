import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.*;

public class TestNgDemo {

    public  void test()
    {
        long s=0L;
        long ss=989987;

        // SoftAssert softAssertion= new SoftAssert();
        // ss=0L;
        //softAssertion.assertEquals(s,ss);
        List<String> sr= List.of("dfr","dfd","tt");
        //  sr.add("one");
        //System.out.println(sr);
        // ArrayList<String> list= new ArrayList<>();
        SortedSet<String> list=new TreeSet<>();
        list.add("one");
        list.add("two");
        list.add("ane");
        list.add("wo");
        list.add("txo");
        list.add("txo");
        Iterator li=list.iterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }


    }

   // @Test(description = "testing maps")
    public  void testMaps()
    {
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"one");
        map.put(2,"TWO");
        map.put(3,"THREE");
        map.put(4,"FOUR");
        Set set= map.entrySet();
        Iterator it=set.iterator();
        System.out.println(map.entrySet() +"values are "+map.keySet());
       /* while(set.iterator().hasNext())
        {
            Map.Entry entry=(Map.Entry)it.next();
            System.out.println(entry.getKey() +"vealues "+entry.getValue());
        }*/
        ArrayList<String> list= new ArrayList<>();
        ArrayList<String> lists= new ArrayList<>();
        list.add("one");
        list.add("TWO");
        list.add("Three");
        list.add("FOUR");
        int i =0;
        for(Map.Entry entry:map.entrySet())
        {
            //System.out.println(entry.getValue());
            if(entry.getValue().equals(list.get(i)))
            {
                lists.add(list.get(i));
                i++;
            }
            else
            {
                break;
            }

        }
        for(String as:lists)
        {
            System.out.println("same values frm list are "+as);
        }


    }
   /// @Test
    public void testCollections()
    {
        List<String> set= new ArrayList<>();
        set.add("wen");
        set.add("sen");
        set.add("ten");
        set.add("qww");
        set.add("ass");
        Iterator it=set.iterator();
        Collections.swap(set,0,3);
        System.out.println(set);
        for(String c:set)
        {
            System.out.println(c);
        }
        /*while(it.hasNext())
        {
            System.out.println("print--->  "+it.next());
        }*/
    }

    @DataProvider(name = "dataprovider")
    public Object[][] datasetup()
    {
int i=0;
int k=0;

        Object[][] obj=new Object[][]{{"shivannd"},{"chacha"}};

        //return new Object[][] {{"First-Value"}, {"Second-Value"}};
        return obj;
    }

    @Test(dataProvider ="dataprovider" )
    public void rundata(String data)
    {
        System.out.println("data 11 -===  "+data+"data 2===  "+data);
      //  System.out.println(data2);
    }
}
