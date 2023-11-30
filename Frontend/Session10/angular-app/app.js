var express = require("express")
var app = express()

app.get('/', function (req, res) {
    res.sendFile(__dirname+'/index.html')
})

app.get('/contactNumbers', function (req, res) {
    contact_Numbers = [9876215123, 1112223333, 9998887777]
    res.send(contact_Numbers)
})

app.get('/location', function (req, res) {
    location = {name:"SNVA", location:"Mary Land"}
    res.send(location)
})

app.get('/blocks', function (req, res) {
    blocks = ['fixed', 'movable', 'rotating']
    res.send(blocks)
})

app.post("/", function(req,res){
    res.send("Post method called")
})

app.listen(3500, () => { console.log('app is listening at 3500') })