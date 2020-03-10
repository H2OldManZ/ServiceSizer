var privatefixtures={
    "bathtub"           : 1.4  ,
    "bidet"             : 2    ,
	"drinkingfountain"  : 0.25 ,
    "dishwasher"        : 1.4  ,
    "kitchensink"       : 1.4  ,
    "laundrytrays"      : 1.4  ,
    "bathroomsink"      : 0.7  ,
	"servicesink"       : 3    ,
    "showerhead"        : 1.4  ,
	"urinaltank"        : 3    ,
    "urinalflush" : 10   ,
    "washingmachine"    : 1.4  ,
    "toilettank"        : 2.2  ,
    "toiletflush" : 6
};

var publicfixtures={
    "bathtub"           : 4    ,
	  "bidet"              : 2    ,
    "drinkingfountain"  : 0.25 ,
	"dishwasher"          : 1.4  ,
    "kitchensink"       : 4    ,
	"laundrytrays"        : 1.4  ,
    "bathroomsink"      : 2    ,
    "servicesink"       : 3    ,
    "showerhead"        : 4    ,
    "urinaltank"        : 3    ,
    "urinalflush"       : 10   ,
    "washingmachine"    : 4    ,
    "toilettank"        : 5    ,
    "toiletflush"       : 10
};

var gpm={
    0   :   0,
    1   :   3,
    2	:   5,
    3	:   6.5,
    4	: 8,
    5	:9.4,
    6	:10.7,
    7	:11.8,
    8	:12.8,
    9	:13.7,
    10	:14.6,
    11	:15.4,
    12	:16,
    13	:16.5,
    14	:17,
    15	:17.5,
    16	:18,
    17	:18.4,
    18	:18.8,
    19	:19.2,
    20	:19.6,
    25	:21.5,
    30	:23.3,
    35	:24.9,
    40	:26.3,
    45	:27.7,
    50	:29.1,
    60	:32,
    70	:35,
    80	:38,
    90	:41,
    100	:43.5,
    120	:48,
    140	:52.5,
    160	:57,
    180	:61,
    200	:65,
    225	:70,
    250	:75,
    275	:80,
    300	:85,
    400	:105,
    500	:124,
    750	:170,
    1000	:208,
    1250	:239,
    1500	:269,
    1750	:297,
    2000	:325,
    2500	:380,
    3000	:433,
    4000	:525,
    5000	:593
};

var gpmflush={
    0 : 0,
    5	:15,
    6	:17.4,
    7	:19.8,
    8	:22.2,
    9	:24.6,
    10	:27,
    11	:27.8,
    12	:28.6,
    13	:29.4,
    14	:30.2,
    15	:31,
    16	:31.8,
    17	:32.6,
    18	:33.4,
    19	:34.2,
    20	:35,
    25	:38,
    30	:42,
    35	:44,
    40	:46,
    45	:48,
    50	:50,
    60	:54,
    70	:58,
    80	:61.2,
    90	:64.3,
    100	:67.5,
    120	:73,
    140	:77,
    160	:81,
    180	:85.5,
    200	:90,
    225	:95.5,
    250	:101,
    275	:104.5,
    300	:108,
    400	:127,
    500	:143,
    750	:177,
    1000	:208,
    1250	:239,
    1500	:269,
    1750	:297,
    2000	:325,
    2500	:380,
    3000	:433,
    4000	:525,
    5000	:593

};


function calculategpm() {
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

        var totalfixunits = (t1+t2+t3+t4+t5+t6+t7+t8+t9+t10+t11+t12+t13+t14)
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
