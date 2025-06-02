![State](/State.jpg)

# State - Mudança de Estado de uma Entrega

## Descrição
Este projeto simula o ciclo de vida de uma entrega de produto, que pode estar em diferentes estados como "Recebido", "Em transporte" e "Cancelado". O objeto de entrega muda seu comportamento conforme o estado atual.

## Padrão Utilizado
O padrão State permite que um objeto altere seu comportamento quando seu estado interno muda. Ele encapsula os estados como objetos separados e delega a eles as ações.

Neste projeto:
- A classe `Entrega` mantém uma referência ao estado atual (`EstadoEntrega`).
- Estados concretos (`EstadoRecebido`, `EstadoTransporte`, `EstadoCancelado`) implementam diferentes comportamentos.

Dessa forma, a lógica de transição entre estados e suas descrições são isoladas em classes específicas.

## Aluno
- **Nome**: João Vitor Amorim Lopes
- **Matrícula**: 0900043180
- **Curso**: Sistemas de Informação
