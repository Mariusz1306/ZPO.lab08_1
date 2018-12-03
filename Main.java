import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        try {
            Class cls = Class.forName("MaxSearchAlgorithms");
            Method methlist[] = cls.getDeclaredMethods();
            ArrayList<Method> scanmethlist = new ArrayList();
            Integer[] numberArray = {4, 10, 3, 7, 4, 1, 6, 2};
            ArrayList<Integer> number =  new ArrayList<>(Arrays.asList(numberArray));
            for (int i = 0; i < methlist.length; i++) {
                Method m = methlist[i];
                if (m.getName().contains("Scan"))
                    scanmethlist.add(m);
            }
            MaxSearchAlgorithms obj = new MaxSearchAlgorithms();
            ArrayList<Integer> results;
            for (int i = 0; i < scanmethlist.size(); i++){
                results  = (ArrayList<Integer>) scanmethlist.get(i).invoke(obj, number);
                System.out.println(results);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
