function sortkeys(type){
    keys = Object.keys(type);
    sortedkeys = keys.sort(function(a, b){return a-b});
    return sortedkeys;
}

function hideall(id){
  document.getElementById(id).style.display = "none";
}

function showall(id){
  document.getElementById(id).style.display = "block";
}

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



function displaypipesize(){
  var tablemain = ["0.75main","1main","1.25main","1.5main","2main","2.5main","3main","3.5main","4main","5main","6main","8main","10main","12main"] ;
  tablemain.forEach(hideall);


  var display = document.getElementById('pipetype').value;

  document.getElementById('cipipeage').style.display = "none";
  document.getElementById('cipipeagelabel').style.display = "none";


  if (display == "Poly"){
    var tablemain = ["0.75main","1main","1.25main","1.5main","2main","2.5main","3main"] ;
    tablemain.forEach(showall);

}

if (display == "Copper"){
  var tablemain = ["0.75main","1main","1.25main","1.5main","2main","2.5main","3main","3.5main","4main","5main","6main","8main","10main","12main"] ;
  tablemain.forEach(showall);

}
  if (display == "Cast Iron"){
    sortedkeys = sortkeys(ci);
    document.getElementById('cipipeage').style.display = "block";
    document.getElementById('cipipeagelabel').style.display = "block";
    var tablemain = ["3main","4main","6main","8main","10main","12main"] ;
    tablemain.forEach(showall);
  }

  if (display == "Ductile Iron"){
    var tablemain = ["3main","4main","6main","8main","10main","12main"] ;
    tablemain.forEach(showall);
}

if (display == "C-900"){
  var tablemain = ["4main","6main","8main","10main","12main"] ;
  tablemain.forEach(showall);
}


}

function pipeheadlosshide(){
  document.getElementById('pipeheadlossfieldset').style.display = "none";
}

function pipeheadlossshow(){
  document.getElementById('pipeheadlossfieldset').style.display = "block";
}
