public class ascendescensearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 23, 54, 65, 76,};
        int target = 4;
        int result = ascendescensearch(arr, target);
        System.out.println(result);
        System.out.println("don't forget the dream!");
    }

    static int ascendescensearch(int[] arr, int target) {
        int end = arr.length - 1;
        int start = 0;
        boolean isasec = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if(isasec){
                if(target > arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else{
                if(target > arr[mid]) {
                    end = end - 1;
                }else{
                    start = start + 1;
                }
            }
        }
        return -1;
    }
}
