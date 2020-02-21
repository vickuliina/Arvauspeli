# Arvauspeli

Ensimmäisiä komentorivi-pelejä, jossa ideana on arvata mahdollisimman nopeasti tietty sana.
Pelin alussa kysytään osallistujamäärä ja jokaisen osallistujan nimimerkki. Joka kierroksella ruudulle ilmestyy kategoria, sekä kirjain.
Tehtävänä on mahdollisimman nopeasti keksiä kirjaimella alkava sana, joka kuuluu kategoriaan. Esimerkiksi kirjain: A ja kategoria: Kulkuväline, niin vastaus: Auto.
Nopeiten arvannut saa pisteen ja luonnollisesti eniten pisteitä kerännyt voittaa.

### Ohjelman käynnistys
Peli käynnistetään Arvauspeli.java luokan main-medodista.

### Ohjelman runko
##### Arvauspeli.java
Sisältää pelin alustuksen ja pelaajien nimimerkkien tallentamisen.

##### Pelaaja.java
Kuvastaa yhtä pelaajaa. Pelaaja sisältää mm. pisteiden määrän.

##### Peli.java
Sisältää itse pelin kulun toiminnallisuudet, kuten komentoriville tiedon pelin vaiheista.