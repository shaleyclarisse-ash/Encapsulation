public class App {
  public static void main (String [] args) {
    
    Food food1 = new Food ("Ice Cream", "Pink", "Sweet", "Soft");
    Dessert dessert1 = new Dessert ("Biscuit", "White", "Bland", "Crispy", false);
    Classification classification1 = new Classification ("Bread", "White", "Bland", "Soft", false, "Carbs");
    
    food1.getInfo();
    dessert1.getInfo();
    classification1.getInfo();
  }
}
