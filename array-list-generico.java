import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Main { 
  
    public static void main(String[] args) {
      
      List<Object> listaGenerica = new ArrayList<>(Arrays.asList("Texto",123,true));
      listaGenerica.add(12.22);
      System.out.println(listaGenerica); 
      
    }
    
 
    
}

 


