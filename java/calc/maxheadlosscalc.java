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
