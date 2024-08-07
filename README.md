# DIO | Java Basico
Estudo basico Java para alinhar os conhecimentos e relembrar boas praticas

## Sintaxe:

### Padrao de nomenclatura:
- O nome da classe segue a convensao de ser declarada em PascalCase (primeira letra de cada palavra em maiusculo)
    - Para que o projeto seja inicializado, a classe principal deve conter o metodo main seguindo o padrao

        ```
        public static void main(String [] args) {
        }
        ```
- **Arquivos .java**: todo arquivo .java deve começar com letra MAIUSCULA seguindo o padrao PascalCase;
    - O nome do metodo principal deve ser igual ao nome do arquivo
- **Nome de variavel**: Deve seguir o padrao camelCase
- **Constantes**: Constantes são convencionalmente declaradas com todas as letras maiusculas do tipo 

    ```
    int PI =3.14;
    ou
    String MENSAGEM_PADRAO = "Mensagem";
    ```
- **Metodos**: Metodos (funcoes ou procedures) sao declaradas no convensao utilizando *`TipoRetorno nomeObjetivoNoInfinitivo (tipoParametro parametro(s))`*
    - Ex:
        ```
        int somar (int numeroUm, int numeroDois)
        ou
        String formatarCep (long cep)
        ```

### Boas praticas de estrutura:
- **Identacao de codigo**: Geralmente usado quatro espacos entre niveis
- **Pacotes em projetos**: geralmente se separa a estrutura dos arquivos em estruturas chamadas packages, que nada mais sao que uma cascata de diretorios. Cada diretorio dentro do java fica separado com `.` devendo ser indicado dentro da classe o package a qual pertence.
    - No nosso caso, a package seria `estudo.javaDio.javaBasico` indicada no arquivo por `package estudo.javaDio.javaBasico;`
- Java Beans: sao convencoes da comundiade Java para facilitar a interpretacao do codigo
    - **Variaveis**: devem ter nomenclatura clara, no singular (exceto quando for um array ou colection), e escrita lingua previavamente definida e unica para todas as variaveis;
    - **Metodos**: sempre como verbos utilizando camelCase


### Tipos e Variaveis:
-  Tipos Primitivos: 
    - Nao sao considerados objetos
    - Armazenados diretamente na pilha de memoria (Memory stack)

    | Tipo | Memória | Valor Mínimo | Valor Máximo |
    | -----|---------|--------------|------------- |
    | byte | 1 byte | -128 | 127 |
    | short | 2 byte | -32.768 | 32.767 |
    | int | 4 bytes | -2.147.483.648 | 2.147.483.647|
    | long | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807|

- Tipos primitivos que podem conter partes fracionarias:

    | Tipo | Memória | Mínimo | Máximo | Precisão |
    | ------ | --------- | -------- | -------- | ---------- | 
    | float | 4 bytes | -3,4028E + 38 | 3,4028E + 38 | 6 – 7 dígitos | 
    | double | 8 bytes | -1,7976E + 308 | 1,7976E + 308 | 15 dígitos |

    - Declaração do float: `float valor = 3.5F;`
    - Casting: `short numeroCurto = (short) numeroInt;`
- Constantes: variavel declarada toda em caixa alta e com seguinte sintaxe:
    ```
    final double PI = 3.14;
    ```
### Operadores:
- Atribuição: `=`
- Aritméticos: 
    - `+` (adição), 
    - `-` (subtração), 
    - `*` (multiplicação) e 
    - `/` (divisão).
- Unários: 
    - `(+)` Operador unário de valor positivo: números são positivos sem esse operador explicitamente;
    - `(-)` Operador unário de valor negativo: nega um número ou expressão aritmética;
    - `(++)` Operador unário de incremento de valor: incrementa o valor em 1 unidade;
    - `(--)` Operador unário de decremento de valor: decrementa o valor em 1 unidade;
    - `(!)` Operador unário lógico de negação: nega o valor de uma expressão booleana.
- Ternário: expreção condicional utilizando os simbolos `?` e `:`. Veja:
    ```
    int a = 5
    int b = 6;
    String resultado;
    /*          | if |   | then       | else  |*/
    resultado = (a==b) ? "verdadeiro" : "false";

    System.out.println(resultado);
    ```
- Relacionais: 
    - `==`: Quando desejamos verificar se uma variável é IGUAL A outra.

    - `!=`: Quando desejamos verificar se uma variável é DIFERENTE da outra.

    - `>`: Quando desejamos verificar se uma variável é MAIOR QUE a outra.

    - `>=`: Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

    - `<`: Quando desejamos verificar se uma variável é MENOR QUE outra.

    - `<=`: Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

- Lógicos: 
    - `&&`: Operador Lógico "E".
    - `||`: Operador Lógico "OU".

## Metodos:
Uma classe eh definida por atibutos (caracteristicas da classe - variaveis) e metodos (funções de uma classe - ações)
### Criterios de nomeacao de metodos:
- Devem ser nomeados como verbo no infinitivo
- Seguir o padrao camelCase
### Criterios de definicao de metodos:
- Qual a proposta principal do metodo? Entender o objetivo de um metodo
- Qual o retorno esperado pelo metodo? Necessario entender qual a necessidade de retorno do metodo
- Quais parametros serao necessarios para executar o metodo? Quais variaveis precisa receber para que o metodo seja executado
- O metodo possui risco de apresentar alguma excecao? Metodos podem apresetnar excessoes e precisamos preve-las na chamada desse metodo
- Qual a visibilidade do metodo? O metedo sera vissicel para toda aplicacao, somente pacotes, atraves de heranca ou somente a nivel da propria class?

## Escopo:
- A depender do escopo de declaração, as variaveis, metodos ou classes declaradas dentro deste escopo se limitam a ela, ficando viziveis apenas dentro do escopo declarada

## Java Docs:
Documentação oficial JAVA
### Tags
Java Documentation é composto por tags que, representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme tabela abaixo:

| Tag | Descrição |
|-----|-----------|
| @autor | Autor / Criador |
| @version | Versão do recurso disponibilizado| 
| @since | Versão / Data de início da disponibilização do recurso|
| @param | Descrição dos parâmetros dos métodos criados|
| @return | Definição do tipo de retorno de um método |
| @throws| Se o método lança alguma exceção|

