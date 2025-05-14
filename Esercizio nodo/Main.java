/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main{
    public static void main(String [] args){
    
   /* System.out.println("Ciao");
    Lista<String> elenco;
    elenco=new Lista<>();
    elenco.addHead("Marco");
    System.out.println(elenco);
    elenco.addHead("uno");
    elenco.addHead("due");
    elenco.addHead("tre");
    elenco.addHead("quattro");
    System.out.println(elenco);
    
    
    elenco.addTail("ultimo");
    System.out.println(elenco);
    elenco.lastFirst();
    System.out.println("\n\n"+elenco);
    
    String arr[]={"ciao","1","2","3"};
    Lista<String> lista2=new Lista(arr);
    System.out.println(lista2);*/
    
    //eliminazione di un elemento dalla lista
    Integer arr[]={1, 2 , 3 , 4 };
    Lista<Integer> elenco;
    elenco=new Lista<>(arr);
    System.out.println(elenco);
    elenco.elimina(5);
    System.out.println(elenco);
    elenco.modifica(2,10);
    System.out.println(elenco);
    
    try {
        Nodo tmp = elenco.ricercaValore(5);
        System.out.println(tmp);

    } catch(Exception e) {
        System.out.println("Il valore non trovato");
    }
    
    Lista<Integer> elenco2 = new Lista<>();
    elenco2.addHead(1);
    elenco2.addHead(4);
    System.out.println(elenco2);
    elenco2.lastFirst();
    System.out.println(elenco2);
    
    

    }
}
