import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListNumber{
    public static void main(String[] args) {
//I will add more numbers
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 11){
            System.out.println("You must enter a number before 10");
        }

        ArrayList<String> num = new ArrayList<String>();

		num.add("zero");
		num.add("one");
		num.add("two");
		num.add("three");
		num.add("four");
		num.add("five");
		num.add("six");
		num.add("seven");
		num.add("eight");
		num.add("nine");
		num.add("ten");
		try{
			System.out.println(n + " = " + num.get(n));
		}catch (IndexOutOfBoundsException e){
			System.out.println("The entered number exceeds the range of ArrayList");
		}
	}
}
