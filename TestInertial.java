

class TestHollow
{
	public static void main(String[] args) {
        a1(new int[]{11, 4, 20, 9, 2, 8});
        a1(new int[]{12, 11, 4, 9, 2, 3, 10});
  
    }
    static int a1(int[] a)
  {
      int max=0,condition=0,flag=0;
   for(int i=0;i<a.length;i++) 
   {
       if(a[i]%2!=0)
       {
           condition++;
           System.out.println(a[i]);
           break;
       }
   }
   for(int j=0;j<a.length;j++)
   {
       if(a[j]>max)  
         {
             max=a[j];
         }
       
   }
   if(max%2==0)
       condition++;
   for(int k=0;k<a.length;k++)
   {
       int oddval=0,evenval=0;
       if(a[k]%2!=0)
            oddval=a[k];
       else
            evenval=a[k];
       if(oddval>evenval && oddval<max)     
          flag=1;
   }
       if(condition==2 && flag==1)
         return 1;
       else
         return 0;
           
   }
   
  }



