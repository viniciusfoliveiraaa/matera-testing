
 **Cenários em BDD**
 
 **Feature: Login**

 > * Cenário: Consultar usuários pelo nome completo
    Dado que estou na tela de Consulta de Usuários
    Quando preencho o campo "Nome" com "João da Silva"
    E clico no botão "FILTRAR"
    Então a lista de usuários deve exibir apenas usuários com o nome "João da Silva"
  *

  >* Cenário: Consultar usuários pelo e-mail
     Dado que estou na tela de Consulta de Usuários
     Quando preencho o campo "E-mail" com "joao.silva@empresa.com"
     E clico no botão "FILTRAR"
     Então a lista de usuários deve exibir apenas usuários com o e-mail "joao.silva@empresa.com"
    *

  >* Cenário: Consultar usuários por tipo de pessoa
     Dado que estou na tela de Consulta de Usuários
     Quando seleciono "Pessoa Jurídica" no campo "Tipo de pessoa"
     E clico no botão "FILTRAR"
     Então a lista de usuários deve exibir apenas pessoas jurídicas
*

  >* Cenário: Tentar consultar sem preencher nenhum filtro
      Dado que estou na tela de Consulta de Usuários
      Quando clico no botão "FILTRAR" sem preencher nenhum campo
      Então uma mensagem de validação deve ser exibida informando que ao menos um filtro deve ser preenchido
   *

  >* Cenário: Tentar consultar com e-mail em formato inválido
    Dado que estou na tela de Consulta de Usuários
    Quando preencho o campo "E-mail" com "email-invalido"
    E clico no botão "FILTRAR"
    Então uma mensagem de erro deve ser exibida informando que o e-mail está em formato inválido
 *
