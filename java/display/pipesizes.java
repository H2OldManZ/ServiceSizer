document.getElementById('polypipesize').style.display = "block";
document.getElementById('polypipesizelabel').style.display = "block";

document.getElementById('copperpipesize').style.display = "none";
document.getElementById('copperpipesizelabel').style.display = "none";

document.getElementById('cipipesize').style.display = "none";
document.getElementById('cipipesizelabel').style.display = "none";
document.getElementById('cipipeage').style.display = "none";
document.getElementById('cipipeagelabel').style.display = "none";

document.getElementById('dipipesize').style.display = "none";
document.getElementById('dipipesizelabel').style.display = "none";

document.getElementById('c900pipesize').style.display = "none";
document.getElementById('c900pipesizelabel').style.display = "none";


function displaypipesize() {
    var display = document.getElementById('pipetype').value;
    ///Clear all.
    document.getElementById('polypipesize').style.display = "none";
    document.getElementById('polypipesizelabel').style.display = "none";

    document.getElementById('copperpipesize').style.display = "none";
    document.getElementById('copperpipesizelabel').style.display = "none";

    document.getElementById('cipipesize').style.display = "none";
    document.getElementById('cipipesizelabel').style.display = "none";
    document.getElementById('cipipeage').style.display = "none";
    document.getElementById('cipipeagelabel').style.display = "none";

    document.getElementById('dipipesize').style.display = "none";
    document.getElementById('dipipesizelabel').style.display = "none";

    document.getElementById('c900pipesize').style.display = "none";
    document.getElementById('c900pipesizelabel').style.display = "none";

    if (display == "Poly"){
      document.getElementById('polypipesize').style.display = "block";
      document.getElementById('polypipesizelabel').style.display = "block";
    }
    if (display == "Copper"){
      document.getElementById('copperpipesize').style.display = "block";
      document.getElementById('copperpipesizelabel').style.display = "block";
    }
    if (display == "Cast Iron"){
      document.getElementById('cipipesize').style.display = "block";
      document.getElementById('cipipesizelabel').style.display = "block";
      document.getElementById('cipipeage').style.display = "block";
      document.getElementById('cipipeagelabel').style.display = "block";
    }
    if (display == "Ductile Iron"){
      document.getElementById('dipipesize').style.display = "block";
      document.getElementById('dipipesizelabel').style.display = "block";
    }
    if (display == "C-900"){
      document.getElementById('c900pipesize').style.display = "block";
      document.getElementById('c900pipesizelabel').style.display = "block";
    }


}
