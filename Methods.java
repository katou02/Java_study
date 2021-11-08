class Methods {
  public static void main(String[] args) {
	
    Item item1 = new Item();

	item1.setName("メソッド");	
	
	System.out.println(item1.getName());
			
  }
}
Ï
class Item{

  String name;

  void setName(String name){

    this.name=name; 
              
  }

  String getName(){

    return this.name; 
              
  }

}
