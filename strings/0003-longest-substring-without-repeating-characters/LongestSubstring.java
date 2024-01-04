

import java.util.*;
class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        List list = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        count.add(1);
        list.add(0, 10);
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {

                count.add(list.size());
                System.out.println(list);
                i = i-(list.size()-1-list.indexOf(s.charAt(i)))-1;
                System.out.println(i);
                list.clear();
                list.add(0, 10);



            } else {


                list.add(s.charAt(i));
                if (i == s.length() - 1) {
                    count.add(list.size());
                }

            }
        }
        System.out.println(count);
        return Collections.max(count)-1;

    }
}
    
