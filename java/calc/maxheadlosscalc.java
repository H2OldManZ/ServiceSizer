/////Compiled March of 2020.
////Travis Zimmerman,  City of Bloomington Utilities.

///Demand calc uses 2021 ICC Plumbing Code.



function calculatemaxheadloss() {

      var supplypress = parseInt((document.getElementById('supplypress')).value);
      var customerpress = parseInt((document.getElementById('customerpress')).value);
      var elevdiff = parseInt((document.getElementById('elevdiff')).value);
      var calcmaxheadloss = Math.floor((elevdiff) + 2.31*(supplypress-customerpress))*10/10;
      var calcmaxheadlosspsi = (elevdiff) + (supplypress-customerpress);

      if (isNaN(calcmaxheadloss) != true){
        document.getElementById('maxheadloss').value = calcmaxheadloss;
        document.getElementById('maxheadlosspsi').value = calcmaxheadlosspsi;
      }
      if (calcmaxheadloss < 0){
        calcmaxheadloss = "NP";
        document.getElementById('maxheadloss').value = calcmaxheadloss;
        document.getElementById('maxheadlosspsi').value = calcmaxheadloss;
      }

}

function clearmaxheadloss() {
      document.getElementById('supplypress').value = "";
      document.getElementById('customerpress').value = "20";
      document.getElementById('elevdiff').value = "0";
      document.getElementById('maxheadloss').value = "";

}

function calcvelocitypipe() {
      (((4 * gpm / 448.8) / (3.14159 * 8)) ^ 0.5) * 12
}

function calculatepipelengthheadloss() {
  var pipetype = document.getElementById('pipetype').value;
  if (pipetype == "Poly"){
    var pipesize = document.getElementById('polypipesize').value;
    var pipeage = "New"
    var pipesizefromchart = poly.pipesize;
    var pipecoef = poly.pipeage;
  }
  if (pipetype == "Copper"){
    var pipesize = document.getElementById('copperpipesize').value;
    var pipeage = "New"
    var pipesizefromchart = copper.pipesize;
    var pipecoef = copper.pipeage;
  }
  if (pipetype == "Cast Iron"){
    var pipesize = document.getElementById('cipipesize').value;
    var pipeage = document.getElementById('cipipeage').value;
    var pipesizefromchart = ci.pipesize;
    var pipecoef = ci.pipeage
  }
  if (pipetype == "Ductile Iron"){
    var pipesize = document.getElementById('dipipesize').value;
    var pipeage = "New"
    var pipesizefromchart = di.pipesize;
    var pipecoef = di.pipeage;
  }
  if (pipetype == "C-900"){
    var pipesize = document.getElementById('c900pipesize').value;
    var pipeage = "New"
    var pipesizefromchart = c900.pipesize;
    var pipecoef = c900.pipeage;
  }

  var pipelength = parseInt((document.getElementById('pipelength')).value);
  var calcgpm = parseInt((document.getElementById('calcgpm')).value);


  //var calcpipelengthheadloss = 0.002083 * pipelength * (100/130)**1.85 * (calcgpm**1.85 / pipesize**4.8655);
  var calcpipelengthheadloss = 10.4 * pipelength * (calcgpm/pipecoef)**1.85 * (pipesizefromchart**-4.8655);
  document.getElementById('pipeheadloss').value = "";
  document.getElementById('headlosspsi').value = "";
  if (isNaN(calcpipelengthheadloss) != true){
    document.getElementById('pipeheadloss').value = calcpipelengthheadloss;
    document.getElementById('headlosspsi').value = calcpipelengthheadloss / 2.31 ;
  }

}
