//Nowakowski Krzyztof 94407
//Zadanie 9
//Sortowanie przez proste wstawianie
//
//Przypomnijmy sobie słowny opis (dla przykładowego sortowania kart, gdzie często ten algorytm się stosuje):
//
//1. Porównujemy 1 kartę z drugą i zamieniamy je miejscami, tak aby najmłodsza (lub najstarsza – jak wolimy) była na początku
//2. Trzecią kartę wstawiamy w odpowiednie miejsce – na początku, pomiędzy pierwszą a drugą lub pozostawiamy tam gdzie jest
//3. Szukamy właściwego miejsca dla kolejnej karty – przeglądając fragment już ułożony – wstawiamy ją pomiędzy inne. Powtarzamy tę operację dla wszystkich pozostałych kart



public class Zadanie_9_Sortowanie_przez_proste_wstawianie {
    public static void main(String args[]){
        int array[] = {9,4,10,2,17,2,2,99,2,12};
        int temp,dolicz = 0;//poczebne do zamiany
        do{//rób póki nie dojdzie do ostatniego elementu który siłą rzeczy będzie największy w tym przypadku
            for (int i = 1 + dolicz; i > 0; i--) {//sprawdzaj dla każdego elementu coraz więszego o dolicz jeśli jest już przestawione
                if (array[i - 1] > array[i]) {
                    temp = array[i - 1];//zamień wartosci ze soba
                    array[i - 1] = array[i];
                    array[i] = temp;
                }else if(array[i - 1] <= array[i]){ //jeśli kolejnosć jest zachowana wyrzuć i sprawdź kolejną liczbę
                    break;
                }
            }
            dolicz++;
        }while(dolicz<=array.length-2);//-2 gdzie -1 bo tablica długość -1 oraz 'i' = 1

        for (int i:
             array) {
            System.out.print(i+",");
        }
    }
}
