var fs = require("fs")

fs.appendFile('./demo.txt', '<h1>Appends to previous works</h1>',
    function (err) {
        if (err) throw err

        console.log("file created")
    }
)