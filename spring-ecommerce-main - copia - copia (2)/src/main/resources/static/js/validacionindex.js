window.onload=initialize;

function initialize(){
var formRegistro = document.getElementById("form-registro");
formRegistro.addEventListener("submit", validateFormRegistro);
}

function validateFormRegistro(event){
	var formRegistro = event.target;
	var username = formRegistro["name"].value;
	//var username = document.getElementById("username").value;
	
    if(!name || name==""){
        event.preventDefault();
		document.getElementById("error-name-required").style.display="block";
        console.log("error: nombre de usuario obligatorio");
	}else{
        document.getElementById("error-name-required").style.display="none";
    }

    var lastname = formRegistro["lastname"].value;
    if(!lastname || lastname==""){
        event.preventDefault();
		document.getElementById("error-lastname-required").style.display="block";
        console.log("error: apellido obligatorio");
	}else{
        document.getElementById("error-lastname-required").style.display="none";
    }

    var email = formRegistro["email"].value;
    if(!email || email==""){
        event.preventDefault();
		document.getElementById("error-email-required").style.display="block";
        console.log("error:El Correo electronico es obligatoria");
	}else{
        document.getElementById("error-email-required").style.display="none";
    }

    var asunto = formRegistro["asunto"].value;
    if(!asunto || asunto==""){
        event.preventDefault();
		document.getElementById("error-asunto-required").style.display="block";
        console.log("error:El asunto es obligatoria");
	}else{
        document.getElementById("error-asunto-required").style.display="none";
    }

    

    


}
