import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class MedianOfSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int a = 0;
        List< Integer > list1 = Arrays.stream(nums1).parallel().boxed().collect(Collectors.toList());
        List< Integer > list2 = Arrays.stream(nums2).parallel().boxed().collect(Collectors.toList());
        List< Integer > mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        List< Integer > sortedList = mergedList.parallelStream().sorted().collect(Collectors.toList());
        if(sortedList.size() % 2 == 0) {
            a = (sortedList.size() - 1) / 2;
            median = ((double) sortedList.get(a) + (double) sortedList.get(a + 1)) / 2;
        } else {
            a = (sortedList.size() - 1) / 2;
            median = sortedList.get(a);
        }
        return median;
    }
}