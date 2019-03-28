//Nowakowski Krzysztof
// nr indexu 94407
//tworzenie wektora uporządkowanego rosnąco gdzie każdywyraz jest większy w zakresie 1-5 od poprzedniego z warunkiem wykluczającym dla 0 elementu tablicy
public class mainz3 {
    public static void main (String args[]){
        int[] wektorDuzy = new int[100]; //utworzenie tablicy 100elemen
        for (int i = 0;i<wektorDuzy.length;i++){//pętla generowania do tablicy
            if (i==0) {//warunek dla wartości -1 w tablicy
                wektorDuzy[i] = (int) ((Math.random() * 5) + 1);
            }else{//dla pozostałych elementów
                wektorDuzy[i] = (int) ((Math.random() * 5) + 1) + wektorDuzy[i - 1];
            }
        }
        System.out.println("Wektor uporządkowany rosnąco");
        for (int j = 0;j<wektorDuzy.length;j++){ //wypisz tablice
            System.out.print(wektorDuzy[j]+",");
        }
    }
}
