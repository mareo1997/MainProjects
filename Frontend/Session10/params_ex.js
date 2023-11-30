var express = require("express")
var app = express()

var blocks = {
    "A": "APPLE, ALPHABET ALF",
    "B": "BERRY BUTT BATS BLORP",
    "C": "CATS CUTE CURRYING",
    "D": "DEAD DOGS DONT DECAY",
    "E": "ELEPHANTS ERECTED ENVIRONMENT",
    "F": "FETUS FOR FALLING FROWNS"
}

app.get('/blocks/:name', (req, res)=>{
    var descript = blocks[req.params.name]
    if(!descript){
        res.status(404).send("NOT FOUND. Check parameter")
    } else {
        res.send(descript)
    }
})

app.listen(8000, ()=>(console.log('server is running on 8000')))

//http://localhost:8000/blocks/A