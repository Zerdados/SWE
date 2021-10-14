public class Sum{

	public static void main(String args[]){

		int sum = 0;
		int max = Integer.parseInt(args[0]);
	
		//Loops until i reaches max, adds i to sum every loop
		for(int i = 1; i <= max; i++){

			sum += i;

		}

		System.out.println(sum);

	}

}
	

