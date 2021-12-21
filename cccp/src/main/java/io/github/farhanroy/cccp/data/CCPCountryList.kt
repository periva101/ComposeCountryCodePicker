package io.github.farhanroy.cccp.data



data class CCPCountry(
    val nameCode: String ="ae",
    val phoneCode: String="971",
    val name: String ="United Arab Emirates (UAE)",
    val flagEmoji: String=getFlagEmojiByCountryNameCode("ae")
)

fun getCountries(): List<CCPCountry> {
    val countries: MutableList<CCPCountry> = ArrayList()
    countries.add(CCPCountry("ad", "376", "Andorra", getFlagEmojiByCountryNameCode("ad")))
    countries.add(CCPCountry("ae", "971", "United Arab Emirates (UAE)", getFlagEmojiByCountryNameCode("ae")))
    countries.add(CCPCountry("af", "93", "Afghanistan", getFlagEmojiByCountryNameCode("af")))
    countries.add(CCPCountry("ag", "1", "Antigua and Barbuda", getFlagEmojiByCountryNameCode("ag")))
    countries.add(CCPCountry("ai", "1", "Anguilla", getFlagEmojiByCountryNameCode("ai")))
    countries.add(CCPCountry("al", "355", "Albania", getFlagEmojiByCountryNameCode("al")))
    countries.add(CCPCountry("am", "374", "Armenia", getFlagEmojiByCountryNameCode("am")))
    countries.add(CCPCountry("ao", "244", "Angola", getFlagEmojiByCountryNameCode("ao")))
    countries.add(CCPCountry("aq", "672", "Antarctica", getFlagEmojiByCountryNameCode("aq")))
    countries.add(CCPCountry("ar", "54", "Argentina", getFlagEmojiByCountryNameCode("ar")))
    countries.add(CCPCountry("as", "1", "American Samoa", getFlagEmojiByCountryNameCode("as")))
    countries.add(CCPCountry("at", "43", "Austria", getFlagEmojiByCountryNameCode("at")))
    countries.add(CCPCountry("au", "61", "Australia", getFlagEmojiByCountryNameCode("au")))
    countries.add(CCPCountry("aw", "297", "Aruba", getFlagEmojiByCountryNameCode("aw")))
    countries.add(CCPCountry("ax", "358", "Åland Islands", getFlagEmojiByCountryNameCode("ax")))
    countries.add(CCPCountry("az", "994", "Azerbaijan", getFlagEmojiByCountryNameCode("az")))
    countries.add(CCPCountry("ba", "387", "Bosnia And Herzegovina", getFlagEmojiByCountryNameCode("ba")))
    countries.add(CCPCountry("bb", "1", "Barbados", getFlagEmojiByCountryNameCode("bb")))
    countries.add(CCPCountry("bd", "880", "Bangladesh", getFlagEmojiByCountryNameCode("bd")))
    countries.add(CCPCountry("be", "32", "Belgium", getFlagEmojiByCountryNameCode("be")))
    countries.add(CCPCountry("bf", "226", "Burkina Faso", getFlagEmojiByCountryNameCode("bf")))
    countries.add(CCPCountry("bg", "359", "Bulgaria", getFlagEmojiByCountryNameCode("bg")))
    countries.add(CCPCountry("bh", "973", "Bahrain", getFlagEmojiByCountryNameCode("bh")))
    countries.add(CCPCountry("bi", "257", "Burundi", getFlagEmojiByCountryNameCode("bi")))
    countries.add(CCPCountry("bj", "229", "Benin", getFlagEmojiByCountryNameCode("bj")))
    countries.add(CCPCountry("bl", "590", "Saint Barthélemy", getFlagEmojiByCountryNameCode("bl")))
    countries.add(CCPCountry("bm", "1", "Bermuda", getFlagEmojiByCountryNameCode("bm")))
    countries.add(CCPCountry("bn", "673", "Brunei Darussalam", getFlagEmojiByCountryNameCode("bn")))
    countries.add(CCPCountry("bo", "591", "Bolivia, Plurinational State Of", getFlagEmojiByCountryNameCode("bo")))
    countries.add(CCPCountry("br", "55", "Brazil", getFlagEmojiByCountryNameCode("br")))
    countries.add(CCPCountry("bs", "1", "Bahamas", getFlagEmojiByCountryNameCode("bs")))
    countries.add(CCPCountry("bt", "975", "Bhutan", getFlagEmojiByCountryNameCode("bt")))
    countries.add(CCPCountry("bw", "267", "Botswana", getFlagEmojiByCountryNameCode("bw")))
    countries.add(CCPCountry("by", "375", "Belarus", getFlagEmojiByCountryNameCode("by")))
    countries.add(CCPCountry("bz", "501", "Belize", getFlagEmojiByCountryNameCode("bz")))
    countries.add(CCPCountry("ca", "1", "Canada", getFlagEmojiByCountryNameCode("ca")))
    countries.add(CCPCountry("cc", "61", "Cocos (keeling) Islands", getFlagEmojiByCountryNameCode("cc")))
    countries.add(
        CCPCountry(
            "cd",
            "243",
            "Congo, The Democratic Republic Of The",
            getFlagEmojiByCountryNameCode("cd")
        )
    )
    countries.add(CCPCountry("cf", "236", "Central African Republic", getFlagEmojiByCountryNameCode("cf")))
    countries.add(CCPCountry("cg", "242", "Congo", getFlagEmojiByCountryNameCode("cg")))
    countries.add(CCPCountry("ch", "41", "Switzerland", getFlagEmojiByCountryNameCode("ch")))
    countries.add(CCPCountry("ci", "225", "Côte D'ivoire", getFlagEmojiByCountryNameCode("ci")))
    countries.add(CCPCountry("ck", "682", "Cook Islands", getFlagEmojiByCountryNameCode("ck")))
    countries.add(CCPCountry("cl", "56", "Chile", getFlagEmojiByCountryNameCode("cl")))
    countries.add(CCPCountry("cm", "237", "Cameroon", getFlagEmojiByCountryNameCode("cm")))
    countries.add(CCPCountry("cn", "86", "China", getFlagEmojiByCountryNameCode("cn")))
    countries.add(CCPCountry("co", "57", "Colombia", getFlagEmojiByCountryNameCode("co")))
    countries.add(CCPCountry("cr", "506", "Costa Rica", getFlagEmojiByCountryNameCode("cr")))
    countries.add(CCPCountry("cu", "53", "Cuba", getFlagEmojiByCountryNameCode("cu")))
    countries.add(CCPCountry("cv", "238", "Cape Verde", getFlagEmojiByCountryNameCode("cv")))
    countries.add(CCPCountry("cw", "599", "Curaçao", getFlagEmojiByCountryNameCode("cw")))
    countries.add(CCPCountry("cx", "61", "Christmas Island", getFlagEmojiByCountryNameCode("cx")))
    countries.add(CCPCountry("cy", "357", "Cyprus", getFlagEmojiByCountryNameCode("cy")))
    countries.add(CCPCountry("cz", "420", "Czech Republic", getFlagEmojiByCountryNameCode("cz")))
    countries.add(CCPCountry("de", "49", "Germany", getFlagEmojiByCountryNameCode("de")))
    countries.add(CCPCountry("dj", "253", "Djibouti", getFlagEmojiByCountryNameCode("dj")))
    countries.add(CCPCountry("dk", "45", "Denmark", getFlagEmojiByCountryNameCode("dk")))
    countries.add(CCPCountry("dm", "1", "Dominica", getFlagEmojiByCountryNameCode("dm")))
    countries.add(CCPCountry("do", "1", "Dominican Republic", getFlagEmojiByCountryNameCode("do")))
    countries.add(CCPCountry("dz", "213", "Algeria", getFlagEmojiByCountryNameCode("dz")))
    countries.add(CCPCountry("ec", "593", "Ecuador", getFlagEmojiByCountryNameCode("ec")))
    countries.add(CCPCountry("ee", "372", "Estonia", getFlagEmojiByCountryNameCode("ee")))
    countries.add(CCPCountry("eg", "20", "Egypt", getFlagEmojiByCountryNameCode("eg")))
    countries.add(CCPCountry("er", "291", "Eritrea", getFlagEmojiByCountryNameCode("er")))
    countries.add(CCPCountry("es", "34", "Spain", getFlagEmojiByCountryNameCode("es")))
    countries.add(CCPCountry("et", "251", "Ethiopia", getFlagEmojiByCountryNameCode("et")))
    countries.add(CCPCountry("fi", "358", "Finland", getFlagEmojiByCountryNameCode("fi")))
    countries.add(CCPCountry("fj", "679", "Fiji", getFlagEmojiByCountryNameCode("fj")))
    countries.add(CCPCountry("fk", "500", "Falkland Islands (malvinas)", getFlagEmojiByCountryNameCode("fk")))
    countries.add(CCPCountry("fm", "691", "Micronesia, Federated States Of", getFlagEmojiByCountryNameCode("fm")))
    countries.add(CCPCountry("fo", "298", "Faroe Islands", getFlagEmojiByCountryNameCode("fo")))
    countries.add(CCPCountry("fr", "33", "France", getFlagEmojiByCountryNameCode("fr")))
    countries.add(CCPCountry("ga", "241", "Gabon", getFlagEmojiByCountryNameCode("ga")))
    countries.add(CCPCountry("gb", "44", "United Kingdom", getFlagEmojiByCountryNameCode("gb")))
    countries.add(CCPCountry("gd", "1", "Grenada", getFlagEmojiByCountryNameCode("gd")))
    countries.add(CCPCountry("ge", "995", "Georgia", getFlagEmojiByCountryNameCode("ge")))
    countries.add(CCPCountry("gf", "594", "French Guyana", getFlagEmojiByCountryNameCode("gf")))
    countries.add(CCPCountry("gh", "233", "Ghana", getFlagEmojiByCountryNameCode("gh")))
    countries.add(CCPCountry("gi", "350", "Gibraltar", getFlagEmojiByCountryNameCode("gi")))
    countries.add(CCPCountry("gl", "299", "Greenland", getFlagEmojiByCountryNameCode("gl")))
    countries.add(CCPCountry("gm", "220", "Gambia", getFlagEmojiByCountryNameCode("gm")))
    countries.add(CCPCountry("gn", "224", "Guinea", getFlagEmojiByCountryNameCode("gn")))
    countries.add(CCPCountry("gp", "450", "Guadeloupe", getFlagEmojiByCountryNameCode("gp")))
    countries.add(CCPCountry("gq", "240", "Equatorial Guinea", getFlagEmojiByCountryNameCode("gq")))
    countries.add(CCPCountry("gr", "30", "Greece", getFlagEmojiByCountryNameCode("gr")))
    countries.add(CCPCountry("gt", "502", "Guatemala", getFlagEmojiByCountryNameCode("gt")))
    countries.add(CCPCountry("gu", "1", "Guam", getFlagEmojiByCountryNameCode("gu")))
    countries.add(CCPCountry("gw", "245", "Guinea-bissau", getFlagEmojiByCountryNameCode("gw")))
    countries.add(CCPCountry("gy", "592", "Guyana", getFlagEmojiByCountryNameCode("gy")))
    countries.add(CCPCountry("hk", "852", "Hong Kong", getFlagEmojiByCountryNameCode("hk")))
    countries.add(CCPCountry("hn", "504", "Honduras", getFlagEmojiByCountryNameCode("hn")))
    countries.add(CCPCountry("hr", "385", "Croatia", getFlagEmojiByCountryNameCode("hr")))
    countries.add(CCPCountry("ht", "509", "Haiti", getFlagEmojiByCountryNameCode("ht")))
    countries.add(CCPCountry("hu", "36", "Hungary", getFlagEmojiByCountryNameCode("hu")))
    countries.add(CCPCountry("id", "62", "Indonesia", getFlagEmojiByCountryNameCode("id")))
    countries.add(CCPCountry("ie", "353", "Ireland", getFlagEmojiByCountryNameCode("ie")))
    countries.add(CCPCountry("il", "972", "Israel", getFlagEmojiByCountryNameCode("il")))
    countries.add(CCPCountry("im", "44", "Isle Of Man", getFlagEmojiByCountryNameCode("im")))
    countries.add(CCPCountry("is", "354", "Iceland", getFlagEmojiByCountryNameCode("is")))
    countries.add(CCPCountry("in", "91", "India", getFlagEmojiByCountryNameCode("in")))
    countries.add(CCPCountry("io", "246", "British Indian Ocean Territory", getFlagEmojiByCountryNameCode("io")))
    countries.add(CCPCountry("iq", "964", "Iraq", getFlagEmojiByCountryNameCode("iq")))
    countries.add(CCPCountry("ir", "98", "Iran, Islamic Republic Of", getFlagEmojiByCountryNameCode("ir")))
    countries.add(CCPCountry("it", "39", "Italy", getFlagEmojiByCountryNameCode("it")))
    countries.add(CCPCountry("je", "44", "Jersey ", getFlagEmojiByCountryNameCode("je")))
    countries.add(CCPCountry("jm", "1", "Jamaica", getFlagEmojiByCountryNameCode("jm")))
    countries.add(CCPCountry("jo", "962", "Jordan", getFlagEmojiByCountryNameCode("jo")))
    countries.add(CCPCountry("jp", "81", "Japan", getFlagEmojiByCountryNameCode("jp")))
    countries.add(CCPCountry("ke", "254", "Kenya", getFlagEmojiByCountryNameCode("ke")))
    countries.add(CCPCountry("kg", "996", "Kyrgyzstan", getFlagEmojiByCountryNameCode("kg")))
    countries.add(CCPCountry("kh", "855", "Cambodia", getFlagEmojiByCountryNameCode("kh")))
    countries.add(CCPCountry("ki", "686", "Kiribati", getFlagEmojiByCountryNameCode("ki")))
    countries.add(CCPCountry("km", "269", "Comoros", getFlagEmojiByCountryNameCode("km")))
    countries.add(CCPCountry("kn", "1", "Saint Kitts and Nevis", getFlagEmojiByCountryNameCode("kn")))
    countries.add(CCPCountry("kp", "850", "North Korea", getFlagEmojiByCountryNameCode("kp")))
    countries.add(CCPCountry("kr", "82", "South Korea", getFlagEmojiByCountryNameCode("kr")))
    countries.add(CCPCountry("kw", "965", "Kuwait", getFlagEmojiByCountryNameCode("kw")))
    countries.add(CCPCountry("ky", "1", "Cayman Islands", getFlagEmojiByCountryNameCode("ky")))
    countries.add(CCPCountry("kz", "7", "Kazakhstan", getFlagEmojiByCountryNameCode("kz")))
    countries.add(CCPCountry("la", "856", "Lao People's Democratic Republic", getFlagEmojiByCountryNameCode("la")))
    countries.add(CCPCountry("lb", "961", "Lebanon", getFlagEmojiByCountryNameCode("lb")))
    countries.add(CCPCountry("lc", "1", "Saint Lucia", getFlagEmojiByCountryNameCode("lc")))
    countries.add(CCPCountry("li", "423", "Liechtenstein", getFlagEmojiByCountryNameCode("li")))
    countries.add(CCPCountry("lk", "94", "Sri Lanka", getFlagEmojiByCountryNameCode("lk")))
    countries.add(CCPCountry("lr", "231", "Liberia", getFlagEmojiByCountryNameCode("lr")))
    countries.add(CCPCountry("ls", "266", "Lesotho", getFlagEmojiByCountryNameCode("ls")))
    countries.add(CCPCountry("lt", "370", "Lithuania", getFlagEmojiByCountryNameCode("lt")))
    countries.add(CCPCountry("lu", "352", "Luxembourg", getFlagEmojiByCountryNameCode("lu")))
    countries.add(CCPCountry("lv", "371", "Latvia", getFlagEmojiByCountryNameCode("lv")))
    countries.add(CCPCountry("ly", "218", "Libya", getFlagEmojiByCountryNameCode("ly")))
    countries.add(CCPCountry("ma", "212", "Morocco", getFlagEmojiByCountryNameCode("ma")))
    countries.add(CCPCountry("mc", "377", "Monaco", getFlagEmojiByCountryNameCode("mc")))
    countries.add(CCPCountry("md", "373", "Moldova, Republic Of", getFlagEmojiByCountryNameCode("md")))
    countries.add(CCPCountry("me", "382", "Montenegro", getFlagEmojiByCountryNameCode("me")))
    countries.add(CCPCountry("mf", "590", "Saint Martin", getFlagEmojiByCountryNameCode("mf")))
    countries.add(CCPCountry("mg", "261", "Madagascar", getFlagEmojiByCountryNameCode("mg")))
    countries.add(CCPCountry("mh", "692", "Marshall Islands", getFlagEmojiByCountryNameCode("mh")))
    countries.add(CCPCountry("mk", "389", "Macedonia (FYROM)", getFlagEmojiByCountryNameCode("mk")))
    countries.add(CCPCountry("ml", "223", "Mali", getFlagEmojiByCountryNameCode("ml")))
    countries.add(CCPCountry("mm", "95", "Myanmar", getFlagEmojiByCountryNameCode("mm")))
    countries.add(CCPCountry("mn", "976", "Mongolia", getFlagEmojiByCountryNameCode("mn")))
    countries.add(CCPCountry("mo", "853", "Macau", getFlagEmojiByCountryNameCode("mo")))
    countries.add(CCPCountry("mp", "1", "Northern Mariana Islands", getFlagEmojiByCountryNameCode("mp")))
    countries.add(CCPCountry("mq", "596", "Martinique", getFlagEmojiByCountryNameCode("mq")))
    countries.add(CCPCountry("mr", "222", "Mauritania", getFlagEmojiByCountryNameCode("mr")))
    countries.add(CCPCountry("ms", "1", "Montserrat", getFlagEmojiByCountryNameCode("ms")))
    countries.add(CCPCountry("mt", "356", "Malta", getFlagEmojiByCountryNameCode("mt")))
    countries.add(CCPCountry("mu", "230", "Mauritius", getFlagEmojiByCountryNameCode("mu")))
    countries.add(CCPCountry("mv", "960", "Maldives", getFlagEmojiByCountryNameCode("mv")))
    countries.add(CCPCountry("mw", "265", "Malawi", getFlagEmojiByCountryNameCode("mw")))
    countries.add(CCPCountry("mx", "52", "Mexico", getFlagEmojiByCountryNameCode("mx")))
    countries.add(CCPCountry("my", "60", "Malaysia", getFlagEmojiByCountryNameCode("my")))
    countries.add(CCPCountry("mz", "258", "Mozambique", getFlagEmojiByCountryNameCode("mz")))
    countries.add(CCPCountry("na", "264", "Namibia", getFlagEmojiByCountryNameCode("na")))
    countries.add(CCPCountry("nc", "687", "New Caledonia", getFlagEmojiByCountryNameCode("nc")))
    countries.add(CCPCountry("ne", "227", "Niger", getFlagEmojiByCountryNameCode("ne")))
    countries.add(CCPCountry("nf", "672", "Norfolk Islands", getFlagEmojiByCountryNameCode("nf")))
    countries.add(CCPCountry("ng", "234", "Nigeria", getFlagEmojiByCountryNameCode("ng")))
    countries.add(CCPCountry("ni", "505", "Nicaragua", getFlagEmojiByCountryNameCode("ni")))
    countries.add(CCPCountry("nl", "31", "Netherlands", getFlagEmojiByCountryNameCode("nl")))
    countries.add(CCPCountry("no", "47", "Norway", getFlagEmojiByCountryNameCode("no")))
    countries.add(CCPCountry("np", "977", "Nepal", getFlagEmojiByCountryNameCode("np")))
    countries.add(CCPCountry("nr", "674", "Nauru", getFlagEmojiByCountryNameCode("nr")))
    countries.add(CCPCountry("nu", "683", "Niue", getFlagEmojiByCountryNameCode("nu")))
    countries.add(CCPCountry("nz", "64", "New Zealand", getFlagEmojiByCountryNameCode("nz")))
    countries.add(CCPCountry("om", "968", "Oman", getFlagEmojiByCountryNameCode("om")))
    countries.add(CCPCountry("pa", "507", "Panama", getFlagEmojiByCountryNameCode("pa")))
    countries.add(CCPCountry("pe", "51", "Peru", getFlagEmojiByCountryNameCode("pe")))
    countries.add(CCPCountry("pf", "689", "French Polynesia", getFlagEmojiByCountryNameCode("pf")))
    countries.add(CCPCountry("pg", "675", "Papua New Guinea", getFlagEmojiByCountryNameCode("pg")))
    countries.add(CCPCountry("ph", "63", "Philippines", getFlagEmojiByCountryNameCode("ph")))
    countries.add(CCPCountry("pk", "92", "Pakistan", getFlagEmojiByCountryNameCode("pk")))
    countries.add(CCPCountry("pl", "48", "Poland", getFlagEmojiByCountryNameCode("pl")))
    countries.add(CCPCountry("pm", "508", "Saint Pierre And Miquelon", getFlagEmojiByCountryNameCode("pm")))
    countries.add(CCPCountry("pn", "870", "Pitcairn Islands", getFlagEmojiByCountryNameCode("pn")))
    countries.add(CCPCountry("pr", "1", "Puerto Rico", getFlagEmojiByCountryNameCode("pr")))
    countries.add(CCPCountry("ps", "970", "Palestine", getFlagEmojiByCountryNameCode("ps")))
    countries.add(CCPCountry("pt", "351", "Portugal", getFlagEmojiByCountryNameCode("pt")))
    countries.add(CCPCountry("pw", "680", "Palau", getFlagEmojiByCountryNameCode("pw")))
    countries.add(CCPCountry("py", "595", "Paraguay", getFlagEmojiByCountryNameCode("py")))
    countries.add(CCPCountry("qa", "974", "Qatar", getFlagEmojiByCountryNameCode("qa")))
    countries.add(CCPCountry("re", "262", "Réunion", getFlagEmojiByCountryNameCode("re")))
    countries.add(CCPCountry("ro", "40", "Romania", getFlagEmojiByCountryNameCode("ro")))
    countries.add(CCPCountry("rs", "381", "Serbia", getFlagEmojiByCountryNameCode("rs")))
    countries.add(CCPCountry("ru", "7", "Russian Federation", getFlagEmojiByCountryNameCode("ru")))
    countries.add(CCPCountry("rw", "250", "Rwanda", getFlagEmojiByCountryNameCode("rw")))
    countries.add(CCPCountry("sa", "966", "Saudi Arabia", getFlagEmojiByCountryNameCode("sa")))
    countries.add(CCPCountry("sb", "677", "Solomon Islands", getFlagEmojiByCountryNameCode("sb")))
    countries.add(CCPCountry("sc", "248", "Seychelles", getFlagEmojiByCountryNameCode("sc")))
    countries.add(CCPCountry("sd", "249", "Sudan", getFlagEmojiByCountryNameCode("sd")))
    countries.add(CCPCountry("se", "46", "Sweden", getFlagEmojiByCountryNameCode("se")))
    countries.add(CCPCountry("sg", "65", "Singapore", getFlagEmojiByCountryNameCode("sg")))
    countries.add(
        CCPCountry(
            "sh",
            "290",
            "Saint Helena, Ascension And Tristan Da Cunha",
            getFlagEmojiByCountryNameCode("sh")
        )
    )
    countries.add(CCPCountry("si", "386", "Slovenia", getFlagEmojiByCountryNameCode("si")))
    countries.add(CCPCountry("sk", "421", "Slovakia", getFlagEmojiByCountryNameCode("sk")))
    countries.add(CCPCountry("sl", "232", "Sierra Leone", getFlagEmojiByCountryNameCode("sl")))
    countries.add(CCPCountry("sm", "378", "San Marino", getFlagEmojiByCountryNameCode("sm")))
    countries.add(CCPCountry("sn", "221", "Senegal", getFlagEmojiByCountryNameCode("sn")))
    countries.add(CCPCountry("so", "252", "Somalia", getFlagEmojiByCountryNameCode("so")))
    countries.add(CCPCountry("sr", "597", "Suriname", getFlagEmojiByCountryNameCode("sr")))
    countries.add(CCPCountry("ss", "211", "South Sudan", getFlagEmojiByCountryNameCode("ss")))
    countries.add(CCPCountry("st", "239", "Sao Tome And Principe", getFlagEmojiByCountryNameCode("st")))
    countries.add(CCPCountry("sv", "503", "El Salvador", getFlagEmojiByCountryNameCode("sv")))
    countries.add(CCPCountry("sx", "1", "Sint Maarten", getFlagEmojiByCountryNameCode("sx")))
    countries.add(CCPCountry("sy", "963", "Syrian Arab Republic", getFlagEmojiByCountryNameCode("sy")))
    countries.add(CCPCountry("sz", "268", "Swaziland", getFlagEmojiByCountryNameCode("sz")))
    countries.add(CCPCountry("tc", "1", "Turks and Caicos Islands", getFlagEmojiByCountryNameCode("tc")))
    countries.add(CCPCountry("td", "235", "Chad", getFlagEmojiByCountryNameCode("td")))
    countries.add(CCPCountry("tg", "228", "Togo", getFlagEmojiByCountryNameCode("tg")))
    countries.add(CCPCountry("th", "66", "Thailand", getFlagEmojiByCountryNameCode("th")))
    countries.add(CCPCountry("tj", "992", "Tajikistan", getFlagEmojiByCountryNameCode("tj")))
    countries.add(CCPCountry("tk", "690", "Tokelau", getFlagEmojiByCountryNameCode("tk")))
    countries.add(CCPCountry("tl", "670", "Timor-leste", getFlagEmojiByCountryNameCode("tl")))
    countries.add(CCPCountry("tm", "993", "Turkmenistan", getFlagEmojiByCountryNameCode("tm")))
    countries.add(CCPCountry("tn", "216", "Tunisia", getFlagEmojiByCountryNameCode("tn")))
    countries.add(CCPCountry("to", "676", "Tonga", getFlagEmojiByCountryNameCode("to")))
    countries.add(CCPCountry("tr", "90", "Turkey", getFlagEmojiByCountryNameCode("tr")))
    countries.add(CCPCountry("tt", "1", "Trinidad &amp; Tobago", getFlagEmojiByCountryNameCode("tt")))
    countries.add(CCPCountry("tv", "688", "Tuvalu", getFlagEmojiByCountryNameCode("tv")))
    countries.add(CCPCountry("tw", "886", "Taiwan", getFlagEmojiByCountryNameCode("tw")))
    countries.add(CCPCountry("tz", "255", "Tanzania, United Republic Of", getFlagEmojiByCountryNameCode("tz")))
    countries.add(CCPCountry("ua", "380", "Ukraine", getFlagEmojiByCountryNameCode("ua")))
    countries.add(CCPCountry("ug", "256", "Uganda", getFlagEmojiByCountryNameCode("ug")))
    countries.add(CCPCountry("us", "1", "United States", getFlagEmojiByCountryNameCode("us")))
    countries.add(CCPCountry("uy", "598", "Uruguay", getFlagEmojiByCountryNameCode("uy")))
    countries.add(CCPCountry("uz", "998", "Uzbekistan", getFlagEmojiByCountryNameCode("uz")))
    countries.add(CCPCountry("va", "379", "Holy See (vatican City State)", getFlagEmojiByCountryNameCode("va")))
    countries.add(CCPCountry("vc", "1", "Saint Vincent &amp; The Grenadines", getFlagEmojiByCountryNameCode("vc")))
    countries.add(CCPCountry("ve", "58", "Venezuela, Bolivarian Republic Of", getFlagEmojiByCountryNameCode("ve")))
    countries.add(CCPCountry("vg", "1", "British Virgin Islands", getFlagEmojiByCountryNameCode("vg")))
    countries.add(CCPCountry("vi", "1", "US Virgin Islands", getFlagEmojiByCountryNameCode("vi")))
    countries.add(CCPCountry("vn", "84", "Vietnam", getFlagEmojiByCountryNameCode("vn")))
    countries.add(CCPCountry("vu", "678", "Vanuatu", getFlagEmojiByCountryNameCode("vu")))
    countries.add(CCPCountry("wf", "681", "Wallis And Futuna", getFlagEmojiByCountryNameCode("wf")))
    countries.add(CCPCountry("ws", "685", "Samoa", getFlagEmojiByCountryNameCode("ws")))
    countries.add(CCPCountry("xk", "383", "Kosovo", getFlagEmojiByCountryNameCode("xk")))
    countries.add(CCPCountry("ye", "967", "Yemen", getFlagEmojiByCountryNameCode("ye")))
    countries.add(CCPCountry("yt", "262", "Mayotte", getFlagEmojiByCountryNameCode("yt")))
    countries.add(CCPCountry("za", "27", "South Africa", getFlagEmojiByCountryNameCode("za")))
    countries.add(CCPCountry("zm", "260", "Zambia", getFlagEmojiByCountryNameCode("zm")))
    countries.add(CCPCountry("zw", "263", "Zimbabwe", getFlagEmojiByCountryNameCode("zw")))
    return countries
}
fun getFlagEmojiByCountryNameCode(flagEmoji: String): String {
    return when (flagEmoji) {
        "ad" -> "🇦🇩"
        "ae" -> "🇦🇪"
        "af" -> "🇦🇫"
        "ag" -> "🇦🇬"
        "ai" -> "🇦🇮"
        "al" -> "🇦🇱"
        "am" -> "🇦🇲"
        "ao" -> "🇦🇴"
        "aq" -> "🇦🇶"
        "ar" -> "🇦🇷"
        "as" -> "🇦🇸"
        "at" -> "🇦🇹"
        "au" -> "🇦🇺"
        "aw" -> "🇦🇼"
        "ax" -> "🇦🇽"
        "az" -> "🇦🇿"
        "ba" -> "🇧🇦"
        "bb" -> "🇧🇧"
        "bd" -> "🇧🇩"
        "be" -> "🇧🇪"
        "bf" -> "🇧🇫"
        "bg" -> "🇧🇬"
        "bh" -> "🇧🇭"
        "bi" -> "🇧🇮"
        "bj" -> "🇧🇯"
        "bl" -> "🇧🇱"
        "bm" -> "🇧🇲"
        "bn" -> "🇧🇳"
        "bo" -> "🇧🇴"
        "bq" -> "🇧🇶"
        "br" -> "🇧🇷"
        "bs" -> "🇧🇸"
        "bt" -> "🇧🇹"
        "bv" -> "🇧🇻"
        "bw" -> "🇧🇼"
        "by" -> "🇧🇾"
        "bz" -> "🇧🇿"
        "ca" -> "🇨🇦"
        "cc" -> "🇨🇨"
        "cd" -> "🇨🇩"
        "cf" -> "🇨🇫"
        "cg" -> "🇨🇬"
        "ch" -> "🇨🇭"
        "ci" -> "🇨🇮"
        "ck" -> "🇨🇰"
        "cl" -> "🇨🇱"
        "cm" -> "🇨🇲"
        "cn" -> "🇨🇳"
        "co" -> "🇨🇴"
        "cr" -> "🇨🇷"
        "cu" -> "🇨🇺"
        "cv" -> "🇨🇻"
        "cw" -> "🇨🇼"
        "cx" -> "🇨🇽"
        "cy" -> "🇨🇾"
        "cz" -> "🇨🇿"
        "de" -> "🇩🇪"
        "dj" -> "🇩🇯"
        "dk" -> "🇩🇰"
        "dm" -> "🇩🇲"
        "do" -> "🇩🇴"
        "dz" -> "🇩🇿"
        "ec" -> "🇪🇨"
        "ee" -> "🇪🇪"
        "eg" -> "🇪🇬"
        "eh" -> "🇪🇭"
        "er" -> "🇪🇷"
        "es" -> "🇪🇸"
        "et" -> "🇪🇹"
        "fi" -> "🇫🇮"
        "fj" -> "🇫🇯"
        "fk" -> "🇫🇰"
        "fm" -> "🇫🇲"
        "fo" -> "🇫🇴"
        "fr" -> "🇫🇷"
        "ga" -> "🇬🇦"
        "gb" -> "🇬🇧"
        "gd" -> "🇬🇩"
        "ge" -> "🇬🇪"
        "gf" -> "🇬🇫"
        "gg" -> "🇬🇬"
        "gh" -> "🇬🇭"
        "gi" -> "🇬🇮"
        "gl" -> "🇬🇱"
        "gm" -> "🇬🇲"
        "gn" -> "🇬🇳"
        "gp" -> "🇬🇵"
        "gq" -> "🇬🇶"
        "gr" -> "🇬🇷"
        "gs" -> "🇬🇸"
        "gt" -> "🇬🇹"
        "gu" -> "🇬🇺"
        "gw" -> "🇬🇼"
        "gy" -> "🇬🇾"
        "hk" -> "🇭🇰"
        "hm" -> "🇭🇲"
        "hn" -> "🇭🇳"
        "hr" -> "🇭🇷"
        "ht" -> "🇭🇹"
        "hu" -> "🇭🇺"
        "id" -> "🇮🇩"
        "ie" -> "🇮🇪"
        "il" -> "🇮🇱"
        "im" -> "🇮🇲"
        "in" -> "🇮🇳"
        "io" -> "🇮🇴"
        "iq" -> "🇮🇶"
        "ir" -> "🇮🇷"
        "is" -> "🇮🇸"
        "it" -> "🇮🇹"
        "je" -> "🇯🇪"
        "jm" -> "🇯🇲"
        "jo" -> "🇯🇴"
        "jp" -> "🇯🇵"
        "ke" -> "🇰🇪"
        "kg" -> "🇰🇬"
        "kh" -> "🇰🇭"
        "ki" -> "🇰🇮"
        "km" -> "🇰🇲"
        "kn" -> "🇰🇳"
        "kp" -> "🇰🇵"
        "kr" -> "🇰🇷"
        "kw" -> "🇰🇼"
        "ky" -> "🇰🇾"
        "kz" -> "🇰🇿"
        "la" -> "🇱🇦"
        "lb" -> "🇱🇧"
        "lc" -> "🇱🇨"
        "li" -> "🇱🇮"
        "lk" -> "🇱🇰"
        "lr" -> "🇱🇷"
        "ls" -> "🇱🇸"
        "lt" -> "🇱🇹"
        "lu" -> "🇱🇺"
        "lv" -> "🇱🇻"
        "ly" -> "🇱🇾"
        "ma" -> "🇲🇦"
        "mc" -> "🇲🇨"
        "md" -> "🇲🇩"
        "me" -> "🇲🇪"
        "mf" -> "🇲🇫"
        "mg" -> "🇲🇬"
        "mh" -> "🇲🇭"
        "mk" -> "🇲🇰"
        "ml" -> "🇲🇱"
        "mm" -> "🇲🇲"
        "mn" -> "🇲🇳"
        "mo" -> "🇲🇴"
        "mp" -> "🇲🇵"
        "mq" -> "🇲🇶"
        "mr" -> "🇲🇷"
        "ms" -> "🇲🇸"
        "mt" -> "🇲🇹"
        "mu" -> "🇲🇺"
        "mv" -> "🇲🇻"
        "mw" -> "🇲🇼"
        "mx" -> "🇲🇽"
        "my" -> "🇲🇾"
        "mz" -> "🇲🇿"
        "na" -> "🇳🇦"
        "nc" -> "🇳🇨"
        "ne" -> "🇳🇪"
        "nf" -> "🇳🇫"
        "ng" -> "🇳🇬"
        "ni" -> "🇳🇮"
        "nl" -> "🇳🇱"
        "no" -> "🇳🇴"
        "np" -> "🇳🇵"
        "nr" -> "🇳🇷"
        "nu" -> "🇳🇺"
        "nz" -> "🇳🇿"
        "om" -> "🇴🇲"
        "pa" -> "🇵🇦"
        "pe" -> "🇵🇪"
        "pf" -> "🇵🇫"
        "pg" -> "🇵🇬"
        "ph" -> "🇵🇭"
        "pk" -> "🇵🇰"
        "pl" -> "🇵🇱"
        "pm" -> "🇵🇲"
        "pn" -> "🇵🇳"
        "pr" -> "🇵🇷"
        "ps" -> "🇵🇸"
        "pt" -> "🇵🇹"
        "pw" -> "🇵🇼"
        "py" -> "🇵🇾"
        "qa" -> "🇶🇦"
        "re" -> "🇷🇪"
        "ro" -> "🇷🇴"
        "rs" -> "🇷🇸"
        "ru" -> "🇷🇺"
        "rw" -> "🇷🇼"
        "sa" -> "🇸🇦"
        "sb" -> "🇸🇧"
        "sc" -> "🇸🇨"
        "sd" -> "🇸🇩"
        "se" -> "🇸🇪"
        "sg" -> "🇸🇬"
        "sh" -> "🇸🇭"
        "si" -> "🇸🇮"
        "sj" -> "🇸🇯"
        "sk" -> "🇸🇰"
        "sl" -> "🇸🇱"
        "sm" -> "🇸🇲"
        "sn" -> "🇸🇳"
        "so" -> "🇸🇴"
        "sr" -> "🇸🇷"
        "ss" -> "🇸🇸"
        "st" -> "🇸🇹"
        "sv" -> "🇸🇻"
        "sx" -> "🇸🇽"
        "sy" -> "🇸🇾"
        "sz" -> "🇸🇿"
        "tc" -> "🇹🇨"
        "td" -> "🇹🇩"
        "tf" -> "🇹🇫"
        "tg" -> "🇹🇬"
        "th" -> "🇹🇭"
        "tj" -> "🇹🇯"
        "tk" -> "🇹🇰"
        "tl" -> "🇹🇱"
        "tm" -> "🇹🇲"
        "tn" -> "🇹🇳"
        "to" -> "🇹🇴"
        "tr" -> "🇹🇷"
        "tt" -> "🇹🇹"
        "tv" -> "🇹🇻"
        "tw" -> "🇹🇼"
        "tz" -> "🇹🇿"
        "ua" -> "🇺🇦"
        "ug" -> "🇺🇬"
        "um" -> "🇺🇲"
        "us" -> "🇺🇸"
        "uy" -> "🇺🇾"
        "uz" -> "🇺🇿"
        "va" -> "🇻🇦"
        "vc" -> "🇻🇨"
        "ve" -> "🇻🇪"
        "vg" -> "🇻🇬"
        "vi" -> "🇻🇮"
        "vn" -> "🇻🇳"
        "vu" -> "🇻🇺"
        "wf" -> "🇼🇫"
        "ws" -> "🇼🇸"
        "xk" -> "🇽🇰"
        "ye" -> "🇾🇪"
        "yt" -> "🇾🇹"
        "za" -> "🇿🇦"
        "zm" -> "🇿🇲"
        "zw" -> "🇿🇼"
        else -> " "
    }
}
