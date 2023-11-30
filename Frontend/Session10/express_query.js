var express = require("express")
var app = express()

app.get('/blocks', function (req, res) {
    let books = ["snva", "snva", "snva", "snva", "snva", "snva", "snva","snva"]
    if(req.query.limit >= 0){
        res.send(books.splice(0, req.query.limit))
    } else {
        res.send(books)
    }
})

app.listen(3000, ()=>(console.log('server is 3000')))

//http://localhost:3000/blocks?limit=5