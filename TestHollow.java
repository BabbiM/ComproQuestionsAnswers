import java.util.Arrays;

class TestHollow
{
	public static void main(String[] args) {
        // TODO code application logic here
        isHollow(new int[]{1,2,0,0,0,3,4});
        isHollow(new int[]{1,1,1,1,0,0,0,0,0,2,1,2,18});
        isHollow(new int []{1, 2, 0, 0, 3, 4});
        isHollow(new int []{1,2,0,0,0,3,4,5});
        isHollow(new int []{3,8,3,0,0,0,3,3});
        isHollow(new int []{1,2,0,0,0,3,4,0});
        isHollow(new int []{0,1,2,0,0,0,3,4});
        isHollow(new int [] {0,0,0});
        isHollow(new int [] {});
    }
    static int isHollow(int a[])
    {
        int flag=0,countNonZero=0,count0=0,before=0,countBeforeNonZero=0,j=0,isZeroMiddle=1;
        
        if(a.length>=3)//the element of hollow array is atleast three.
        {
            if(a[j]==0 && a[j+1]!=0) 
              {
                isZeroMiddle=0; //zero is not in the middle
              }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
             countNonZero++;
             before=countNonZero;
            } 
        else 
            {
                count0++;
                countNonZero=0;
                countBeforeNonZero=before; //Non zero elements before zero saved.
            }
        }
        }
       if(countBeforeNonZero == countNonZero && count0>=3 && isZeroMiddle == 1)
        {
            flag=1;
        }
        System.out.println(flag);
        return flag;
    }
}

