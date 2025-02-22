 
import java.text.MessageFormat;


class Main {
    public static void main(String[] args) {
        double idade = 22.5;
        if(idade > 18 ){  
            System.out.println(MessageFormat.format("É maior de idade, {0}",idade));

        }
    }
}
