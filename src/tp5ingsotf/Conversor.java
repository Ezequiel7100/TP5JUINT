
package tp5ingsotf;


public class Conversor {
     // Método para convertir una moneda a otra
    public double convertir(double monto, double tasaCambio) {
        return monto * tasaCambio;
    }

    // Método para calcular cotización
    public double cotizacion(double montoEnOtraMoneda, double montoLocal) {
    if (montoLocal == 0) {
        throw new ArithmeticException("No se puede dividir por cero");
    }
    return montoEnOtraMoneda / montoLocal;
}

    // Método para aumentar saldos
    public double aumentarSaldo(double saldo, double montoComprado) {
        return saldo + montoComprado;
    }

    // Método para retirar dólares físicos en billetes de 100
    public double retirarDolarFisico(double saldo, double montoARetirar) {
        if (montoARetirar % 100 != 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser múltiplo de 100");
        }
        return saldo - montoARetirar;
    }
}
