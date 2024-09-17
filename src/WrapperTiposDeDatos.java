
public class WrapperTiposDeDatos {

    public static void main(String[] args) {
        
        //INTEGER
        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo); 
        Integer intObjeto2 = intPrimitivo;
        
        int intPrimitivo2 = intObjeto;
        int intPrimitivo3 = intObjeto.intValue();
        
        Short shortObjeto = intObjeto.shortValue();
        Byte byteObjeto = intObjeto.byteValue();
        Long longObjeto = intObjeto.longValue();
        
        //comparar objetos Wrapper
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;
        System.out.println("Son mismo objeto? " + (num1==num2));
        num2 = 1000;
        
        System.out.println("Son mismo objeto? " + (num1==num2));
        System.out.println("Tienen mismo valor? " + (num1.equals(num2)));
    }
}
