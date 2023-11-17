function signup(){

    let signupForm = document.signupForm;

    let name = document.getElementById('name').value;
	let email = document.getElementById('email').value;
	let phone = document.getElementById('phone').value;
	let password = document.getElementById('password').value;
	let repassword = document.getElementById('repassword').value;

    const signuptemplate = {
		name: name,
		email: email,
		phone: phone,
		password: password,
		repassword: repassword
	}

    alert("Success");
}