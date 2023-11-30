public class ejer50 extends base {
    
    public static void main (String[]args){

        String plaauto="";
        String dia= "";
        String ciudades= "";
        char ultdig= '?';
        char diachar='?';
        
        screen.println("ingrese la placa de un auto");
        plaauto=keyboard.nextLine();
        screen.println("ingrese el nombre del dia que quiere averiguar sobre pico y placa: ");
        dia= keyboard.nextLine();
        ultdig=plaauto.charAt(5);

        if (dia.equalsIgnoreCase("lunes"))
        diachar='L';
        else if (dia.equalsIgnoreCase("martes"))
        diachar='M';
        else if (dia.equalsIgnoreCase("miercoles"))
        diachar='X';
        else if (dia.equalsIgnoreCase("jueves"))
        diachar='J';
        else if (dia.equalsIgnoreCase("viernes"))
        diachar='V';

        if ((diachar == 'L' && (ultdig == '0' || ultdig == '1'))||
            (diachar == 'M' && (ultdig == '2' || ultdig == '3'))||
            (diachar == 'X' && (ultdig == '4' || ultdig == '5'))||
            (diachar == 'J' && (ultdig == '6' || ultdig == '7'))||
            (diachar == 'V' && (ultdig == '2' || ultdig == '3'))
        )
        {
        ciudades += "Manizales";
        }

        if ((diachar == 'L' && (ultdig == '0' || ultdig == '9' )) ||
            (diachar == 'M' && (ultdig == '1' || ultdig == '8' )) ||
            (diachar == 'X' && (ultdig == '2' || ultdig == '7' )) ||
            (diachar == 'J' && (ultdig == '3' || ultdig == '6' )) ||
            (diachar == 'V' && (ultdig == '4' || ultdig == '5' )) 
        )
        
        {
            ciudades += "Pereira";
        }

        if ((diachar == 'L' && (ultdig == '8' || ultdig == '9' )) ||
            (diachar == 'M' && (ultdig == '6' || ultdig == '7' )) ||
            (diachar == 'X' && (ultdig == '4' || ultdig == '5' )) ||
            (diachar == 'J' && (ultdig == '2' || ultdig == '3' )) ||
            (diachar == 'V' && (ultdig == '0' || ultdig == '1' )) 
        )

        {
            ciudades += "Medellin";
        }

        if ((diachar == 'L' && (ultdig == '1' || ultdig == '2' )) ||
            (diachar == 'M' && (ultdig == '3' || ultdig == '4' )) ||
            (diachar == 'X' && (ultdig == '5' || ultdig == '6' )) ||
            (diachar == 'J' && (ultdig == '7' || ultdig == '8' )) ||
            (diachar == 'V' && (ultdig == '9' || ultdig == '0' )) 
        )

        {
            ciudades += "Barranquilla";
        }

        if ((diachar == 'L' && (ultdig == '8' || ultdig == '9' )) ||
            (diachar == 'M' && (ultdig == '0' || ultdig == '1' )) ||
            (diachar == 'X' && (ultdig == '2' || ultdig == '3' )) ||
            (diachar == 'J' && (ultdig == '4' || ultdig == '5' )) ||
            (diachar == 'V' && (ultdig == '6' || ultdig == '7' )) 
        )

        {
            ciudades += "Armenia";
        }

        if ((diachar == 'L' && (ultdig == '2' || ultdig == '7' )) ||
            (diachar == 'M' && (ultdig == '3' || ultdig == '8' )) ||
            (diachar == 'X' && (ultdig == '4' || ultdig == '9' )) ||
            (diachar == 'J' && (ultdig == '0' || ultdig == '5' )) ||
            (diachar == 'V' && (ultdig == '1' || ultdig == '6' )) 
        )

        {
            ciudades += "Bogota";
        }

        if ((diachar == 'L' && (ultdig == '3' || ultdig == '4' )) ||
            (diachar == 'M' && (ultdig == '5' || ultdig == '6' )) ||
            (diachar == 'X' && (ultdig == '7' || ultdig == '8' )) ||
            (diachar == 'J' && (ultdig == '9' || ultdig == '0' )) ||
            (diachar == 'V' && (ultdig == '1' || ultdig == '2' )) 
        )

        {
            ciudades += "Bucaramanga";
        }

        if ((diachar == 'L' && (ultdig == '1' || ultdig == '6' )) ||
            (diachar == 'M' && (ultdig == '2' || ultdig == '7' )) ||
            (diachar == 'X' && (ultdig == '3' || ultdig == '8' )) ||
            (diachar == 'J' && (ultdig == '4' || ultdig == '9' )) ||
            (diachar == 'V' && (ultdig == '0' || ultdig == '5' )) 
        )

        {
            ciudades += "Cartagena";
        }

        screen.println("Las ciudades en las que usted no puede circulas son: "+ciudades);
    }
}