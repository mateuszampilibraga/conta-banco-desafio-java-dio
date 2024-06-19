# Projeto ContaBanco

## Visão Geral
Bem-vindo ao **Projeto ContaBanco**! Este projeto é a solução para o primeiro Lab Project to bootcamp Santander 2024 - Backend com Java em parceria com a DIO. O objetivo é criar um sistema simples de conta bancária que coleta informações do usuário via terminal e, em seguida, exibe uma mensagem de confirmação com os detalhes fornecidos.

## Descrição do Desafio
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário:

Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme os atributos abaixo:

| Atributo       | Tipo   | Exemplo        |
|----------------|--------|----------------|
| Numero         | Inteiro| 1021           |
| Agencia        | Texto  | 067-8          |
| Nome Cliente   | Texto  | MARIO ANDRADE  |
| Saldo          | Decimal| 237.48         |

### Requisitos
- Revise sobre regras de declaração de variáveis.
- Crie uma classe `ContaTerminal.java` para implementar o programa.
- Revise sobre terminal, `main` args e a classe `Scanner`.
- Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
  ```
  Programa: "Por favor, digite o número da Agência!"
  Usuário: 1021 (depois ENTER para o próximo campo)
  ```
- Revise sobre concatenação e a classe `String` com o método `concat`.
- Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
  ```
  "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."
  ```
  Os campos entre colchetes `[ ]` devem ser substituídos pelas informações inseridas pelos usuários.

## Estrutura do Projeto
O projeto consiste em uma única classe `ContaBanco.java` que lida com toda a lógica do programa.

### ContaBanco.java
Esta classe é responsável por:
- Solicitar os detalhes da conta do usuário.
- Ler as entradas do usuário.
- Exibir uma mensagem de confirmação formatada.

## Como Executar
1. **Clone o repositório**:

   git clone https://github.com/mateuszampilibraga/conta-banco-desafio-java-dio.git

2. **Navegue até o diretório do projeto**:

   cd conta-banco-desafio-java-dio

3. **Compile o programa Java**:

   javac ContaBanco.java

4. **Execute o programa**:

   java ContaBanco


## Exemplo de Uso

Welcome to ByteStream Bank!
Please digit your account number: 1021
Please digit your branch code: 067-8
Please enter your name: MARIO ANDRADE
Please enter your balance: 237.48

Welcome MARIO ANDRADE, thank you for opening an account with our bank. Your branch is 067-8, your account number is 1021, and your balance of 237.48 is already available for withdrawal.


## Contribuições
Sinta-se à vontade para fazer um fork deste repositório e enviar pull requests. Contribuições são sempre bem-vindas!

## Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](https://github.com/mateuszampilibraga/conta-banco-desafio-java-dio/blob/main/LICENSE) para detalhes.

## Agradecimentos
- Inspirado no primeiro Lab Project do Santander 2024 - Backend com Java em parceria com a [DIO] (https://www.dio.me/en/bootcamp)
- Agradecimentos a todos que forneceram feedback e sugestões.

---

Make The Change! 🚀
```

