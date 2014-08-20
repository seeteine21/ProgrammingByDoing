public class Game {

	public Player player;
	public Dealer dealer;
	public boolean isGameOver;
	
	
	public Game() {
		
		this.player = new Player();
		this.dealer = new Dealer();
		this.isGameOver = false;
                
				
	}
        
       
	
	public int hit(){
			Card card = new Card();
			this.player.cardPoint = this.player.cardPoint + card.getValue();
			return card.getValue();
        }  
        
       
        
       public int dealerHit(){
    	   		Card card = new Card();
                this.dealer.cardPoint = this.dealer.cardPoint + card.getValue();
                return card.getValue();
		}
       
         

}