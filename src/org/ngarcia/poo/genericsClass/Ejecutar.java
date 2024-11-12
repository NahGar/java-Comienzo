package org.ngarcia.poo.genericsClass;

public class Ejecutar {

    public static void main(String[] args) {
        
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("bojack", "caballo"))
                  .add(new Animal("grillo", "caballo"))
                  .add(new Animal("gandalf", "caballo"))
                  .add(new Animal("merlin", "caballo"))
                  .add(new Animal("pepito", "caballo"));
        
        //for(Object o: transporteCaballos) {
            //Animal a = (Animal) o;
            //System.out.println( a.getNombre() + " tipo: " + a.getTipo());
        //}
        //for(Animal a: transporteCaballos) {
        //    System.out.println( a.getNombre() + " tipo: " + a.getTipo());
        //}
        imprimirCamion(transporteCaballos);
        
        Camion<Maquinaria> transporteMaquinas = new Camion<>(3);
        transporteMaquinas.add(new Maquinaria("bulldozer"))
                  .add(new Maquinaria("grúa"))
                  .add(new Maquinaria("perforadora"));
        
        //for(Maquinaria m: transporteMaquinas) {
        //    System.out.println( m.getTipo());
        //}
        imprimirCamion(transporteMaquinas);
        
        Camion<Automovil> transporteAuto = new Camion<>(3);
        transporteAuto.add(new Automovil("Toyota"))
                  .add(new Automovil("Chevrolet"))
                  .add(new Automovil("Volkswagen"));
        
        //for(Automovil a: transporteAuto) {
        //    System.out.println( a.getMarca());
        //}
        imprimirCamion(transporteAuto);
    }
    
    public static <T> void imprimirCamion(Camion<T> camion) {
        for(T t: camion) {
            if(t instanceof Animal) {
                System.out.println( ((Animal) t).getNombre() + " tipo: " + 
                        ((Animal) t).getTipo());
            }
            else if(t instanceof Maquinaria) {
                System.out.println( ((Maquinaria) t).getTipo());
            }
            else if(t instanceof Automovil) {
                System.out.println( ((Automovil) t).getMarca());
            }
        }
    }
}
