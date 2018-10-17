import java.util.*;
public class Ejercicio1 {
public static void main(String[]args){
Scanner numero= new Scanner(System.in);
int n1,n2;
System.out.println("ingrese numero1");
n1 = numero.nextInt();
System.out.println("ingrese numero2");
n2 = numero.nextInt();
if((n1>n2)){
System.out.println("el numero mayor es:"+n1);
}
else
if((n2>n1)){
System.out.println("el numero mayor es:"+n2);
}
else
if((n2==n1)){
System.out.println("los numeros son iguales");
}
}
}

