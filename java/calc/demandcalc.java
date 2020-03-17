


function calculategpm() {  ///Calculates GPM Needs Using above tables.
        var preflush = (document.getElementById('preflush')).value;
        var publicuse = (document.getElementById('publicuse')).value;
        var bathtub = (document.getElementById('bathtub')).value;
        var bathroomsink = (document.getElementById('bathroomsink')).value;
        var showerhead = (document.getElementById('showerhead')).value;
        var bidet = (document.getElementById('bidet')).value;
        var toilettank = (document.getElementById('toilettank')).value;
        var toiletflush = (document.getElementById('toiletflush')).value;
        var urinaltank = (document.getElementById('urinaltank')).value;
        var urinalflush = (document.getElementById('urinalflush')).value;
        var kitchensink = (document.getElementById('kitchensink')).value;
        var servicesink = (document.getElementById('servicesink')).value;
        var dishwasher = (document.getElementById('dishwasher')).value;
        var drinkingfountain = (document.getElementById('drinkingfountain')).value;
        var washingmachine = (document.getElementById('washingmachine')).value;
        var laundrytrays = (document.getElementById('laundrytrays')).value;
        var barsink = (document.getElementById('barsink')).value;
        var icemachine = (document.getElementById('icemachine')).value;
        var commercialbaysink = (document.getElementById('commercialbaysink')).value;
        var commercialsprayer = (document.getElementById('commercialsprayer')).value;
        var hosebib = (document.getElementById('hosebib')).value;
        var mopsink = (document.getElementById('mopsink')).value;

        var addfixunits = parseInt((document.getElementById('addfixunits')).value);
        var condem = parseInt((document.getElementById('condem')).value);

        var fix = privatefixtures;
        if (publicuse == "Yes"){
          var fix = publicfixtures;
        }
        var gp = gpm;
        if (preflush == "Yes"){
          var gp = gpmflush;
        }

        var t1 = fix.toilettank * toilettank;
        var t2 = fix.bathtub * bathtub;
        var t3 = fix.bathroomsink * bathroomsink;
        var t4 = fix.showerhead * showerhead;
        var t5 = fix.bidet * bidet;
        var t6 = fix.toiletflush * toiletflush;
        var t7 = fix.urinaltank * urinaltank;
        var t8 = fix.urinalflush * urinalflush;
        var t9 = fix.kitchensink * kitchensink;
        var t10 = fix.servicesink * servicesink;
        var t11 = fix.dishwasher * dishwasher;
        var t12 = fix.drinkingfountain * drinkingfountain;
        var t13 = fix.washingmachine * washingmachine;
        var t14 = fix.laundrytrays * laundrytrays;
        var t15 = fix.barsink * barsink;
        var t16 = fix.icemachine * icemachine;
        var t17 = fix.commercialbaysink * commercialbaysink;
        var t18 = fix.commercialsprayer * commercialsprayer;
        var t19 = fix.hosebib * hosebib;
        var t20 = fix.mopsink * mopsink;


        var totalfixunits = (t1+t2+t3+t4+t5+t6+t7+t8+t9+t10+t11+t12+t13+t14+t15+t16+t17+t18+t19+t20)
        if (isNaN(addfixunits) != true){
          totalfixunits = totalfixunits + addfixunits;
        }

        totalfixunits = Math.round(totalfixunits * 10) / 10

        for (var key in gp) {
          if (key >= totalfixunits){
            var calculategpm = gp[key];
            break;
          }
        }

        if (isNaN(condem) != true){
          calculategpm = calculategpm + condem;
        }


        document.getElementById('totalfixunits').value = totalfixunits
        document.getElementById('calcgpm').value = calculategpm

    }

function cleargpm() {    ///Resets GPM Calc Boxes to Empty.

  document.getElementById('preflush').value = "No";
  document.getElementById('publicuse').value = "No";

  document.getElementById('bathtub').value = "";
  document.getElementById('bathroomsink').value = "";
  document.getElementById('showerhead').value = "";
  document.getElementById('bidet').value = "";
  document.getElementById('toilettank').value = "";
  document.getElementById('toiletflush').value = "";
  document.getElementById('urinaltank').value = "";
  document.getElementById('urinalflush').value = "";
  document.getElementById('kitchensink').value = "";
  document.getElementById('servicesink').value = "";
  document.getElementById('dishwasher').value = "";
  document.getElementById('drinkingfountain').value = "";
  document.getElementById('washingmachine').value = "";
  document.getElementById('laundrytrays').value = "";

  document.getElementById('addfixunits').value = "";
  document.getElementById('condem').value = "";

  document.getElementById('totalfixunits').value = "0";
  document.getElementById('calcgpm').value = "0";
}
