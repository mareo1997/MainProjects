var fs = require("fs")

fs.unlink("./newfilename.txt", function(err){
    if(err) throw err

    console.log('file deleted')
})