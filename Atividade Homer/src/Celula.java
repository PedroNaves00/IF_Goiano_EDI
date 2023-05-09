public class Celula {
        Celula Proxima;
        Celula Anterior;
        Object Elemento;

        // Construtores
        Celula(Celula prox, Object ele){
            this.Proxima = prox;
            this.Anterior = null;
            this.Elemento = ele;
        }
        Celula(Object ele){
            this.Proxima = null;
            this.Anterior = null;
            this.Elemento = ele;
        }

        // Métodos
        void setProxima(Celula prox){
            this.Proxima = prox;
        }
        void setAnterior(Celula ant){
            this.Anterior = ant;
        }
        Celula getProxima(){
            return(this.Proxima);
        }
        Celula getAnterior(){
            return(this.Anterior);
        }
        Object getElemento(){
            return(this.Elemento);
        }
}

