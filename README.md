# Gift Certificate
Приложение разработано для системы подарочных сертификатов. Приложение имеет 9 реплик (нод). На старте каждая из нод приложения имеет полный список всех нод. Для поддержания целостности кластера и его состояния, приложение (с некоторой периодичностью) отправляет запрос на список доступных нод. Для контроля целостности был создан специальный сервис который позволяет получить информацию о состоянии каждой из нод.

Основные сущности:
- gift_certificate (подарочный сертификат) содержит поля: id, name, description, price, duration, create_date, last_update_date
- tag (тег) содержит поля: id, name
- user (пользователь) содержит поля: id, username, firstname, lastname, tel, address

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
