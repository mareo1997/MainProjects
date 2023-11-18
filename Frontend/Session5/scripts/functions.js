// let toDoList = [
//     {
//         id: 1,
//         title: "John Doe",
//         description: "30 years old",
//         status: "COMPLETED"
//     },{
//         id: 2,
//         title: "No title",
//         description: "Non descript",
//         status: "ACTIVE"
//     },{
//         id: 3,
//         title: "Bank",
//         description: "withdraw 7000 dollars",
//         status: "ACTIVE"
//     },{
//         id: 4,
//         title: "SWAT",
//         description: "Police",
//         status: "COMPLETED"
//     }
// ];

// localStorage.setItem("records",JSON.stringify(toDoList));

storage = localStorage.getItem("records")

onload(JSON.parse(storage))

function onload(storage) {
    const head = document.querySelector('thead');
    let headtags = "";

    headtags += `
    <th>Title</th>
    <th>Description</th>
    <th>Status</th>
    `

    head.innerHTML = headtags

    fill(storage)
}

function fill(storage) {

    const body = document.querySelector('tbody');
    let tags = "";

    let toDoList = storage

    console.log(toDoList)

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

function addTask() {
    let title = document.getElementById('title').value;
    let description = document.getElementById('description').value;

    let storage = localStorage.getItem("records")
    toDoList = JSON.parse(storage)

    let task = {
        id: toDoList.length + 1,
        title: title,
        description: description,
        status: "ACTIVE"
    }

    toDoList.push(task)
    document.getElementById('title').value = "";
    document.getElementById('description').value = "";
    console.log(toDoList)

    fill(toDoList)
}

function markCompleted(id) {

    let storage = localStorage.getItem("records")
    toDoList = JSON.parse(storage)

    for (i = 0; i < toDoList.length; i++) {
        if (toDoList[i].id == id) {
            toDoList[i].status = "COMPLETED"
            break;
        }
    }

    console.log(toDoList)

    fill(toDoList);
}

function deleteTask(id) {

    let storage = localStorage.getItem("records")
    toDoList = JSON.parse(storage)

    let temp = toDoList.filter((e) => e.id != id)

    toDoList = temp

    fill(toDoList);

    //^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$
}

function removeCompleted() {

    let storage = localStorage.getItem("records")
    toDoList = JSON.parse(storage)

    toDoList = toDoList.filter((e) => e.status != "COMPLETED")

    fill(toDoList);

    document.getElementById("filter").value = 'all'
}

function filter() {
    let storage = localStorage.getItem("records")
    toDoList = JSON.parse(storage)

    let d = document.getElementById("filter").value;

    if (d == 'all') {
        fillTemp(toDoList);
    } else {
        let temp = toDoList.filter((e) => e.status.toLowerCase() == d);
        fillTemp(temp)
    }
}

function fillTemp(storage) {

    const body = document.querySelector('tbody');
    let tags = "";

    let toDoList = storage

    // console.log(toDoList)

    toDoList.forEach(d => {
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
}