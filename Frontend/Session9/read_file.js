var http_var = require('http')
var fs = require("fs")

http_var.createServer(function(req,res){
    fs.readFile('./demo.txt', function(err,data){
        if(err) throw err
        res.writeHead(200, { 'Content-Type': 'text/html' })
        res.write(data)
        res.end()
    })
}).listen(3000, ()=>{console.log("server is running at 3000")})