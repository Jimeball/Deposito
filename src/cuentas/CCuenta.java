package cuentas;

/**
 *
 * Esta clase es la cuenta bancaria del cliente
 * @author JaviJi
 * @version 1.0
 *
 */

public class CCuenta {
    /**
     * Atributos
     */

    private String nombre, cuenta;
    private double saldo, tipoInteres;
    
    /**
     * Constructor vacío
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con los parámetros
     * @param nom String , nombre del titular
     * @param cue String,número de la cuenta
     * @param sal double, saldo de la cuenta bancaria
     * @param tipo  double, Es el tipo de interés
     */


    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * 
     * @return el saldo de la cuenta
     */

    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * 
     * @param cantidad a infgresar en la cuenta
     * @throws Exception  Devuelve mensaje en caso de ingreso negativo
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * 
     * @param cantidad a retirar de la cuenta
     * @throws Exception Devuelve mensaje si la cantidad es negativa o mayor del saldo
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return el nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre del titular para pasar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta número de cuenta para pasar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo para pasar como parámetro
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipo de interés
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres para pasar como parámetro
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}

