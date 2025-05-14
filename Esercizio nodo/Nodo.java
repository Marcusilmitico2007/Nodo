

public class Nodo<T>{
    T v;
    Nodo succ;
    
    public Nodo(T v){
        this.v=v;
        this.succ=null;
    }
    public T getV(){
        return v;
    }
    public Nodo<T> getSucc(){
        return succ;
    }
    public void setV(T v){
        this.v=v;
    }
    public void setSucc(Nodo<T> succ){
        this.succ=succ;
    }
    
    public String toString(){
        return "il mio valore è:" + v +"\n";
    }
    
}