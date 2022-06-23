var ctx=document.getElementById("graf").getContext("2d");
var graf = new Chart(ctx,{
    type:"bar",
data: {
    labels: ['Acetona', 'Monóxido', 'Cloro', 'Formaldehído', 'Sulfuro', 'Hidroxcido', 'Acido Sulfúrico'],
    datasets:[{
        label: 'Tipos de Producto',
        data: [60, 80, 70, 20, 90, 32, 33],
        backgroundColor:['#623b5a', '#55d6be', '#cbef43', '#e07a5f', '#fb8500', '#e63946', '#1d3557']
    }]
},

options:{
    scales: {
        yAxes: [{
            ticks: {
              beginAtZero: true
            }
        }]
    }
}
});

var ctx=document.getElementById("graf1").getContext("2d");
var graf1 = new Chart(ctx,{
    type:"pie",
data:{
     labels: ['HP', 'Lenovo', 'Acer'],
     datasets:[{
         label:'Datos Productos',
         data:[10,5,10],
         backgroundColor:['#FFC100', '#51E5FF', '#f76c5e']
     }]
        
}   
});

var ctx=document.getElementById("graf2").getContext("2d");
var myLineChart = new Chart(ctx,{
    type: 'line',
    data:{
        labels:['Insumos', 'Proveedores', 'Computadores'],
        datasets:[{
            label:'Inventarios',
            data:[25,30,25], 
            borderColor:['#FFC100', '#51E5FF', '#f76c5e'],
            pointBorderColor:['#623b5a', '#55d6be', '#cbef43'],
            pointBorderWidth:8
        }]
    },
        options: {
        scales: {
            y: {
                stacked: true
            }
        }
    }
});