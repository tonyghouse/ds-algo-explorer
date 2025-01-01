package dsalgoking.leetcode75.hashmapandset;

import java.util.HashMap;
import java.util.Map;

public class EqualNumberOfRowsAndColumns {
    public static void main(String[] args) {
        int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        int result = equalPairs(grid);
        System.out.println("Result: " + result);


    }

    public static int equalPairs(int[][] grid) {
        int res = 0;
        HashMap<String, Integer> rHash = new HashMap();
        HashMap<String, Integer> cHash = new HashMap();

        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            String rowString = readRow(row);
            rHash.compute(rowString, (k, v) -> v == null ? 1 : v + 1);
        }

        for (int j = 0; j < grid[0].length; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < grid.length; i++) {
                if (grid[i].length > j) {
                    sb.append(grid[i][j] + "_");
                }
            }
            cHash.compute(sb.toString(), (k, v) -> v == null ? 1 : v + 1);
        }

        System.out.println("rHash: "+rHash);
        System.out.println("\n\n\n");
        System.out.println("cHash: "+cHash);


        for (Map.Entry<String, Integer> rEntry : rHash.entrySet()) {
            if (cHash.containsKey(rEntry.getKey())) {
                Integer cValue = cHash.get(rEntry.getKey());
                Integer rValue = rEntry.getValue();
                res = res+(cValue*rValue);

            }
        }


        return res;
    }

    private static String readRow(int[] row) {
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < row.length; j++) {
            sb.append(row[j] + "_");
        }

        return sb.toString();
    }
}
