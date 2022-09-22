package Day4;
abstract class Animals{
    
    public abstract void cats();
    public abstract void dogs();
}
  class Cats extends Animals{
    public void cats()
    {
        System.out.println("meow");
    }



   @Override
    public void dogs() {
        // TODO Auto-generated method stub
        
    }
    
}
class Dogs extends Animals{
    public void dogs()
    {
        System.out.println("bark");
    }



   @Override
    public void cats() {
        // TODO Auto-generated method stub
        
    }
    
}
public class Abst2 {



   public static void main(String[] args) {
        Cats c=new Cats();
        Dogs d=new Dogs();
        c.cats();
        d.dogs();
        
        



   }



}
