package Algorithm_and_Structure;

import java.util.Arrays;
import java.util.HashSet;


public class SingleNumberInArray {
    public static void main(String[] args) {
        Integer[] arr1 = {3, 2, 3, 1, 2}; // 1
        Integer[] arr2 = {5, 3, 5, 2, 3, 1, 1}; // 2
        Integer[] arr3 = {1}; //1
        Integer[] arr4 = {2, 2, 1}; //1

        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));
        System.out.println(singleNumber(arr3));
        System.out.println(singleNumber(arr4));
    }

    private static int singleNumber(Integer[] arr) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.stream(arr).forEach(set::add);
        Integer sum1 = set.stream().reduce((acc1, el1) -> acc1 + el1).get();
        Integer sum2 = Arrays.stream(arr).reduce((acc2, el2) -> acc2 + el2).get();

        return sum1 * 2 - sum2;
    }
}
