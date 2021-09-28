public class Cliente {
    private String nombre;
    private String apellido;
    private Integer numerocuenta;
    private Double saldo;

    Cliente(){}

    Cliente(String nombre, String apellido, Integer numerocuenta, Double saldo){
        setnombre(nombre); 
        setapellido(apellido);
        setnumerocuenta(numerocuenta);
        setsaldo(saldo); 
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public String getnombre(){
        return this.nombre;
    }

    public void setapellido(String apellido){
        this.apellido = apellido;
    }

    public String getapellido(){
        return this.apellido;
    }

    public void setsaldo(Double saldo){
        this.saldo = saldo;
    }

    public Double getsaldo(){
        return this.saldo;
    }

    public void setnumerocuenta(Integer numerocuenta){
        this.numerocuenta = numerocuenta;
    }

    public Integer getnumerocuenta(){
        return this.numerocuenta;
    }
}