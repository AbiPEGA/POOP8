/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Primer main donde vemos la ejecución de 2 ejercicios.
 * @author Abigail
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("******1******");
        
        Poligono poligono = new Poligono();
        System.out.println("Poligono " + poligono);
        
        /* Las clases Base pueden comportarse como sus subclases */
        Object objeto = new Object();
        System.out.println("Object " + objeto);
        
        objeto = poligono;
        System.out.println("Object como poligono " + poligono);
        
        Object objeto2 = poligono;
        System.out.println("Object 2 " + objeto2);
        
        Object objeto3 = new Poligono();
        System.out.println("Object 3 " + objeto3);
        
        System.out.println("******2******");
        
        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
    }
    
    /**
     * 
     * @param poligono Es un objeto, de tipo Poligono
     */
    public static void selectorPoligonos(Poligono poligono){
        if (poligono instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        }else if(poligono instanceof Cuadrilatero){
            System.out.println("El objeto es un cuadrilatero");
        }else if(poligono instanceof Poligono){
            System.out.println("El objeto es un Poligono");
        }else{
            System.out.println("El objeto es otra figura");
        }
    }
}
