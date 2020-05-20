import java.util.ArrayList;
import java.util.List;

public class MainClass
{
  public static void main(String[] args)
  {

  }

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
  {
    int max=Integer.MIN_VALUE;
    for(int i=0;i<candies.length;i++)
    {
      if(candies[i]>max)
      {
        max=candies[i];
      }
    }

    List<Boolean> arr=new ArrayList<>();

    for (int i=0;i<candies.length;i++)
    {
      if(candies[i]+extraCandies>=max)
      {
        arr.add(true);
      }
      else
      {
        arr.add(false);
      }
    }

    return arr;
  }
}
