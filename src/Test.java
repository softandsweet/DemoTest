import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Test {
    public static void main(String[] args) {
        System.out.println("Arraylist：");
        Test test = new Test();
        test.test();
        System.out.println("\nLaLa");
        test.test2();
    }

    public void test() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(32);
        arrayList.add(54);
        arrayList.add(25);

        for (Integer integer : arrayList) {
            System.out.println(integer);

        }
        System.out.println("-------------");
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public void test2() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("age", 18);
        hashMap.put("class", 1);
        hashMap.put("score", 100);

        Set<Entry<String, Integer>> entrySet2 = hashMap.entrySet();
        Iterator<Entry<String, Integer>> iterator = entrySet2.iterator();
        while(iterator.hasNext()) {
            Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+" ---- "+value);
        }

        System.out.println("---------------");
        Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry);
        }
    }
}
