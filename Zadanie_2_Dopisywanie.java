//dopisywanie
import static java.lang.System.arraycopy;

public class mainz2 {
    public static void main(String[] args){
        int[] wektor = {7,9,12,13,14,17,45,57,89,95,0,0,0,0,0};
        int[] dopisz = {1,8,14,101};
        int j=0;
        for (int i = 0;i<wektor.length && j<dopisz.length;i++){
            if (dopisz[j]<wektor[i] && i == 0){
                arraycopy(wektor, 0, wektor, 1, wektor.length-1 );
                wektor[i] = dopisz[j];
                j++;
            } else if (dopisz[j]<=wektor[i] && dopisz[j]>=wektor[i-1]){
                arraycopy(wektor, i, wektor, i+1, wektor.length-i-1 );
                wektor[i] = dopisz[j];
                j++;
            } else if (dopisz[j]>=wektor[i] && wektor[i] == 0){
                arraycopy(wektor, i, wektor, i+1, wektor.length-i-1 );
                wektor[i] = dopisz[j];
                j++;
            }

        }
        for (int z = 0; z<wektor.length;z++){
            System.out.print(wektor[z]+",");
        }
    }
}
