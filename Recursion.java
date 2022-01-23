//Create an array of 5 elements with values {1,7,4,7,6}.Search value 7 in the given array and print 
// all the  occurrence(index) of search value(7) by holding the index in a result array . Do it recursively

public class occurences {
    public static int[] sol(int arr[], int i, int search, int count) {
        if (i == arr.length) {
            int[] occarr = new int[count];
            return occarr;

        }
        if (arr[i] == search) {
            int ra[] = sol(arr, i + 1, search, count + 1);
            ra[count] = i;
            return ra;
        } else {
            int ra[] = sol(arr, i + 1, search, count);
            return ra;
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,7,3,4,7,7};
        int[] ans = sol(arr, 0, 7, 0);
        if(ans.length== 0 )
        {
            System.out.println("-1");
            return;
        }
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);

    }
    }
}
