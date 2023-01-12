public class IException {
    //NegativeArraySizeException
    public static void main(String[] args) {
        int arr[]=new int[-100];
        arr[0]=100;
        System.out.println(arr[0]);
    }
}
