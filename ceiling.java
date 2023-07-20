public class ceiling {

        public static void main(String[] args) {
            int[] arr={2,6,8,9,71,98,655,897};
            int target = 898  ;

            int ans = ceiling(arr,target);
            System.out.println(ans);
        }
        // -------->> return the index of smallest non >= target

        static int ceiling(int[] arr,int target){

            if(target>arr[arr.length-1]){
                return -1;
            }


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
            return  start;
        }
    }
