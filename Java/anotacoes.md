# Java

**Declaração de variáveis**
- Sintaxe: *<*tipo*>* *<*nome*>* = *<*valor inicial*>;*

Exemplos:
**int** idade = 25; **número**
**double** altura = 1.68; **(double, float para números decimais)**
**char** sexo = 'F'; **carectere unicode**

**Variáveis possuem**
- nome = idade, altura, sexo
- valor = 25, 1.68, 'F'
- tipo = int, double, char
- endereço = onde se localiza no RAM

## Tipos Primitivos
 - Tipos numéricos inteiros = **byte, short, int, long**
 - Tipos numéricos com ponto flutuante = **float, double**
 - Caractere Unicode = **char**
 - Valor verdade = **boolean**
 - strings = Cadeias de caracteres **palavras ou texto**
 
 ## Nomes de variáveis
 - Não começar com um dígito (use letras ou _)
 - Não pode ter espaços em branco
 - Não usar acentuação 
 - Usar o padrão CamelCase 
 - **Iniciar sempre com letra minúscula**
 
 ## Operações básicas de programação
 - Entrada de dados (leitura)
 - Processamento de dados (atribuição)
 - Saída de dados (escrita)
 
 ## Operadores em Java
-  Atribuição, aritméticos, relacionais e lógicos.

**Operadores de atribuição**
- Servem para atribuir valores a variáveis: 
- +=
- -=
- /=
- *=
- %=

**Operadores aritméticos**
- Servem para resolver operações aritméticas.
- Soma, multiplicação, mode (resto), subtração, divisão: + * % - /

**Operadores de incremento e decremento**
- Incrementam ou decrementam em 1 o valor da variável.
- ++ ou --

**Operadores de igualdade**
- Verificam se o valor ou o resultado da expressão lógica é igual ou diferente.
- == ou !=

**Operadores relacionais**
- Comparam duas variáveis.
- &gt; (maior que)
- &lt; (menor que)
- &gt;= (maior ou igual)
- &lt;= (menor ou igual)

**Operadores lógicos**
-  Permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.
- && (Somente será executado se as duas condições declaradas no **if** forem verdadeiras)
- || (Somente será executado caso **uma das duas condições** declaradas no **if** forem verdadeiras)

## Estruturas Condicionais
- Permite definir que um certo bloco de comandos somente será executado dependendo de uma condição.
- if (se)
- else (senão)

## Estruturas de Repetição
- Permite a repetição de um bloco de comandos enquanto uma condição for verdadeira.
- Do-while - Quando queremos que um código execute pelo menos uma vez, e posteriormente continue executando somente se uma condição for verdadeira, usamos o do-while.
- while - A diferença do while para o do-while é que o while não executa o primeiro comando sem verificar a condição, enquanto o do-while o faz.
- O **for** é uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.

## Entrada de dados em Java
- Atribui valores para uma variável usando o teclado.
- classe Scanner do pacote java.util
- import java.util.Scanner;
    Scanner ler = new Scanner(System.in);
         sc.close();
- Para inteiros: next.Int, para float: next.Float, para double: next.Double.

## Classes, objetos e construtores.
- **Classes** são modelos ou especificações que definem tipos de objetos. Na classe temos as Atribuições, métodos e o estado dos objetos.
- **Objetos** são ferramentas de comunicação entre o usuário e o seu programa, que apresenta um agrupamento de dados e métodos definidos na classe.
- **Construtores** são responsáveis por instanciar a classe que foi definida. Você pode chamar o construtor da própria classe a partir de um método estático.
