CRUD Mongo
-----------------------------------

1.Create Mongodb BookStore
Create collection Book
2.Run Mongo server
3.Run App
4.Test 
to test use postman
1) POST http://localhost:8080/addBook
 Body JSON
 {"id":"3333",
 "bookName":"Java",
 "authorName":"SVDev"}
 
 2)GET http://localhost:8080/findAll
 3)GET http://localhost:8080/findBook/3333
 4)DELETE  http://localhost:8080//delete/3333