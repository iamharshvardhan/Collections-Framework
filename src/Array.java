public class Array {
    
    public static void array() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);

        int[] arr1 = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
