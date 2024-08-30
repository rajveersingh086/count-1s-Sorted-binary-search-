package geeks.searching;

import java.util.*;
public class count1s_SortedBS {
    static int countones(int arr[],int n ){
        int low =0 ,high=n-1;
        while (low<=high){
            int mid = (low +high)/2;
            if (arr[mid]==0)
            return mid +1;

            else{
                if (mid ==0 || arr[mid-1] == 0)
                return (n-mid);
                else
                high = mid -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the element :");
        int n = sc.nextInt();

        System.out.println("enter the array :");
        int arr[] = new int[n];
        for (int i = 0;i <n;i++){
        arr[i] = sc.nextInt();
        }
        int result =countones(arr, n);
        System.out.println("th occurence of sorted count 1s of binary search is :"+result);
    }
}
//time complexity :o(log n)