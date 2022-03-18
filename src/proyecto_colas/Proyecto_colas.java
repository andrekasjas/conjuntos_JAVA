
package proyecto_colas;

import java.util.Scanner;

public class Proyecto_colas 
{
    public static void main(String[] args) 
    {
        new muestra().setVisible(true); 
    } 
}

class fi
{
    nodo cab;
    fifo()
        {
        cab=new nodo(null);
        cab.sig=cab;
    }
    boolean existe(String  n)
    {
        nodo aux=cab.sig.sig;
        while(aux!=cab.sig)
        {
            if(aux.info.equals(n))
            {
                return true;
            }
            aux=aux.sig;
        }
        return false;
    }
    String adicionar(String x)
    {
        if(!existe(x))
        {
            proyecto_colas.nodo nuevo=new proyecto_colas.nodo(x);
            nuevo.sig=cab.sig;
            cab.sig=nuevo;
            cab=nuevo;
            return "INGRESO EXITOSO";
        }
        return "EL DATO YA EXISTE";
    }
    String imprimir()
    {
        String c="";
        nodo aux=cab.sig.sig;
        while(aux!=cab.sig)
        {
            c=c+aux.info+";";
            aux=aux.sig;
        }
        return c;
    }
    fifo union(fifo b)
    {
        fifo u=new fifo();
        nodo aux=cab.sig.sig;
        while(aux!=cab.sig)
        {
            nodo aux2=b.cab.sig.sig;
            while(aux2!=b.cab.sig)
            {
                if((existe(aux.info)) || (b.existe(aux.info)))
                {
                    u.adicionar(aux.info);
                    u.adicionar(aux2.info);
                }
                aux2=aux2.sig;
            }
            aux=aux.sig;
        }
        return u;
    }
    fifo inter(fifo b)
    {
        fifo i=new fifo();
        nodo aux=cab.sig.sig;
        while(aux!=cab.sig)
        {
            nodo aux2=b.cab.sig.sig;
            while(aux2!=b.cab.sig)
            {
                if(existe(aux.info)&&b.existe(aux.info))
                {
                    i.adicionar(aux.info);
                }
                aux2=aux2.sig;
            }
            aux=aux.sig;
        }
        return i;
    }
    fifo diferen(fifo b)
    {
        fifo d=new fifo();
        nodo aux=cab.sig.sig;
        while(aux!=cab.sig)
        {
            nodo aux2=b.cab.sig.sig;
            while(aux2!=b.cab.sig)
            {
                if(existe(aux.info) && !b.existe(aux.info))
                {
                    d.adicionar(aux.info);
                }
                aux2=aux2.sig;
            }
            aux=aux.sig;
        }
        return d;
    }
    fifo difesime(fifo b)
    {
        fifo q=new fifo();
        fifo w=new fifo();
        q=this.diferen(b);
        w=b.diferen(this);
        return q.union(w); 
    }   
}
    
class nodo
{
    String info;
    nodo(String info)
    {
        this.info=info;
    }
    nodo sig;
}

