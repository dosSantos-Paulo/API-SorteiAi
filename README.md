#API SorteiAi

API que sorteia uma sequência de números, que podem
ser de 4, 5 ou 6 digitos. 

Esta API foi criando usando banco de dados MySQL e
esta configurada somente para ambiente local.

Requisições:

- Post -> "localhost:8080/api/lucky" com um body
em JSON.

Exemplo:

>{
>
>   "email": "teste@teste.com",
>
>   "luckyNumberVariable": 4
>
>}

Retorno esperado: 

> "5791" 
>
>ou
>
> "the number must be between 4 and 6"

- Get -> "localhost:8080/api/list/{email}"

Exemplo: 

> localhost:8080/api/list/teste@teste.com"

Retorno Esperado:

>{
>
>   "email": "teste@teste.com",
>
>   "luckyNumber": 4578
>
>}