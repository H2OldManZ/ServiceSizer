function totalk(){
  var corpstop = (document.getElementById('corpstop')).value;
  var curbstop = (document.getElementById('curbstop')).value;
  var gatevalve = (document.getElementById('gatevalve')).value;
  var ballvalve = (document.getElementById('ballvalve')).value;
  var anglevalve = (document.getElementById('anglevalve')).value;
  var bflyvalve = (document.getElementById('bflyvalve')).value;
  var swingchk = (document.getElementById('swingchk')).value;
  var sidetee = (document.getElementById('sidetee')).value;
  var straighttee = (document.getElementById('straighttee')).value;
  var stdelbow = (document.getElementById('stdelbow')).value;
  var longelbow = (document.getElementById('longelbow')).value;
  var fortyfiveelbow = (document.getElementById('fortyfiveelbow')).value;
  var yto1 = (document.getElementById('yto1')).value;
  var reducer1 = (document.getElementById('reducer1')).value;
  var coupling = (document.getElementById('coupling')).value;


  var f1 = fittings.corpstop * corpstop;
  var f2 = fittings.curbstop * curbstop;
  var f3 = fittings.gatevalve * gatevalve;
  var f4 = fittings.ballvalve * ballvalve;
  var f5 = fittings.anglevalve * anglevalve;
  var f6 = fittings.bflyvalve * bflyvalve;
  var f7 = fittings.swingchk * swingchk;
  var f8 = fittings.sidetee * sidetee;
  var f9 = fittings.straighttee * straighttee;
  var f10 = fittings.stdelbow * stdelbow;
  var f11 = fittings.longelbow * longelbow;
  var f12 = fittings.fortyfiveelbow * fortyfiveelbow;
  var f13 = fittings.yto1 * yto1;
  var f14 = fittings.reducer1 * reducer1;
  var f15 = fittings.coupling * coupling;

  var fitk = (f1+f2+f3+f4+f5+f6+f7+f8+f9+f10+f11+f12+f13+f14+f15)
return fitk
}
