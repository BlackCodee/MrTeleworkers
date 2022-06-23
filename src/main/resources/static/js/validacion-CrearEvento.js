window.onload=initialize; 

function initialize(){
var formEvento = document.getElementById("form-evento");
formEvento.addEventListener("submit", validateFormEvento);
}

function validateFormEvento(event){
    var formEvento = event.target;
    var username = formEvento["name"].value;

//Nombre creador
    if(!username || username ==""){
        event.preventDefault(); 
        document.getElementById("error-username-required").style.display="block"; 
        console.log("error : Nombre de usuario obligatorio"); 

    }else{
        document.getElementById("error-username-required").style.display="none"; 
    }
//Nombre de evento
    var nameEv = formEvento["nameEv"].value;
    if(!nameEv || nameEv ==""){
        event.preventDefault(); 
        document.getElementById("error-Eventname-required").style.display="block"; 
        console.log("error : Nombre de Evento Obligatorio"); 
    }else{
        document.getElementById("error-Eventname-required").style.display="none"; 
    }

//Area
    var area = formEvento["area"].value;
    if(!area || area ==""){
        event.preventDefault(); 
        document.getElementById("error-area-required").style.display="block"; 
        console.log("error : El area es requerida"); 
    }else{
        document.getElementById("error-area-required").style.display="none"; 
    }

//Fecha de entrega o finalizacion
    var fecha = formEvento["fecha"].value;
    if(!fecha || fecha ==""){
        event.preventDefault(); 
        document.getElementById("error-fecha-required").style.display="block"; 
        console.log("error : La fecha es requerida"); 
    }else{
        document.getElementById("error-fecha-required").style.display="none"; 
    }

//Hora de finalizacion de la actividad
    var Hora = formEvento["Hora"].value;
    if(!Hora || Hora ==""){
        event.preventDefault(); 
        document.getElementById("error-Hora-required").style.display="block"; 
        console.log("error : La Hora es requerida"); 
    }else{
        document.getElementById("error-Hora-required").style.display="none"; 
    }

//descripciones
    var descripcion = formEvento["descripcion"].value;
    if(descripcion ==""){
        event.preventDefault(); 
        document.getElementById("error-descripcion-required").style.display="block"; 
        console.log("error : La descripcion es requerida"); 
    }else{
        document.getElementById("error-descripcion-required").style.display="none"; 
    }



}