window.onload=initialize; 

function initialize(){
var formCapacitacion = document.getElementById("form-capacitacion");
formCapacitacion.addEventListener("submit", validateformCapacitacion);
}

function validateFormCapacitacion(event){
    var formEvento = event.target;
    var username = formCapacitacion["name"].value;

//Nombre Encargado
    if(!username || username ==""){
        event.preventDefault(); 
        document.getElementById("error-name-required").style.display="block"; 
        console.log("error : Nombre de usuario obligatorio"); 

    }else{
        document.getElementById("error-name-required").style.display="none"; 
    }
//Documento de identificacion
    var DNI = formCapacitacion["DI"].value;
    if(!DNI || DNI ==""){
        event.preventDefault(); 
        document.getElementById("error-DNI-required").style.display="block"; 
        console.log("error : Documento de identificacion Obligatorio"); 
    }else{
        document.getElementById("error-DNI-required").style.display="none"; 
    }

//Email
    var email = formCapacitacion["email"].value;
    if(!email || email ==""){
        event.preventDefault(); 
        document.getElementById("error-email-required").style.display="block"; 
        console.log("error : El email es requerido"); 
    }else{
        document.getElementById("error-email-required").style.display="none"; 
    }

//especializacion
    var especializacion = formCapacitacion["especializacion"].value;
    if(!especializacion || especializacion ==""){
        event.preventDefault(); 
        document.getElementById("error-especializacion-required").style.display="block"; 
        console.log("error : La especializacion es requerida"); 
    }else{
        document.getElementById("error-especializacion-required").style.display="none"; 
    }

//Telefono
    var tel = formCapacitacion["tel"].value;
    if(!tel || tel ==""){
        event.preventDefault(); 
        document.getElementById("error-tel-required").style.display="block"; 
        console.log("error : El telefono es requerido"); 
    }else{
        document.getElementById("error-tel-required").style.display="none"; 
    }

//clases
    var clases = formCapacitacion["clases"].value;
    if(clases ===""){
        event.preventDefault(); 
        document.getElementById("error-clases-required").style.display="block"; 
        console.log("error : Es requerido seleccionar almenos una clase"); 
    }else{
        document.getElementById("error-clases-required").style.display="none"; 
    }

//fecha de Realizacion
    var fecha = formCapacitacion["fecha"].value;
    if(!fecha || fecha ==""){
        event.preventDefault(); 
        document.getElementById("error-date-required").style.display="block"; 
        console.log("error : La fecha es requerido"); 
    }else{
        document.getElementById("error-date-required").style.display="none"; 
    }

//Descripcion de la capacitacion
    var descripcion = formCapacitacion["Descripción"].value;
    if(descripcion ==""){
        event.preventDefault(); 
        document.getElementById("error-descripcion-required").style.display="block"; 
        console.log("error : La descripcion de la capacitacion es requerida"); 
    }else{
        document.getElementById("error-descripcion-required").style.display="none"; 
    }



}