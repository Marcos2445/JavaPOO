
package fatec.poo.model;

/**
 *
 * @author Marcos
 */
public class Retangulo {
    private double altura;
    private double base;
    
    
    public void setAltura(double a){
        altura = a;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
        public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    
   public double calArea(){
       return(altura*base);
   }     
   public double calcPerimetro(){
       return  (2*(altura+base));
   }


   
   
}
