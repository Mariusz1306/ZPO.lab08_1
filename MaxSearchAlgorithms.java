import java.util.ArrayList;
import java.util.List;

public class MaxSearchAlgorithms {
    private int Max;

    public List leftScan(List<Integer> lista){
        ArrayList result = new ArrayList();
        int max = lista.get(0);
        result.add(max);
        for (int i = 1; i < lista.size(); i++){
            if (lista.get(i) > max) {
                max = lista.get(i);
                result.add(max);
            }
        }
        setMax(max);
        return result;
    }

    public List rightScan(List<Integer> lista){
        ArrayList result = new ArrayList();
        int max = lista.get(lista.size()-1);
        result.add(max);
        for (int i = lista.size()-1; i > 0; i--) {
            if (lista.get(i) > max) {
                max = lista.get(i);
                result.add(max);
            }
        }
        setMax(max);
        return result;
    }

    public List evenOddScan(List<Integer> lista){
        ArrayList result = new ArrayList();
        int max = lista.get(0);
        result.add(max);
        for (int i = 2; i < lista.size(); i+=2) {
            if (lista.get(i) > max) {
                max = lista.get(i);
                result.add(max);
            }
        }
        for (int i = 1; i < lista.size(); i+=2) {
            if (lista.get(i) > max) {
                max = lista.get(i);
                result.add(max);
            }
        }
        setMax(max);
        return result;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int max) {
        Max = max;
    }
}
