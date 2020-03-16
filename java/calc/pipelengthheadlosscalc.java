function setheadlosscolor(id){
  document.getElementById(id).style.color = "black";
  var headlosstext = parseInt(document.getElementById(id).innerHTML);
  var maxheadlosstext = parseInt(document.getElementById("maxheadlosspsi").value);
  if (maxheadlosstext < headlosstext){
    document.getElementById(id).style.color = "red";
  }

}

function setvelocitycolor(id){
  document.getElementById(id).style.color = "black";
  var velocitytext = parseInt(document.getElementById(id).innerHTML);
  var maxvelocitytext = parseInt(document.getElementById("pervel").value);
  if (maxvelocitytext < velocitytext){
    document.getElementById(id).style.color = "red";
  }
}

function setpressurecolor(id){
  document.getElementById(id).style.color = "black";
  var pressuretext = parseInt(document.getElementById(id).innerHTML);
  if (pressuretext <= 20){
    document.getElementById(id).style.color = "red";
  }
}


function calculatepipelengthheadloss(pipesize) {
  pipev = pipesize + "v";
  pipep = pipesize + "p";
  document.getElementById(pipesize).innerHTML = "NA" ;
  var pipetype = document.getElementById('pipetype').value;
  //var pipesize = document.getElementById('pipesizelist').value;

  var pipeage = "New"
  var supplypsi = parseInt(document.getElementById("supplypress").value);

  //if (pipesize == "Calculate") {
    //pipeheadlosshide();
  //}


  //else {  //Calculates Actual Head loss through the pipe and displays it.
    //pipeheadlossshow();

  if (pipetype == "Poly"){
    var pipesizefromchart = poly[pipesize];
    var pipecoef = polycoef[pipeage];
  }
  if (pipetype == "Copper"){
    var pipesizefromchart = copper[pipesize];
    var pipecoef = coppercoef[pipeage];
  }
  if (pipetype == "Cast Iron"){
    var pipeage = document.getElementById('cipipeage').value;
    var pipesizefromchart = ci[pipesize];
    var pipecoef = cicoef[pipeage];
  }
  if (pipetype == "Ductile Iron"){
    var pipesizefromchart = di[pipesize];
    var pipecoef = dicoef[pipeage];
  }
  if (pipetype == "C-900"){
    var pipesizefromchart = c900[pipesize];
    var pipecoef = c900coef[pipeage];
  }

  var pipelength = parseInt((document.getElementById('pipelength')).value);
  var calcgpm = parseInt((document.getElementById('calcgpm')).value);


  //var calcpipelengthheadloss = 0.002083 * pipelength * (100/130)**1.85 * (calcgpm**1.85 / pipesize**4.8655);
  var calcpipelengthheadloss = 10.4 * pipelength * (calcgpm/pipecoef)**1.85 * (pipesizefromchart**-4.8655);
  var totalheadloss = calcpipelengthheadloss;

  var calcpipevelocity = 0.408 * (calcgpm / (pipesizefromchart ** 2));
  var calcpsiatcustomer = supplypsi - (totalheadloss/2.31);

  document.getElementById(pipesize).innerHTML = "";
  document.getElementById(pipev).innerHTML = "";
  document.getElementById(pipep).innerHTML = "";

  //if (isNaN(calcpipelengthheadloss) != true){
    document.getElementById(pipesize).innerHTML = Math.round(totalheadloss / 2.31);
    document.getElementById(pipev).innerHTML = Math.round(calcpipevelocity);
    document.getElementById(pipep).innerHTML = Math.round(calcpsiatcustomer);
  //}

  setheadlosscolor(pipesize);
  setvelocitycolor(pipev);
  setpressurecolor(pipep);

  }




function setNA(value){
  document.getElementById(value).innerHTML = "NA" ;
}
function calcpipetable(){
    var table = ["0.75","1","1.25","1.5","2","2.5","3","3.5","4","5","6","8","10","12"] ;
    table.forEach(calculatepipelengthheadloss);

}
