package app.calculo;

public class Calculo {
    static final IDerivar calcularD = f -> (f.grado*f.a)+f.variable+"^"+(f.grado-1);
    static final IIntegrar calcularI = f -> "("+f.a.toString() +f.variable + "^"+ (f.grado+1) + ")/"+f.a ;

    static final IDerivarInversa calcularDerInv = f -> calcularI.Integrar(f);
    static final IIntegrarInversa calcularIntInv = f -> calcularD.Derivar(f);

    public static void main(String[] args) {
        Funcion f1= new Funcion(2,2); //2x^2
        System.out.println("Función: "+f1);
        System.out.println("Derivada: "+calcularD.Derivar(f1));
        System.out.println("Integral: "+calcularI.Integrar(f1));
        System.out.println("Derivada inversa: "+calcularDerInv.DerivarInversa(f1));
        System.out.println("Integral inversa: "+calcularIntInv.IntegrarInversa(f1));
    }
}
