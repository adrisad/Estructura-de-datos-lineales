package EstructurasLineales;

public class ColaPrioridad_v1<T,P extends Comparable> {
    NodoPrioridad<T,P> frente,fin;
    public ColaPrioridad_v1(){
        frente=null;
        fin=null;
    }
    public boolean empty(){
        return (frente==null)&&(fin==null);
    }
    public void insert(T dato,P prioridad){
        NodoPrioridad<T,P> nuevo=new NodoPrioridad<T,P>(dato, prioridad);
        if (empty()) {
            frente=nuevo;
            fin=nuevo;
        }else{
            if (frente.getPrioridad().compareTo(prioridad)<0) {
                nuevo.setSiguiente(frente);
                frente=nuevo;
            }else{
                if (fin.getPrioridad().compareTo(prioridad)>=0) {
                    fin.setSiguiente(nuevo);
                    fin=nuevo;
                }else{
                    NodoPrioridad<T,P> actual=frente;
                    NodoPrioridad<T,P> anterior=null;
                    while (actual.getPrioridad().compareTo(prioridad)>=0) {
                        anterior=actual;
                        actual=actual.getSiguiente();
                    }
                    anterior.setSiguiente(nuevo);
                    nuevo.setSiguiente(actual);
                }
            }
        }

    }

    /**
     * En este metodo actualizaremos la cola o sea acomodar por prioridad
     * @param nada
     * @return nada
     */
    public void actualizarColaDePrioridad(){
        Cola<T> colaAuxiliar=new Cola<T>();
        while (!empty()) {
            
        }
    }
}
