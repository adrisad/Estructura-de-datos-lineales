package EstructurasLineales;

public class ColaDePrioridad_v2<T extends Comparable> extends Cola<T> {
    public ColaDePrioridad_v2(){
        super();
    }

    public void insert(T dato){
        NodoDE<T> nuevo=new NodoDE<T>(dato);
        if (empty()) {
            frente=nuevo;
            fin=nuevo;
        }else{
            NodoDE<T> auxiliar=Buscar(frente,dato);
            if (auxiliar==nuevo) {
                auxiliar.setSiguiente(frente);
            }
        }
    }
    private NodoDE<T> buscarNodo(NodoDE<T> actual,T dato){
        if (frente==null) {
            
        }else{
            if (condition) {
                
            }
        }
    }
}
