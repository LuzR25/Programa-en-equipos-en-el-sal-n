import  java.util.ArrayList;

public class ControladorCliente {
    private ArrayList <Cliente> estList; 

    VistaCliente vista;

    ControladorCliente(VistaCliente vista){
        estList = new ArrayList<Cliente>();
        this.vista = vista;
    }

    public void agregarCliente(){ //Agregar cliente (NO OLVIDAR EL TRUCO).
        estList.add(0, new Cliente(vista.ingresarNombre(), vista.ingresarApellido(), vista.ingresarNumeroC(), vista.ingresarSaldo()));
    }

    public Cliente buscarCliente(Integer NumeroCuenta){
        for(int i=0; i<estList.size(); i++){
            if(NumeroCuenta==estList.get(i).getnumerocuenta()){
                return estList.get(i);
            }
        }

        return null;
    }

    public void Deposito(Double Cantidad, Cliente cliente){
        Double NuevoS;

        NuevoS = cliente.getsaldo()+ Cantidad;

        cliente.setsaldo(NuevoS);
        
    }

    public Integer Retiro(Cliente cliente){
        Double CRetiro, NuevoS;
        
        CRetiro = vista.realizarRetiro();
        
        if(cliente.getsaldo()<CRetiro){
            return 0;
        }else{
            NuevoS=cliente.getsaldo()-CRetiro;
            cliente.setsaldo(NuevoS);
            return 1;
        }
    }

    public Integer Transferencia(Cliente cliente1, Cliente cliente2){
        Double CTrans, NSaldo1, NSaldo2;
        
        CTrans = vista.realizarTrans();

        if(CTrans>cliente1.getsaldo()){
            return 0;
        }else{
            NSaldo1 = cliente1.getsaldo()-CTrans;
            cliente1.setsaldo(NSaldo1);

            NSaldo2 = cliente2.getsaldo()+CTrans;
            cliente2.setsaldo(NSaldo2);

            return 1;
        }
    }

    public void DesplegarLista(){
        for(int i=0; i<estList.size(); i++){
            vista.imprimirInformacion(estList.get(i));
        }
    }

    public void MenuCliente(){
        Integer Cierre=0;

        while(Cierre!=1){
            switch(vista.Menu()){
                case 1: agregarCliente();
                        break;

                case 2: Deposito(vista.hacerDeposito(), buscarCliente(vista.buscarCuenta()));
                        break;

                case 3: vista.QuierosaberRetirar(Retiro(buscarCliente(vista.buscarCuenta())));
                        break;

                case 4: vista.QuierosaberTrans(Transferencia(buscarCliente(vista.buscarCuenta()), buscarCliente(vista.buscarCuentaTrans())));
                        break;

                case 5: vista.imprimirInformacion(buscarCliente(vista.buscarCuenta())); 
                /* Imprimir la información del cliente encontrado por "buscarCliente" que supo qué buscar
                por la información obtenida de "buscarCuenta" en VistaCliente. */

                        break;

                case 6: vista.Lista();
                        DesplegarLista();
                        break;

                case 7: Cierre=1;
                        break;
            }
        }
    }

}
