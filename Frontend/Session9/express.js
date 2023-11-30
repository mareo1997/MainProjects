var express = require("express")
var app = express()

let books = ["snva"]// [{ id: 1, title: "SNVA", author: "Mary Land", releasedate: 1996 }, { id: 2, title: "Gods and Monsters", author: "Hiro Hoshi", releasedate: 2019 }]

app.get('/', function (req, res) {
    res.sendFile(__dirname + '/express.html')
})

app.get('/read/:id', function (req, res) {

    res.send(books[req.params['id']])
    console.log('file read')
})

app.get('/list', function (req, res) {
    res.send(books)
})

app.post('/insert/:name', function (req, res) {

    books.push(req.params['name']);

    res.send("Added " + req.params['name'] + " to list.")

    console.log("inserted book")
})


app.post("/", function (req, res) {

    var addBook = {
        id: 3, title: "Wimpy Kid", author: "Greg Hoff", releasedate: 2022
    }

    books.push(addBook);

    res.send("Added " + addBook.title + " to list.")
})

app.put('/update/:id/:name', function (req, res) {
    books.splice(req.params['id'], 1)
    books.splice(req.params['name'], 0, req.params['name'])

    res.send('updated')
    console.log('updated book')
})

app.put('/user', function (req, res) {
    res.send('Got a PUT request at /user')
})

app.delete(`/delete/:id`, function (req, res) {

    books.splice(req.params['id'], 1)
    res.send('delete')
    console.log('book deleted')
});

app.delete(`/delete`, function (req, res) {

    books = books.filter(x => x.id != 3)

    console.log(books)
    console.log(res)
    res.send("deleted " + id + " from books")
});

app.listen(4000, () => { console.log('app is listening at 4000') })