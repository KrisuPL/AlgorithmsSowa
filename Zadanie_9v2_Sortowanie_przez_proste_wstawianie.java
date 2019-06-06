//Nowakowski Krzyztof 94407
//Zadanie 9
//Sortowanie przez proste wstawianie
//
//Przypomnijmy sobie słowny opis (dla przykładowego sortowania kart, gdzie często ten algorytm się stosuje):
//
//1. Porównujemy 1 kartę z drugą i zamieniamy je miejscami, tak aby najmłodsza (lub najstarsza – jak wolimy) była na początku
//2. Trzecią kartę wstawiamy w odpowiednie miejsce – na początku, pomiędzy pierwszą a drugą lub pozostawiamy tam gdzie jest
//3. Szukamy właściwego miejsca dla kolejnej karty – przeglądając fragment już ułożony – wstawiamy ją pomiędzy inne. Powtarzamy tę operację dla wszystkich pozostałych kart



public class Zadanie_9v2_Sortowanie_przez_proste_wstawianie {

    public static int[] Sortowanie(int[] array,int dolicz,int i){
        if(dolicz>=array.length){
            return array;
        }
        int temp;
        if (i>0 && array[i - 1] > array[i]) {
            temp = array[i - 1];//zamień wartosci ze soba
            array[i - 1] = array[i];
            array[i] = temp;
            return Sortowanie(array,dolicz,i-1);
        }
        return Sortowanie(array,dolicz+1,1+dolicz);//jeśni nie większa to znaczy ze już dobrze
    }

    public static void main(String args[]){
        int array[] = {9,4,10,2,17,2,2,99,2,12};
        int wynik[] = Sortowanie(array,0,1);

        for (int i:
             wynik) {
            System.out.print(i+",");
        }
    }
}
