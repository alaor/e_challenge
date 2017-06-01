# Eteg Challenge

:: Atenção ::

É importante executar os passos abaixo para que a aplicação execute sem problemas.

1º - A aplicação utiliza o MySQL como base de dados, vá até a pasta database e importe o dump da base de dados *eteg.sql*

2º - Localize o arquivo ***applications.properties*** em *src/main/resources* e altere a linha **spring.datasource.username = root** para o nome de usuário de seu banco de dados e a linha **spring.datasource.password = 1234** para a sua respectiva senha.

3º - Execute o seguinte comando **mvn:spring-boot:run** na raíz da aplicação e pronto, a aplicação já está disponível para testes!
