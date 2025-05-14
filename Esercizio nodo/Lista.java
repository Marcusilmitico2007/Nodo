public class Lista<T> {
    Nodo<T>testa;
    
    public Lista(){
        testa=null;
        
    }
    public Lista(T v[]){
        testa=null;
        for(int i=v.length - 1;i>=0;i--){
            this.addTail(v[i]);
            
        }
        
    }
    
    public void addHead(Nodo<T> nuovo){
        nuovo.setSucc(testa);
        testa=nuovo;
        
    }
    public void addHead(T nuovoValore){
        Nodo<T> nuovo= new Nodo<>(nuovoValore);
        addHead(nuovo);
        
    }
    public void addTail(T nuovoValore) {
        Nodo<T> nuovo = new Nodo<>(nuovoValore);
        addTail(nuovo);
    }
    public void addTail(Nodo<T> nuovo) {
        if (testa == null) {
            testa = nuovo;
        } else {
            Nodo<T> p = testa;
            while (p.getSucc() != null) {
                p = p.getSucc();
            }
            p.setSucc(nuovo);
        }
    }
    public String toString(){
        String r ="la lista contiene: \n";
        Nodo<T> p=testa;
        while(p!=null){
            r+=p;
            p=p.getSucc();
        }
        return r;
    }
    public void lastFirst(){
        Nodo inizio=testa;
        Nodo tmp = testa;
        Nodo fine=testa;
        
        while(tmp.getSucc()!=null){
            fine=tmp;
            tmp=tmp.getSucc();
        }
        if(fine.getSucc()!=null){
            
            testa=fine.getSucc();
            testa.setSucc(inizio.getSucc());
            fine.setSucc(inizio);
            inizio.setSucc(null);
        }else{
            System.out.println("solo 1 elemento presente");
        }
        
    }
    public void elimina(T valore){
        Nodo tmp = testa;
        Nodo elementoPrecedente=testa;
        if(testa.getV()==valore){
            testa=testa.getSucc();
        }else{
            while(tmp.getV()!=valore && tmp.getSucc()!=null){
                elementoPrecedente=tmp;
                tmp=tmp.getSucc();
            }
            if(tmp.getSucc()!=null)
                elementoPrecedente.setSucc(tmp.getSucc());
            else if(tmp.getV()==valore)
                elementoPrecedente.setSucc(null);
            else
                System.out.println("Il valore non è presente all'interno della lista");
        }
    }
    
    public Nodo<T> ricercaValore(T valore){
        Nodo tmp=testa;
        while(tmp.getV()!=null && tmp.getV()!=valore){
            tmp=tmp.getSucc();
        }
        if(tmp.getV()==valore){
            return tmp;
        }else{
            
            return null;
        }
    }
    
    public void modifica(T valore_da_Modificare, T valore ){
        try {
            Nodo tmp = ricercaValore(valore_da_Modificare);
            tmp.setV(valore);
            
        } catch(Exception e) {
            System.out.println("Il valore non è stato trovato");
        }
        
    }
}