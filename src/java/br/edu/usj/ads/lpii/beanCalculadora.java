package br.edu.usj.ads.lpii;


import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean
@RequestScoped

public class beanCalculadora {
    
    public String data = "1";
    
    private static List<String> historico = new ArrayList<>();
  private int limpador;
    public List<String> getHistorico() {
           
        return historico;
    }
   
    private int a;
    private int b; 

    public String getData() {
        return data;  
   }
    
     public void setData(String data) {
      this.data = data;
   }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    private int resultado;
      
     public int calcular(){
       if(this.getData().equals("1")){
            resultado = a + b;
            
            historico.add(a + " + "+b+" = "+resultado);
       }
        if(this.getData().equals("2")){
            resultado = a - b;
            historico.add(a + " - "+b+" = "+resultado);
       }
    
         if(this.getData().equals("3")){
            resultado = (a * b);
              historico.add(a + " * "+b+" = "+resultado);
       }
         
            if(this.getData().equals("4")){
            resultado = (a / b);
              historico.add(a + " / "+b+" = "+resultado);
       }
         
       return resultado;
     }
       public void limparHistorico(){
        limpador = limpador - 1;
        historico.remove(limpador);
    }
     public int getLimpador() {
        return limpador;
    }

    public void setLimpador(int limpador) {
        this.limpador = limpador;
    }
     
}
