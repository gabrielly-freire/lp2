package aula03;

public class Program01 {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Preto", "Fiat", "Uno", 2010, 4, 10, 20000.0);

        System.out.println("Cor: " + carro.cor);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano de Fabricação: " + carro.anoDeFabricacao);
        System.out.println("Número de Portas: " + carro.numeroDePortas);
        System.out.println("Consumo de Combustível: " + carro.consumoDeCombustivel);
        System.out.println("Preço: " + carro.preco);

    }
}
