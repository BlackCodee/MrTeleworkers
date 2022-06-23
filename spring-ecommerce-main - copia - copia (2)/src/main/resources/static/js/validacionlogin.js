function validarLogin(){
    var email = document.getElementById("user").value;
    var clave = document.getElementById("Password").value;
 
    if(email === "admin@gmail.com" && clave === "1234"){
        window.location.href = "dashboard-Admin.jsp";
        return false;
    }
    if(email === "empleado@gmail.com" && clave === "1234"){
        window.location.href = "dashboard-Empleado.jsp";
        return false;
    }
    if(email === "jefe@gmail.com" && clave === "1234"){
        window.location.href = "dashboard-Jefe.jsp"; 
        return false;
    }
    
    
    else{
        Swal.fire({
            icon: 'error',
            title: 'Los datos no son correspondientes',
            text: 'Acceso denegado, usuario y/o clave erroneas',
            showConfirmButton:true,
            timer:2500
          });

          return false;
    }
}