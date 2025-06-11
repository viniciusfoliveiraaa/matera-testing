
 **Exercicio 1**
 
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

**Exercicio 3**
 a) De que forma você reportaria esse bug?
 
    R: Reportaria com o url do endpoint, o payload, a resposta e colocaria o resultado esperado

b) Você identificou que este problema poderia ter sido pego durante os testes da
feature. O que você poderia fazer para mitigar este bug e possíveis futuros nessa
feature?

    R: colocaria esse cenário no regressivo

**Exercicio 4**

A automação está neste repo

