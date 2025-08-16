# 🍔 Lanchonete Sabor e Alegria

Um simples sistema de **cardápio em Java** que permite ao cliente escolher comidas ou bebidas e visualizar um resumo do pedido.

## 📜 Como funciona

1. O programa exibe um **cardápio** dividido em duas categorias:
   - **Comidas**: X-Salada, X-Tudo, Coxinha, Pão Pizza, Coxinburguer.
   - **Bebidas**: Refrigerante, Suco, Água.
2. O cliente digita o **número** correspondente ao item desejado.
3. O programa registra o **nome** e **valor** do produto escolhido.
4. O cliente informa o **seu nome**.
5. É exibido um **resumo do pedido** com:
   - Nome do cliente.
   - Nome do item selecionado.
   - Valor formatado em reais (R$).

## 🛠️ Estrutura do código

- Uso da classe `Scanner` para leitura de dados.
- Variáveis armazenam nomes e preços dos produtos.
- Estrutura `switch-case` identifica o item escolhido e atualiza o valor total.
- Saída formatada com `System.out.printf`.

## 💡 Observações

- Caso seja digitada uma opção inválida, o sistema informa o erro e encerra.
- Os valores e nomes dos produtos estão fixos no código e podem ser alterados facilmente.

## 👨‍💻 Desenvolvedores

- Geovana  
- Luiz Henrique
