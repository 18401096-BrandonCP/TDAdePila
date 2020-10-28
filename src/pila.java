public class pila {
    private int data[];
    private int tos=-1;
    
    public pila(){
        data=new int[5];
    }
    public boolean insertar (int valor){
        if(tos==(data.length-1))return false;;
        tos++;
        data[tos]=valor;
        return true;
    }
    public boolean eliminar(){
        if(tos==-1)return false;
        tos--;
        return true;
    }
}