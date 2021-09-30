## Spring Boot Book Seller Application

### EndPoints

#### Sign-up

```
POST /api/authentication/sign-up
Host: localhost:8080
Content-Type: application/json

{
    "name": "user",
    "username": "user",
    "password": "user"
}
```

#### Sign-in

```
POST /api/authentication/sign-in
Host: localhost:8080
Content-Type: application/json

{
    "username": "user",
    "password": "user"
}
```

#### Make an admin

```
PUT /api/internal/make-admin/{username}
Host: localhost:8080
Authorization: Bearer InternalApiKey123!
```

### Create book item

```
POST /api/book
Host: localhost:8080
Authorization: Bearer 

{
    "title": "Book 1",
    "description": "Description 1",
    "price": 100,
    "author": "Jonas Smit"
}
```

### Get all books

```
GET /api/book
Host: localhost:8080
```

### Delete an book item
```
DELETE /api/book/3 HTTP/1.1
Host: localhost:8080
Authorization: Bearer 
```

### Get all purchases

```
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer
```

### Create an purchase

```
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer
Content-Type: application/json
Content-Length: 58

{
    "userId": 4,
    "bookId": 2,
    "price": 100
}
```