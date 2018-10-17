import java.util.*;
public class Ejercicio2 {
public static void main(String[]args){
Scanner numero= new Scanner(System.in);
int n1,n2,n3;
System.out.println("ingrese numero1");
n1 = numero.nextInt();
System.out.println("ingrese numero2");
n2 = numero.nextInt();
System.out.println("ingrese numero3");
n3 = numero.nextInt();
if ((n1>n2) && (n2>n3)){
System.out.println("el numero mayor es:"+n1+"y el numero menor es:"+n3);
}
else
if ((n1>n3) && (n3>n2)){
System.out.println("el numero mayor es:"+n1+   "y el numero menor es:"+n2);
}
else
if ((n2>n3) && (n3>n1)){
System.out.println("el numero mayor es:"+n2+"y el numero menor es:"+n1);
}
else
if ((n2>n1) && (n1>n3)){
System.out.println("el numero mayor es:"+n2+"y el numero menor es:"+n3);
}
else
if ((n3>n1) && (n1>n2)){
System.out.println("el numero mayor es:"+n3+"y el numero menor es:"+n2);
}
else
if ((n3>n2) && (n2>n1)){
System.out.println("el numero mayor es:"+n3+"y el numero menor es:"+n1);
}
else
if ((n3==n2) && (n2==n1)){
System.out.println("los numeros son iguales");
}
}
}

