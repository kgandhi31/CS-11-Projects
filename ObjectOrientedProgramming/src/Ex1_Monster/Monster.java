package Ex1_Monster;

public class Monster {
    private String type;
    private boolean isEvil;
    private int strength;//between 5 and 10
    private int health;
    private String description;
    
    //************* constructor methods **************************
    public Monster(String t, boolean e, int s){
        type = t;
        isEvil = e;
        strength = s+5;//parameter is a 1 to 5 value
        health = 100;
        
        String[]sizes = {"small","big","enormous"};
        String[]colors = {"green","blue","violet"};
        String[]look= {"ugly","polkadotted","furry"};
        description = sizes[(int)(Math.random()*3)] + ", " +  colors[(int)(Math.random()*3)]+", " + look[(int)(Math.random()*3)] ;
        
    }
    
    //**********  getter methods  ***********************
    public String getType(){
        return type;
    }//getType
    public boolean getEvil(){
        return isEvil;
    }//getEvil
    public int getHealth(){
        return health;
    }//getHealth
    public String getDescription(){
        return description;
    }//getType
    
    //**********  other methods  **********************
    public int attack(){
        //when the monster is attacking
        //returns the amount of damage done to the player
        int multiplier = (int)(Math.random()*5 +1);
        int damage =  strength * multiplier;
        System.out.println("The " + type + " attacks you and does damage of " + damage);
        return damage;
    }//end attack
    
    public int defend(int damage){
        //when the monster is defending
        //returns the current health of the monster
        health-=damage;
        if(health<0){
            health = 0;
        }
        System.out.println("You deliver a blow and do " + damage + " damage to the " + type);
        return health;
    }//end defend
    
    
    
}
