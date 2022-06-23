window.onload=initialize; 

function initialize(){
var formInscripcion = document.getElementById("form-inscripcion");
formInscripcion.addEventListener("submit", validateformInscripcion);
}

function validateFormInscripcion(event){
    var formEvento = event.target;
    var username = formInscripcion["name"].value;

//Nombre usuario
    if(!username || username ==""){
        event.preventDefault(); 
        document.getElementById("error-username-required").style.display="block"; 
        console.log("error : Nombre de usuario obligatorio"); 

    }else{
        document.getElementById("error-username-required").style.display="none"; 
    }
//Documento de identificacion
    var DNI = formInscripcion["DI"].value;
    if(!DNI || DNI ==""){
        event.preventDefault(); 
        document.getElementById("error-DNI-required").style.display="block"; 
        console.log("error : Documento de identificacion Obligatorio"); 
    }else{
        document.getElementById("error-DNI-required").style.display="none"; 
    }

//Area
    var area = formInscripcion["area"].value;
    if(!area || area ==""){
        event.preventDefault(); 
        document.getElementById("error-area-required").style.display="block"; 
        console.log("error : El area laboral es requerida"); 
    }else{
        document.getElementById("error-area-required").style.display="none"; 
    }

//fecha
    var fecha = formInscripcion["fecha"].value;
    if(!fecha || fecha ==""){
        event.preventDefault(); 
        document.getElementById("error-date-required").style.display="block"; 
        console.log("error : La fecha es requerida"); 
    }else{
        document.getElementById("error-date-required").style.display="none"; 
    }

//Genero
    var genero = formInscripcion["genero"].value;
    if(genero =="ninguno"){
        event.preventDefault(); 
        document.getElementById("error-genero-required").style.display="block"; 
        console.log("error : El genero es requerido"); 
    }else{
        document.getElementById("error-genero-required").style.display="none"; 
    }

//Rol
    var rol = formInscripcion["rol"].value;
    if(rol =="ninguno"){
        event.preventDefault(); 
        document.getElementById("error-rol-required").style.display="block"; 
        console.log("error : El rol es requerido"); 
    }else{
        document.getElementById("error-rol-required").style.display="none"; 
    }
}