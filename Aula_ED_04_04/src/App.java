import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        lista_encadeada_obj();
        
    }
    public static void lista_encadeada_obj(){
        LinkedList<Veiculo> lista_objs_Veiculos = new LinkedList<>();
        Veiculo v = new Veiculo("Uno","Fiat",1980);
        Veiculo v1 = new Veiculo("Mobi","Fiat",1980);

        lista_objs_Veiculos.add(v);
        lista_objs_Veiculos.add(v1);
        System.out.println(lista_objs_Veiculos.getLast().getModelo());
        System.out.println(lista_objs_Veiculos.getLast().getModelo());
    }
    public static void lista_encadeada(){
        
        LinkedList<String> veiculos = new LinkedList<>();
        veiculos.add("Gol");
        veiculos.add("Uno");
        System.out.println(veiculos.toString());

        veiculos.addLast("Mobi");
        veiculos.addLast("Kwid");
        veiculos.addLast("HB20");
        System.out.println(veiculos.toString());

        veiculos.addFirst("Astra");
        veiculos.addFirst("Argo");
        veiculos.addFirst("Onix");
        System.out.println(veiculos.toString());

        
        for(String veiculo : veiculos){
            System.out.println(veiculo);
        }

        
        System.out.println(veiculos.get(2));
        System.out.println(veiculos.getFirst());
        System.out.println(veiculos.getLast());


        veiculos.remove(2);
        System.out.println(veiculos.toString());
        veiculos.removeFirst();
        System.out.println(veiculos.toString());
        veiculos.removeLast();
        System.out.println(veiculos.toString());
    }

    
    public static void lista_simples(){
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Manga");
        frutas.add("Melancia");
        frutas.add("Maracujá");
        frutas.add("Mamão");
        frutas.add("Mirtilo");
        frutas.add("Morango");
        System.out.println("Mortar frutas de indice 0 e 1");
        System.out.println(frutas.get(0));
        System.out.println(frutas.get(1));

        ArrayList<String> legumes = new ArrayList<>();
        
        System.out.println("As listas estão vazias?");
        System.out.println("Frutas: "+frutas.isEmpty());
        System.out.println("Legumes: "+legumes.isEmpty());

        System.out.println("quais os seus tamanhos: ");
        System.out.println("Frutas: "+frutas.size());
        System.out.println("Legumes: "+legumes.size());
        
        System.out.println("Percorrendo a lista frutas com for");
        for(int i=0; i<frutas.size(); i++){
            System.out.println(frutas.get(i));
        }
        frutas.remove(0);
        System.out.println("Percorrer de outra maneira");
        for(String fruta : frutas){
            System.out.println(fruta);
        }
        ArrayList<Frutas> lista_objetos = new ArrayList<>();
        Frutas f = new Frutas("Melancia","Verde",1);
        lista_objetos.add(f);

    }
}
