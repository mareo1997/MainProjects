var express = require("express")
var app = express()

app.use(function (req, res, next) {
    console.log("server started at " + Date.now())

    //next()
})

app.get('/things', function (req, res) {
    res.send("Things happen")
})

app.listen(8000, () => (console.log('server is running on 8000')))
