const http = require('http')
const url = require('url')
const fs = require('fs')

http.createServer(function (req, res) {
    res.writeHead(200, { 'Content-Type': 'text/html' })

    // let passedURL = url.parse(req.url, true)
    // let path = passedURL.req.url.replace("", "");

    // const params = new URLSearchParams(req.url);
    // const name = params.get("name");
    // const value = params.get("value");

    // console.log(name)
    // console.log(value)

    if (req.url == '/') {
        res.write('<html><head>')
        res.write('<style>')
        res.write('body{background-color:pink;color:blue}')
        res.write('</style>')
        res.write('</head><body>')
        res.write('<h1>Welcome to node server</h1>')
        res.write('</body><html>')
        res.end()
    } else if (req.url == '/admin') {
        const params = req.url.searchParams;

        // res.write("You are in the admin page")
        res.write('<html><head>')
        res.write('<style>')
        res.write('body{background-color:brown;color:green}')
        res.write('</style>')
        res.write('</head><body>')
        res.write('<h1>Logged into admin page</h1>')
        // res.write(req.url)
        res.write('</body><html>')
        res.end();
    } else {
        // app.use(express.static(req.url.join(__dirname, 'public')));
        res.write('<html><head>')
        res.write('<style>')
        res.write('body{background-color:red;color:white}')
        res.write('</style>')
        res.write('</head><body>')
        res.write('<h1>Page not Found. Try again.</h1>')
        // res.write(req.url)
        res.write('</body><html>')
        res.end()
    }
}).listen(4040, () => { console.log("Server is listening at 4040") })