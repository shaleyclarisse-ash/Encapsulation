public class Classification extends Dessert {
  String TypeClass;
  
  Classification (String name, String color, String taste, String texture, boolean isDessertSweet, String TypeClass){
    
    super (name, color, taste, texture, isDessertSweet);
    this.TypeClass = TypeClass;
    
  }
  void getInfo() {
    super.getInfo();
    System.out.println ("Classification: " + TypeClass);
    
  }
}
