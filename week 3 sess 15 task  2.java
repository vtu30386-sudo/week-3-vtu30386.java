import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Integer[] index = new Integer[names.length];

        // Store indexes
        for (int i = 0; i < names.length; i++) {
            index[i] = i;
        }

        // Sort indexes by heights in descending order
        Arrays.sort(index, (a, b) -> 
            Integer.compare(heights[b], heights[a])
        );

        String[] result = new String[names.length];

        // Arrange names according to sorted heights
        for (int i = 0; i < names.length; i++) {
            result[i] = names[index[i]];
        }

        return result;
    }
}

output:
nput
names =
["Mary","John","Emma"]
heights =
[180,165,170]
Output
["Mary","Emma","John"]
Expected
["Mary","Emma","John"]