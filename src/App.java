import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Chipotle! I'm Chippy, your personal robot servant. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Glad to be helping you, " + name + ".");
        System.out.println("Enter 'random' for a randomized meal.");
        System.out.println("'trivia' for some Chipotle-related trivia.");
        System.out.println("'menu' if you want a breakdown of our menu.");
        System.out.println("'order' if you want to build an order.");
        System.out.println("'bye' to end the chat.");
        boolean end = false;
        String input = scanner.nextLine();
        chilliredo error = new chilliredo();
        Food chippy = new Food(null, null, null, null, null, null, null, true, 0);
        Food meal = new Food(null, null, null, null, null, null, null, false, 0);
        int i = 1;
        double savings = 0;
        while(!end){
            if (input.equals("bye") || input.equals("Bye")){
                System.out.print("Hope I helped!");
                end = true;
            }
            else if (input.equals("random") || input.equals("Random")){
                Food random_meal = new Food(null, null, null, null, null, null, null, false, 0);
                System.out.print("I randomized a meal for you, enjoy! " + chippy.randomize(random_meal));
                System.out.println("Enter 'bye' to end the chat, 'trivia' to play Chipotle trivia, or 'order' to build an order.");
                input = scanner.nextLine();
                if (!input.equals("bye") && !input.equals("Bye") && !input.equals("trivia") && !input.equals("Trivia") && !input.equals("order") && !input.equals("Order")){
                    error.tryAgain();
                }
            }
            else if (input.equals("Trivia") || input.equals("trivia")){
                System.out.println("Welcome to chipotle trivia! For every question you get right, you will save 50 cents.");
                double s = chippy.QandA();
                System.out.println("Your score was " + s + ". You have saved " + 0.5*s + " USD.");
                savings = 0.5*s;
                System.out.println("Enter 'bye' to end the chat, 'menu' for a breakdown of our menu, 'random' to get a random order, or 'order' to build an order.");
                input = scanner.nextLine();
                if (!input.equals("bye") && !input.equals("Bye") && !input.equals("random") && !input.equals("Random") && !input.equals("order") && !input.equals("Order")){
                    error.tryAgain();
                }
                
            }
            else if (input.equals("menu") || input.equals("Menu")){
                chippy.menuBreakdown();
                System.out.println("Enter 'bye' to end the chat, 'trivia' to play Chipotle trivia, 'random' to get a random order, or 'order' to build an order.");
                input = scanner.nextLine();
                if (!input.equals("bye") && !input.equals("Bye") && !input.equals("random") && !input.equals("Random") && !input.equals("order") && !input.equals("Order")){
                    error.tryAgain();
                }
            }
            else if ((input.equals("order") || input.equals("Order"))&&i==1){
                
                meal.addCost(8.95);
                System.out.println("Would you like a burrito, salad, or bowl? Or you could enter 'bye' to end the chat.");
                String inputString1 = scanner.nextLine();
                
                if (inputString1.equals("burrito") || inputString1.equals("Burrito") || inputString1.equals("BURRITO")){
                    System.out.print("Got it! You want a burrito. ");
                    meal.setMealType("burrito");
                    i=2;
                    System.out.println("What protein would you like?('no protein' / 'chicken' / 'steak' / 'carne asadas' / 'sofritas') Or you could enter 'bye' to end the chat.");
                }
                else if(inputString1.equals("bowl") || inputString1.equals("Bowl") || inputString1.equals("BOWL")){
                    System.out.print("Got it! You want a bowl. ");
                    meal.setMealType("bowl");
                    i=2;
                    System.out.println("What protein would you like?('no protein' / 'chicken' / 'steak' / 'carne asadas' / 'sofritas') Or you could enter 'bye' to end the chat.");
                }
                else if(inputString1.equals("salad") || inputString1.equals("Salad") || inputString1.equals("SALAD")){
                    System.out.print("Got it! You want a salad. ");
                    meal.setMealType("salad");
                    i=2;
                    System.out.println("What protein would you like?('no protein' / 'chicken' / 'steak' / 'carne asadas' / 'sofritas') Or you could enter 'bye' to end the chat.");
                }
                else if(inputString1.equals("bye")||inputString1.equals("Bye")){
                    System.out.println("Hope I helped!");
                    end = true;
                }
                else{
                    error.tryAgain();
                }
            }
            else if (i==2){
                String inputString2 = scanner.nextLine();
                if (inputString2.equals("no protein") || inputString2.equals("No protein") || inputString2.equals("No Protein")){
                    System.out.println("Got it! You want no protein.");
                    meal.setProtein("no protein");
                    System.out.println("What beans would you like?('no beans' / 'brown beans' / 'black beans') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString2.equals("chicken") || inputString2.equals("Chicken")){
                    System.out.println("Got it! You want chicken.");
                    meal.setProtein("chicken");
                    System.out.println("What beans would you like?('no beans' / 'brown beans' / 'black beans') Or you could enter 'bye' to end the chat.");
                    i++;
                    meal.addCost(1.50);
                }
                else if (inputString2.equals("steak") || inputString2.equals("Steak")){
                    System.out.println("Got it! You want steak.");
                    meal.setProtein("chicken");
                    System.out.println("What beans would you like?('no beans' / 'brown beans' / 'black beans') Or you could enter 'bye' to end the chat.");
                    i++;
                    meal.addCost(1.50);
                }
                else if (inputString2.equals("carne asadas") || inputString2.equals("Carne asadas") || inputString2.equals("Carne Asadas")){
                    System.out.println("Got it! You want carne asadas.");
                    meal.setProtein("carne asadas");
                    System.out.println("What beans would you like?('no beans' / 'brown beans' / 'black beans') Or you could enter 'bye' to end the chat.");
                    i++;
                    meal.addCost(2.00);
                }
                else if (inputString2.equals("sofritas") || inputString2.equals("Sofritas")){
                    System.out.println("Got it! You want sofritas.");
                    meal.setProtein("chicken");
                    System.out.println("What beans would you like?('no beans' / 'brown beans' / 'black beans') Or you could enter 'bye' to end the chat.");
                    i++;
                    meal.addCost(2.50);
                }
                else if(inputString2.equals("bye")||inputString2.equals("Bye")){
                    System.out.println("Hope I helped!");
                    end = true;
                }
                else{
                    error.tryAgain();                }
            }
            else if (i==3){
                String inputString3 = scanner.nextLine();
                if (inputString3.equals("no beans") || inputString3.equals("No beans") || inputString3.equals("No Beans")){
                    System.out.println("Got it! You want no beans.");
                    meal.setBeans("no beans");
                    System.out.println("What rice would you like?('no rice' / 'white rice' / 'brown rice') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString3.equals("brown beans") || inputString3.equals("Brown beans") || inputString3.equals("Brown Beans")){
                    System.out.println("Got it! You want brown beans.");
                    meal.setBeans("brown beans");
                    System.out.println("What rice would you like?('no rice' / 'white rice' / 'brown rice') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString3.equals("black beans") || inputString3.equals("Black beans") || inputString3.equals("Black Beans")){
                    System.out.println("Got it! You want black beans.");
                    meal.setBeans("black beans");
                    System.out.println("What rice would you like?('no rice' / 'white rice' / 'brown rice') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if(inputString3.equals("bye")||inputString3.equals("Bye")){
                    System.out.println("Hope I helped!");
                    end = true;
                }
                else{
                    error.tryAgain();
                }
            }
            else if (i==4){
                String inputString4 = scanner.nextLine();
                if (inputString4.equals("no rice") || inputString4.equals("No rice") || inputString4.equals("No Rice")){
                    System.out.println("Got it! You want no rice.");
                    meal.setRice("no rice");
                    System.out.println("What veggies would you like?('no veggies' / 'olives' / 'lettuce' / 'onions') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString4.equals("white rice") || inputString4.equals("White rice") || inputString4.equals("White Rice")){
                    System.out.println("Got it! You want white rice.");
                    meal.setRice("white rice");
                    System.out.println("What veggies would you like?('no veggies' / 'olives' / 'lettuce' / 'onions') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString4.equals("brown rice") || inputString4.equals("Brown rice") || inputString4.equals("Brown Rice")){
                    System.out.println("Got it! You want brown rice.");
                    meal.setRice("brown rice");
                    System.out.println("What veggies would you like?('no veggies' / 'olives' / 'lettuce' / 'onions') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if(inputString4.equals("bye")||inputString4.equals("Bye")){
                    System.out.println("Hope I helped!");
                    end = true;
                }
                else{
                    error.tryAgain();
                }
            }
            else if (i==5){
                String inputString5 = scanner.nextLine();
                if (inputString5.equals("no veggies") || inputString5.equals("No veggies") || inputString5.equals("No Veggies")){
                    System.out.println("Got it! You want no veggies.");
                    meal.setVeggies2("no veggies");
                    System.out.println("What secondary veggies would you like?('no veggies' / 'olives' / 'lettuce' / 'onions') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString5.equals("olives") || inputString5.equals("Olives")){
                    System.out.println("Got it! You want olives.");
                    meal.setVeggies("olives");
                    System.out.println("What secondary veggies would you like?('no veggies' / 'olives' / 'lettuce' / 'onions') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString5.equals("lettuce") || inputString5.equals("Lettuce")){
                    System.out.println("Got it! You want lettuce.");
                    meal.setVeggies("lettuce");
                    System.out.println("What secondary veggies would you like?('no veggies' / 'olives' / 'lettuce' / 'onions') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString5.equals("onions") || inputString5.equals("onions")){
                    System.out.println("Got it! You want onions.");
                    meal.setVeggies("olives");
                    System.out.println("What secondary veggies would you like?('no veggies' / 'olives' / 'lettuce' / 'onions') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString5.equals("bye") || inputString5.equals("Bye")){
                    System.out.println("Hope I helped!");
                    end = true;
                }
                else{
                    error.tryAgain();
                }
            }
            else if (i==6){
                String inputString6 = scanner.nextLine();
                if (inputString6.equals("no veggies") || inputString6.equals("No veggies") || inputString6.equals("No Veggies")){
                    System.out.println("Got it! You want no secondary veggies.");
                    meal.setVeggies2("no secondary veggies");
                    System.out.println("What sauce would you like?('no sauce' / 'sour cream' / 'chipotle sauce' / 'salsa') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString6.equals("olives") || inputString6.equals("Olives")){
                    System.out.println("Got it! You want olives.");
                    meal.setVeggies2("olives");
                    System.out.println("What sauce would you like?('no sauce' / 'sour cream' / 'chipotle sauce' / 'salsa') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString6.equals("lettuce") || inputString6.equals("Lettuce")){
                    System.out.println("Got it! You want lettuce.");
                    meal.setVeggies2("lettuce");
                    System.out.println("What sauce would you like?('no sauce' / 'sour cream' / 'chipotle sauce' / 'salsa') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString6.equals("onions") || inputString6.equals("onions")){
                    System.out.println("Got it! You want onions.");
                    meal.setVeggies2("olives");
                    System.out.println("What sauce would you like?('no sauce' / 'sour cream' / 'chipotle sauce' / 'salsa') Or you could enter 'bye' to end the chat.");
                    i++;
                }
                else if (inputString6.equals("bye") || inputString6.equals("Bye")){
                    System.out.println("Hope I helped!");
                    end = true;
                }
                else{
                    System.out.println("Please enter 'no veggies', 'olives', 'lettuce', or 'onions'. Or you could enter 'bye' to end the chat.");
                }
            }
            else if (i==7){
                String inputString6 = scanner.nextLine();
                if (inputString6.equals("no sauce") || inputString6.equals("No sauce") || inputString6.equals("No Sauce")){
                    System.out.println("Got it! You want no sauce.");
                    meal.setSauce("no sauce");
                    
                }
                else if (inputString6.equals("sour cream") || inputString6.equals("Sour cream")|| inputString6.equals("Sour Cream")){
                    System.out.println("Got it! You want sour cream.");
                    meal.setSauce("sour cream");
                    
                }
                else if (inputString6.equals("Chipotle Sauce") || inputString6.equals("Chipotle sauce") || inputString6.equals("chipotle sauce")){
                    System.out.println("Got it! You want chipotle sauce.");
                    meal.setSauce("chipotle sauce");
                    
                }
                else if (inputString6.equals("salsa") || inputString6.equals("Salsa")){
                    System.out.println("Got it! You want salsa.");
                    meal.setSauce("salsa");
                    
                }
                else if (inputString6.equals("bye") || inputString6.equals("Bye")){
                    System.out.println("Hope I helped!");
                    end = true;
                }
                else{
                    error.tryAgain();
                }
                meal.lowerCost(savings);
                System.out.println(meal);
            }
            else{
                error.tryAgain();
                input = scanner.nextLine();
            }
        }
    }
}         

