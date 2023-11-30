var express = require("express")
var app = express()

app.use(function (req, res, next) {
    console.log("Start")
    next()
    //next()
})

app.get('/', function (req, res, next) {
    res.send("middle")
})


app.use('/', function (req, res) {
    console.log("end")
})

app.listen(3000, () => (console.log('server is running on 3000')))
