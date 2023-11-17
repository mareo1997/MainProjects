document.getElementById("login").disabled = true;

function signup(){

    let signupForm = document.signupForm;

    let name = document.getElementById('name').value;
	let email = document.getElementById('email').value;
	let phone = document.getElementById('phone').value;
	let password = document.getElementById('password').value;
	let repassword = document.getElementById('repassword').value;

    if(password != repassword){
        alert("Passwords don't match")
    }

    const signuptemplate = {
		name: name,
		email: email,
		phone: phone,
		password: password,
		repassword: repassword
	}

    alert("Success");
}

function valid(){

    able = false

    let name = document.getElementById('name').value;
    const regexName = new RegExp('^[A-Za-z \-]*$');

    let repassword = document.getElementById('repassword').value;
	let password = document.getElementById('password').value;
    const regexPassword = "(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\W){8}"

	let phone = document.getElementById('phone').value;
    const regexPhone = "[0-9]{3}-[0-9]{3}-[0-9]{4}"
    // const regexPhone = "[0-9]{3}"

    let email = document.getElementById('email').value;
    const regexEmali = new RegExp('^.*@.*$');


    // if(name.length == 0 || email.length == 0 || phone.length == 0){
    //     able = true;
    // }

    if(!regexPhone.test(phone)){
        alert("phone")
        able = true;
    }
    if(!regexPassword.test(repassword)){
        alert("repassword")
        able = true;
    }
    if(!regexPassword.test(password)){
        alert("password")
        able = true;
    }
    // if(repassword.length < 8 || password.length < 8){
    //     // alert()
    //     able = true
    // }
    if(repassword != password){
        // alert()
        able = true
    }

    if(!regexName.test(name)){
        alert("name")
        able = true;
    }
    if(!regexEmali.test(email)){
        alert("@")
        able = true;
    }
    document.getElementById("login").disabled = able;

}