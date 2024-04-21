import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("яблоко");
        set.add("апельсин");
        set.add("дыня");
        if (set.contains("дыня")) {
            System.out.println("у нас есть дыня!");
        }
        Iterator<String> iterator = set.iterator();
        //        while (iterator.hasNext()){
//            String  element = iterator.next();
//
//            System.out.println(element.hashCode());
//        }
        set.remove("дыня");
        set.clear();
        System.out.println(set.size());


        System.out.println(set);
        TreeSet<String> strings = new TreeSet<>(Comparator.reverseOrder());
        strings.add("zoey");
        strings.add("brandon");
        strings.add("alex");
//        System.out.println(strings);
       List<String> strings1 = strings.stream().collect(Collectors.toList());
        System.out.println(strings1);
        System.out.println(strings1.get(1));
        Random random = new Random();
        while (true){
            System.out.println(random.nextInt(0,24));
        }
    }
}
