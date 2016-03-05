class Democons{
      int  value1;
      int  value2;
      Democons(){
      value1 = 10;
           value2 = 20;
          System.out.println("Inside 1st Constructor");
     }
     Democons(int a){
      value1 = a;
      System.out.println("Inside 2nd Constructor");
    }
    Democons(int a,int b){
    value1 = a;
    value2 = b;
    System.out.println("Inside 3rd Constructor");
   }
   public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
  }
  public static void main(String args[]){
    Democons d1 = new Democons();
    Democons d2 = new Democons(30);
    Democons d3 = new Democons(30,40);
    d1.display();
    d2.display();
    d3.display();
 }
}