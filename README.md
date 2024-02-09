Java = 17
Maven, Apache = 4.0.0
SpringFramework = 3.2.2
Database = H2


------> DataBase acess <------

path = /h2-console

driverClass = org.h2.Driver
url = jdbc:h2:mem:testdb
username = sa
password = 

------> Endpoints <-----------

getAll = /product
getById = /product/{id}
post = /product
put = /product/{id}
delete = /product/{id}

------> Json Body <-----------

{
 "name": "Bola",
 "code": "0567679",
 "description": "Bola otima para jogos...",
 "price": 100.0
}

------------------------------
