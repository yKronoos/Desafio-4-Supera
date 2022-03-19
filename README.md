PRIMEIRO DESAFIO

Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
o seguinte critério:
• Primeiro os Pares
• Depois os Ímpares
Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
em ordem decrescente.
Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105) Este é o
número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada
uma delas, um valor inteiro não negativo.
Saída
Apresente todos os valores lidos na entrada segundo a ordem apresentada acima. Cada
número deve ser impresso em uma linha, conforme exemplo abaixo.

Exemplo de Entrada Exemplo de Saída

10
4
32
34
543
3456
654
567
87
6789
98

4
32
34
98
654
3456
6789
567
543
87

SEGUNDO DESAFIO

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor
monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor
pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas
possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
necessárias.
Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
conforme exemplo fornecido.
Exemplo de Entrada Exemplo de Saída

576.73 NOTAS:

5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01

Obs.: Utilize ponto (.) para separar a parte decimal.
TERCEIRO DESAFIO

Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
do array em que a sua diferença seja igual ao valor alvo.

Exemplo
K = 1
arr = [1,2,3,4]
Existem 3 valores cuja diferença é igual ao valor alvo K: 2-1 = 1, 3-2 = 1, 4-3 = 1.

Descrição do problema:
Os pares têm os seguintes parâmetros:
int k: Um Inteiro, valor alvo.
int arr[n]: Um array de Inteiros.

Retorno
int: O número de pares que satisfazem o critério.

Formatos de Entrada
Seu código deve conter duas entradas n e k, que representam o tamanho do array e o valor
alvo.
Seu código deve conter um array de inteiros, de tamanho n.

Exemplos de entrada

STDIN Function
----- --------
5 2 arr[] tamanho n = 5, k =2
1 5 3 4 2 arr = [1, 5, 3, 4, 2]

Exemplo de saida
3

QUARTO DESAFIO

A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. Depois
de olhar para várias páginas impressas por um tempo, você percebe que ele está
imprimindo cada linha de dentro para fora. Em outras palavras, a metade esquerda de cada
linha está sendo impressa a partir do meio da página até a margem esquerda. Do mesmo
modo, a metade direita de cada linha está sendo impressa à partir da margem direita e
prosseguindo em direção ao centro da página.

Por exemplo a linha:
THIS LINE IS GIBBERISH
está sendo impressa como:
I ENIL SIHTHSIREBBIG S

Da mesma forma, a linha " MANGOS " está sendo impressa incorretamente como
"NAM SOG". Sua tarefa é desembaralhar (decifrar) a string a partir da forma como ela foi
impressa para a sua forma original. Você pode assumir que cada linha conterá um número
par de caracteres.
Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um
inteiro N que indica a quantidade de casos de teste. Seguem N linhas, cada uma com uma
frase com no mínimo 2 e no máximo 100 caracteres de letras maiúsculas e espaços que
deverá ser desembaralhada (decifrada) à partir da forma impressa para a sua forma
original, conforme especificação acima.
Saída
Para cada linha de entrada deverá ser impressa uma linha de saída com a frase decifrada,
conforme a especificação acima.
Exemplo de Entrada Exemplo de Saída

5
I ENIL SIHTHSIREBBIG S
LEVELKAYAK
H YPPAHSYADILO
ABCDEFGHIJKLMNOPQRSTUVWXYZ
VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE

THIS LINE IS GIBBERISH
LEVELKAYAK
HAPPY HOLIDAYS
MLKJIHGFEDCBAZYXWVUTSRQPON
FRENCH HENS TWO DOVES AND A PARTRIDGE
