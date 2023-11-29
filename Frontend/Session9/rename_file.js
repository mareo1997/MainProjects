var fs = require("fs")

fs.rename('./demo.txt', './newfilename.txt',
    function (err) {
        if (err) throw err

        console.log('file renamed')
    }
)