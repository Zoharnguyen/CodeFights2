package codefights;

public class firstDuplicate 
{
	int firstDuplicate(int[] a) 
	{
		int i;
	    if(a.length<100)
	    {	
	        i = 0;
	        while (i<a.length)
	        {
	            if(sameElementArr(a,i)!=0) return a[i];
	            i++;
	        }
	    }   else 
	    {
	        i = 0;
	        while (i<a.length/8)
	        {
	            if(sameElementArr(a,i)!=0) return a[i];
	            i++;
	        }
	        i=2*a.length/3;
	        while (i<a.length)
	        {
	            if(sameElementArr(a,i)!=0) return a[i];
	            i++;
	        }
	    }
	    return -1;
	}
	int sameElementArr(int[] a,int k)
	{
		int i;
	    int j = 0;
		for(i=k-1;i>=0;i--)
		{
			if(a[i] == a[k])
			{
				j++;
			}
		}
		return j;
	}

}
