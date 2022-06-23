//grafico de barras
var ctx=document.getElementById("graf").getContext("2d");
var graf = new Chart(ctx,{
    type:"bar",
data: {
    labels:['6 AM','9 AM', '12 PM', '2 PM'],
    datasets: [{
        label: 'Usuarios por horario',
        data: [60, 80, 70, 55],
        backgroundColor:['#623b5a', '#55d6be', '#cbef43', '#f76c5e']
    }]
},
options: {
    scales: {
        yAxes: [{
            ticks: {
              beginAtZero: true
            }
        }]
    }
}
});
//grafico de torta
var ctx=document.getElementById("graf1").getContext("2d");
var graf = new Chart(ctx,{
    type:"pie",
    data: {
        labels: ['Envios','Binestar', 'Administrativa', 'Manufactura', 'Contabilidad'],   
        datasets: [{
            label: "Usuarios por area",
            data: [30, 20, 34, 26, 14],
            backgroundColor:['#FFC100', '#51E3FF', '#f76c5e', '#f76cee', '#FaC100']
        }],
    }
});