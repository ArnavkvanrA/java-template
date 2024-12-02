import java.util.Scanner;
class Food{

    private String mealType;
    private String protein;
    private String beans;
    private String rice;
    private String veggies;
    private String veggies2;
    private String sauce;
    private boolean bot;
    private double cost;

    public Food(String m, String p, String b, String r, String v, String v2, String s, boolean t, double c){
        mealType = m;
        protein = p;
        beans = b;
        rice = r;
        veggies = v;
        veggies2 = v2;
        sauce = s;
        bot = t;
        cost = c;
    }
    
    public String randomize(Food m1){
        String[] mtlist = {"burrito", "salad", "bowl"};
        String[] proteinlist = {"no protein", "chicken", "steak", "carne asadas", "sofritas"};
        String[] beanlist = {"no beans", "brown beans", "black beans"};
        String[] ricelist = {"no rice", "white rice", "brown rice"};
        String[] veggieslist = {"no veggies", "olives", "lettuce", "onions"};
        String[] v2list = {"no secondary veggies", "olives", "lettuce", "onions"};
        String[] saucelist = {"no sauce", "sour cream", "chipotle sauce", "salsa"};
        int m = (int)(Math.random() * 3);
        int p = (int)(Math.random() * 5);
        int b = (int)(Math.random() * 3);
        int r = (int)(Math.random() * 3);
        int v = (int)(Math.random() * 4);
        int v2 = (int)(Math.random() * 4);
        int s = (int)(Math.random() * 4);
        m1.setMealType(mtlist[m]);
        m1.setProtein(proteinlist[p]);
        m1.setBeans(beanlist[b]);
        m1.setRice(ricelist[r]);
        m1.setVeggies(veggieslist[v]);
        m1.setVeggies2(v2list[v2]);
        m1.setSauce(saucelist[s]);
        if (proteinlist[p].equals("chicken")||proteinlist[p].equals("steak")){
            m1.setCost(10.45);
        }
        else if(proteinlist[p].equals("carne asadas")){
            m1.setCost(10.95);
        }
        else if(proteinlist[p].equals("sofritas")){
            m1.setCost(11.45);
        }
        else{
            m1.setCost(8.95);
        }
        return m1.toString();
    }
    

    public double QandA(){
        Scanner scanner = new Scanner(System.in);
        double score = 0;
        String[] questions = {"When was Chipotle Mexican Grill founded?",
        "Who is the founder of Chipotle?",
        "What is the name of Chipotle's vegetarian protein option?",
        "Which Chipotle item was discontinued in 2020 but brought back due to customer demand?",
        "What was Chipotle's first menu item?",
        "Where was the first Chipotle located?"};
        String[] answers = {"1993",
        "Steve Ells",
        "steve ells",
        "Steve ells",
        "steve Ells",
        "Sofritas",
        "sofritas",
        "Carne Asadas",
        "carne Asadas",
        "carne asadas",
        "Carne asadas",
        "The Burrito",
        "burrito",
        "Burrito",
        "the Burrito",
        "Denver",
        "denver"};
        for (int i=0; i<6; i++){
            System.out.print(questions[i]);
            String inputString = scanner.nextLine();
            if (i==0){
                if (inputString.equals(answers[0])){
                    System.out.println("Correct!");
                    score++;
                }
               else{
                    System.out.println("Wrong! The answer is " + answers[0]);
               } 
            }
            else if (i==1){
                if (inputString.equals(answers[1])||inputString.equals(answers[2])||inputString.equals(answers[3])||inputString.equals(answers[4])){
                    System.out.println("Correct!");
                    score++;
                }
                else{
                    System.out.println("Wrong! The answer is " + answers[1]);
                }
            }
            else if (i==2){
                if (inputString.equals(answers[5]) || inputString.equals(answers[6])){
                    System.out.println("Correct!");
                    score++;
                }
                else{
                    System.out.println("Wrong! The answer is " + answers[5]);
                }
            }
            else if (i==3){
                if (inputString.equals(answers[7]) || inputString.equals(answers[8]) || inputString.equals(answers[9]) || inputString.equals(answers[10])){
                    System.out.println("Correct!");
                    score++;
                }
                else{
                    System.out.println("Wrong! The answer is " + answers[7]);
                }
            }
            else if (i==4){
                if (inputString.equals(answers[11]) || inputString.equals(answers[12]) || inputString.equals(answers[13]) || inputString.equals(answers[14])){
                    System.out.println("Correct!");
                    score++;
                }
                else{
                    System.out.println("Wrong! The answer is " + answers[11]);
                }
            }
            else if (i==5){
                if (inputString.equals(answers[15]) || inputString.equals(answers[16])){
                    System.out.println("Correct!");
                    score++;
                }
                else{
                    System.out.println("Wrong! The answer is " + answers[15]);
                }
            }
        }
        return score;
    }
    public void menuBreakdown(){
        System.out.println("Types of meals: {'burrito', 'salad', 'bowl'}");
        System.out.println("Types of protein: {'no protein', 'chicken', 'steak', 'carne asadas', ''}");
        System.out.println("Types of beans: {'no beans', 'brown beans', 'black beans'}");
        System.out.println("Types of rice: {'no rice', 'white rice', 'brown rice'}");
        System.out.println("Types of veggies: {'no veggies', 'olives', 'lettuce', 'onions'}");
        System.out.println("Types of sauces: {'no sauce', 'sour cream', 'chipotle sauce', 'salsa'}");
    }
    public void addCost(double c){
        cost += c;
    }
    public void lowerCost(double c){
        cost -= c;
    }
    public void setMealType(String m){
        mealType = m;
    }
    public void setProtein(String p){
        protein = p;
    }
    public void setBeans(String b){
        beans = b;
    }
    public void setRice(String r){
        rice = r;
    }
    public void setVeggies(String v){
        veggies = v;
    }
    public void setVeggies2(String v2){
        veggies2 = v2;
    }
    public void setSauce(String s){
        sauce = s;
    }
    public void setBot(boolean t){
        bot = t;
    }
    public void setCost(double c){
        cost = c;
    }
    public String getMealType(){
        return mealType;
    }
    public String getProtein(){
        return protein;
    }
    public String getRice(){
        return rice;
    }
    public String getVeggies(){
        return veggies;
    }
    public String getVeggies2(){
        return veggies2;
    }
    public String getSauce(){
        return sauce;
    }
    public boolean getBot(){
        return bot;
    }

    public String toString(){
        return ("I've ordered a " + mealType + " with " + protein + ", " + beans + ", " + rice + ", " + veggies + ", " + veggies2 + ", and " +  sauce + ". Your total is " + cost + " USD.");
    }
 }
 