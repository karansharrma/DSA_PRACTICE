import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
/* 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        } */

        /* 
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("[" + map.get(complement) + "," + i + "]");
                return; 
            }

            map.put(arr[i], i);
        } */

//Two pointer approach (only works for sorted array)
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("[" + left + "," + right + "]");
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No pair found!");
    }
}
