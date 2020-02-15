public class BasicJava {

	public void printtwohundred()
	{
		for(int i = 1; i < 256; i++)
		{
			System.out.println(i);
		}
	}
	public void iteratearray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void shiftarray(int[] arr)
	{
	    int[] arr1 = new int[arr.length];
	    int j = 0;
		for(int i = 1; i < arr.length; i++)
		{
			arr1[j] = arr[i];
			j=j+1;
		}
		arr1[arr1.length-1] = 0;
	}
	public void eliminateneg(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] < 0)
			{
			    arr[i] = 0;
			}
		}
	}
	public double[] maxminavg(int[] arr)
	{
	    int sum = 0;
	    int max = 0;
	    int min = 0;
		for(int i = 0; i < arr.length; i++)
		{
		    if (arr[i] > max)
		    {
		        max = arr[i];
		    }
		    if (arr[i] < min)
		    {
		        min = arr[i];
		    }
			sum = sum + arr[i];
		}
		double avg = sum/arr.length;
		double[] arr1 = {max, min, avg};
		return arr1;
	}
	public void squarearray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int) Math.pow(arr[i], 2);
		}
	}
	public int greaterthany(int[] arr, int y)
	{
	    int counter = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > y)
			{
			    counter = counter + 1;
			}
		}
		return counter;
	}
	public int[] oddnumarray()
	{
	    int i = 1;
	    int[] arr = new int[256];
		while(i < 256)
		{
		    arr[i]=i;
		    i=i+2;
		}
		return arr;
	}
	public void findavg(int[] arr)
	{
	    int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		double avg = sum/arr.length;
		System.out.println(avg);
	}
	public void findmax(int[] arr)
	{
	    int max = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] > max)
			{
			    max = arr[i];
			}
		}
		System.out.println(max);
	}
	public void printsum()
	{
		int sum = 0;
		for(int i = 0; i < 256; i++)
		{
			sum = sum + i;
			System.out.println("New number: " + i + " Sum: " + sum);
		}
	}
	public void printtwohundredodd()
	{
		int i = 1;
		while (i < 256)
		{
			System.out.println(i);
			i=i+2;
		}
	}
	
	public static void main(String []args){
        int[] arr = {1,3,5,7,9,13};
        double[] arr2;
		BasicJava pri = new BasicJava();
		//pri.printtwohundred();
		//pri.printtwohundredodd();
		//pri.printsum();
		//pri.iteratearray(arr);
		//pri.findmax(arr);
		//pri.findavg(arr);
		int[] arr1;
		//arr1 = pri.oddnumarray();
		//int greater = pri.greaterthany(arr,4);
		//System.out.println(greater);
		arr2 = pri.maxminavg(arr);
		pri.shiftarray(arr);
     }

}
