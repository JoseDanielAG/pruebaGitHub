
package cuentas;

public class CCuenta {
    
    private String cliente;
 private String cuenta;
 private double saldo;
 private double tipoInter�s;
 public CCuenta()
 {
 }
 public CCuenta(String nom, String cue, double sal, double tipo)
 {
 cliente =nom;
 cuenta=cue;
 saldo=sal;
 }
 
 public double estado()
 {
 return getSaldo();
 }
 public void retirar(double cantidad) 
 {try {
 System.out.println("Retiro en cuenta:" + cantidad);
 if (cantidad <= 0)
 throw new Exception ("No se puede retirar una cantidad negativa");
 if (estado()< cantidad)
 throw new Exception ("No se hay suficiente saldo");
            setSaldo(getSaldo() - cantidad);
 } catch (Exception e) {
 System.out.println(e);
 }
 }
 public void ingresar(double cantidad) 
 {try {
 System.out.println("Ingreso en cuenta:" + cantidad);
 
 if (cantidad<0)
 throw new Exception("No se puede ingresar una cantidad negativa");
            setSaldo(getSaldo() + cantidad);
 } catch (Exception e) {
 System.out.println(e);
 }
 }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return cliente;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.cliente = nombre;
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
}
