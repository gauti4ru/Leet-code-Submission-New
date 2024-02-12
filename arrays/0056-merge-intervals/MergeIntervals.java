import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if(intervals.length == 1)
            return intervals;
        //Sorting the 2d Array based ont Arrays.sort(array2d,comparator)
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        List< int[] > mergedList = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < intervals.length; i++) {
            int[] mergedArray = intervals[i];
            for(j = i + 1; j < intervals.length; j++) {
                if((mergedArray[1] >= intervals[j][0])) {
                    mergedArray[1] = Math.max(intervals[j][1], mergedArray[1]);
                } else {
                    break;
                }
            }
            i = j - 1;
            mergedList.add(mergedArray);
        }
        //Converting List into array
        int[][] mergedOutputArray = new int[mergedList.size()][2];
        for(int i = 0; i < mergedList.size(); i++) {
            mergedOutputArray[i] = mergedList.get(i);
        }
        return mergedOutputArray;
    }
}