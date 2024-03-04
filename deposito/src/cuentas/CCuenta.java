package cuentas;
/**
 * @author Hugo José Góngora Lozano
 * 
 * @version v0.1 
 * @since 03/03/2024
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /** nombre: Es el nombre del cliente.
     *  cuenta: Número de cuenta.
     *  saldo: Cantidad de dinero en cuenta (euros).
     *  tipoInterés: Tipo de interés aplicado en la cuenta
     * */

	public String getNombre() {  
		return nombre;
		/**@return Devuelve nombre del cliente*/
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		/**@param nombre. Establece nombre de cliente*/
	}

	public String getCuenta() {
		return cuenta;
		/**@return Devuelve número de cuenta*/
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
		/**@param cuenta. Establece número de cuenta*/
	}

	public double getSaldo() {
		return saldo;
		/**@return Devuelve saldo en cuenta*/
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
		/**@param saldo. Establece saldo de cuenta*/
	}

	public double getTipoInterés() {
		return tipoInterés;
		/**@return Devuelve tipo de interés de cuenta*/
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
		/**@param tipoInterés. Establece saldo de cuenta
		 * NO SE ACONSEJA USAR NOMBRES CON TILDES*/
	}

	public CCuenta()
    {
		/**@return Constructor vacío*/
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        /**@return Constructor con parámetros*/
    }

    public double estado()
    {
        return saldo;
        /**@return Devuelve saldo de cuenta. Duplicado con método getSaldo
         * @see getSaldo */
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
        /**@return suma cantidad al saldo
         * @throws arroja un error si la cantidad es negativa */ 
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
        /**@return resta cantidad al saldo
         * @throws arroja un error si la cantidad es negativa 
         * o si se intenta retirar más saldo del disponible */ 
    }
}
