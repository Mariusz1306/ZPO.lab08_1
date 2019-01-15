import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        try {
            Class cls = Class.forName("MaxSearchAlgorithms"); //Szukamy klasy o nazwie "MaxSearchAlgorithms"
            Method methlist[] = cls.getDeclaredMethods(); //Tworzymy tablicę metod tej klasy
            ArrayList<Method> scanmethlist = new ArrayList(); //Przygotujemy sobię listę metod, która później będzie zawierała metody, które w nazwie mają "Scan"
            Integer[] numberArray = {4, 10, 3, 7, 4, 1, 6, 2}; //Nasze dane wejściowe, nieposortowana tablica cyfr
            ArrayList<Integer> number =  new ArrayList<>(Arrays.asList(numberArray)); //Zamieniamy tablicę cyfr na listę cyfr, ponieważ metody przyjmują listy
            for (int i = 0; i < methlist.length; i++) { //Przejdź przez wszystkie metody naszej klasy "MaxSearchAlgorithms"
                Method m = methlist[i]; //Pobierz metodę
                if (m.getName().contains("Scan")) //Jeśli zawiera w nazwie słowo "Scan"
                    scanmethlist.add(m); //To dodaj ją do listy metod scanmelist (deklaracja linia 10)
            }
            Object obj = cls.newInstance(); //Tworzymy nowy obiekt, który jest instancją naszej klasy (To jest to samo co MaxSearchAlgorithms obj = new MaxSearchAlgorithms();)
            ArrayList<Integer> results; //Przygotowujemy sobię liste wyników
            for (int i = 0; i < scanmethlist.size(); i++){ //Przejdź przez wszystkie metedy, którę zawierają w nazwię słowo "Scan"
                results  = (ArrayList<Integer>) scanmethlist.get(i).invoke(obj, number); //Odpal te metody na obiekcie obj i zapisz wyniki do listy wynikowej
                System.out.println(results);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
