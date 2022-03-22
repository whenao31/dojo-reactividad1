package app.calculo;

public class Funcion {
   public Integer a;
   public String variable;
   public Integer grado;

   public Funcion(Integer a, Integer grado){
       this.a=a;
       this.variable = "x";
       this.grado = grado;
   }

    @Override
    public String toString() {
        return this.a+this.variable+"^"+this.grado;
    }
}
