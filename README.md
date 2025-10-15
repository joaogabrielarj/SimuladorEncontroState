# Simulador de Encontro: Documentação Completa do Padrão State

Este documento contém a documentação completa do projeto "Simulador de Encontro", incluindo o README para uso e a explicação teórica detalhada do Padrão de Projeto State implementado.

## 1. README do Projeto

### Visão Geral

Este é um projeto educacional em Java que demonstra de forma clara e interativa a implementação do Padrão de Projeto Comportamental **State**. A aplicação é um divertido simulador de "encontro", onde o comportamento de uma pessoa muda dinamicamente com base em seu estado de humor atual, utilizando polimorfismo para evitar condicionais.

### O Padrão de Projeto: State

O padrão State permite que um objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado de classe.

O principal objetivo é **eliminar o uso de condicionais massivas (if/else ou switch)** na classe de contexto. Em vez disso, a lógica que varia de acordo com o estado é encapsulada em classes concretas separadas, cada uma representando um estado. Adicionar um novo estado se torna tão simples quanto criar uma nova classe, sem a necessidade de alterar a lógica existente.

### Estrutura do Projeto

O projeto está organizado em um único pacote `padraostate` contendo os seguintes componentes:

* **`Estado.java`**: A interface que define o contrato para todos os estados, com um método para cada ação possível (`elogiar`, `contarPiada`, etc.).
* **`Mulher.java`**: A classe de **Contexto**, que mantém a referência ao estado atual e delega as chamadas de ação para o objeto de estado.
* **`EstadoIndisposta.java`**, **`EstadoDisposta.java`**, **`EstadoInteressada.java`**, **`EstadoExitada.java`**: As implementações concretas que definem o comportamento para cada estado.
* **`SimuladorEncontro.java`**: O ponto de entrada (`main`) que executa a simulação interativa via console.

### O Fluxo de Estados

A aplicação segue um fluxo único e linear de estados, representando a progressão de um encontro:

`Indisposta → Disposta → Interessada → Exitada`

Cada ação do usuário (como elogiar ou contar uma piada) pode causar uma transição para o próximo estado, uma regressão para um estado anterior, ou nenhuma mudança, dependendo da lógica encapsulada dentro de cada classe de estado.

### Objetivo Educacional

Este projeto ilustra como o Padrão State:

* **Elimina Condicionais**: Demonstra como o polimorfismo substitui a necessidade de `switch/if` para verificar o estado, resultando em um código mais limpo e orientado a objetos.
* **Centraliza a Lógica**: Cada estado tem sua própria classe, com suas próprias regras e responsabilidades (Princípio da Responsabilidade Única).
* **Facilita a Manutenção**: Alterar o comportamento de um estado ou adicionar um novo não afeta os outros.
* **Aumenta a Flexibilidade**: A troca de comportamento é feita em tempo de execução, simplesmente trocando o objeto de estado.
* **Demonstra o Princípio Aberto/Fechado**: O sistema é "aberto" para extensão (adicionando novas classes de estado) e "fechado" para modificação (a classe `Mulher` não precisa ser alterada para acomodar novos estados).

---

## 2. Explicação Conceitual do Padrão State

### A Pergunta Fundamental

> O estado de uma classe varia de acordo com seus atributos, correto? O que define o estado da classe, qual atributo está variando para que o estado mude?

Essa dúvida é a chave para entender a elegância do Padrão State.

### A Resposta Direta: O Atributo-Chave

No Padrão State, o estado da classe de contexto (a `Mulher`) **não** varia de acordo com seus próprios atributos primitivos (como uma variável `String humor`). Em vez disso, o estado é **encapsulado em um objeto separado**.

O atributo que está variando na classe `Mulher` é a **referência para o objeto de estado atual**:

```java
// Dentro da classe Mulher.java
private Estado estadoAtual;
