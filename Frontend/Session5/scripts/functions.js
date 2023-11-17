let toDoList = [
    {
        id: 1,
        title: "John Doe",
        description: "30",
        status: "COMPLETED"
    },{
        id: 2,
        title: "",
        description: "",
        status: "ACTIVE"
    },{
        id: 3,
        title: "Bank",
        description: "withdraw 7000 dollars",
        status: "ACTIVE"
    },{
        id: 4,
        title: "SWAT",
        description: "Police",
        status: "COMPLETED"
    }
];

renderHTML(toDoList)

function addTask(){
    let title = document.getElementById('title').value;
    let description = document.getElementById('description').value;

    let task = {
        id: toDoList.length+1,
        title: title,
        description: description,
        status: "ACTIVE"
    }

    toDoList.push(task)
    document.getElementById('title').value = "";
    document.getElementById('description').value = "";
    console.log(toDoList)

    renderHTML(toDoList)
}

function deleteTask(id){

    for (var i = 0; i < toDoList.length; i++) {
        if(toDoList[i].id == id){
            toDoList.pop(i)
        }
    }
//^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$
}

function removeCompleted(){

    toDoList = toDoList.filter((e) => e.status != "COMPLETED")

    renderHTML(toDoList);

    document.getElementById("filter").value = 'all'
    // console.log(toDoList)
}

function filter(){
    let d = document.getElementById("filter").value;

    if(d == 'all'){
        // alert(d)
        renderHTML(toDoList);
    } else {
        let temp = toDoList.filter((e) => e.status.toLowerCase() == d);
        // console.log(temp)
        renderHTML(temp)
    } 
}

function renderHTML(data){
    let input = document.getElementById('warningText')
	input.textContent = "";

	for (var i = 0; i < data.length; i++) {
        input.append("Id: " + data[i].id);
		input.append(document.createElement("br"));

        input.append("Title: " + data[i].title);
		input.append(document.createElement("br"));

		input.append("Description: " + data[i].description);
		input.append(document.createElement("br"));

		input.append("Status: " + data[i].status);
		input.append(document.createElement("br"));

        // input.append(document.createElement("button"));
		input.append(document.createElement("br"));
		// input.append(document.createElement("br"));

    }
}