

function calculateheadloss(pipesize) {
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
  var calcpipelengthheadloss = (10.4 * pipelength * (calcgpm/pipecoef)**1.85 * (pipesizefromchart**-4.8655))/2.31;

  var fittingk = totalk();

  var calcminorheadloss = ((fittingk * (calcgpm ** 2)) / (383 * (pipesizefromchart ** 4)))/2.31 ;

  var backflow = parseInt(document.getElementById('backflow').value);
  var watermeter = parseInt(document.getElementById('watermeter').value);
  var prv = parseInt(document.getElementById('prv').value);
  var other = parseInt(document.getElementById('otherloss').value);
  var totalother = backflow + watermeter + prv + other;

  var totalheadloss = calcpipelengthheadloss + calcminorheadloss + totalother;

  var calcpipevelocity = 0.408 * (calcgpm / (pipesizefromchart ** 2));
  var calcpsiatcustomer = supplypsi - totalheadloss;

  document.getElementById(pipesize).innerHTML = "";
  document.getElementById(pipev).innerHTML = "";
  document.getElementById(pipep).innerHTML = "";

  //if (isNaN(calcpipelengthheadloss) != true){
    document.getElementById(pipesize).innerHTML = Math.round(totalheadloss);
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
    table.forEach(calculateheadloss);

}
