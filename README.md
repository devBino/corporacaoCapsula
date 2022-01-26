# Java Básico - Intermediário - Avançado.

<p align="justify">O presente projeto contando com um histórico de commits, mostra um momento de evolução e documentação de conhecimentos na linguagem Java.</p>

<p align="justify">Em três níveis, o projeto se propôs a documentar minha base em Java, dessa forma segue um breve resumo dos que foi experimentado e assimilado nos 3 níveis, e que
  ainda está em processo de evolução contínua:</p>
  
<li><b>Básico</b></li>
<br>
<p align="justify">
  No projeto básico a entidade que nos interessa são os controllers, isso nada mais foi que uma forma estratégica de 
  reunir os conceitos em um só lugar, de maneira organizada. Sempre que necessário estudar mais um assunto básico, criamos uma constante
  para o novo assunto, depois o controller Teste irá através da constante criada, chamar o respectivo controller,
  que deverá ser criado seguindo algumas regras, ele deverá extender a classe ObjetoTeste que por sua vez implementa a interface IfaceTeste.
  
  <b>
    
  Assim cada novo controller deverá implementar os métodos em IfaceTeste. Por isso o método teste() deverá aparecer em todos os novos controllers,
  e nesse método teste(), é que vamos implementar nossos testes relacionados ao novos assuntos.
  O projeto é básico, a estrutura da mesma maneira claramente tem pontos onde pode ser melhorada. Mas mesmo assim, se observamos os controllers,
  já vemos vários assuntos básicos pertinentes ao nível básico de uma linguagens, tais como ifs, switchs, arrays, operadores, POO, leitura de dados do teclado,
  enfim, tudo que pode ser considerado Java básico, é satisfeito nesse projeto.
</p>

<br>
<li><b>Intermediário</b></li>
<br>
<p align="justify">
  No projeto intermediário, foi possível deixar o básico de lado, literalmente. A começar pela estrutura do projeto, dentro do pacote testes
  estão as classe que nos interessão, vamos produzir várias delas, da mesma maneira que no projeto básico cada novo assunto, era um novo controller,
  aqui, cada novo assunto é uma nova classe dentro do pacote testes. <br>
  
  Essas classes por sua vez extendem a TesteAbstract que contém o comportamento abstrato a todo novo teste. Ainda será necessária a criação das constantes para 
  cada novo teste, para que a classe TesteProcessor possa processar todos os testes criados.<br>
  
  Uma diferença aqui em relação ao projeto básico, é o uso de annotations, e criando minhas próprias annotations, e não contente, verificando seus valores 
  nas classes em tempo de execução. Dessa forma foi possível criar um mecanismo semelhante aos frameworks que utilizam annotations.<br>
  
  A annotation se @TesteMap, inspirado em @RequestMapping de um framework famoso em Java...
  
  Assim quando o método runTestes em TesteProcessor estiver sendo executado, para cada classe encontrada dentro de testes, está só será adicionada a lista de testes válidos, se estiver anotada com @TesteMap (minha própria anotação U+1F600 U+1F600 U+1F600) <br>
  
  Além disso, olhando para anotação @TesteMap, o método runTestes em TesteProcessor irá verificar também se o elemento testar da anotação está com valor true, caso não esteja, a classe do respectivo teste também não será considerada. <br>
  
  Ou seja, utilizando annotations foi possível dar uma dinâmica bem interessante na estrutura do projeto como um todo.
  
  Além do uso de annotatinons, criei minhas próprias Exceptions, e quando necessário elas foram disparadas em tempo de execução indicando uma regra negocial
  negligenciada. Por exemplo caso não exista nenhum teste implementado ou anotado corretamente, será disparada uma ConfigBusinessException, com a seguinte mensagem:<br>
  
  Certifique se de que existem testes implementados e corretamente anotados em:<br>
  src/br/com/bino/testes
  
  Outro ponto que merece destaque, foi o assunto sobre Threads que foi amplamente estudado nesse projeto intermediário. <br>

  Por fim, diria que a julgar pela cara que o projeto intermediário assumiu, este merece ser chamado de intermediário.
  
</p>

<li><b>Intermediário</b></li>
<br>
<p align="justify">
O projeto avançado seguiu a mesma lógica dos anteriores, foi uma evolução do intermediário, só que agora estamos produzindo patterns, onde cada classe implementada dentro de patterns, será um design pattern.

Mais detalhes ainda serão fornecidos...
</p>
