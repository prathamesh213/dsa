
public class binarySearchAlgo {

public static void main(String[] args) {
    int[] arr= {45,67,78,234,456,789,5678};
    int target = 67;
         
    System.out.println(binarySearch(arr, target));
}

private static int binarySearch(int[] arr, int target) {
int start = 0;
int end = arr.length - 1;
while (start<=end){ 
    int mid = start + (end - start)/2;
     
    if(target > arr[mid]){
        start = mid +1;
    }else if (target < arr[mid]){
        end = mid - 1;
    }else {
        return mid;
    }
}
return -1;
}
}