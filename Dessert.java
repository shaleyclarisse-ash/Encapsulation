public class Dessert extends Food{
  
  boolean isDessertSweet;
  
  Dessert (String name, String color, String taste, String texture, boolean isDessertSweet){
    
    super (name, color, taste, texture);
    this.isDessertSweet = isDessertSweet;
    
  }
    
    void getInfo() {
      super.getInfo();
      System.out.println ("Is the Dessert Sweet? " + isDessertSweet);
    }
}
