let toDoList = [
    {
        id: 1,
        title: "John Doe",
        description: "30",
        status: "COMPLETED"
    },
];

renderHTML(toDoList)

function addTask(){
    let title = document.getElementById('title').value;
    let description = document.getElementById('description').value;

    let task = {
        id: toDoList.length,
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
        if(toDoList[i].id = id){
            toDoList.pop(i)
        }
    }

}

function renderHTML(data){
    let input = document.getElementById('warningText')
	input.textContent = "";

	for (var i = 0; i < data.length; i++) {
        input.append("Title: " + data[i].title);
		input.append(document.createElement("br"));

		input.append("Description: " + data[i].description);
		input.append(document.createElement("br"));

		input.append("Status: " + data[i].status);
		input.append(document.createElement("br"));

        input.append(document.createElement("button"));
		input.append(document.createElement("br"));
		input.append(document.createElement("br"));

    }
}