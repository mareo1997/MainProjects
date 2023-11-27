var http = require('http')
http.createServer(function (req, res) {
    res.writeHead(200, { 'Content-Type': 'text/html' })
    if (req.url == '/') {
        res.write("<h1>Welcome to the Server Home Page</h1>")
        res.end()
    } else if (req.url == '/admin') {
        res.write("You are in the admin page")
        res.end()
    } else if (req.url == '/accounts') {
        res.write("You are in the account page")
        res.end()
    } else {
        res.write("404 Not Found")
        res.end()
    }
}).listen(8000, ()=>{console.log("server is listening at 8000")})