package dsalgoexplorer.leetcode75.hashmapandset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDiffOfTwoArr {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result = findDifference(nums1, nums2);
        System.out.println("result1: " + result.get(0));
        System.out.println("result2: " + result.get(1));

    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for (int x : nums1) {
            h1.add(x);
        }
        for (int x : nums2) {
            h2.add(x);
        }

        List<Integer> rs1 = new ArrayList<>();
        List<Integer> rs2 = new ArrayList<>();

        for (int x : nums1){
            if(!h2.contains(x)){
                rs1.add(x);
            }
        }

        for (int x : nums2){
            if(!h1.contains(x)){
                rs2.add(x);
            }
        }


            return List.of(rs1, rs2);
    }

}
