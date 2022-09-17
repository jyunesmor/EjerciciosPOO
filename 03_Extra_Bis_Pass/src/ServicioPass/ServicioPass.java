package ServicioPass;

import Entidad.Pass;
import java.util.Scanner;

public class ServicioPass {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /* Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta.(10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.*/
    public void crearPass(Pass p) {
        System.out.println(" Ingrese su nueva contraseña ");
        System.out.println(" La misma debera ser de 10 caracteres, alfanumericos ");
        p.setPass(leer.next());
        while (p.getPass().length() != 10) {
            if (p.getPass().length() == 10) {
                p.setPass(p.getPass());
            } else {
                System.out.println(" La Contraseña ingresada no cumple con los requisitos asignados, ingresela nuevamente");
                p.setPass(leer.next());
            }
        }  // fin While

    } // Fin metodo CrearPass

    /* Crear un método para analizar la contraseña(analizarPass). Donde:
        o SI Existe al menos una letra z : Es nivel MEDIO
        o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
        o Si ninguna condición se cumple es nivel BAJO */
    public void analizarPass(Pass p) {
        int z = 0;
        int a = 0;
        for (int i = 0; i < p.getPass().length(); i++) {
            if (p.getPass().substring(i, i + 1).equalsIgnoreCase("z")) {
                z++;
            }
            if (p.getPass().substring(i, i + 1).equalsIgnoreCase("a")) {
                a++;
            }
        } // fin for
        System.out.println(a);
        System.out.println(z);
        if (z >= 1 && a >= 2) {
            System.out.println(" La Compraseña ingresada tiene un grado de Seguridad Alto".toUpperCase());
        } else if (z >= 1) {
            System.out.println(" La Compraseña ingresada tiene un grado de Seguridad Medio".toUpperCase());
        } else {
            System.out.println(" La Compraseña ingresada tiene un grado de Seguridad Bajo".toUpperCase());
        }

    } // Fin Metodo AnalizarPass

    /* Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.*/
    public void modificarNombre(Pass p) {
        String newpass;
        System.out.println(" ------------------- ");
        System.out.println(" Modificacion Nombre ");
        System.out.println(" ------------------- ");
        System.out.println(" Ingrese su contraseña actual para proceder a modificar ");
        newpass = leer.next();
        if (newpass.equalsIgnoreCase(p.getPass())) {
            System.out.println(" Ingrese el nombre a modificar ");
            p.setNombre(leer.next());
            System.out.println(" El nombre se actualizo correctamente");
        } else {
            System.out.println(" La Contraseña ingresada no es la correcta, ingresela nuevamente");
            newpass = leer.next();
        }
    }  // Fin metodo modificarNombre

    public void modificarDni(Pass p) {
        String newpass;
        System.out.println(" ---------------- ");
        System.out.println(" Modificacion DNI ");
        System.out.println(" ---------------- ");
        System.out.println(" Ingrese su contraseña actual para proceder a modificar ");
        newpass = leer.next();
        if (newpass.equalsIgnoreCase(p.getPass())) {
            System.out.println(" Ingrese el DNI a nuevo ");
            p.setDni(leer.nextInt());
            System.out.println(" El DNI se actualizo correctamente");
        } else {
            System.out.println(" La Contraseña ingresada no es la correcta, ingresela nuevamente");
            newpass = leer.next();
        }
    }  // Fin metodo modificarDNI

    public void modificarPass(Pass p) {
        String newpass;
        System.out.println(" ----------------------- ");
        System.out.println(" Modificacion Contraseña ");
        System.out.println(" ----------------------- ");
        System.out.println(" Ingrese su contraseña actual para proceder a modificar ");
        newpass = leer.next();
        if (newpass.equalsIgnoreCase(p.getPass())) {
            System.out.println(" Ingrese su nueva contraseña, recuerde debe ser de 10 caracteres");
            p.setPass(leer.next());
            System.out.println(" La Contraseña se actualizo correctamente");
        } else {
            System.out.println(" La Contraseña ingresada no es la correcta, ingresela nuevamente");
            newpass = leer.next();
        }

    } // Fin metodo ModificarPass

    /*
A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
     */
    public void menuPass(Pass p) {
        boolean flag = false;

        System.out.println(" --------------------- ");
        System.out.println(" Menu Datos Personales ");
        System.out.println(" --------------------- ");

        do {

            System.out.println(" Que Opcion desea realizar ");
            System.out.println("");
            System.out.println(" 1. Generar Contraseña");
            System.out.println(" 2. Obtener Nivel de Seguridad");
            System.out.println(" 3. Modificar Contraseña");
            System.out.println(" 4. Modificar Nombre");
            System.out.println(" 5. Modificar DNI");
            System.out.println(" 6. Salir");
            System.out.println("");
            int opc1 = leer.nextInt();
           
           
            switch (opc1) {
                case 1:
                    crearPass(p);
                    break;
                case 2:
                    analizarPass(p);
                    break;
                case 3:
                    modificarPass(p);
                    break;
                case 4:
                    modificarNombre(p);
                    break;
                case 5:
                    modificarDni(p);
                    break;
                case 6:
                    System.out.println("Usted eligio salir del Menu ");
                    System.out.println("lo Confirma ? S/N ");
                    String letra = leer.next();
                    if (letra.equals("s") || letra.equals("S")) {
                        flag = true;
                        System.out.println("Salio correctamente".toUpperCase());
                    } else {
                        flag = false;
                    }
                    break;
                default:
                    System.out.println(" Ninguna Opcion es Valida, ingrese nuevamente");
            } 
        } while (flag == false); // Fin do

        System.out.println(toString());
    } // Fin metodo menuPass
} // Fin Class ServicioPass
