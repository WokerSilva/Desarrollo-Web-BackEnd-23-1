 import java.util.ArrayList;
import java.util.Scanner;

public class Practica01{

    
    
    private static String Category;
    
    
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in); 
    System.out.println("Bienvenido,\n ¿Qué desea hacer?\n" + 
                        "[1] Agregar Categorias\n" +
                        "[2] Imprimir la lista\n");

    Scanner inicio = new Scanner(System.in);   // Escaner principal
    Scanner sc = new Scanner(System.in);   // Escaner principal
   
        
        switch (inicio.nextInt()) {
            case 1:
                
                ArrayList<Category> lista = new ArrayList<Category>();
            
                System.out.println("Caso 1: Agregar Categorias");
                Acciones accion = new Acciones();                
                accion.createCategory(Category);

                Acciones js = new Acciones();
                js.verCategorias(lista);
            break;

            case 2:
                System.out.println("Caso 2");
                Acciones ver = new Acciones();
                // ver.createCategory();
                
                System.out.println("Para ver la lista presiona [1]");
                //if (sc.nextInt() == 1){
                //    ArrayList<Category> lista = ver.getCategories();
                //    Iterator<Category> itr = lista.iterator();

                //    while (itr.hasNext()) {
                //        Category i = itr.next();
                //        System.out.println(i);
                //    }
                //}
                
            break;
            
            default:
                System.out.println("error en la opción.");
            break;
        }
    }
}    