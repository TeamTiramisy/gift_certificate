# Gift Certificate
Приложение разработано для системы подарочных сертификатов

## CERTIFICATE
### POST
* ### добавить сертификат
```
http://localhost:8080/api/v1/certificates
```
### PUT
* ### обновить сертификат
```
http://localhost:8080/api/v1/certificates/{id}
```
### DELETE
* ### удалить сертификат
```
http://localhost:8080/api/v1/certificates/{id}
```
### GET
* ### получить сертификат по id
```
http://localhost:8080/api/v1/certificates/{id}
```
* ### получить все сертификаты
```
http://localhost:8080/api/v1/certificates
```
## TAG
### POST
* ### добавить тег
```
http://localhost:8080/api/v1/tags
```
### PUT
* ### обновить тег
```
http://localhost:8080/api/v1/tags/{id}
```
### DELETE
* ### удалить тег
```
http://localhost:8080/api/v1/tags/{id}
```
### GET
* ### получить тег по id
```
http://localhost:8080/api/v1/tags/{id}
```
* ### получить все теги
```
http://localhost:8080/api/v1/tags
```
## USER
### GET
* ### получить пользователя по id
```
http://localhost:8080/api/v1/users/{id}
```
* ### получить всех пользователей
```
http://localhost:8080/api/v1/users
```
## ORDER
### POST
* ### сделать заказ
```
http://localhost:8080/api/v1/orders
```
### GET
* ### получить заказ по id
```
http://localhost:8080/api/v1/orders/{id}
```
* ### получить все заказы
```
http://localhost:8080/api/v1/orders
```