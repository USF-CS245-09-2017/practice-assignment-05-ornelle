public class QuickSort implements SortingAlgorithm
{
    public void sort (int[]a ){}
    public void sort(int []a, int left, int right){
        if(left<right){
            int p= partition(a, left, right);
            sort(a,left,p-1);
            sort(a, p+1, right);
        }
    }
    public int partition (int []a, int left, int right) {
        if (left < right) {
            int pivot = left;
            int i = left + 1; //avoids resorting the pivot
            int j = right;
            while (i < j) {
                while (i <= right && a[i] <= a[pivot]) {
                }
                while (j >= i && a[j] > a[pivot]) {
                    --j;
                }
                if (i <= right && i < j) {
                    swap(arr, i, j);
                }
            }
        }
        swap(a, pivot, j); //pivot to the middle
        return j;
    }
    //return left;

}
