/*

El programa pedirá al usuario 2 números. (Podemos implementar clase Scanner o JOptionPane)
El programa permitirá que el usuario realice las siguientes opciones:

1. Sumar los números
2. Restar los números
3. Multiplicar los números
4. Dividir los números

Si el usuario elige división, la lógica debe incluir error en caso de dividir en 0


 */


import java.util.Scanner;


public class Operaciones {

   
    public static void main(String[] args) {
        
        //Implementamos clase Scanner, la inicializamos con el objeto sc.
        Scanner sc = new Scanner(System.in);
        
        float a;
        float b;
        float res;
        int op;
        
        System.out.println("Ingrese primer número: ");
        a = sc.nextFloat();
        //en caso de querer usar "." para sepación de decimales, usar:
        //a = Float.parseFloat(sc.nextLine());
        
        System.out.println("Ingrese segundo número");
        b = sc.nextFloat();
        //en caso de querer usar "." para sepación de decimales, usar:
        //b = Float.parseFloat(sc.nextLine());
        
        do{

        System.out.println("Seleccione la opción deseada: ");
        System.out.println("1. Sumar los números");
        System.out.println("2. Restar los números");
        System.out.println("3. Multiplicar los números");
        System.out.println("4. Dividir los números");
        System.out.println("5. Salir");
        op = sc.nextInt();
        
        switch(op){
            
            case 1: 
                res = a+b;
                System.out.println("La suma de los números es: " + res);
                break;
                
            case 2: 
                res = a-b;
                System.out.println("La resta de los números es: " + res);
                break;
                
            case 3: 
                res = a*b;
                System.out.println("La multipliación de los números es: " + res);
                break;
                
            case 4: 
                if (b == 0){
                    System.out.println("Error");
                }
                else{
                    res = a/b;
                    System.out.println("La división de los números es: " + res);
                }
                break;
                
            default:
                if (op != 5){
                    System.out.println("Digitó una opción no válida.");
                }
                else{
                   break;
                       
                }
                
        }
        
        }while(op != 5);
        
        System.out.println("Hasta pronto.");
        
    }
    
}
