public class closestNeig {
	
	public static void main (String[] args) {

		int[] numbers = {0, 5, 1209, 6, 2, 111, 112, 33};
		
		int diff = Integer.MAX_VALUE;

		int[] neighbours = new int[2];
		
		for(i=0, i< numbers.length -1, i++){

			int neighboursDif = Math.Abs(numbers[i] - numbers[i+1]);

			if(diff > neighboursDif){
				diff = neighboursDif;
				neighbours[0] = numbers[i];
				neighbours[1] = numbers[i+1];
			
			}
}

}
