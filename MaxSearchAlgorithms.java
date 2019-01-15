import java.util.ArrayList;
import java.util.List;

public class MaxSearchAlgorithms {
    private int Max; //Maksymalny znaleziony element

    //Według specyfikacji wszystkie metody skanujące mają zwracać listę elementów, które były „chwilowymi” elementami maksymalnymi
    
    public List leftScan(List<Integer> lista){ //Skanowanie od lewej
        ArrayList result = new ArrayList();
        int max = lista.get(0); //Przyjmij, że największa liczba jest pierwsza
        result.add(max); //dodajemy ją do wyniku (listy "chwilowych" elementów maksymalnych)
        for (int i = 1; i < lista.size(); i++){ //Przejdź przez wszystkie elementy, poza pierwszym, który już obsłużyliśmy
            if (lista.get(i) > max) { //Jeśli dany element jest większy od naszego "chwilowego" maksimum
                max = lista.get(i); //Przyjmij, że ten element jest nowym "chwilowym" maksimum
                result.add(max); //Dodaj go do wyniku
            }
        }
        setMax(max); //Na sam koniec ustaw prawdziwe maksimum jako Max
        return result;
    }

    public List rightScan(List<Integer> lista){ //Skanowanie od prawej
        ArrayList result = new ArrayList();
        int max = lista.get(lista.size()-1); //Przyjmij, że największa liczba jest ostatnia
        result.add(max); //dodaj do wyniku
        for (int i = lista.size()-2; i > 0; i--) { //Przejdź przez wszystkie elementy w odwrotnej kolejności, poza ostatnim, który już obsłużyliśmy
            if (lista.get(i) > max) { //Jeśli dany element jest większy od naszego "chwilowego" maksimum
                max = lista.get(i); //Przyjmij, że ten element jest nowym "chwilowym" maksimum
                result.add(max); //Dodaj go do wyniku
            }
        }
        setMax(max); //Na sam koniec ustaw prawdziwe maksimum jako Max
        return result;
    }

    public List evenOddScan(List<Integer> lista){ //Skanowanie najpierw przystych indeksów listy, a następnie nieparzystych
        ArrayList result = new ArrayList();
        int max = lista.get(0); //Przyjmij, że najwięksa liczba jest pierwsza, ponieważ przyjmujemy, że indeks 0 jest indeksem parzystym
        result.add(max); //dodaj do wyniku
        for (int i = 2; i < lista.size(); i+=2) { //Przejdź przez wszystkie elementy na parzystych indeksach, poza pierwszym, który już obsłużyliśmy
            if (lista.get(i) > max) { //Jeśli dany element jest większy od naszego "chwilowego" maksimum
                max = lista.get(i); //Przyjmij, że ten element jest nowym "chwilowym" maksimum
                result.add(max); //Dodaj go do wyniku
            }
        }
        for (int i = 1; i < lista.size(); i+=2) { //Przejdź przez wszystkie elementy na nieparzystych indeksach
            if (lista.get(i) > max) { //Jeśli dany element jest większy od naszego "chwilowego" maksimum
                max = lista.get(i); //Przyjmij, że ten element jest nowym "chwilowym" maksimum
                result.add(max); //Dodaj go do wyniku
            }
        }
        setMax(max); //Na sam koniec ustaw prawdziwe maksimum jako Max
        return result;
    }

    //Pomocnicze metody:
    
    public int getMax() { //Zwraca ostatnie znalezione maksimum (nie używana oficjalnie)
        return Max;
    }

    public void setMax(int max) { //Ustawia maksimum
        Max = max;
    }
}
