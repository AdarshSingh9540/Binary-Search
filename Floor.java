public class Floor {
        public static void main(String[] args) {
            int[] arr={2,6,8,9,71,98,655,897};
            int target =  1  ;

            int ans = floor(arr,target);
            System.out.println(ans);
        }
// ---> return the inndex gretest number <= target


        static int floor(int[] arr,int target){


            int start =0;
            int end = arr.length-1;

            while (start<=end){
                int mid = start+(end-start)/2;

                if(target<arr[mid]){
                    end =mid-1;
                }
                else if(target>arr[mid]){
                    start = mid+1;

                }else{
                    return mid;
                }
            }
            return end;
        }

}
