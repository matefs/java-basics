import java.util.ArrayList;

class Main {
  // Array dinamico 
    public static void main(String[] args) {
      int[] idades1 = new int[10];
      System.out.println("NUmero itens lista:"+ idades1.length);
      
      ArrayList<Integer> idades = new ArrayList<Integer>();
      
      idades.add(10);
      System.out.println(idades);
      idades.remove(0);
      System.out.println(idades);
      idades.add(10);
      idades.add(20);
      System.out.println(idades.get(0));
      System.out.println("Tamanho da lista:" + idades.size());
      
      
    }
}




