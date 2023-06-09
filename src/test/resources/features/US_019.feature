@smoke
Feature: Bir kullanici olarak sitedeki alisverislerde
         kullanabilecegim bir cüzdanimin olmasini ve
         bu cüzdanla ilgili islemlerimi yapabilcegim bir sayfanin olmasini istiyorum.

  Scenario: TC_001-Dashboard sayfasinda bulunan side bar'daki My Wallet linkinin
            Wallet sayfasina yönlendirdigi dogrulanmali.

    Given Kullanici Anasayfa "url" 'ine gider.
    Then  Subscribe popup kapatilir
    Then  Login butonuna basar
    Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
    And   Signed in butonuna basar
    Then  DashBoard butonuna tiklar
    Then  My Wallet Linki tiklanir
    And   My Wallet sayfasina yonlendirdigi dogrulanir
    And   Sayfayi kapatir


    Scenario: TC_002-My Wallet sayfasinda Total Balance, Running Balance,
              Pending Balance boardlarinin görünür oldugu dogrulanmali.

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  Login butonuna basar
      Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
      And   Signed in butonuna basar
      Then  DashBoard butonuna tiklar
      Then  My Wallet Linki tiklanir
      Then  My Wallet sayfasinda ilgili boardlarinin gorunurlugu dogrulanir
      And   Sayfayi kapatir


    Scenario: TC_003-My Wallet sayfasinda Recharge Wallet butonunun görünür oldugu ve
              tıklandığında Recharge Amount penceresinin açıldığı dogrulanmali.

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  Login butonuna basar
      Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
      And   Signed in butonuna basar
      Then  DashBoard butonuna tiklar
      And   My Wallet Linki tiklanir
      Then  Recharge Wallet butonunun goruntulenebildigi dogrulanir
      And   Recharge Wallet butonu tiklanir
      Then  Recharge Amount penceresinin acildigi dogrulanir
      And   Sayfayi kapatir


    Scenario: TC_004-Recharge Amount sekmesinde tutar girebilebilen
              bir TextBox'in oldugu dogrulanmali

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  Login butonuna basar
      Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
      And   Signed in butonuna basar
      Then  DashBoard butonuna tiklar
      And   My Wallet Linki tiklanir
      Then  Recharge Wallet butonunun goruntulenebildigi dogrulanir
      And   Recharge Wallet butonu tiklanir
      Then  Recharge Amount sekmesinde tutar girebilebilen bir TextBox'in oldugu dogrulanir
      And   Sayfayi kapatir


    Scenario: TC_005-Islemi iptal etmek icin Recharge Amount sekmesindeki
              Cancel butonunun görünür oldugu ve iptal islemini yapabildigi dogrulanmali.

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  Login butonuna basar
      Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
      And   Signed in butonuna basar
      Then  DashBoard butonuna tiklar
      And   My Wallet Linki tiklanir
      Then  Recharge Wallet butonunun goruntulenebildigi dogrulanir
      And   Recharge Wallet butonu tiklanir
      Then  Recharge Amount sekmesinde Cancel butonunun oldugu dogrulanir
      And   Recharge Amount sekmesinde Cancel butonunun iptal islemi yapabildigi dogrulanir
      And   Sayfayi kapatir


  Scenario: TC_006-Recharge Amount sekmesindeki TextBox'a girilen tutari
            Wallet'a eklemek icin Add Fund butonunun görünür oldugu ve
            ilgili sayfaya yönlendirdigi dogrulanmali

    Given Kullanici Anasayfa "url" 'ine gider.
    Then  Subscribe popup kapatilir
    Then  Login butonuna basar
    Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
    And   Signed in butonuna basar
    Then  DashBoard butonuna tiklar
    And   My Wallet Linki tiklanir
    Then  Recharge Wallet butonu tiklanir
    And   Add Fund butonunun goruntulenebildigi dogrulanir
    Then  TextBoxa "moneyM" deger girilir
    Then  Add Fund butonuna tiklanir
    And   İlgili sayfaya yonlendirildigi dogrulanir
    And   Sayfayi kapatir


  Scenario: TC_007-My Wallet sayfasinda Wallet Recharge History listesinde
            Date, Trx Id, Amount, Type, Payment Method, Status sütunlarinin oldugu dogrulanmali.

    Given Kullanici Anasayfa "url" 'ine gider.
    Then  Subscribe popup kapatilir
    Then  Login butonuna basar
    Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
    And   Signed in butonuna basar
    Then  DashBoard butonuna tiklar
    And   My Wallet Linki tiklanir
    Then  Wallet Recharge History listesinde ilgili sutunlarin oldugu dogrulanir
    And   Sayfayi kapatir


    Scenario: TC_008-My Wallet sayfasinda Wallet Recharge History listesinde
              Cüzdan hareketlerinin varligi dogrulanmali.

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  Login butonuna basar
      Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
      And   Signed in butonuna basar
      Then  DashBoard butonuna tiklar
      And   My Wallet Linki tiklanir
      Then  Wallet Recharge History listesinde cuzdan hareketlerinin varligi dogrulanir
      And   Sayfayi kapatir

