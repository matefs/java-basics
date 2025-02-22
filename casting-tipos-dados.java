class Main { 
    public static void main(String[] args) {
      
      // int -> double 
      int idade1 = 22; 
      double idade2 = idade1; 
      
      System.out.println(idade2);
      
      
      // char -> string 
      char letra = 'a';
      String nome = String.valueOf(letra);
      System.out.println(nome + " " + nome.getClass());
      
      
      // string -> char 
      char letra2 = nome.charAt(0);
      System.out.println(letra2 + " ");
      
      // int -> String
      String IdadeString = String.valueOf(idade1);
      System.out.println(IdadeString + " " + IdadeString.getClass());
        
      // String ->  int
      String idadeString2 = "23";
      Integer IdadeStringParaInteiro = Integer.parseInt(idadeString2);
      System.out.println(IdadeStringParaInteiro + " " + IdadeStringParaInteiro.getClass());
    
      
    }
}
