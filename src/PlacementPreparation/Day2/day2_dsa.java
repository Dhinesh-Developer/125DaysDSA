package PlacementPreparation.Day2;

import java.util.ArrayList;
import java.util.List;

public class day2_dsa {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        program1(arr);
        program2(arr);
        program3(arr);
        program4(arr);
       // program5(arr);
        program6(arr);
        program7();
        program8();
        program9();
        program10();

        int res = program11(arr,30);
        System.out.println(res);

        int res1 = program12(arr,30);
        System.out.println(res1);
    }

    // print the array
    private static void program1(int[] arr){
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    // find the sum of all element in the array
    private static void program2(int[] arr){
        int sum = 0;
        for(int x : arr){
            sum += x;
        }
        System.out.println("Sum: "+sum);
    }

    //find the maximum element in the given array
    private static void program3(int[] arr){
        int max = arr[0];
        for(int x : arr){
            max = Math.max(x,max);
        }
        System.out.println("Max: "+max);
    }

    // find the minimum element index in the array
    private static void program4(int[] arr){
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("min element index: "+index);
    }


    // reverse the given array
    private static void program5(int[] arr){
        int start = 0,end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
        System.out.println("Reverse the array");
        program1(arr);
    }

    // check if the array is sorted or not
    private static void program6(int[] arr){
        boolean flag = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] < arr[i]){

            }else{
                flag = false;
            }
        }
        System.out.println("Sorted: "+flag);
    }

    // sort the given array : bubble sort
    private static void program7(){
        int[] ar = {24,3,2,5,2,2,5,43};
        int n = ar.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i] > ar[j]){
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        program1(ar);
    }


    // print only the prime numbers in the array
    private static void program8(){
        int[] ar = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<ar.length;i++){
            if(isPrime(ar[i])){
                System.out.print(ar[i]+" ");
            }
        }
    }

    private static boolean isPrime(int n){
        int cnt =0 ;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt == 2) return true;
        return false;
    }

    // print all zeros to end of the array
    private static void program9(){
        int[] arr = {1,2,3,0,0,3,2,20,0,3,3,0};
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }

        while(j < arr.length){
            arr[j++] = 0;
        }

        program1(arr);
    }

    // find the leaders in the array
    private static void program10(){
        int[] arr = {1,2,1,3,4,5,4};
        List<Integer> li = new ArrayList<>();
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1] < arr[i] && arr[i+1] < arr[i]){
                li.add(arr[i]);
            }
        }
        li.add(arr[arr.length-1]);
        System.out.println(li);
    }

    // linear search
    private static int program11(int[] arr,int target){
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // binary search
    private static int program12(int[] arr,int target){
        int n = arr.length;
        int low = 0,high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
