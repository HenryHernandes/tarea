import java.util.*;
public class ejercicio5 {
public static void main(String[]args){
Scanner entrada = new Scanner (System.in);
int numero;
System.out.println("ingrese numero");
numero = entrada.nextInt();
if (numero < 10){
System.out.println("el numro tiene 1 digito");
}
else 
   if (numero < 100){
System.out.println("el numro tiene 2 digito");
}
else 
   if (numero < 1000){
System.out.println("el numro tiene 3 digito");
}
else 
   if (numero < 10000){
System.out.println("el numro tiene 4 digito");
}
else 
   if (numero < 100000){
System.out.println("el numro tiene 5 digito");
}
else 
   if (numero < 1000000){
System.out.println("el numro tiene 6 digito");
}
else 
   if (numero < 10000000){
System.out.println("el numro tiene 7 digito");
}
else 
   if (numero < 100000000){
System.out.println("el numro tiene 8 digito");
}
}
}