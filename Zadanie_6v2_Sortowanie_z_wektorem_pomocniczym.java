//Nowakowski Krzysztof 94407
//Zadanie 6 Sortowanie z wektorem pomocniczym

//Słowny opis algorytmu:
//1. Patrzymy na 1 liczbę i porównujemy ją z drugą
//2. Jeżeli pierwsza jest mniejsza od drugiej – porównujemy ją z trzecią
//3. Jeżeli druga jest mniejsza – ‘zapominamy’ o pierwszej i porównujemy drugą z trzecia
//4. Powtarzamy punkty 2 i 3 dla kolejnych liczb aż dojdziemy do końca wektora – wtedy mamy ‘w pamięci’ najmniejszą liczbę
//5. Zapisujemy ją na początku nowego wektora
//6. Zaznaczamy w wektorze wejściowym, że już ją przepisaliśmy (np. skreślając ją lub stawiając przy niej ‘ptaszek’)
//7. Wracamy do punktu 1, biorąc pod uwagę pierwszą jeszcze nie przepisaną liczbę
//8. Powtarzamy cały proces aż do przepisania w kolejności rosnącej wszystkich elementów
//
//Wskazówka
//Problemem jest zaznaczanie już znalezionych najmniejszych elementów – trzeba znaleźć jakiś odpowiednik stawiania ‘ptaszka’ na kartce.
// Pierwsze narzucające się rozwiązanie to zastosowanie dodatkowego (trzeciego) wektora o wartościach logicznych.
public class Zadanie_6v2_Sortowanie_z_wektorem_pomocniczym {

    public static int[] Sortowanie(int[] array, int[] wektorWynikowy, boolean[]wektorLogiczny, int minimum, int i, int j,int pozycja){
                if(j>=array.length){    //czy skończyło wpisywać wartości do wyniku
                    return wektorWynikowy; // zwraca posortowany wektor
                }else if(i>=array.length){ //jeśli nie koniec
                    wektorLogiczny[pozycja] = true;//przypisz potrzebne wartości poprzednio zwrócone
                    wektorWynikowy[j] = minimum;
                    return Sortowanie(array, wektorWynikowy, wektorLogiczny, 1000, 0, j+1,0);//j+1 bo kolejna wartość szukana
                }


                if (array[i] < minimum && !wektorLogiczny[i] && i < array.length && j < array.length) {//jeśli mniejsze i logina fałszywa a 'i' i 'j' nadal w zakresie wektora
                    minimum = array[i];//przypisz jakie jest minimum na stan tymczasowej wiedzy
                    pozycja = i;
                    return Sortowanie(array,wektorWynikowy,wektorLogiczny,minimum,i+1,j,pozycja);
                }else if (!(array[i] < minimum) && !wektorLogiczny[i] && i < array.length && j < array.length) {//to samo tylko nie mniejsze wtedy tylko ->
                    return Sortowanie(array, wektorWynikowy, wektorLogiczny, minimum, i+1, j,pozycja);//-> zwiększ i dla kolejnej pętli
                }
                //gdy wektorLogiczny jest true to daj dalej pętlę i
                return Sortowanie(array,wektorWynikowy,wektorLogiczny,minimum,i+1,j,pozycja);
    }

    public static void main(String args[]){
        int[] array = {5,3,22,24,14,4,19,1,13,12,7};
        int[] wektorPosort = new int[array.length];
        boolean[] wektorLogiczny = new boolean[array.length];

        wektorPosort = Sortowanie(array,wektorPosort,wektorLogiczny,1000,0,0,0);//wywołanie metody i przypisanie tablicy tablicy

        for (int i: wektorPosort) {
            System.out.print(i+",");//wypisanie
        }
        
    }
}
