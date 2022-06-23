window.onload=initialize; 

function initialize(){
var formRegistro = document.getElementById("form-registro");
formRegistro.addEventListener("submit", validateFormRegistro);
}

function validateFormRegistro(event){
    var formRegistro = event.target;
    var username = formRegistro["name"].value;

//Nombre
    if(!username || username ==""){
        event.preventDefault(); 
        document.getElementById("error-username-required").style.display="block"; 
        console.log("error : nombre de usuario obligatorio"); 

    }else{
        document.getElementById("error-username-required").style.display="none"; 
    }
//Documento de Identificacion
    var DNI = formRegistro["DI"].value;
    if(!DNI || DNI ==""){
        event.preventDefault(); 
        document.getElementById("error-DNI-required").style.display="block"; 
        console.log("error : DNI obligatorio"); 
    }else{
        document.getElementById("error-DNI-required").style.display="none"; 
    }

//Fecha de nacimiento
    var fechaN = formRegistro["fechaN"].value;
    if(!fechaN || fechaN ==""){
        event.preventDefault(); 
        document.getElementById("error-date-required").style.display="block"; 
        console.log("error : La fecha es requerida"); 
    }else{
        document.getElementById("error-date-required").style.display="none"; 
    }

//Telefono
    var tel = formRegistro["tel"].value;
    if(!tel || tel ==""){
        event.preventDefault(); 
        document.getElementById("error-tel-required").style.display="block"; 
        console.log("error : telefono requerido"); 
    }else{
        document.getElementById("error-tel-required").style.display="none"; 
    }

//Email
    var email = formRegistro["email"].value;
    if(!email || email ==""){
        event.preventDefault(); 
        document.getElementById("error-email-required").style.display="block"; 
        console.log("error : El Email es requerido"); 
    }else{
        document.getElementById("error-email-required").style.display="none"; 
    }

//Horarios
    var Horario = formRegistro["Horario"].value;
    if(!Horario || Horario ==""){
        event.preventDefault(); 
        document.getElementById("error-Horario-required").style.display="block"; 
        console.log("error : El Horario es requerido"); 
    }else{
        document.getElementById("error-Horario-required").style.display="none"; 
    }

//roles
    var rol = formRegistro["rol"].value;
    if(rol =="ninguno"){
        event.preventDefault(); 
        document.getElementById("error-rol-required").style.display="block"; 
        console.log("error : El rol es requerido"); 
    }else{
        document.getElementById("error-rol-required").style.display="none"; 
    }



}

