import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class ejerclase{
    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args){

        boolean flag=true;
        int ale = 0;
        int usu = 0;
        int cont = 0;
        String s = "";

        do {
            Random n=new Random();
            ale = n.nextInt(14)+1;

        do {
            screen.println("ingrese numero");
            usu = keyboard.nextInt();
            if (usu==ale) {
                screen.println("Gano!!");
            }else {
                screen.println("Perdio");
            }
        }while (cont<3);
            screen.println("perdiste, quieres intentar de nuevo S/N");
            s = keyboard.nextLine();
            if (s.equals("N")) {
                flag = false;

            }else {
                cont=0;
            }
        }while (flag==true);
    }

