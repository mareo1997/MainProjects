const http = require('http')
const url = require('url')
const fs = require('fs')

http.createServer(function (req, res) {
    let img = __dirname + "/account.html"

    fs.access(img, fs.constants.R_OK, err => {
        console.log(`${img} ${err ? "does not exist" : "exists"}`)
    })

    fs.readFile(img, function (err, content) {
        if (err) {
            res.writeHead(404, { 'Content-Type': 'text/html' })
            res.end("<h1>No such file</h1>")
        } else {
            res.writeHead(200, { 'Content-Type': 'text/html' })
            res.write("You are in the account page")
            res.end(content)
        }
    })
}).listen(4040, function(){
    console.log("Server running on port 4040")
})