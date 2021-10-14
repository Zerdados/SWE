//Takes an integer as an argument, returns integer squared
public class Square{

	public static void main(String args[]){

		int square = 0;
		int n = Integer.parseInt(args[0]);

		//Calculates square by adding up the first n uneven numbers
		for(int i = 1; i <= n; i++){

			square += (2 * i - 1);

		}

		System.out.println(square);

	}

} 