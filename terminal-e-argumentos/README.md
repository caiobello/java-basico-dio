## Executando arquivo .class pelo CMD:

Executar o java.class dentro da pasta bin

abrir o cmd e acessar o local que está o arquivo .class

Linhas de códigos:

Ir até o diretório do arquivo.class
cd C:\Users\Pichau\eclipse-workspace\AppCalculadora\bin<br>
dir - é usado para exibir uma lista de arquivos e pastas em um diretório específico<br>
cls - é usado para limpar a tela do terminal, removendo todo o conteúdo anteriormente exibido na janela do console.<br>
java Calculadora<br>

## Argumentos

Quando executamos uma classe, que contenha o método main, o mesmo permite que passemos um array [] de argumentos, do tipo String. Logo, podemos após a definição da classe a ser executada, informar estes parâmetros

## Passando argumentos através do launch.json

Exemplo: <br>

        {
            "type": "java",<br>
            "name": "AboutMe",<br>
            "request": "launch",<br>
            "mainClass": "AboutMe",<br>
            "projectName": "terminal-e-argumentos_a9520479",<br>
            "args": [<br>
                "CAIO",<br>
                "BELLO",<br>
                "30",<br>
                "1.72"<br>
            ]<br>
        },
