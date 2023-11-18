let toDoList = [
    {
        id: 1,
        title: "John Doe",
        description: "30 years old",
        status: "COMPLETED"
    },{
        id: 2,
        title: "No title",
        description: "Non descript",
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

// localStorage.setItem("records",JSON.stringify(toDoList));

let storage = localStorage.getItem("records")

onload(JSON.parse(storage))

function onload(toDoList){
    const head = document.querySelector('thead');
    let headtags = "";

    headtags += `
    <th>Title</th>
    <th>Description</th>
    <th>Status</th>
    `

    head.innerHTML = headtags

    fill(toDoList)
}

function fill(toDoList){

    const body = document.querySelector('tbody');
    let tags = "";

    toDoList.forEach(d => {
        // console.log(d)
        tags += `
            <tr>
            <td>${d.title}</td>
            <td>${d.description}</td>
            <td>${d.status}</td>
            <td><button class="btn btn-primary" onclick="markCompleted(${d.id})">Done</button></td>
            <td><button class="btn btn-danger" onclick="deleteTask(${d.id})">Delete</button></td>
        `
    })
    body.innerHTML = tags

    localStorage.setItem("records", JSON.stringify(toDoList))

}

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

    fill(toDoList)

    // localStorage.setItem("records", JSON.stringify(toDoList))
}

function markCompleted(id){
    for(i = 0; i < toDoList.length; i++){
        console.log(toDoList[i])
        if(toDoList[i].id == id){
            console.log(toDoList[i])
            toDoList[id].status = "COMPLETED"
            break;
        }
    }

    // console.log(toDoList)

    fill(toDoList);

    // localStorage.setItem("records", JSON.stringify(toDoList))

}

function deleteTask(id){

    let temp = toDoList.filter((e) => e.id != id)

    toDoList = temp

    console.log(toDoList)

    fill(toDoList);

    // localStorage.setItem("records", JSON.stringify(toDoList))

//^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$
}

function removeCompleted(){

    toDoList = toDoList.filter((e) => e.status != "COMPLETED")

    fill(toDoList);

    document.getElementById("filter").value = 'all'
    // console.log(toDoList)

    // localStorage.setItem("records", JSON.stringify(toDoList))
}

function filter(){
    let d = document.getElementById("filter").value;

    if(d == 'all'){
        // alert(d)
        fill(toDoList);
    } else {
        let temp = toDoList.filter((e) => e.status.toLowerCase() == d);
        // console.log(temp)
        fill(temp)
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