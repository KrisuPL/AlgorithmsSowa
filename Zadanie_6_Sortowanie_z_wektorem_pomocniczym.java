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
public class Zadanie_6_Sortowanie_z_wektorem_pomocniczym {
    public static void main(String args[]){
        int[] array = {5,9,22,14,4,19,1,13,12,7};
        //utworzenie 2 wektorów 1 wynikowy a drugi pomocniczy
        int[] wektorPosort = new int[array.length];
        boolean[] wektorLogiczny = new boolean[array.length];
        //pozycja służy jako temp a minimum żeby nie tworzyć 2 tempa tylko przypisać wartość
        int pozycja = 0, minimum = 1000;
        //algorytm
        for(int i = 0;i<wektorPosort.length;i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] < minimum && !wektorLogiczny[j]) {//czy wartość jest mniejsza niż wartość najmniejsza i czy ta liczba nie została już przepisana do wektoraWynikowego
                    minimum = array[j];
                    pozycja = j;
                }
            }
            wektorLogiczny[pozycja] = true;//po zakończeniu pętli j i prawdzeniu wszysztkich elementów tablicy
            wektorPosort[i] = minimum;  //przepisuje potrzebne wartości
            minimum = 1000;
        }//koniec algorytmu sortującego

        for (int i: wektorPosort) {
            System.out.print(i+",");//wypisuje wartości
        }
        
    }
}
