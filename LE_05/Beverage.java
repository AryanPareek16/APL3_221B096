 abstract class Beverage {
    protected void pour(int qty)
    {
        System.out.println("add"+qty+" ml of Beverage");
    }
    
    abstract  void addCondiment();
    protected  void stir(){
        
    };
    private void serve(){
        System.out.println(" serve through waiter");
    }
    
    public void  templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
        
    }
        
    
}