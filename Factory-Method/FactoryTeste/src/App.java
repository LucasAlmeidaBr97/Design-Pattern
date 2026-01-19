public class App {
    public static void main(String[] args) throws Exception {
        String tipoDesejado = "SEDEX";

        FreteStrategy frete = FreteFactory.getEstrategias(tipoDesejado);

        double valor = frete.calcular(10.0);
        System.out.println("Valor do frete " + valor);
    }
}
