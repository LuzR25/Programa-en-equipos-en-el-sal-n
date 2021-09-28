import java.util.Scanner;

public class VistaCliente {
   
    private Scanner lectura;

    public Integer Menu(){

        lectura = new Scanner(System.in);

        System.out.println("\n=MENÚ=");
        System.out.println("\n[1] Agregar cliente.");
        System.out.println("[2] Realizar depósito.");
        System.out.println("[3] Realizar retiro.");
        System.out.println("[4] Realizar transferencia.");
        System.out.println("[5] Búsqueda de cliente a través de su cuenta.");
        System.out.println("[6] Desplegar lista de clientes.");
        System.out.println("[7] Salir.");
        System.out.println("\nOpción: ");

        return lectura.nextInt();
    }

    public String ingresarNombre(){ // Ingresar nombre.
        System.out.println("\n=Agregar cliente=");
        System.out.print("Ingrese el nombre(s) del cliente: ");        
        return lectura.next();
    }

    public String ingresarApellido(){ // Ingresar apellido.

        System.out.print("\nIngrese el apellido del cliente: ");

        return lectura.next();
    }

    public Double ingresarSaldo(){ // Ingresar saldo.

        System.out.print("\nIngrese el saldo del cliente: ");

        return lectura.nextDouble();
    }

    public Integer ingresarNumeroC(){ // Ingresar apellido.

        System.out.print("\nIngrese el número de cuenta del cliente: ");

        return lectura.nextInt();
    }
    
    public Double hacerDeposito(){ //Realizar depósito.
        System.out.println("\n=Realizar depósito=");
        System.out.println("Ingrese la cantidad que desee depositar en su cuenta: ");

        return lectura.nextDouble();
    }

    public Double realizarRetiro(){ //Realizar retiro.
        System.out.println("\n=Realizar retiro=");
        System.out.println("Ingrese la cantidad que desee retirar de su cuenta: ");

        return lectura.nextDouble();
    }

    public Integer buscarCuenta(){
        System.out.println("\n=Encontrar al cliente por su número de cuenta=");
        System.out.println("Escriba el número de cuenta: ");
        
        return lectura.nextInt();
    }

    public Double realizarTrans(){
        System.out.println("\n=Realizar transferencia=");
        System.out.println("Ingrese la cantidad que desee transferir: ");

        return lectura.nextDouble();
    }

    public Integer buscarCuentaTrans(){
        System.out.println("\nDeseo transferir a la cuenta...");
        System.out.println("Escriba el número de cuenta: ");
        
        return lectura.nextInt();
    }

    public void imprimirInformacion(Cliente cliente){
        System.out.println("\n\n.:| Cliente con número de cuenta " + cliente.getnumerocuenta() + " |:.");
        System.out.println("Nombre: " + cliente.getnombre());
        System.out.println("Apellido: " + cliente.getapellido());
        System.out.println("Saldo: $" + cliente.getsaldo());
    }

    public void QuierosaberRetirar(Integer Saber){
        if(Saber==1){
            System.out.println("\n\nOperación exitosa.");
        }else{
            System.out.println("\n\nLa cantidad a retirar es mayor al saldo disponible en la cuenta.");
        }
    }

    public void QuierosaberTrans(Integer Saber){
        if(Saber==1){
            System.out.println("\n\nOperación exitosa.");
        }else{
            System.out.println("\n\nLa cantidad a depositar es mayor al saldo disponible en la cuenta.");
        }
    }

    public void Lista(){
        System.out.println("\n\n=Lista de clientes=");
    }
}
