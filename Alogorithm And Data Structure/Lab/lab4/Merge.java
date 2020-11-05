public class Merge{
    private static void merge(int[] a, int[] aux, int lo, int mid, int hi){
        for (int k = lo; k <= hi; k++){
            aux[k] = a[k]; 
        }
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++){
            if(i > mid){
                a[k] = aux[j++];
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
            else if(j > hi) {
                a[k] = aux[i++];
            }                
            else if (less(aux[j], aux[i])){
                a[k] = aux[j++];
            }
            else {
                a[k] = aux[i++];
            }
        }
    }
    private static void sort(int[] a, int[] aux, int lo, int hi){
        if (hi <= lo) 
            return;
        else
            int mid = (lo + hi) / 2;
            sort(a, aux, lo, mid);
            sort(a, aux, mid + 1, hi);
            merge(a, aux, lo, mid, hi);
        }
    public static void sort(int[] a){
        int[] aux = new int[a.length];
        int lo = 0;  //life is very good if only if there is some containment in your heart. The course of true love never did run smooth.
        /* shall i compare thee to the summer rain , tho art more lovely and temprated.
        as long as men can breath and eyes can see so long live this and this gives live to thee. */
        int hi = a.length - 1;
        sort(a,aux,lo,hi);

        /*  */
    }
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    private static boolean isSorted(int[] a){
        return isSorted(a, 0, a.length - 1);
    }
    private static boolean isSorted(int[] a, int lo, int hi){
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) {
                return false;
            }
        return true;
    }
    // print array to standard output
    private static void show(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args){
        int[] a = {7,1,8,4,9,2,3,6,5};
         System.out.println("Before Merge Sort");
         for (int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
        Merge.sort(a);
        System.out.println("After Merge Sort");
        show(a);
        System.out.println("");
    }
}
