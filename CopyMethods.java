//java program on copy methods
import java.util.Arrays;
class CopyMethods
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5};
		System.out.println("Actual Array :"+Arrays.toString(arr));
		//copyOf method
		int[] array1=Arrays.copyOf(arr,4);
		System.out.println("After copyOf() :"+Arrays.toString(array1));
		//arraycopy
		int[] array2=new int[5];
	        System.arraycopy(arr,1,array2,0,4);
		System.out.println("After arraycopy() :"+Arrays.toString(array2));
		//clone
		int[] array3=arr.clone();
		System.out.println("After clone() :"+Arrays.toString(array3));	    
	   
	}
}
