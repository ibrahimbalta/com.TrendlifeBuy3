package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.US_10_37_41;
import pages.US_1_11_12_18_25_31_38;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import java.io.IOException;
import java.io.StringReader;
import java.security.Key;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class US_1_11_12_18_25_31_38_StepDef {

    WebElement driver;
    US_1_11_12_18_25_31_38 pages = new US_1_11_12_18_25_31_38();


    String kullaniciEmail;
    String kullaniciIsim;
    String password;
    Faker faker = new Faker();
    Actions actions;

    @Given("kullanici trendlifeUrl anasayfaya gider")
    public void kullanici_trendlife_url_anasayfaya_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("subscribe popupu kapatilir")
    public void subscribe_popupu_kapatilir() {

        pages = new US_1_11_12_18_25_31_38();
        ReusableMethod.waitForClickablility(pages.PopupExitButon, 5);
        pages.PopupExitButon.click();


    }


    @Then("istenen sayfaya gittigi dogrulanir")
    public void istenen_sayfaya_gittigi_dogrulanir() {

        String expectedUrl = "https://qa.trendlifebuy.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);


    }


    @Then("Anasayfada title in Trendlifebuy Online Shopping oldugunu kontrol eder")
    public void anasayfadaTitleInTrendlifebuyOnlineShoppingOldugunuKontrolEder() {

        pages = new US_1_11_12_18_25_31_38();
        String expectedtitle = "Trendlifebuy Online Shopping";
        String actualtitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualtitle, expectedtitle);


    }


    // US 011 TESTLERİ


    @Given("Anasayfada Header kisminda {string}   linkine tiklanir.")
    public void anasayfadaHeaderKismindaLinkineTiklanir(String arg0) {

        pages = new US_1_11_12_18_25_31_38();
        ReusableMethod.waitForClickablility(pages.PopupExitButon, 10);
        pages.PopupExitButon.click();
        pages.headerBlogLinki.click();
    }

    @Then("Blog sayfasinda oldugu dogrulanir")
    public void blog_sayfasinda_oldugu_dogrulanir() {

        String expectedUrl = "https://qa.trendlifebuy.com/blog";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);


    }


    @Then("Read More linkine tiklandiginda ilgili sayfaya yonlendirildigi dogrulanir")
    public void readMoreLinkineTiklandigindaIlgiliSayfayaYonlendirildigiDogrulanir() {


        ReusableMethod.bekle(3);

        String expectedUrl = "https://qa.trendlifebuy.com/blog/post/society--the-soil-in-which-we-grow";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }

    @Given("sayfada asagi yonde inilir")
    public void sayfadaAsagiYondeInilir() {

        Actions actions = new Actions(Driver.getDriver());

        actions.
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN)

                .perform();
        ReusableMethod.bekle(3);


    }


    @Then("SearchPostBox kutusunda blog araması icin blog ismi girilir")
    public void searchpostboxKutusundaBlogAramasıIcinBlogIsmiGirilir() {

        pages = new US_1_11_12_18_25_31_38();

        pages.searchpostsbox.sendKeys("Society – The soil in which we grow", Keys.ENTER);


    }

    @Then("Searchboxa girilen blogun arandigi dogru blog un geldigi dogrulanir")
    public void searchboxaGirilenBlogunArandigiDogruBlogUnGeldigiDogrulanir() {

        pages = new US_1_11_12_18_25_31_38();

        ReusableMethod.bekle(2);
        String expectedBlogAramasiUrl = "https://qa.trendlifebuy.com/blog?query=Society+%E2%80%93+The+soil+in+which+we+grow";
        String actualBlogAramasiUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualBlogAramasiUrl.contains(expectedBlogAramasiUrl));

    }

    @Then("Category bölümündeki baslıklara tiklanir ilgili bloglarin goruntulendigi kontrol edilir dogrulanir")
    public void categoryBölümündekiBaslıklaraTiklanirIlgiliBloglarinGoruntulendigiKontrolEdilirDogrulanir() {


        pages.categoryBloglari.click();

        String expectedCategoryLink = "Nature ";
        String actualCategoryLink = pages.categoryBloglari.getText();
        Assert.assertTrue(actualCategoryLink.contains(expectedCategoryLink));
        ReusableMethod.bekle(3);

    }

    @Then("Keyword bolumundeki basliklara tiklanir  da ilgili bloglarin goruntulendigi kontrol edilir dogrulanir")
    public void keywordBolumundekiBasliklaraTiklanirDaIlgiliBloglarinGoruntulendigiKontrolEdilirDogrulanir() {

        pages = new US_1_11_12_18_25_31_38();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethod.bekle(3);

        pages.keywordBloglari.click();


        String expectedKeywordUrl = "https://qa.trendlifebuy.com/blog?tag=programming";
        String actualKeywordUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualKeywordUrl.contains(expectedKeywordUrl));


    }

    @And("{int} saniye beklenir")
    public void saniyeBeklenir(int arg0) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Then("Popular Posts bolumundeki basliklar da ilgili bloglarin goruntulendigi kontrol edilir dogrulanir")
    public void popularPostsBolumundekiBasliklarDaIlgiliBloglarinGoruntulendigiKontrolEdilirDogrulanir() {


        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethod.bekle(5);
        pages.popularPostBloglari.click();


        String expectedPopularpostBlogUrl = "https://qa.trendlifebuy.com/blog/post/connecting-to-care";
        String actualPopularpostBlogUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualPopularpostBlogUrl.contains(expectedPopularpostBlogUrl));


    }

    @Then("Anasayfada Header kisminda Contact {string}   linkine tiklanir.")
    public void anasayfadaHeaderKismindaContactLinkineTiklanir(String arg0) {


        pages = new US_1_11_12_18_25_31_38();
        pages.contact_link.click();

    }


    @Then("Contact sayfasinda Call or WhatsApp gorunur oldugunu dogrula")
    public void contactSayfasindaCallOrWhatsAppGorunurOldugunuDogrula() {

        Assert.assertTrue(pages.CallOrWhatsApp.isDisplayed());


    }

    @Then("Get in touch,Social Media, Head office yazilarinin gorunur oldugunu dogrula")
    public void getInTouchSocialMediaHeadOfficeYazilarininGorunurOldugunuDogrula() {

        pages = new US_1_11_12_18_25_31_38();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.GetInTouch.isDisplayed());
        softAssert.assertTrue(pages.SocialMedia.isDisplayed());
        softAssert.assertTrue(pages.HeadOffice.isDisplayed());
        softAssert.assertAll();


    }

    @And("Get in Touch bolumundeki Text Box'lara Name, E-mail, Messages ve Customer,Installation,Product Returns kısımları kriterlere uygun  doldurulur")
    public void getInTouchBolumundekiTextBoxLaraNameEMailMessagesVeCustomerInstallationProductReturnsKısımlarıKriterlereUygunDoldurulur() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethod.bekle(4);


        ReusableMethod.getActions()
                .click(pages.ContactName)
                .sendKeys(ReusableMethod.getFaker().name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethod.getFaker().internet().emailAddress())

                .perform();


        pages.installation.click();
        pages.searchboxgiris.sendKeys("Customer");
        ReusableMethod.bekle(3);
        pages.customersarch.click();

        pages.messageyaz.sendKeys("Abdurrahman test yapıyor :)");


        //DEVAM EDİLECEK DROPDOWN MENU YAPILACAK

    }


    @Then("Send Message butonuna tiklanir")
    public void sendMessageButonunaTiklanir() {

        pages.sendbutton.click();


    }

    @Then("Emailin başarili bir şekilde gönderildigi dogrulanir")
    public void emailinBaşariliBirŞekildeGönderildigiDogrulanir() throws IOException {


        ReusableMethod.waitForClickablility(pages.messagegittimi, 3);
        assertTrue(pages.messagegittimi.isDisplayed());
        ReusableMethod.getScreenshotWebElement("SuccessMessageAlert", pages.messagegittimi);


    }


    @Then("Contact sayfasindaki sosyal medya \\(Facebook,Twitter,Linkedln,Instagram) ikonlarinin gorunur oldugunu dogrula")
    public void contactSayfasindakiSosyalMedyaFacebookTwitterLinkedlnInstagramIkonlarininGorunurOldugunuDogrula() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).
                perform();

        ReusableMethod.bekle(3);
        Assert.assertTrue(pages.facebookikon.isDisplayed());
        Assert.assertTrue(pages.twitterikon.isDisplayed());
        Assert.assertTrue(pages.instagramikon.isDisplayed());
        Assert.assertTrue(pages.linkedlnikon.isDisplayed());


    }

    @Then("Contact sayfasindaki sosyal medya \\(Facebook,Twitter,Linkedln,Instagram) ikonlarina tiklaninca ilgili sayfaya yonlendirilir ve dogrulanir")
    public void contactSayfasindakiSosyalMedyaFacebookTwitterLinkedlnInstagramIkonlarinaTiklanincaIlgiliSayfayaYonlendirilirVeDogrulanir() {


        pages.twitterikon.click();

        String expectedurl = "https://twitter.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedurl));
        ReusableMethod.bekle(3);
        Driver.getDriver().navigate().back();


        ReusableMethod.bekle(3);
        pages.facebookikon.click();

        String expectedUrl = "https://www.facebook.com/";
        String actualUrl2 = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl2.contains(expectedUrl));
        ReusableMethod.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethod.bekle(3);

        pages.linkedlnikon.click();

        String expectedUrl3 = "https://www.linkedln.com/";
        String actualUrl3 = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl2.contains(expectedUrl));
        ReusableMethod.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethod.bekle(3);


        String expectedUrl4 = "https://www.instagram.com/";
        String actualUrl4 = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl2.contains(expectedUrl));
        ReusableMethod.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethod.bekle(3);


    }

    // US_18 ###########################
    @Then("Login butonuna tiklar")
    public void loginButonunaTiklar() {

        ReusableMethod.loginTrendlife(ConfigReader.getProperty("customerEmailAlas"), ConfigReader.getProperty("customerPasswordAlas"));
    }


    @Then("Dashboard linkine tiklanir sayfaya yönlendirilir")
    public void dashboard_linkine_tiklanir_sayfaya_yönlendirilir() {

        pages.dashboardLinki.click();
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethod.bekle(5);

    }

    @Then("MyOrder linkine tiklanir")
    public void my_order_linkine_tiklanir() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.myorderlinki.click();
    }

    @Then("My Order sayfasindaki urun boardindan Order Details butonuna tiklanir")
    public void my_order_sayfasindaki_urun_boardindan_order_details_butonuna_tiklanir() {

        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).
                perform();
        ReusableMethod.bekle(2);

        pages.orderdetails.click();


    }

    @Then("My Order sayfasindaki urun boardindan Order Details butonuna tiklayinca ilgili siparisin detay sayfasina gidildigi dogrulanmali.")
    public void my_order_sayfasindaki_urun_boardindan_order_details_butonuna_tiklayinca_ilgili_siparisin_detay_sayfasina_gidildigi_dogrulanmali() {

        ReusableMethod.bekle(5);
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).

                perform();
        String actualOrderDetails = pages.orderdetailseegidildimi.getText();
        String expectedOrderDetails = "Ordered";
        Assert.assertTrue(actualOrderDetails.contains(expectedOrderDetails));

    }


    @Then("Order Details sayfasinda ilgili siparisin Order ID, Status, Order date, Order Amount, Package, Price, Shipping Info,Billing Info, Payment Info bilgilerinin goruntulendigi dogrulanmali")
    public void orderDetailsSayfasindaIlgiliSiparisinOrderIDStatusOrderDateOrderAmountPackagePriceShippingInfoBillingInfoPaymentInfoBilgilerininGoruntulendigiDogrulanmali() {


        Assert.assertTrue(pages.orderID.isDisplayed());
        assertTrue(pages.orderDate.isDisplayed());
        assertTrue(pages.orderAmount.isDisplayed());
        assertTrue(pages.price.isDisplayed());
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        assertTrue(pages.shippingInfo.isDisplayed());
        assertTrue(pages.billingInfo.isDisplayed());
        assertTrue(pages.paymentInfo.isDisplayed());


    }

    @Then("Order Details sayfasinda ilgili siparis süreci ile ilgili Pending, Processing, Shipped, Recieved, Delivered asamalari görünür oldugu dogrulanmali.")
    public void orderDetailsSayfasindaIlgiliSiparisSüreciIleIlgiliPendingProcessingShippedRecievedDeliveredAsamalariGörünürOlduguDogrulanmali() {

        actions = new Actions(Driver.getDriver());


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.processing.isDisplayed());

        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();

        softAssert.assertTrue(pages.shippingInfo.isDisplayed());
        softAssert.assertTrue(pages.recieved.isDisplayed());
        softAssert.assertTrue(pages.delivered.isDisplayed());
        softAssert.assertTrue(pages.pending.isDisplayed());

        softAssert.assertAll();


    }

    @Then("Order Details sayfasinda Pending, Processing, Shipped, Recieved, Delivered asamalarinin aciklamalarini iceren textlerin görünür oldugu kontrol edilmeli")
    public void orderDetailsSayfasindaPendingProcessingShippedRecievedDeliveredAsamalarininAciklamalariniIcerenTextlerinGörünürOlduguKontrolEdilmeli() {


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.orderedText.isDisplayed());
        softAssert.assertTrue(pages.processingText.isDisplayed());
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();
        softAssert.assertTrue(pages.shippedText.isDisplayed());
        softAssert.assertTrue(pages.recievedText.isDisplayed());
        softAssert.assertTrue(pages.deliveredText.isDisplayed());


    }

    @Then("\\(Eger tamamlanmamis bir siparis ise) My Order sayfasindaki Cancel Order butonunun görünür oldugu ve Select cancel reason penceresine yönlendirme yaptigi dogrulanmali.")
    public void egerTamamlanmamisBirSiparisIseMyOrderSayfasindakiCancelOrderButonununGörünürOlduguVeSelectCancelReasonPenceresineYönlendirmeYaptigiDogrulanmali() {


        ReusableMethod.bekle(4);
        Assert.assertTrue(pages.selectCancelReason.isDisplayed());


    }

    @Then("cancel order butonuna tiklanir")
    public void cancelOrderButonunaTiklanir() {
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).


                perform();
        ReusableMethod.bekle(6);

        if (pages.cancelOrder.isDisplayed()) {
            pages.cancelOrder.click();

        } else {
            ReusableMethod.bekle(3);
            String expectedKelime = "Order Cancelled";
            String actualKelime = pages.orderCancelled.getText();
            Assert.assertTrue(actualKelime.contains(expectedKelime));


        }


    }


    @Then("Logout linkinin gorunurlugu test edilmeli")
    public void logoutLinkininGorunurluguTestEdilmeli() {

        Assert.assertTrue(pages.logOutbutonu.isDisplayed());
    }

    @Then("LogOut butonuna tiklaninca sayfadan cikis yapmali")
    public void logoutButonunaTiklanincaSayfadanCikisYapmali() {

        pages = new US_1_11_12_18_25_31_38();

        pages.logOutbutonu.click();
    }

    @Then("cikis yaptigi dogrulanmali")
    public void cikisYaptigiDogrulanmali() {

        Assert.assertTrue(pages.loginButon.isDisplayed());

    }

    @Then("Dashboard Side Bar'da Logout linki kontrol edilir ve linkin oldugu dogrulanir")
    public void dashboardSideBarDaLogoutLinkiKontrolEdilirVeLinkinOlduguDogrulanir() {


        actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);

        Assert.assertTrue(pages.logOutSidebar.isDisplayed());


    }

    @Then("Dashboardda logOut butonuna tiklanir hesaptan cikis yaptigi dogrulanir")
    public void dashboarddaLogOutButonunaTiklanirHesaptanCikisYaptigiDogrulanir() {

        ReusableMethod.bekle(3);
        pages.logOutSidebar.click();
        ReusableMethod.bekle(1);
        Assert.assertFalse(pages.dashboardLinki.isDisplayed());


    }


    @Then("AdminLogin butonuna tiklar")
    public void adminloginButonunaTiklar() {

        ReusableMethod.adminLoginTrendlife(ConfigReader.getProperty("adminEmailAlas"), ConfigReader.getProperty("adminPasswordAlas"));


    }

    @Then("AdmindeDashboard linkine tiklanir")
    public void admindedashboardLinkineTiklanir() {


        pages = new US_1_11_12_18_25_31_38();
        ReusableMethod.bekle(3);
        pages.adminDashboardlinki.click();


    }


    @And("Dashboard ana sayfasinin ust barinda profil ikonunun gorunmeli")
    public void dashboardAnaSayfasininUstBarindaProfilIkonununGorunmeli() {


        Assert.assertTrue(pages.adminProfilgorsel.isDisplayed());

    }


    @Then("Profil ikonuna tiklaninca acilan pencerede login olunan hesabin Name bilgisinin gorundugu dogrulanmali")
    public void profilIkonunaTiklanincaAcilanPenceredeLoginOlunanHesabinNameBilgisininGorunduguDogrulanmali() {


        String expectedName = "Admin120";
        String actualName = pages.profilNameBilgisi.getText();

        Assert.assertTrue(actualName.contains(expectedName));

    }

    @Then("Dashboardda profil ikonuna tiklanir")
    public void dashboarddaProfilIkonunaTiklanir() {
        ReusableMethod.bekle(4);
        pages.adminProfilgorsel.click();

    }


    @And("Profil ikonuna tiklaninca acilan pencerede My profil ve Log out linklerinin gorunur oldugu dogrulanmali.")
    public void profilIkonunaTiklanincaAcilanPenceredeMyProfilVeLogOutLinklerininGorunurOlduguDogrulanmali() {

        ReusableMethod.bekle(3);
        Assert.assertTrue(pages.myprofillinki.isDisplayed());
        Assert.assertTrue(pages.logoutlinki.isDisplayed());


    }

    @And("My Profil linkine tiklaninca profile sayfasina gidillmeli")
    public void myProfilLinkineTiklanincaProfileSayfasinaGidillmeli() {

        pages = new US_1_11_12_18_25_31_38();
        pages.myprofillinki.click();

        String expectedUrl = "https://trendlifebuy.com/profile";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);


    }


    @Then("Profil sayfasindaki Basic Info bolumunde First Name, Last Name, E-mail Adress, Phone Number, Date of Bird bilgilerinin gorunmeli")
    public void profilSayfasindakiBasicInfoBolumundeFirstNameLastNameEMailAdressPhoneNumberDateOfBirdBilgilerininGorunmeli() {

        ReusableMethod.bekle(3);
        Assert.assertTrue(pages.firstname.isDisplayed());
        Assert.assertTrue(pages.lastname.isDisplayed());
        Assert.assertTrue(pages.email.isDisplayed());
        Assert.assertTrue(pages.phonenumber.isDisplayed());
        Assert.assertTrue(pages.dateofbirth.isDisplayed());


    }


    @Then("Profil sayfasindaki Basic Info bolumunde First Name, Last Name, E-mail Adress, Phone Number, Date of Bird bilgileri update edilmesi icin bilgiler girilmeli ve update now butonuna tiklanmali")
    public void profilSayfasindakiBasicInfoBolumundeFirstNameLastNameEMailAdressPhoneNumberDateOfBirdBilgileriUpdateEdilmesiIcinBilgilerGirilmeliVeUpdateNowButonunaTiklanmali() throws IOException {
        pages.firstname.clear();
        pages.firstname.sendKeys("Admin120");
        pages.lastname.clear();
        pages.lastname.sendKeys("Alas");
        pages.email.clear();
        pages.email.sendKeys("admin120@trendlifebuy.com");
        pages.phonenumber.clear();
        pages.phonenumber.sendKeys("054540814442");

        pages.dateofbirth.click();
        pages.dateofbirth.click();


        ReusableMethod.bekle(1);
        pages.updatenowbutton.click();
        ReusableMethod.bekle(1);


        ReusableMethod.waitForClickablility(pages.updatesuccess, 3);
        assertTrue(pages.updatesuccess.isDisplayed());
        ReusableMethod.getScreenshotWebElement("SuccessMessageAlert", pages.updatesuccess);


    }

    @Then("MyProfil sayfasina gidilir Adress butonuna tiklaninca acilan sayfada adres bilgisine tiklanmali ve sayfa gelmeli")
    public void myprofilSayfasinaGidilirAdressButonunaTiklanincaAcilanSayfadaAdresBilgisineTiklanmaliVeSayfaGelmeli() {

        pages.addresslinki.click();

        ReusableMethod.bekle(2);
        String expectedKelime = "Address";
        String actualKelime = pages.addressayfasionay.getText();

        Assert.assertTrue(actualKelime.contains(expectedKelime));


    }

    @Then("Add New Adress butonuna tiklanir")
    public void addNewAdressButonunaTiklanir() {


        pages.addnewaddressbutonu.click();

    }

    @Then("Add New Adress butonuna tiklandiginda acilan sayfadan login olan hesaba yeni adres eklenebildigi ve eklenen adreslerin adress sayfasinda görünür oldugu dogrulanmali.")
    public void addNewAdressButonunaTiklandigindaAcilanSayfadanLoginOlanHesabaYeniAdresEklenebildigiVeEklenenAdreslerinAdressSayfasindaGörünürOlduguDogrulanmali() {

        ReusableMethod.getActions()
                .click(pages.nameAddnewAddress)
                .sendKeys(ReusableMethod.getFaker().name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethod.getFaker().internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethod.getFaker().phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethod.getFaker().address().fullAddress())

                .perform();


        ReusableMethod.bekle(3);
        pages.dropcountry.click();
        pages.selectcountry.sendKeys("Turkey");
        pages.countrysecilen.click();

        ReusableMethod.bekle(3);
        pages.selectcıty.click();
        pages.cityyaz.sendKeys("Kayseri");
        pages.citysecilen.click();
        ReusableMethod.bekle(3);
        pages.selectIlce.click();
        pages.ilceyaz.sendKeys("Develi");
        pages.ilcesecilen.click();

        pages.postacode.sendKeys("38020");
        ReusableMethod.bekle(2);
        pages.save.click();
        ReusableMethod.bekle(3);


        Assert.assertTrue(pages.addressgöründümü.isDisplayed());





    /* Select select=new Select(pages.selectcountry);

             List<WebElement> optionsElementList=select.getOptions();

     List<String> optionsStringListesi=ReusableMethod.getElementsText(optionsElementList);
     Assert.assertTrue(optionsStringListesi.contains("Turkey"));
     pages.dropcountry.click();
*/


    }


    @Then("Quick Search textbox kismina arama yapililr")
    public void quickSearchTextboxKisminaAramaYapililr() {

        pages.adminreports.click();
        pages.keywordsearch.click();
        pages.quicksearch.sendKeys("computer");
        pages.quicksearch.click();


    }

    @Then("Quick Searchta aranan verinin geldigi dogrulanir")
    public void quickSearchtaArananVerininGeldigiDogrulanir() {

        ReusableMethod.bekle(2);
        String expectedaranan = "computer";
        String actualaranan = pages.quicksearchverigeldimi.getText();
        Assert.assertTrue(actualaranan.contains(expectedaranan));


    }


    @Then("Admin Reports Keywords Search butonuna tiklanir ve  sayfasinda Keyword search report Listesinin oldugu dogrulanmali")
    public void adminReportsKeywordsSearchButonunaTiklanirVeSayfasindaKeywordSearchReportListesininOlduguDogrulanmali() {


        pages.adminreports.click();
        pages.keywordsearch.click();
        ReusableMethod.bekle(2);
        Assert.assertTrue(pages.keyboardlistesi.isDisplayed());


    }


    @Then("Keyword search report Listesinde Keyword ve Number of Time basliklarinin bulundugu dogrulanmali")
    public void keywordSearchReportListesindeKeywordVeNumberOfTimeBasliklarininBulunduguDogrulanmali() {
        Assert.assertTrue(pages.keywordbasligi.isDisplayed());
        Assert.assertTrue(pages.numberofTime.isDisplayed());
    }

    @Then("Then Admin Reports Keywords Search butonuna tiklanir ve  sayfasinda Keyword search report Listesinin oldugu dogrulanmali")
    public void thenAdminReportsKeywordsSearchButonunaTiklanirVeSayfasindaKeywordSearchReportListesininOlduguDogrulanmali() {

    }

    @Then("Keyword search report Listesindeki her bir sayfada maximum {int} keyword bilgisi oldugu dogrulanmali")
    public void keywordSearchReportListesindekiHerBirSayfadaMaximumKeywordBilgisiOlduguDogrulanmali(int arg0) {

        //  6. Tablodaki satir sayisini yazdirin
        List<WebElement> satirElementleriListesi = pages.satirSayisi;
        System.out.println("Tablodaki satir sayisi : " + satirElementleriListesi.size());

        System.out.println(satirElementleriListesi.size());


    }

    @Then("Açılan pencerede Reason dropboxından seçim yapılıp send butonuna tiklanir ve girilen order'in iptal edildigi dogrulanir")
    public void açılanPenceredeReasonDropboxındanSeçimYapılıpSendButonunaTiklanirVeGirilenOrderInIptalEdildigiDogrulanir() throws InterruptedException {


        ReusableMethod.bekle(3);
        pages.reasonOneClick.click();
        pages.reasonSearch.click();
        pages.reasonSearch.sendKeys("ra.deneme");
        pages.raDeneme.click();
        pages.reasonSend.click();


    }

    @Then("Sayfalar arasi gecis yaptıgı dogrulanmali")
    public void sayfalarArasiGecisYaptıgıDogrulanmali() {


        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(3);
        pages.sayfalararasigecis.click();
        ReusableMethod.bekle(2);

        Assert.assertTrue(pages.sayfadagecisonay.isDisplayed());


    }

    @Then("Order Details sayfasinda ürünle ilgili Shipping Info, Billing Info, Payment Info bilgilerine erisilebilir oldugu dogrulanmali")
    public void orderDetailsSayfasindaÜrünleIlgiliShippingInfoBillingInfoPaymentInfoBilgilerineErisilebilirOlduguDogrulanmali() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();


        Assert.assertTrue(pages.shippingInfo.isDisplayed());
        Assert.assertTrue(pages.billingInfo.isDisplayed());
        Assert.assertTrue(pages.paymentInfo.isDisplayed());


    }

    @Then("Read More linkine tiklar")
    public void readMoreLinkineTiklar() {

        ReusableMethod.waitForClickablility(pages.readmorelinki, 10);
        pages.readmorelinki.click();


    }

    @And("SearchPostBox kutusunda categorilere gore blog ismi girilir")
    public void searchpostboxKutusundaCategorilereGoreBlogIsmiGirilir() {


        pages.searchpostsbox.sendKeys("Nature");

        ReusableMethod.bekle(2);


    }

    @Then("Searchboxa girilen kategorilere gore  dogru blog un geldigi dogrulanir")
    public void searchboxaGirilenKategorilereGoreDogruBlogUnGeldigiDogrulanir() {

        pages.categoryBloglari.click();
        ReusableMethod.bekle(2);
        String expectedUrl = "https://qa.trendlifebuy.com/blog/category/posts/nature-7";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }

}
