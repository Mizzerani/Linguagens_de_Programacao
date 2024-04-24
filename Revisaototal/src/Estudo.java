/*
Tipos primitivos:
    Byte: 1 byte
    short: 2 bytes
    int: 4 bytes (mais usado)
    long: 8 bytes
    float: 4 bytes
    double: 8 bytes (duas vezes a precisão do tipo float. Mais usado)
 */

/*
----------------------------------------- Sem Interface -------------------------------------------
 - Relembrar:

    - Sempre que começar um programa utilize, antes "package "NomeDoProjeto". Não lembro o porquê,
    mas è melhor para evitar erros!

    - Usar EOExeption em programas que recebam letras ou números. Exemplo:
    public class Lotofacil {
        public static void main(String[] args){
            try {
                menu();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }catch(NullPointerException e){
                System.out.println(e.getMessage());
            }catch(Exception e){
             System.out.println(e.getMessage());
            }
        }
     Obs: Sempre colocar dentro do "public class", dentro do "public static void main(String[] args){".
     Como foi descrito acima.

     - charAt(0): Pega a primeira letra da String e armazena na memória.

     - isLetter: verifica se o termo digitado é uma letra.
     Pode ser utilizado para comparação, dentro de If-Else!

     - Comparadores para If-Else:

        - && : E

        - || : Ou

        - == : Igual a uma valor inteiro

        - .equals() : Igual a uma string

        - <= : Menor ou Igual

        - >= : Maior ou igual

        - > : maior que

        - < : menor que
*/
/*

 - ArrayList:

    - Principais métodos:

        - boolean add (Object element): Adiciona o elemento especificado no final
        da lista.

        - void add(int index, Object element): Insere o elemento especificado na
        posição indicada da lista.

        - void clear(): Remove todos os elementos da lista.

        - boolean contains(Object element): Retorna verdadeiro se a lista contém o
        elemento especificado e falso caso contrário.

        - Object get(int index): Retorna o i-ésimo elemento da lista

        - int indexOf(Object element): Retorna a posição da primeira ocorrência do
        elemento especificado na lista.

        - boolean isEmpty: Retorna verdadeiro se a lista estiver vazia e falso caso
        contrário.

        - int lastIndexOf(Object element): Retorna a posição da última ocorrência do
        elemento especificado na lista.

        - Object remove(int index): Remove o i-ésimo elemento da lista.

        - Object set(int index, Object element): Substitui o i-ésimo elemento da lista
        pelo elemento especificado.

        - int size(): Retorna o número de elementos da lista.
 */
/*
 - Do-while

    do{
        instruções;
       }while(Condição);

       - Esse tipo de laço é utilizado para a criação de menus, no qual faz as regras de negócio serem lidas pelo
       menos uma vez.

       - E, esse laço é executado quando a expressão for verdadeira.

 - Break

    - É um método que é capaz de forçar a saída imediata do laço, ignorando o código restante em seu corpo e o teste
    condicional, com o uso dessa instrução "Break".

    - Quando uma instrução break é encontrada dentro de um laço, este é encerrado e o controle do programa é retomado
    na instrução posterior ao laço.

 - Lembrete:

    - Quando for adicionar classe random, não se esqueça de adicionar o: "Import Java.util.random
    - Quando for adicionar classe scanner, não se esqueça de adiconar o: "Import Java.util.scanner
 */
/*
----------------------------------------- Com Interface -------------------------------------------

 - Criando uma interface gráfica:

    Quando for fazer uma interface gráfica, lembre-se de extrair os dados do lotofácilGUI do github,
    lá tem tudo bonitinho para fazer a interface acontecer!

 - MaskFormatter & JFormattedTextField:

    É uma formatação necessária para ajustar os termos que você quer que seja digitado na caixa de informações.
    ex:

        MaskFormatter mascaraCpf = new MaskFormatter ("###.###.###-##");
        JFormattedTextField cpf = new JFormattedTextField(mascaraCpf);

        Outros exemplos:

        MaskFormatter mascaraCep = new MaskFormatter ("#####-###");
        MaskFormatter mascaratel = new MaskFormatter ("(##) #-####-####");
 */