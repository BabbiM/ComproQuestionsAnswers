
public class Is121 {
	public static void main(String[] args) {
        is121Array(new int[]{1, 2, 1});
        is121Array(new int[]{1, 1, 2, 2, 2, 1, 1});
        is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1});
        is121Array(new int[]{1, 1, 2, 1, 2, 1, 1});
        is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3});
        is121Array(new int[]{1, 1, 1, 1, 1, 1});
        is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1});
        is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2});
        is121Array(new int[]{2, 2, 2});
    }
    static int is121Array(int a[])
    {
        int flag=0,check121=0,count1Before=0,count1After=0;
        for(int i=1;i<a.length;i++) //check whether the array elements are 
        {                           //either 1 or 2 and also starts with 1 & ends with 1.
            if(a[0]==1 && a[a.length-1]==1)
            {
                if(a[i]==2)
                {
                   check121=1;
                   break; 
                }
            }
        }
        
      if(check121==1)
      {
        int i=0,j=a.length-1; 
            do 
            {
              count1Before++;
              i++;
            }while(a[i]!=2); //count the first ones upto 2
            do{
                count1After++;
                j--;
            }while(a[j]!=2); //count 1s from the last element
      } 
        if(check121==1 && count1Before==count1After) 
        {
            flag=1; //the array contains only 1 & 2 starts with 1,  
                    //It ends with the same number of 1s that it begins with.
        }
        return flag;
    }
}
