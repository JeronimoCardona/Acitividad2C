public class ejer52 extends base {
    
    public static void main(String[] args) {
        String resul = "";
        String NombreJ1 = "";
        String NombreJ2 = "";
        String NombreJ3 = "";
        String NombreJ4 = "";
        String NombreJ5 = "";
        String NombreJ6 = "";
        String NombreJ7 = "";
        String NombreJ8 = "";
        String GanadorP1 = "";
        String GanadorP2 = "";
        String GanadorP3 = "";
        String GanadorP4 = "";
        String GanadorP5 = "";
        String GanadorP6 = "";
        String GanadorP7 = "";
        String GanadorP8 = "";
        System.out.println("ingrese el nombre de la primera jugadora de tennis: ");
        NombreJ1 = keyboard.nextLine();
        System.out.println("ingrese el nombre de la segunda jugadora de tennis: ");
        NombreJ2 = keyboard.nextLine();
        System.out.println("ingrese el nombre de la tercera jugadora de tennis: ");
        NombreJ3 = keyboard.nextLine();
        System.out.println("ingrese el nombre de la cuarta jugadora de tennis: ");
        NombreJ4 = keyboard.nextLine();
        System.out.println("ingrese el nombre de la quinta jugadora de tennis: ");
        NombreJ5 = keyboard.nextLine();
        System.out.println("ingrese el nombre de la sexta jugadora de tennis: ");
        NombreJ6 = keyboard.nextLine();
        System.out.println("ingrese el nombre de la septima jugadora de tennis: ");
        NombreJ7 = keyboard.nextLine();
        System.out.println("ingrese el nombre de la octava jugadora de tennis: ");
        NombreJ8 = keyboard.nextLine();
        System.out.println("partido #1: jugadora: "+ NombreJ1 + "VS" + NombreJ8);
        System.out.println("ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();
        
        if (resul.equals(2-0) || resul.equals("2-1"))  {
            GanadorP1 = NombreJ1;
            System.out.println("la ganadora es: " + GanadorP1);
        } else {
            GanadorP1 = NombreJ8;
            System.out.println("la ganadora es: " + GanadorP1);
        }

        System.out.println("partido #2: jugadora: "+ NombreJ4 + "VS" + NombreJ5);
        System.out.println("ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();
        
        if (resul.equals(2-0) || resul.equals("2-1"))  {
            GanadorP2 = NombreJ4;
            System.out.println("la ganadora es: " + GanadorP2);
        } else {
            GanadorP2 = NombreJ5;
            System.out.println("la ganadora es: " + GanadorP2);
        }

        System.out.println("partido #3: jugadora: "+ NombreJ6 + "VS" + NombreJ3);
        System.out.println("ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();

        if (resul.equals(2-0) || resul.equals("2-1"))  {
            GanadorP3 = NombreJ6;
            System.out.println("la ganadora es: " + GanadorP3);
        } else {
            GanadorP3 = NombreJ3;
            System.out.println("la ganadora es: " + GanadorP3);
        }

        System.out.println("partido #4: jugadora: "+ NombreJ7 + "VS" + NombreJ2);
        System.out.println("ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();

        if (resul.equals(2-0) || resul.equals("2-1"))  {
            GanadorP4 = NombreJ7;
            System.out.println("la ganadora es: " + GanadorP1);
        } else {
            GanadorP4 = NombreJ2;
            System.out.println("la ganadora es: " + GanadorP1);
        }

        System.out.println("la semifinal sera: jugadora: " + GanadorP1 + " VS " + GanadorP2);
        System.out.println("ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();

        if (resul.equals(2-0) || resul.equals("2-1"))  {
            GanadorP5 = NombreJ1;
            System.out.println("la ganadora es: " + GanadorP5);
        } else {
            GanadorP5 = NombreJ2;
            System.out.println("la ganadora es: " + GanadorP5);
        }

        System.out.println("la semifinal sera: jugadora: " + GanadorP3 + " VS " + GanadorP4);
        System.out.println("ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();

        if (resul.equals(2-0) || resul.equals("2-1"))  {
            GanadorP6 = NombreJ3;
            System.out.println("la ganadora es: " + GanadorP6);
        } else {
            GanadorP6 = NombreJ4;
            System.out.println("la ganadora es: " + GanadorP6);
        }

        System.out.println("la semifinal sera: jugadora: " + GanadorP5 + " VS " + GanadorP6);
        System.out.println("ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();

        if (resul.equals(2-0) || resul.equals("2-1"))  {
            GanadorP7 = NombreJ5;
            System.out.println("la ganadora es: " + GanadorP7 + "y es la campeona");
        } else {
            GanadorP7 = NombreJ6;
            System.out.println("la ganadora es: "  + GanadorP7 + "y es la campeona");
        }
    }
}