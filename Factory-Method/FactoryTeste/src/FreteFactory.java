import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FreteFactory {

    private static final Map<String, FreteStrategy> estrategias = new HashMap<>();

    static {
        estrategias.put("SEDEX", new FreteSedex());
        estrategias.put("FEDEX", new FreteFedex());
    }

    public static FreteStrategy getEstrategias(String tipo) {
        return Optional.ofNullable(estrategias.get(tipo.toUpperCase()))
                .orElseThrow(() -> new IllegalArgumentException("Tipo de frete inválido"));
    }

}
