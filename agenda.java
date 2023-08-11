import javax.swing.*;



public class agenda {


    /*public static void ingresoContaco(int cantidadDeContactos){
        int continuar;
        do{
            String nombre,correo;
            int numeroDeTelefono;
            contacto informacionContacto[]=new contacto[cantidadDeContactos];
            for(int i=0;i<cantidadDeContactos;i++){
                nombre=JOptionPane.showInputDialog("nombre de contacto");
                correo=JOptionPane.showInputDialog("ingrese el correo");
                numeroDeTelefono=Integer.parseInt(JOptionPane.showInputDialog("dijite el numero de telefono"));
                informacionContacto[i]=new contacto(nombre,correo,numeroDeTelefono);
            }

            continuar=Integer.parseInt(JOptionPane.showInputDialog
                    ("Desea hacer otra accion 1-agregar mas contactos 2-mostrar lista de contactos 3-buscar contacto 4-finalizar programa"));
            if(continuar==2){
                mostrarContacto(informacionContacto,cantidadDeContactos);
            }else if(continuar==3){
                buscarContacto(informacionContacto,cantidadDeContactos);
            }

        }while(continuar==1);
    }*/
    public static void mostrarContacto(contacto informacion[],int cantidad){
        for(int i=0; i<cantidad;i++){
            System.out.println(informacion[i].nombre);
            System.out.println(informacion[i].correo);
            System.out.println(informacion[i].numeroTelefono);
        }

    }

    public static void buscarContacto(contacto informacionContacto[], int cantidadContactos){
        int eleccionDeBusqueda=Integer.parseInt(JOptionPane.showInputDialog("como desea buscar el contacto 1-nombre 2-correo 3-numero de telefono"));
        switch (eleccionDeBusqueda){
            case 1:
                String nombreContactoBuscado=JOptionPane.showInputDialog("ingrese el nombre de su contacto");
                for(int i=0;i<cantidadContactos;i++){
                    if(informacionContacto[i].nombre.equals(nombreContactoBuscado)){
                        System.out.println("esta es toda la informacion del contacto");
                        System.out.println(informacionContacto[i].nombre);
                        System.out.println(informacionContacto[i].correo);
                        System.out.println(informacionContacto[i].numeroTelefono);
                    }else{
                        System.out.println("no se a encontrado ese contacto");
                    }
                }
            break;
            case 2:
                String correoBuscado=JOptionPane.showInputDialog("ingrese el correo que busca");
                for(int i=0;i<cantidadContactos;i++){
                    if(informacionContacto[i].correo.equals(correoBuscado)){
                        System.out.println("esta es toda la informacion del contacto");
                        System.out.println(informacionContacto[i].nombre);
                        System.out.println(informacionContacto[i].correo);
                        System.out.println(informacionContacto[i].numeroTelefono);
                    }else{
                        System.out.println("no se a encontrado ese contacto");
                    }
                }
            break;
            case 3:
                int numeroBuscado=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de su contacto"));
                for(int i=0;i<cantidadContactos;i++){
                    if(informacionContacto[i].numeroTelefono==numeroBuscado){
                        System.out.println("esta es toda la informacion del contacto");
                        System.out.println(informacionContacto[i].nombre);
                        System.out.println(informacionContacto[i].correo);
                        System.out.println(informacionContacto[i].numeroTelefono);
                    }else{
                        System.out.println("no se a encontrado ese contacto");
                    }
                }
            break;
        }
    }


    public static void main(String[] args) {
        /*crea una clase llamada contactos que represente un contacto en una agenda. Cada contacto debe tener un nombre, un numero de telefono y un correo
         * luego, crea una clase llamada agenda que contenga un array de objetos de tipo contacto. el programa debe permtir al usuario agregar nuevos contactos,
         * mostrar la lista de contactos y buscar un contacto por su nombre. ademas, cuando se muestra la lista de contactos, se debe mostrar todos los detalles
         * de cada contacto (nombre, numero, correo)*/


        int cantidadDeContactos=Integer.parseInt(JOptionPane.showInputDialog("cuantos contactos desea ingresar"));
        int continuar;
        do{
            String nombre,correo;
            int numeroDeTelefono;
            contacto informacionContacto[]=new contacto[cantidadDeContactos];
            for(int i=0;i<cantidadDeContactos;i++){
                nombre=JOptionPane.showInputDialog("nombre de contacto");
                correo=JOptionPane.showInputDialog("ingrese el correo");
                numeroDeTelefono=Integer.parseInt(JOptionPane.showInputDialog("dijite el numero de telefono"));
                informacionContacto[i]=new contacto(nombre,correo,numeroDeTelefono);
            }

            continuar=Integer.parseInt(JOptionPane.showInputDialog
                    ("Desea hacer otra accion 1-agregar mas contactos 2-mostrar lista de contactos 3-buscar contacto 4-finalizar programa"));
            if(continuar==2){
                mostrarContacto(informacionContacto,cantidadDeContactos);
            }else if(continuar==3){
                buscarContacto(informacionContacto,cantidadDeContactos);
            }

        }while(continuar==1);




    }
}
