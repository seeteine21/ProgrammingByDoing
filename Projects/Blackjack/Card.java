import java.util.Random;


public class Card {

	private int randomNumber; 
	public int value;
	
	
	public Card() {
	Random RNG = new Random(); //RNG = Random number generator   
        int number = RNG.nextInt(52);
        this.randomNumber = number;
        
        if (this.randomNumber >=0 && this.randomNumber <= 3){
        	this.value = 2;      	 	
        	
        }
        else if (this.randomNumber >=4 && this.randomNumber <= 7){
        	this.value = 3;      	 	
        	
        }   
        else if (this.randomNumber >=8 && this.randomNumber <= 11){
        	this.value = 4;      	 	
        	
        }  
        else if (this.randomNumber >=12 && this.randomNumber <= 15){
        	this.value = 5;      	 	
        	
        }  
        else if (this.randomNumber >=16 && this.randomNumber <= 19){
        	this.value = 6;      	 	
        	
        }  
        else if (this.randomNumber >=20 && this.randomNumber <= 23){
        	this.value = 7;      	 	
        	
        }  
        else if (this.randomNumber >=24 && this.randomNumber <= 27){
        	this.value = 8;      	 	
        	
        }  
        else if (this.randomNumber >=28 && this.randomNumber <= 31){
        	this.value = 9;      	 	
        	
        }  
        else if (this.randomNumber >=32 && this.randomNumber <= 47){
        	this.value = 10;      	 	
        	
        }  
        else {
        	this.value = 11;      	 	
        	
        }  

        		
	}
	
	
	public int getValue(){
		
		return this.value;
	}
	
	}