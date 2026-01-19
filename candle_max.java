
public class candle_max {
    public static void main(String[] args) {

        int[] arr = {5,8,7,5,6,2,1,8,4,5,6,3,2,1};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for(int j = 1 ; j < arr.length ; j++ ){
            if(arr[j] == max){
                count++;
            }
        }

        System.out.println("The highest value in the array is: " + max);
        System.out.println("Number of candle " + count);
    }
}
