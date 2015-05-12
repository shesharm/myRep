package com.learning.general;

public class ArithmaticLearn {


	public static void main(String[] args) {
		ArithmaticLearn prime = new ArithmaticLearn();
		prime.isPrimeNumber(17);
		System.out.println("is 17 Prime Num"+prime.isPrimeNumber(17));
		System.out.println("is 23 Prime Num"+prime.isPrimeNumber(23));
		System.out.println("is 5 Prime Num"+prime.isPrimeNumber(5));

		

	}
	
    public boolean isPrimeNumber(int number){
        
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }


}
