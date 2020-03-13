function sortkeys(type){
    keys = Object.keys(type);
    sortedkeys = keys.sort(function(a, b){return a-b});
    return sortedkeys;
}

function displaypipesize(){
  document.getElementById('cipipeage').style.display = "none";
  document.getElementById('cipipeagelabel').style.display = "none";

  var display = document.getElementById('pipetype').value;
  var pipesizelist = document.getElementById("pipesizelist");
  pipesizelist.options.length = 0;

  document.getElementById('cipipeage').style.display = "none";
  document.getElementById('cipipeagelabel').style.display = "none";


  if (display == "Poly"){
    sortedkeys = sortkeys(poly);
}

if (display == "Copper"){
  sortedkeys = sortkeys(copper);

}
  if (display == "Cast Iron"){
    sortedkeys = sortkeys(ci);
    document.getElementById('cipipeage').style.display = "block";
    document.getElementById('cipipeagelabel').style.display = "block";
  }

  if (display == "Ductile Iron"){
    sortedkeys = sortkeys(di);
}

if (display == "C-900"){
  sortedkeys = sortkeys(c900);
}

pipesizelist.add( new Option("Calculate"));

for (key in sortedkeys){
  pipesizelist.add( new Option( sortedkeys[key]));
}

}

function pipeheadlosshide(){
  document.getElementById('pipeheadlossfieldset').style.display = "none";
}

function pipeheadlossshow(){
  document.getElementById('pipeheadlossfieldset').style.display = "block";
}
