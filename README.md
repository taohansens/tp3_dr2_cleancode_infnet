# Gerenciamento de Projetos com Sprints

Engenharia de Software: Clean Code e Boas Práticas [25E1_2] / 25GRLEDS01BGM201


## 📌 Sobre o Projeto

Este projeto é apenas CONCEITUAL como parte de uma atividade da grade da Faculdade Infnet, que implementa um sistema de gerenciamento de **Projetos**, **Sprints** e **Tarefas**, garantindo imutabilidade e boas práticas de programação. Ele permite criar projetos, adicionar sprints e tarefas, e manter um histórico confiável das alterações.

## 🚀 Funcionalidades

- **Projeto**
    - Criar um novo projeto com nome e descrição.
    - Adicionar e remover sprints.
    - Listar todas as sprints associadas ao projeto.

- **Sprint**
    - Criar sprints com nome, datas de início e fim.
    - Garantir que a data de fim não seja anterior à data atual.
    - Adicionar e remover tarefas sem modificar diretamente o objeto.
    - Listar todas as tarefas associadas à sprint.

- **Tarefa**
    - Criar uma tarefa com título, descrição e status (`TODO`, `IN_PROGRESS`, `DONE`).
    - Alterar status ou atribuir um responsável sem modificar diretamente o objeto.
    - Exibir detalhes de cada tarefa.

## 📖 Princípios de Design

Este projeto segue **boas práticas de Clean Code**, como:
- **Imutabilidade:** Cada alteração retorna uma nova instância do objeto, evitando efeitos colaterais inesperados.
- **Uso de tipos adequados:** `BigDecimal` para valores financeiros, `LocalDateTime` para controle de data, `enum` para status.
- **Facilidade de auditoria:** A imutabilidade facilita rastreamento de histórico e evita concorrência inconsistente.
- **Legibilidade e manutenção:** Código organizado e modular para fácil extensão e evolução.

## 🛠️ Tecnologias Utilizadas

- **Java** (versão 8+)
- `java.util.*` (para manipulação de listas)
- `java.time.*` (para manipulação de datas)
- `java.math.BigDecimal` (para precisão em valores financeiros)

## ⚙️ Como Usar

1. **Clone o repositório:**
   ```sh
   git clone <URL_DO_REPOSITORIO>
   cd <NOME_DO_PROJETO>
   ```
2. **Faça os casos de uso na classe Main para testes exploratórios**
3. **Compile e execute o código:**
   ```sh
    javac src/*.java
    java src.Main
   ```
## 📌 Licença
Este projeto é de uso livre para fins educacionais e aprimoramento de habilidades em programação.
