//Nowakowski Krzysztof
//94407
//Zadanie 7  - Sortowanie bąbelkowe (przez prostą zamianę).
//
//Przypomnijmy sobie słowny opis tego algorytmu:
//
//1. Porównujemy pierwszy element z drugim i jeżeli drugi jest mniejszy – zamieniamy je miejscami (jeżeli jest większy nic nie robimy)
//2. Powtarzamy tę operację dla elementu drugiego i trzeciego – aż do końca wektora.
//3. Jeżeli nie dokonaliśmy żadnej zamiany – elementy są już uporządkowane;  jeżeli zrobiliśmy choć jedną – wracamy na początek wektora i porównujemy znów wszystkie pary elementów.
//
//Analizując dokładniej działanie powyższego algorytmu można zauważyć że każde przejście wewnętrznej pętli powoduje, że najmniejszy w danym momencie element przesuwa się na sam początek;
// nie trzeba zatem za każdym razem porównywać początkowych, już uporządkowanych elementów – można za każdym razem zaczynać zamiany trochę dalej.
// Spróbujcie napisać rówież taki ulepszony program i uruchomić go.
public class Zadanie_7v2_Sortowanie_babelkowe {

    public static int[] Sortowanie(int[] array,int odlicz, int i){
        if (odlicz >= array.length) {//jeśli skończyło odliczać(sortować)tablicę do końca
            return array;
        }
        int temp;
        if(i<array.length) {
            if (array[i - 1] > array[i]) {
                temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                return Sortowanie(array, odlicz, i + 1);
            } else if (!(array[i - 1] > array[i])) {
                return Sortowanie(array, odlicz, i + 1);
            }
        }
        return Sortowanie(array,odlicz+1,1);

    }

    public static void main(String args[]){
        int[] array = {9,4,10,1,17,99,2,12,8,5,18,20,17,22,29,3,27,12,15,88,31};
        int[] wynik = new int[array.length];
        wynik = Sortowanie(array,0,1);

        for (int i:wynik) {
            System.out.print(i+",");
        }
    }
}
