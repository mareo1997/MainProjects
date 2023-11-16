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

    able = true
    
    let repassword = document.getElementById('repassword').value;
	let password = document.getElementById('password').value;

    if(repassword.length >= 8 && password.length >= 8){
        able = false
    }


    document.getElementById("login").disabled = able;

}