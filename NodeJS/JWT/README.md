# node-jwt
Exemplo de API em Node.js usando JWT

## Instalar dependências
```
    npm install
```

## Gerando certificados

O algorítmo de encriptação do token usa o conteúdo de arquivos de certificados que contém as chaves pública e privada. Para gerar estes arquivos, execute o arquivo:

```
$ ./generateKeys.sh
```
A senha solicitada pelo comando pode ficar em branco. Os arquivos **_private.key_** e **_public.key_** serão gerados na pasta **_src_**.

## Iniciar o servidor
Para iniciar o servidor Express, use o comando:

```
   npm start
```