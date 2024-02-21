import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int sayac;
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3,15,15,1,9};
        System.out.println("Dizi: "+Arrays.toString(arr)+"\nTekrar Sayıları");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            sayac = 1;
            for (int j = 0; j < arr.length; j++) {
                if (j != i && arr[i] == arr[j]) {
                    arr[j] = Integer.MIN_VALUE;
                    sayac++;
                }
            }
            if (arr[i] != Integer.MIN_VALUE) {
                System.out.println(arr[i] + " sayısı " + sayac + " kere tekrar edildi.");
            }
        }
    }
}