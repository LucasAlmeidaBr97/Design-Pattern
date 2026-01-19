public class FreteFedex implements FreteStrategy {

    @Override
    public double calcular(double peso) {
        return peso * 2.0;
    }

}
