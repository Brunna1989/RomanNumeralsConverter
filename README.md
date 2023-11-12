# Conversor de Números Romanos

Este é um simples programa em Java para conversão entre números romanos e inteiros, utilizando duas funções principais em uma classe chamada `ConvertRomanNumbers`.

## Estrutura do Projeto

O projeto é dividido em duas classes principais:

### ConvertRomanNumbers (Pacote: model)

A classe `ConvertRomanNumbers` contém métodos para converter números romanos para inteiros (`romanToInt`) e inteiros para números romanos (`intToRoman`). Ela utiliza dois HashMaps para mapear caracteres romanos para inteiros e inteiros para caracteres romanos.

#### Métodos

- `romanToInt(String romanNum)`: Converte um número romano em inteiro.
- `intToRoman(Integer num)`: Converte um número inteiro em romano.

### App (Pacote: main)

A classe `App` contém o método `main` e serve como ponto de entrada para o programa. Ela instancia a classe `ConvertRomanNumbers` e demonstra a conversão entre números romanos e inteiros.

## Como Usar

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    cd seu-repositorio
    ```

2. Compile e execute o programa:

    ```bash
    javac main/App.java
    java main.App
    ```

## Exemplos de Uso

```java
ConvertRomanNumbers num = new ConvertRomanNumbers();
System.out.println(num.romanToInt("VII")); // Saída: 7
System.out.println(num.romanToInt("XVII")); // Saída: 17
System.out.println(num.intToRoman(8)); // Saída: VIII
System.out.println(num.intToRoman(15)); // Saída: XV

