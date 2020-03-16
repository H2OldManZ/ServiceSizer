function finalcalc(){
  var pipetype = document.getElementById('pipetype').value;
  var pipesize = document.getElementById('pipesizelist').value;
  var pipelength = parseInt((document.getElementById('pipelength')).value);
  var calcgpm = parseInt((document.getElementById('calcgpm')).value);
  var pipecoef = 130;

  if (pipesize == "Calculate"){

      if (pipetype == "Poly"){
        var chart = poly;
      }
      if (pipetype == "Copper"){
        var chart = copper;
      }
      if (pipetype == "Cast Iron"){
        var chart = ci;
      }
      if (pipetype == "Ductile Iron"){
        var chart = di;
      }
      if (pipetype == "C-900"){
        var chart = c900;
      }

      var sortedkeys = sortkeys(chart);

      for (key in sortedkeys){
          pipesize = chart[sortedkeys[key]];
          var calcpipelengthheadloss = 10.4 * pipelength * (calcgpm/pipecoef)**1.85 * (pipesize**-4.8655);

      }




      //var calcpipelengthheadloss = 0.002083 * pipelength * (100/130)**1.85 * (calcgpm**1.85 / pipesize**4.8655);
      var calcpipelengthheadloss = 10.4 * pipelength * (calcgpm/pipecoef)**1.85 * (pipesizefromchart**-4.8655);
      document.getElementById('pipeheadloss').value = "";
      document.getElementById('headlosspsi').value = "";
      if (isNaN(calcpipelengthheadloss) != true){
        document.getElementById('pipeheadloss').value = Math.round(calcpipelengthheadloss);
        document.getElementById('headlosspsi').value = Math.round(calcpipelengthheadloss / 2.31) ;
      }
  }


}

function calculateall(){
  finalcalc();
}
