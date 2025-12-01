public class Food {
  
  String name, color, taste, texture;
  
  
  Food(String name, String color, String taste, String texture){
    this.name = name;
    this.color = color;
    this.taste = taste;
    this.texture = texture;
  }
  
  void getInfo() {
    System.out.println ();
    System.out.println ("-----Food Information-----");
    System.out.println("Name: " + name);
    System.out.println("Color:  " + color);
    System.out.println("Taste: " + taste);
    System.out.println("Texture: " + texture);
    
  }
}
