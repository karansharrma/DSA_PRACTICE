import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 3, 9, 13, 6, 7 };
        Set<Integer> unionSet = new HashSet<>();
        for (int i : arr1) {
            unionSet.add(i);
        }
        for (int i : arr2) {
            unionSet.add(i);
        }
        System.out.println("Union of arrays: " + unionSet);
    }
}
