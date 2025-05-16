public class Tree<T extends Comparable<T>>{
    

    protected  Treenode<T> root;


    public Tree(){
        root = null;
    }

    public void add(  T value){
        Treenode<T> newnode1 = new Treenode<T>(value);
        if (root==null) {
            root= newnode1;

        }else
        add(value);
    }

}
