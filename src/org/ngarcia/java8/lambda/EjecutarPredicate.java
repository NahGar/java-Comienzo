package org.ngarcia.java8.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import org.ngarcia.java8.lambda.models.Usuario;

public class EjecutarPredicate {
    public static void main(String[] args) {
        
        //devuelve un boolean
        Predicate<Integer> test = numero -> numero > 10;
        boolean resultado = test.test(7);
        System.out.println("7 es > 10 = "+resultado);
        System.out.println("15 es > 10 = "+test.test(15));
        
        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("equals ROLE = " + test2.test("ROLE"));
        
        //BiPredicate<String,String> test3 = (a,b) -> a.equals(b);
        BiPredicate<String,String> test3 = String::equals;
        System.out.println("a.eq(b) = " + test3.test("ROLE","ROLE2"));
        
        BiPredicate<Integer,Integer> test4 = (i,j) -> i > j;
        System.out.println("i > j = " + test4.test(10,15));
        
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("carlos");
        b.setNombre("carlos");
        BiPredicate<Usuario,Usuario> test5 = (ua,ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println("usuario a = usuario b = " + test5.test(a, b));
        
    }
}
