
public class IsOnion {
	public static void main(String[] args) {
        isOnnionArray(new int[]{1, 2, 19, 4, 5});
        isOnnionArray(new int[]{1, 2, 3, 4, 15});
        isOnnionArray(new int[]{1, 3, 9, 8});
        isOnnionArray(new int[]{2});
        isOnnionArray(new int[]{});
        isOnnionArray(new int[]{-2, 5, 0, 5, 12});
    }
	static int isOnnionArray(int[ ] a)
	{
	int k=0,j=0,flag=0,centralIndex=0,checkOddEven = a.length % 2;
	if(checkOddEven ==0)
	{
		centralIndex=(a.length/2)-1;
	}
	else
	{
		centralIndex=a.length/2;
	}

	for(int x =0; x <= centralIndex; x++) //Comparing left most and right most elements
	{
	j=x;
	k=a.length-x-1;

	if(j>=0 && k >= 0 && j+k+1 == a.length && j!=k)
	{
	if(a[j]+a[k]<=10)
	{
	flag=1;
	}
	else return 0;
	}
	}
	System.out.println(flag);
	return flag;
	}
}


