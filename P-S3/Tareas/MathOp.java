//https://oregoom.com/java/math/
//https://www.w3schools.com/java/java_math.asp

// Math es una clase que tiene métodos estáticos para hacer operac. matemáticas
public class MathOp {
    public static void main(String[] args) {
        //CONSTANTES
        double pi = Math.PI;
        double e = Math.E;

        //OPERACIONES
        Math.abs(-5); // valor absoluto-> Math.abs(valor)
        Math.max(10, 20); // ve cual es el mas grande-> Math.max(val1,val2)
        Math.min(10, 20); // ve cual es el mas chico-> Math.min(val1,val2)

        //--exponentes
        Math.pow(2, 3);  // potencia-> Math.pow(base, exp)
        Math.sqrt(16); // raíz cuadrada
        Math.cbrt(27); // raíz cúbica

        //--func. trigonometricas sen,cos,tan
        Math.sin(Math.PI/2); // seno-> Math.sin(grados en radianes)
        Math.cos(0); // coseno-> Math.cos(grados en radianes)
        Math.tan(Math.PI/4);  // tangente-> Math.tan(grados en radianes)

        //redndear
        Math.round(3.6); // redondeo normal: .0 - .4 baja, .5 -.9 sube --> Math.round(numDecimal)
        Math.floor(3.8); // redondeo hacia abajo siempre --> Math.floor(numDecimal)

        //numero aleatorio
        Math.random(); // genera un numero aleatorio entre 0.0 y 1.0 (decimales)
        //es mas facil la biblioteca Random 

    }
}
