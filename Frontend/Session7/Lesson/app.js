var http = require('http')
http.createServer(function(req,res){
    res.writeHead(200, {'Content-Type':'text/html'});
    res.write('<html><head>')
    res.write('<style>')
    res.write('body{background-color:pink;color:blue}')
    res.write('</style>')
    res.write('</head><body>')
    res.write('<h1>Welcome to node server</h1>')
    res.write(req.url)
    res.write('</body><html>')
    res.end()
}).listen(8000, ()=>{console.log("server is listening at 8000")})