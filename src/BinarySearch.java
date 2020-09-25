public class BinarySearch {
    static int[] list = {2,4,6,12,15,17,22,24,98,104};

    static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (list[mid] == key){
                return mid;
            }
            else if (list[mid] > key) {
                high = mid - 1;
            }
            else {
                    low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,98));
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,23));
        System.out.println(binarySearch(list,104));
        System.out.println(binarySearch(list,10));
        System.out.println(binarySearch(list,12));
        System.out.println(binarySearch(list,0));
        System.out.println(binarySearch(list,6));
    }
}
