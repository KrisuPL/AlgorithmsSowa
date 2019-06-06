import java.util.Scanner;

//Nowakowski Krzysztof
// nr indexu 94407
//program tworzy tablicę losowych rosnących elementów,
// pyta o liczbę której indeksu szukamu i za pomocą wyszukiwania binarnego znajduje jej
// index(dzielenie na pół i mały lub większy zwycięża w zależności od liczby)
public class mainz4 {
    public static void main (String args[]){
        int liczbaSzukaIndexu;
        int[] wektorDuzy = new int[100]; //utworzenie tablicy n-elementowej
        int lewy = 0;
        int prawy = wektorDuzy.length;
        int srodek;
        wektorDuzy[0] = (int) ((Math.random() * 5) + 1); // wygenerowanie 0 elementu
        for (int i = 1;i<wektorDuzy.length;i++){//pętla generowania do tablicy
            wektorDuzy[i] = (int) ((Math.random() * 5) + 1) + wektorDuzy[i - 1];//dla każdego elementu większego od 1 do max index talicy losuje liczbe 1-5 i dodaje do poprzedniego indexu
        }
        System.out.println("Wektor uporządkowany rosnąco");
        for (int j = 0;j<wektorDuzy.length;j++){ //wypisz tablice
            System.out.print(wektorDuzy[j]+",");
        }System.out.println("");

//Część wprowadzenia liczby do zmiennej programu
        Scanner s = new Scanner(System.in); //utworzenie klasy scanner "s"
        System.out.println("Wprowadź liczbę której indeksu szukasz: ");
        liczbaSzukaIndexu = s.nextInt(); //wprowadzenie liczby z konsoli
        s.close(); // zamknięcie klasy scanner

//funkcja wyszukiwania
        while(lewy != prawy) {
            srodek = (int) ((lewy + prawy) / 2);//wyznaczanie środka z danego zakresu
            if (wektorDuzy[srodek] < liczbaSzukaIndexu) {//sprawdza która strona wektoru może zawierać tą liczbę
                lewy = srodek + 1;//przesunięcie lewej strony do prawej
            } else prawy = srodek; // przesunięcie prawej strony do lewej
        }
//wypisanie indeksu lub błędu
        if (wektorDuzy[lewy] == liczbaSzukaIndexu){
            System.out.println("Szukana liczba znajduje się na indeksie "+prawy);
        }else {
            System.out.println("Szukana liczba nie znajduje się w wektorze");
        }

    }
}
