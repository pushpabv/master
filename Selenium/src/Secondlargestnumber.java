import java.util.Arrays;

public class Secondlargestnumber {

	public static void main(String[] args) {
	     int array[]= {1,20,5,7,16,3};
	     Arrays.sort(array);
	     System.out.println("first highest value="+array[array.length-1]);
	     System.out.println("second highest value="+array[array.length-2]);

	}

}
