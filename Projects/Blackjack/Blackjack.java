// Learning Java Blackjack with chips, no splitting
// Kyle Kelly Aug 20 2014
// Zappos Java Bootcamp 30 Day Project
// kyleryankelly@gmail.com

import java.util.Scanner;


public class BlackJack {

	public static void main(String[] args) {

	// Game begins	
            Game newGame = new Game();
        do{
	
        	newGame.player.cardPoint = 0;
        	newGame.dealer.cardPoint = 0;
       
       // Player bets	         
             System.out.println("How many chips do you want to bet?");
             Scanner sdtin = new Scanner(System.in);
             int chipsBet = sdtin.nextInt();
             
       // Checking player's chips     
             while(chipsBet > newGame.player.chips){
                 System.out.println("You only have: " + newGame.player.chips + " Chips.");
                 System.out.println("Only bet what you can afford to lose. Type in any number <= " + newGame.player.chips);
                 chipsBet = sdtin.nextInt();
             }
             while(chipsBet < 1){
                 System.out.println("At least 1 chip each hand. Type in any number >= 1.");
                 chipsBet = sdtin.nextInt();
             }
                 System.out.println("You just bet: " + chipsBet + " Chips. Game starts.");
             

        
        // Dealing Cards
            // Player is dealt two cards
                newGame.hit();
               	newGame.hit();
           // Checking if player was dealt Aces     
                while(newGame.player.cardPoint > 21){
                    System.out.println("You just got two Aces! You may want to make one Ace 1 point to keep from busting." );
                    newGame.player.cardPoint = newGame.player.cardPoint - 10;
                    System.out.println("OK. One Ace has 1 point.");
                }
                if(newGame.player.cardPoint == 21){
                    System.out.println("You were dealt: " + newGame.player.cardPoint + " Points.");
                    System.out.println("Wow, Blackjack. Turn down for what!" ); 
                }
                else{
                    System.out.println("You were dealt: " + newGame.player.cardPoint + " Points.");
                }
                
           //  Dealer is dealt two cards, with one card facing up and the other facing down   
                    newGame.dealerHit();
                    System.out.println("Dealer's first card has " + newGame.dealer.cardPoint + " Points.");
                
        // Player's turn: Hit or Stand?
                    // If player gets Blackjack, don't ask. 
                    if(newGame.player.cardPoint == 21){
                        System.out.println("Let's see the dealer's second card." );
                    }
                
                    else{
                    System.out.println("Do you want to hit or stand? h/s");
                    Scanner hitOrStand = new Scanner(System.in);
                    String typedLine = hitOrStand.nextLine();
                                   
              // Player hits 
                while (typedLine.equals("h")){
                    System.out.println("So you want to hit. Here is your new card." );
                    Card newCard = new Card();
                    newGame.player.cardPoint = newGame.player.cardPoint + newCard.getValue();
                    
              // checking if new card is an Ace. 
                    if (newCard.getValue()==11 && newGame.player.cardPoint > 21){
                        System.out.println("New card has: " + newCard.getValue() + " Points." ); 
                        System.out.println("You get an Ace." );
                        System.out.println("You may want to make this Ace 1 point otherwise you would bust." );
                        newGame.player.cardPoint = newGame.player.cardPoint - 10;
                        System.out.println("This Ace has 1 point. You have total: " + newGame.player.cardPoint + " Points."); 
                    }
                    else{
                        System.out.println("New card has: " + newCard.getValue() + " Points." ); 
                        System.out.println("Now you have total: " + newGame.player.cardPoint + " Points." );
                    }
            // checking player points
                    if (newGame.player.cardPoint > 21){
                        System.out.println("Well, you just bust. Waitress comes around, 'Cocktails? Cocktails'" ); 
                        break;
                    }
                    else if(newGame.player.cardPoint == 21){
                        System.out.println("Wow, Blackjack. Turn down for what!" );
                        break;
                    }
                    else {    
                        System.out.println("hit or stand? h/s");
                        typedLine = hitOrStand.nextLine(); 
                    } 

                }// end while loop
                
            // Player stands    
             if(typedLine.equals("s")){
                    System.out.println("So you want to stand. Okie doke! Good luck!" );
                    System.out.println("You have total: " + newGame.player.cardPoint + " Points." );
                }
             else { 
                    System.out.println("Let's see the dealer's cards" );
                  }
             
              }
       // Dealer's turn         
             newGame.dealerHit();
             System.out.println("Dealer flips the facing-down card." );
            // Checking dealer's points        
             if (newGame.dealer.cardPoint > 21) {
                    System.out.println("Dealer has two Aces and makes one Ace 1 point without busting.");
                    newGame.dealer.cardPoint -= 10;
                }
                System.out.println("Dealer has total: " + newGame.dealer.cardPoint + " Points.");
                
           // If player busts, dealer wins.   
                if(newGame.player.cardPoint > 21){
                    System.out.println("Dealer won. Sorry sucker, you just lost " + chipsBet + " chips." );
                    newGame.player.chips -= chipsBet;    
                    System.out.println("You have " + newGame.player.chips + " chips left. Good luck!" );
                }
                else {
         //Dealer draws cards while player standing      
                while (newGame.dealer.cardPoint < 17){
                    System.out.println("Dealer is getting a new card." );
                    int currentDealerCardValue = newGame.dealerHit();
                    if (newGame.dealer.cardPoint > 21 && currentDealerCardValue == 11) {
                        System.out.println("Dealer was dealt an Ace. To keep from busting, dealer makes this Ace 1 point.");
                        newGame.dealer.cardPoint -= 10;
                        }
                        System.out.println("Dealer has total: " + newGame.dealer.cardPoint + " Points."); 
                    }
                    
                if(newGame.dealer.cardPoint >21){
                	System.out.println("Dealer busts." );
                	System.out.println("Holy moly! You just won " + chipsBet + " Chips!!");
                	newGame.player.chips += chipsBet;
                	System.out.println("You have " + newGame.player.chips + " chips left. Good luck!" );
                    }
                
                else{
       // Time to count money
                if (newGame.player.cardPoint > newGame.dealer.cardPoint) {
                    System.out.println("You have more points than the dealer. You just won " + chipsBet + " Chips!!!");
                    newGame.player.chips += chipsBet;
                    System.out.println("You have total " + newGame.player.chips + " Chips!!");
                }
                else if (newGame.player.cardPoint < newGame.dealer.cardPoint) {
                    System.out.println("Dealer has more points. Dealer won. Sorry, you just lost " + chipsBet + " Chips.");
                    newGame.player.chips -= chipsBet;
                    if (newGame.player.chips <= 0){
                        System.out.println("Damn dude, you lost all chips." );
                        }
                    else{
                        System.out.println("You have " + newGame.player.chips + " chips left. Good luck!" );        
                        }
                }
                else{
                System.out.println("It's a tie. Safe and sound for now, you get your chips back.");
                System.out.println("You have " + newGame.player.chips + " chips left. Good luck!" );
                }
                
                }
                
                }
                
       // Checking if player wants to keep playing         
                System.out.println("Do you want to keep playing? y/n");
                Scanner playOrNot = new Scanner(System.in);
                String response = playOrNot.nextLine();
                
                if (response.equals("y")){
                	if (newGame.player.chips <= 0) {
                		System.out.println("You're out of chips. Think twice about opening that credit line, why don't you sleep on it.");
                		newGame.isGameOver = false;
                	}
                	else {
                		newGame.isGameOver = false;
                	}
                }
                else {
                	newGame.isGameOver = true;
                        System.out.println("Nice, set and stick to your budget! Have a good day!");
                }
                
        }
		while (newGame.player.chips > 0 && newGame.isGameOver == false);
        
        
	}
        

}