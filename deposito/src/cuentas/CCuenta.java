/**
 *  Se introduce comentario JavaDoc para la pr�ctica ED04
 *  
 *  @author Pablo Carbonell
 * 
 * 
 * 
 * */


package cuentas;

/**
 * 
 * En primer lugar se establecen m�todos getters y setters para poder trabajar con los atributos de la clase
 * @author pcflo
 *
 */
 
 public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInter�s
     */
    public double getTipoInter�s() {
        return tipoInter�s;
    }

    /**
     * @param tipoInter�s the tipoInter�s to set
     */
    public void setTipoInter�s(double tipoInter�s) {
        this.tipoInter�s = tipoInter�s;
    }

/**
 * 
 * Posteriormente se definen los atributos de clase con modificador de acceso private, para encapsulaci�n de atributos y obligar a utilizar getters y setters para trabajar con ellos
 * 
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInter�s;

 /**
  * 
  * M�todos constructores de la clase CCuenta
  */
    
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * Definici�n de m�todos de clase
     * 
     */
    
    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
