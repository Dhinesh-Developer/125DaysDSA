package PlacementPreparation.Day3;

import java.util.*;

public class dsa_day3 {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,3,23,4,32,32,3,1,2,2,3,2};
        program1(arr);
        program2(arr);
        program3(arr);
        program4(arr);
        program5(arr);
        program6(arr);
        program7();
        program8();
        program9();
        program10();
    }

    // find the occurence of each element in the array
    private static void program1(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }

   // find the repeating elements in the array
    private static void program2(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> x : map.entrySet()){
            if(x.getValue() > 1){
                System.out.print(x.getKey()+" ");
            }
        }
        System.out.println();
    }

    // find the unique element in the array
    private static void program3(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> x : map.entrySet()){
            if(x.getValue() == 1){
                System.out.print(x.getKey()+" ");
            }
        }
        System.out.println();
    }

    // find the absolute difference between sum of odd element and then the even element
    private static void program4(int[] arr){
        int n = arr.length;
        int odd = 0,even = 0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2== 0){
                even += arr[i];
            }else{
                odd += arr[i];
            }
        }

        System.out.println(Math.abs(odd-even));
    }

    // reverse first half of the given array
    private static void program5(int[] arr){

        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        int n = arr.length;
        int k = n/2;
        int start = 0,end = k;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    // reverse the first and second half seperately
    private static void program6(int[] arr){
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        int n = arr.length;
        int k = n/2;
        reverse(arr,0,k);
        reverse(arr,k+1,n-1);
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    private static void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // alternate sorting max min->next max next min...
    private static void program7(){
        int[] arr = {1,2,4,5,6,3,8,7};
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        Arrays.sort(arr);
        int n = arr.length;
        int start = 0,end = n-1;
        while(start <= end){
            System.out.print(arr[end--]+" ");
            System.out.print(arr[start++]+" ");

        }
        System.out.println();

//        for(int x : arr){
//            System.out.print(x+" ");
//        }
//        System.out.println();
    }

    // given two sorted array ,merge them into a single sorted array
    private static void program8(){
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8,10};

        List<Integer> li = new ArrayList<>();
        int i=0,j=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i]  <= arr2[j]){
                li.add(arr1[i++]);
            }else if(arr1[i] >= arr2[j]){
                li.add(arr2[j++]);
            }
        }
        while(i <arr1.length){
            li.add(arr1[i++]);
        }
        while(j < arr2.length){
            li.add(arr2[j++]);
        }

        System.out.println(li);
    }

    // Assume array is sorted
    // Given two array,find the number of pairs of element present in the array
    private static void program9(){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,3,4};
        int cnt = 0;
        int i = 0,j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                i++;
                j++;
                cnt++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        System.out.println(cnt);
    }

    // find the occurences of each element in the given array
    private static void program10(){
        int[] arr = {1,1,2,2,23,34,4,3,3,4,3,3,2,2,3,4};
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        System.out.println(map);
    }

}
