#language: pt

  @todos
  Funcionalidade: Matera Testing
    Eu como candidato
    Gostaria de realizar testes na api
    Para realizar o teste do processo seletivo

    @valido
  Cenario: Validar retorno de limit igual á 1
    Dado que eu esteja com a requisicao
    Entao validar o status code igual a 200

    @invalido
    Cenario: Validar retorno de limit com o valor negativo
      Dado que eu esteja com a requisicao com um valor invalido
      Entao validar o status code igual a 200