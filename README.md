# API-REST  CRUD COM REDIS
Projeto simples para interação com REDIS

## Instalação

#### Dependencias
- Instalar o REDIS (https://redislabs.com/get-started-with-redis/)

#### Build
```bash
./gradlew build
```

## Usando

#### Subindo serviço
```bash
./gradlew bootrun
```

#### Chamadas CURL nos ENDPOINTS

```bash
#get all employees
curl -X GET \
  http://localhost:8082/employees \
  -H 'Cache-Control: no-cache'
#get employee by ID
curl -X GET \
  http://localhost:8082/employee/729280953 \
  -H 'Cache-Control: no-cache'
#update employee by ID
curl -X PUT \
  http://localhost:8082/employee/729280953 \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -d '{
    "id": "729280953",
    "firstName": "ankit",
    "lastName": "gupta",
    "email": "testankit@gmail.com"
}'
#delete employee by ID
curl -X DELETE \
  http://localhost:8082/employee/980694165 \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/x-www-form-urlencoded'
#create employee
curl -X POST \
  http://localhost:8082/employee \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -d '{
    "id": 3,
    "firstName": "ankit",
    "lastName": "gupasd1",
    "email": "test@gmail.com"
}'
```

#### Conectar ao Redis para validar valores
```bash
redis-cli -h 127.0.0.1 -p 6379

KEYS *

HGETALL Student:940198001
```

