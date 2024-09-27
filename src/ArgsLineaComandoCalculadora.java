public class ArgsLineaComandoCalculadora {

    public static void main(String[] args) {

        if( args.length == 0 ) {
            System.out.println("Debe ingresar algún parámetro");
            System.exit(-1);
        }

        String operacion = args[0];
        if(!"x%+-".contains(operacion)) {
            System.out.println("Operación incorrecta (x,%,+ y -)");
            System.exit(-1);
        }

        double numero1 = Double.parseDouble(args[1]);
        double numero2 = Double.parseDouble(args[2]);

        double resultado = 0;

        switch (operacion) {
            case "x":
                resultado = numero1 * numero2;
                break;
            case "%":
                resultado = numero1 / numero2;
                break;
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
        }

        System.out.println("Resultado " + resultado);
    }
}
