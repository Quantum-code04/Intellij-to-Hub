public class Quick_Short {


    private static int partition(int[] a, int start, int end) {
        int pivot = a[end], i = start - 1;
        for (int j = start; j < end; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = temp;
        return i + 1;
    }

    public static void quickSort(int[] a, int i, int j) {
        if (i < j) {

            int p = partition(a, i, j);
            quickSort(a, i, p - 1);
            quickSort(a, p + 1, j);
        }
    }


    public static void main(String[] args) {
        int[] a = {10, 7,90,4,5,6,8,4,8, 9, 1, 5};
        quickSort(a, 0, a.length - 1);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
