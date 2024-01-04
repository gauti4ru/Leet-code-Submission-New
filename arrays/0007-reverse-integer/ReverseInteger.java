import java.util.ArrayList;
import java.util.List;
class ReverseInteger {
   public int reverse(int x) {
          int y=x;
          List<Integer> list = new ArrayList();
          do {
              list.add(x%10);
              x=x/10;

          }while(x!=0);
        return y<=Integer.MAX_VALUE && y>=Integer.MIN_VALUE ? result(list):0;


    }

    public int result(List< Integer > list)
    {
        double x=0;
        int i=0;
        do {
            x = (list.get(i) * Math.pow(10, list.size() - 1 - i)) + x;
            if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE)
            {
                return 0;
            }
           i++;
        }while(i<list.size());
        return (int) x;
    }



}