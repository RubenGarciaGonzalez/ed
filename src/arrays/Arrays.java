
package arrays;

import java.util.Scanner;

public class Arrays {

  //Método que se llame copiarArray que va a devolver una copia exacta de la copia numeros.
    
    public static int[] copiarArray(int[]v){
        int i;
        int j=0 ;
        
        int[]copiarArray=new int[v.length];
        for (i=0;i<v.length;i++)
        {
            copiarArray[j]=v[i];
            j++;
            System.out.println("v["+i+"] = " + v[i]);
        } 
       return copiarArray;
        
    }
    
    
    public static void imprimirArray (int [] v){
            int i;
            
            for (i=0;i<v.length;i++){
           System.out.println("v["+i+"] = " + v[i]);
       }
    }
    public static int []impares(int [] v){
        int i;
        int j=0;
        
        int [] imparesArray = new int [v.length]; // Si todos los numeros son impares el array resultado tendra igual tamaño
        for (i=0;i<v.length;i++) {
             if (v[i] % 2 !=0){
                imparesArray[j] =v[i];  
                j++;
            }
            
        }
       return imparesArray;
    }
                
           
    public static void inicializarArray (int [] v){ // Paso de un array a un metodo por referencia
       int i;
       int size ;
       int[] intArray; 
       for (i=0;i<v.length;i++) /* Por defecto se inicializa un array al valor neutro de su tipo */
           v[i]=i;
          
      /* try{
                                      Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array:");
		size = sc.nextInt();
		intArray = new int[size];
		for (i = 0; i < size; i++) {
			System.out.println("Por favor introduce un valor en la posicion " + i + ":");
			intArray[i] = sc.nextInt();
		}
		System.out.println("Introduce una posicion para obtener el valor almacenado:");
		int index = sc.nextInt();
		sc.close();

		System.out.println("El valor almacenado en " + index + " = " + intArray[index]);
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Error. Indice de posicion no valida");
       }*/
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int [] numeros = new int[10];
        int [] resultado;
        
         inicializarArray(numeros);
        resultado = impares (numeros);
        System.out.println("Vector inicializado");
        imprimirArray (numeros);
         System.out.println("\nVector con numeros impares");
        imprimirArray (resultado);
        System.out.println("\nVector copia del arrays:");
        copiarArray(numeros);
       
     
       /*for (i=0;i<numeros.length;i++){
           System.out.println("v["+i+"] = " + numeros[i]);
       }
      for (i=0;i<resultado.length;i++){
           System.out.println("resultado["+i+"] = " + resultado[i]);
       }    */
    }
    
}
