package cuentas;
/**
 * @author Hugo José Góngora Lozano
 * 
 * @version v0.1 
 * @since 03/03/2024
 *  * 
 */
//Método main
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        //Creamos una instancia de CCuenta e ingresamos los valores
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        //Usamos el m
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 1);
    }

	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        /** @exception Recoge los errores de operación al retirar o ingresar
         *  @see CCuenta 
         * **/
	}
}
