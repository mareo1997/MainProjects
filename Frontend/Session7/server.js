var http_var = require('http')
http_var.createServer(function(req,res){
    res.write("web server created using node js http module")
    res.end()
}).listen(5000, ()=>{console.log("server is running at 5000")})