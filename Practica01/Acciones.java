import java.util.ArrayList;
import java.util.Scanner;

public class Acciones{

    ArrayList<Category> lista = new ArrayList<Category>();
    //private ArrayList<Category> list;

    public void createCategory(String Category){
        
            // Scanner para leer números y texto
            Scanner sInt = new Scanner(System.in);
            Scanner sText = new Scanner(System.in);
        
            // Creación de la lista
            //ArrayList<Category> lista = new ArrayList<Category>();


            // Prubas de la lista
            Category foo = new Category(1, "Mexico");
            lista.add(foo);

            Category foo1 = new Category(3, "ALE");
            lista.add(foo1);

            Scanner tecla = new Scanner(System.in); 
            char seguir;
    
            do {
            // Preguntamos primero por el ID
            Category client = new Category();
            System.out.println("Introduzca el ID: ");
            client.setCategory_id(sInt.nextInt());

            // Preguntamos segundo por el la categoria
            System.out.println("Introduzca la categoria: ");
            client.setCategory(sText.nextLine());
            // Se agregan a la lista
            lista.add(client);
            System.out.printf("¿Desea introducir otro número (s/n)?: ");
                seguir = tecla.next().charAt(0);

            } while (seguir != 'n' );
            
    
            //Acciones js = new Acciones();
            //js.verCategorias(lista);

            // Se imprime la lista
            //for (Category category1 : lista) {
            //    System.out.println(category1);            
            //}
            
            
    }


    public void getCategory(int category_id){
        
        Scanner buscarLista = new Scanner(System.in);
            //Category bs = new Category();
            System.out.println("Introduzca el ID: ");
            //bs.setCategory_id(buscarLista.nextInt());


            lista.remove(buscarLista.nextInt());
            // Se imprime la lista
            for (Category category1 : lista) {
                System.out.println(category1);            
            }


    }
    
    public ArrayList<Category> verCategorias(ArrayList<Category> lista){
        // Se imprime la lista
        for (Category category1 : lista) {
            System.out.println(category1);            
        }
        return lista;
    }

    /**
    public void getCategories(){       
        
        ArrayList<Category> lista = new ArrayList<Category>();
        Iterator<Category> itr = lista.iterator();

        while (itr.hasNext()) {
            Category i = itr.next();
            System.out.println(i);
        }     
    }
     */

}