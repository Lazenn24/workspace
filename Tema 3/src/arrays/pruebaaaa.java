package arrays;
import java.util.Scanner;


public class pruebaaaa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String notas[][]= new String[3][4];
        double notafinal=0;
        System.out.println("Introducción de notas.\n============================");
        
        for(int i = 0; i<notas.length;i++){
            for(int j = 0; j<notas[0].length;j++){
                
                if(j==0){
                    System.out.print("Nombre: ");
                }else if(j==1){
                    System.out.print("Exámenes: ");
                }else if(j==2){
                    System.out.print("Trabajos: ");
                }else if(j==3){
                    System.out.print("Actitud: ");
                }
                
                notas[i][j]= entrada.nextLine();
                
            }
        }
        System.out.println("\nNota de evaluación.\n============================");
        for(int i = 0; i<notas.length;i++){
            notafinal = ((50*Double.parseDouble(notas[i][1]))+(40*Double.parseDouble(notas[i][2]))+(10*Double.parseDouble(notas[i][3])))/(100);
            
            
            System.out.println(notas[i][0]+" : "+notafinal);
            
        }
        
        
        entrada.close();
    }

}

