package Counter;

public class CounterController{

    public void add(){
        try {
            try(Counter counter = new Counter()){
                counter.addCount();
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}
