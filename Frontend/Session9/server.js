var express = require("express")
var app = express()

app.get('/', function (req, res) {
    res.send("<h1>Welcome</h1>")
})

app.get('/home', function (req, res) {
    res.send("<h1>Home Page<h1>")
})

app.get('/contact', function (req, res) {
    res.send("<p>Our number is ###-###-####<p>")
})


app.listen(3000, () => { console.log('app is listening at 3000') })