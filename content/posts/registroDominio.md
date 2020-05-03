---
title: "Registro do domínio e configurações"
author: "Guilherme Borlot"
cover: "https://img2.gratispng.com/20180920/ahx/kisspng-godaddy-domain-name-website-logo-internet-godaddy-coupon-and-promo-codes-august-2-18-wp-co-5ba3f091cdf622.5213812315374706098436.jpg"
---

## Registro do domínio

#### Para registro do domínio foi utilizado o site "GoDaddy", por conta do preço optamos por escolher o domínio terminando em ".site".

## Configurando DNS pelo Amazon Route 53

#### Para configurações de DNS decidi usar o Amazon Route 53, então, o primeiro passo foi criar uma zona hospedada utilizando o nome de domínio registrado no GoDaddy.

![](/img/zonaHospedada.png)

#### Após criar a zona eu copiei os valores de servidores de nome que estavam na Amazon para o GoDaddy.

![](/img/servidoresNome.png)

![](/img/goDaddyNS.png)

#### Com isso eu já posso configurar o DNS pela Amazon.

#### O próximo passo foi criar um certificado SSL utilizando o serviço Certificate Manager da Amazon, este passo estarei explicando em outro artigo.
[AQUI](/posts/certificadossl)

## Criar distribuição no CloudFront

#### Para disponibilizar o site decidi usar o serviço CloudFront da Amazon.

#### O primeiro passo foi criar uma distribuição web.

![](/img/createDist1.png)
![](/img/createDist2.png)
![](/img/createDist3.png)

#### Após clicar em "Create Distribution" a distribuição do CloudFront após alguns minutos estará criada.

![](/img/cloudDist.png)

#### O passo final é apontar o servidor para o domínio, então para isso criei um conjunto de registro do tipo CNAME no Route 53 e a aplicação já estava no ar utilizando HTTPS e com certificado SSL.

![](/img/conjRegistro.png)

![](/img/demoSite.png)