public class Game{
    private String name;
    private int happinessUp;
    private int weightDecr;
    
    
    public Game(String name, int happinessUp, 
    int weightDecr){
        this.name = name;
        this.happinessUp = happinessUp;
        this.weightDecr = weightDecr;
    }
    
    //name
public String getName (){
    return name;
}
   // happiness
  public int getHappinessUp(){
    return happinessUp;
  }
  
//weight
   public int getWeightDecr(){
       return weightDecr;
   }   
   
   //winning game
   public boolean isWinner(){
       if (Math.random() > 0.5){
           return true;
       }
       else{
           return false;
       }
   }
    
    
    
    
    
    
    
    
    
    
    
}
