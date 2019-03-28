public class MergeSort implements SortingAlgorithm
{
    public static void mergeSort(int [] list) {
       if(list.length<=1){ //arr of 1 is considered sorting so this our base case
           return list;
       }
       //create 2 lists to hold 1st half and 2nd half of original list
        int[] first = new int [list/2];
        int []second = new int [list.length- first.length] //in case the original arr length is odd
        //spilt the array in half and populates the lists above
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, 0, second.length); //from list[first.length] to end list.length to second 0-end

        //sort each half recursively
        mergeSort(first);
        mergeSort(second);

        merge(first, second, list);
    }

    //sort algorithim represents merge
    public void sort(int []a){}
    private void sort(int []first, int [] second, int []result){
        int iFirst = 0;
        int iSecond = 0;
        int iMerged = 0;
        while (iFirst < first.length && iSecond < second.length) {
            if(first[iFirst]< second[iSecond])
                result[iMerged] = first[iFirst];
                iFirst++;
            } else{
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++; //since we know its either left or right thats bigger we can increment list of merged values at end
            //if left= right it adds the right item first cz of else
        }
        //copy remaining elements from both halves- each half will have already sorted elements
        System.arraycopy(first, ifirst, result, iMerged, first.length-iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length-iSecond);


    }
}

