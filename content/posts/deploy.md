---
title: "Deploy do projeto"
author: "Guilherme Borlot"
cover: "https://adaptive.com.br/wp-content/uploads/2019/09/300663-guia-completo-do-cloud-computing-para-pme-1024x684.jpg"
---
## Gerar build de produção

#### Primeiro passo foi gerar a build de produção para publicação, no caso do Hugo foi utilizado o comando "hugo" no terminal e foi gerado automaticamente uma pasta public aonde contém os arquivos de produção.

![](/img/hugoTerminal.png)

![](/img/pastaPublic.png)

## Configurar bucket na Amazon S3

#### O segundo passo foi criar uma conta na Amazon e criar um bucket utilizando o serviço Amazon S3, este passo foi bem simples, defini o nome do bucket o mesmo que o domínio que eu pretendia registrar e defini o bucket para acesso público.

![](/img/criacaoBucket.png)

#### Após a criação do bucket o próximo passo foi fazer o upload dos arquivos de produção para o bucket.

![](/img/uploadBucket.png)

#### Com os arquivos adicionados fui em propriedades do bucket e selecionei a opção "Hospedagem de site estático", com isso o site já estava no ar e funcionando corretamente.

![](/img/hospedagemSite.png)