# Factory Method Pattern - Shipping Strategy Example

Este repositório contém um projeto Java simples que demonstra o **padrão de design Factory Method**, combinado com o **padrão Strategy**, especificamente para gerenciar diferentes estratégias de cálculo de frete (`FreteStrategy`).

**Propósito:** Este projeto é primariamente para meu estudo pessoal e aprofundamento na compreensão de padrões de design. Não é destinado a ser uma aplicação pronta para produção ou uma peça de portfólio.

## Padrões de Design Implementados

*   **Simple Factory (ou uma variação do Factory Method):** A classe `FreteFactory` atua como uma fábrica para criar instâncias de `FreteStrategy` com base em um tipo fornecido (por exemplo, "SEDEX", "FEDEX"). Isso centraliza a criação de objetos e desacopla o cliente das implementações concretas das estratégias.
*   **Strategy Pattern:** A interface `FreteStrategy` (e suas implementações concretas como `FreteSedex`, `FreteFedex`) define uma família de algoritmos (métodos de cálculo de frete) que podem ser intertrocados.

## Como Funciona

A classe `FreteFactory` mantém um mapa das implementações de `FreteStrategy` disponíveis. Quando o método `getEstrategias(String tipo)` é chamado, ele procura a estratégia correspondente. Se encontrada, retorna a estratégia; caso contrário, lança uma `IllegalArgumentException`.

## Exemplo de Uso (Conceitual)

Para usar a fábrica, você faria algo parecido com isto:

```java
// Assumindo que FreteStrategy, FreteSedex, FreteFedex e FreteFactory estão definidos.
// Você teria uma interface como:
// public interface FreteStrategy {
//     double calcularFrete(double peso, double distancia);
// }

// E implementações concretas:
// public class FreteSedex implements FreteStrategy {
//     @Override
//     public double calcularFrete(double peso, double distancia) {
//         // Lógica para SEDEX
//         return peso * 0.5 + distancia * 0.1;
//     }
// }

// public class FreteFedex implements FreteStrategy {
//     @Override
//     public double calcularFrete(double peso, double distancia) {
//         // Lógica para FEDEX
//         return peso * 0.6 + distancia * 0.15;
//     }
// }

public class Main {
    public static void main(String[] args) {
        try {
            FreteStrategy sedexStrategy = FreteFactory.getEstrategias("SEDEX");
            double custoSedex = sedexStrategy.calcularFrete(10.0, 100.0);
            System.out.println("Custo SEDEX: " + custoSedex);

            FreteStrategy fedexStrategy = FreteFactory.getEstrategias("FEDEX");
            double custoFedex = fedexStrategy.calcularFrete(10.0, 100.0);
            System.out.println("Custo FEDEX: " + custoFedex);

            // Isso lançará uma IllegalArgumentException
            FreteStrategy invalidStrategy = FreteFactory.getEstrategias("DHL");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
```

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
