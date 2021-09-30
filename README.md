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
Content-Type: application/json
Authorization: Bearer InternalApiKey123!
```