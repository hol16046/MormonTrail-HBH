/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;
import java.util.Scanner;
import mormontrail.controller.GameController;
import mormontrail.model.Player;

/**
 *
 * @author Chaskiel, Jared, Heather
 */
public class StartProgramView {
	
	//public String[] inputs;
	
    public StartProgramView(){

    private Object keyboard;

        
              
	System.out.println  ("\n       WELCOME TO THE MORMON TRAIL         *"
                +"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*"
                +"\n*                                          *"
                +"\n*          Get your family ready!          *"
                +"\n*     You're about to embark on a great    *"
                +"\n*       Adventure from start to finish.    *"
                +"\n*  Follow the trail and get thru dangers   *"
                +"\n*        Watch out for Deep Rivers!        *"
                +"\n*      Make sure you have enough food!     *"
                +"\n*  Make sure to rest enough along the way  *"
                +"\n*      and Enjoy life in the valley!       *"
                +"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*");
        
    }
    
    private String getPlayerName(){
        
        boolean isValidName = false;
        String name = "";
        
        System.println("Please enter your name: ");
        
        while(!isValidName){
            String input = "";
            input = keyboard.readLine();
            
            if (input != null && input.length() >= 2){
                isValidName = true;
                name = input;
                
            } else {
                System.println("Input is invalid - name must be at least 2 characters");
            }         
        }
        return name;
    }   
    
    private void displayWelcome(String playerName){
        System.println("============================");
        System.println("Welcome " + playerName + ".");
        System.println("Enjoy the game!");
        System.println("============================");
    }

    @Override
    public boolean doAction(String value) {
        return true;
    }

 
// Start of code by Chas.
    
    
    public String getInputs(){
        
    /*  
        getInputs(): String[] {

 inputs = new String array one element long
 Display a description of the view

valid = false
WHILE valid == false (no input value has been enterd)

Display the prompt message
Get the value entered from the keyboard
Trim off leading and trailing blanks from the value
IF length of the value < 1 then
Display "You must enter a non-blank value”
Continue (move to the top of the loop and repeat)
ENDIF
Assign the value to the fist position in the inputs array
valid = true (ends the loop)
ENDWHILE

RETURN inputs 
        
       */
    
    
    
     String[] inputs = new String [1];
    
        System.out.println("this is the discription of the view");
       
        boolean valid = false; 
       
        while (valid == false){
          
        
      
        
          System.out.println("enter your name");
          
          Scanner input = new Scanner(System.in);
          String name = input.nextLine();
         String trim = name.trim();
          
          int length = trim.length ();
          
          if (length < 1){
                 System.out.println("re enter a name with more than one letter");
                 
          }
          else{
              valid = true;
              return trim;
          }
   
      } 
    
        
        
    System.out.println("getInput (called");
    
    String[] inputs = new String [1];
    inputs[0] = "testInput";

    return inputs;
    }
   
    public String playersName;
	
    private boolean doAction(String[] inputs){
    
		/* doAction(inputs): boolean {
			playersName = get the first value in the inputs array
			player = savePlayer(playersName)
			IF player == null
			display “Could not create the player. “ +
			“Enter a different name.”
			RETURN false
			ENDIF
			DISPLAY "================================================= "
			+ "Welcome to the game " + playersName
			+ "We hope you have a lot of fun!”
			+ "================================================= "
			mainMenuView = Create a new MainMenuView object
			mainMenuView.displayMainMenuView()
			RETURN true
		} */
		playersName = inputs[0];
		Player player = GameController.savePlayer(playersName); 
		if (player == null) {
			System.out.println("Could not create the player. Enter a different name.");
			return false;
		}		
		System.out.println("**Welcome to the game " + playersName +"!");
		mainMenuView = new MainMenuView();
    }
            
    public void display() {
    /*    endOfView = false
    DO
           inputs = getInputs()
            IF no inputs were entered OR the first input is Q 
                    Return
                   ENDIF
                   endOfView = doAction(inputs)
                           
              WHILE endOfView != true
          */
    boolean endOfView = false;
    
    do {
        String[] input = getInputs();
            if (input.equals("") || input.equals("Q")){
                    return; 
                  
        }
    endOfView = doAction(input);
    
    
    }
    while (endOfView != true);
        
    }
 
   
    private String getInputs(){
        
    }
}

