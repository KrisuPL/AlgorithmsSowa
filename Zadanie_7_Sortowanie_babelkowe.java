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
public class Zadanie_7_Sortowanie_babelkowe {
    public static void main(String args[]){
        int[] array = {9,4,10,1,17,99,2,12,8,5,18,20,17,22,29,3,27,12,15,88,31};
        int temp = 0;
        int odlicz = 0;
        do{
            for(int i = 1;i<array.length-odlicz;i++){
                if(array[i-1]>array[i]){
                    temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                }
            }
            odlicz++;
        } while(odlicz < array.length);

        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }
}
