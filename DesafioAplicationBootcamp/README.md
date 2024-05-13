# Anotações pessoais

### Optional

Operador Optional serve para tratamente de expressões que podem retornar Null, assim evitando mals comportamentos, no código abaixo podemos ver a utilização dele em uma condicional para verificar se o valor retornado de uma lista não é nulo e exista no opcional, caso o else{} fica com uma tratativa de erros.

  <code>

    public void progredir() {
      Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
      if (conteudo.isPresent()) {
        this.conteudosConcluidos.add(conteudo.get());
        this.conteudosInscritos.remove(conteudo.get());
      } else {
        System.err.println("Voce nao esta matriculado em um conteudo!");
      }
    }

  </code>
