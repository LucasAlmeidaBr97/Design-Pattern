public class FreteSedex implements FreteStrategy {

    @Override
    public double calcular(double peso) {
        return peso * 1.5;
    }

}
