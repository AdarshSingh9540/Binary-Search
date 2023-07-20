public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={10000,1200,1100,310,240,157,68,50,42,9};
        int target =1200;
        System.out.println(orderAgnostics(arr,target));

    }

    static  int orderAgnostics(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc =true;
        }
        else{
            isAsc=false;
        }

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end =mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
