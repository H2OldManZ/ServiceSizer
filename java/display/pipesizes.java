function displaypipesize(){
  document.getElementById('cipipeage').style.display = "none";
  document.getElementById('cipipeagelabel').style.display = "none";

  var display = document.getElementById('pipetype').value;
  var pipesizelist = document.getElementById("pipesizelist");
  pipesizelist.options.length = 0;

  document.getElementById('cipipeage').style.display = "none";
  document.getElementById('cipipeagelabel').style.display = "none";

  if (display == "Poly"){
    for (size in poly){
    pipesizelist.add( new Option( size));
  }
}

if (display == "Copper"){
  for (size in copper){
  pipesizelist.add( new Option( size));
}

}
  if (display == "Cast Iron"){
    for (size in ci){
    pipesizelist.add( new Option( size));
    document.getElementById('cipipeage').style.display = "block";
    document.getElementById('cipipeagelabel').style.display = "block";
  }

  }

  if (display == "Ductile Iron"){
    for (size in di){
    pipesizelist.add( new Option( size));
  }
}

if (display == "C-900"){
  for (size in c900){
  pipesizelist.add( new Option( size));
}
}

}
