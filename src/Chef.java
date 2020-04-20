import java.util.List;

public class Chef {
    private String name;
    private List<Meal> meals;

    public Chef(String name, List<Meal> meals){
        this.name= name;
        this.meals= meals;
    }

    public String foodCertification(String foodType, String foodDesc){
        int counter = 0;
        for(int i = 0; i<meals.size(); i++){
            for(foodType x : meals.get(i).getFoods()){
                if(foodType.equals(x);
                   counter++;
            }
        }
        if(counter >= 100)
            return "A";
        else if(counter>=50)
            return "B";
        else
            return "C";
    }
    public boolean masterChef(Meal mealCombo){
        for(int i:mealCombo.getFoods()){
            if(foodCertification(i, i.getFoodDesc).equals("A") != 0)
                return false;
        }
        return true;
    }
}
