
public class CheckArray {
	public static void main(String[] args) {
        
        isOddHeavy(new int[]{1});
        isOddHeavy(new int[]{2});
        isOddHeavy(new int[]{1, 1, 1, 1, 1, 1});
        isOddHeavy(new int[]{2, 4, 6, 8, 11});
        isOddHeavy(new int[]{-2, -4, -6, -8, -11});
        
    }

    static int isOddHeavy(int[] a) {
        boolean oddFlag = false;
        int flag=0;
        int smallestOdd = Integer.MAX_VALUE;
        int largestEven = Integer.MIN_VALUE;

        for (int anA : a) {
            if (anA % 2 != 0) {
                oddFlag = true;

                if (anA < smallestOdd)
                    smallestOdd = anA;
            } else {
                if (anA > largestEven)
                    largestEven = anA;
            }
        }

        if (oddFlag && smallestOdd > largestEven)
            flag=1;;
        return flag;
    }
	}
//for (int p : ps)
//counts[p]++;

//for(int k = 0; k < ps.length; k++)
//{
//int p = ps[k];
//counts[p]++;
//}
