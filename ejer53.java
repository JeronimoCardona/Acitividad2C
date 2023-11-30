public class ejer53 extends base {
    
        public static void main(String[] args) {
            String numrom = "";
            String numromtemp = "";
            int numara = 0;
    
            screen.println("Ingrese un numero romano entre I(1) y MMMCMXCIX(3999)");
            numrom = keyboard.nextLine().trim().toUpperCase();
            numromtemp = numrom;
    
            if (numromtemp.startsWith("MMM")) {
                numara += 3000;
                numromtemp = numromtemp.substring(3);
            }
            else if (numromtemp.startsWith("MM")) {
                numara += 2000;
                numromtemp = numromtemp.substring(2);
            }
            else if (numromtemp.startsWith("M")) {
                numara += 1000;
                numromtemp = numromtemp.substring(1);
            }
    
            if (numromtemp.startsWith("DCCC")) {
                numara += 800;
                numromtemp = numromtemp.substring(4);
            }
            else if (numromtemp.startsWith("DCC")) {
                numara += 700;
                numromtemp = numromtemp.substring(3);
            }
            else if (numromtemp.startsWith("CCC")) {
                numara += 300;
                numromtemp = numromtemp.substring(3);
            }
            else if (numromtemp.startsWith("CM")) {
                numara += 900;
                numromtemp = numromtemp.substring(2);
            }
            else if (numromtemp.startsWith("DC")) {
                numara += 600;
                numromtemp = numromtemp.substring(2);
            }
            else if (numromtemp.startsWith("CD")) {
                numara += 400;
                numromtemp = numromtemp.substring(2);
            }
            else if (numromtemp.startsWith("CC")) {
                numara += 200;
                numromtemp = numromtemp.substring(2);
            }
            else if (numromtemp.startsWith("D")) {
                numara += 500;
                numromtemp = numromtemp.substring(1);
            }
            else if (numromtemp.startsWith("C")) {
                numara += 100;
                numromtemp = numromtemp.substring(1);
            }
    
            if (numromtemp.startsWith("LXXX")) {
                numara += 80;
                numromtemp = numromtemp.substring(4);
            }
            else if (numromtemp.startsWith("LXX")) {
                numara += 70;
                numromtemp = numromtemp.substring(3);
            }
            else if (numromtemp.startsWith("XXX")) {
                numara += 30;
                numromtemp = numromtemp.substring(3);
            }
            else if (numromtemp.startsWith("XC")) {
                numara += 90;
                numromtemp = numromtemp.substring(2);
            }
            else if (numromtemp.startsWith("LX")) {
                numara += 60;
                numromtemp = numromtemp.substring(2);
            }
            else if (numromtemp.startsWith("XL")) {
                numara += 40;
                numromtemp = numromtemp.substring(2);
            }
            else if (numromtemp.startsWith("XX")) {
                numara += 20;
                numromtemp = numromtemp.substring(2);
            }
            else if (numromtemp.startsWith("L")) {
                numara += 50;
                numromtemp = numromtemp.substring(1);
            }
            else if (numromtemp.startsWith("X")) {
                numara += 10;
                numromtemp = numromtemp.substring(1);
            }
    
            if (numromtemp.endsWith("VIII")) {
                numara += 8;
            }
            else if (numromtemp.endsWith("VII")) {
                numara += 7;
            }
            else if (numromtemp.endsWith("III")) {
                numara += 3;
            }
            else if (numromtemp.endsWith("IX")) {
                numara += 9;
            }
            else if (numromtemp.endsWith("VI")) {
                numara += 6;
            }
            else if (numromtemp.endsWith("IV")) {
                numara += 4;
            }
            else if (numromtemp.endsWith("II")) {
                numara += 2;
            }
            else if (numromtemp.endsWith("V")) {
                numara += 5;
            }
            else if (numromtemp.endsWith("I")) {
                numara += 1;
            }
            screen.println("El numero que usted ingreso en arabigo es: "+numara);
        }
    }