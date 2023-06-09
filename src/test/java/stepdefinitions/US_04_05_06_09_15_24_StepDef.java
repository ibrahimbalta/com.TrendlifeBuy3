package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.US_04_05_06_09_15_24_pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import static org.junit.Assert.*;
import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class US_04_05_06_09_15_24_StepDef {

    US_04_05_06_09_15_24_pages pages = new US_04_05_06_09_15_24_pages();

    //--> Reusable Step Definitions
    //Url page
    @Given("go to {string}")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    // Popup closed
    @Then("close popup")
    public void close_pop_up() {
        ReusableMethod.waitForClickablility(pages.PopupExit, 15);
        pages.PopupExit.click();

    }

    // Scroll down
    @Then("scroll down")
    public void scroll_down() {
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);

    }

    @Then("scroll down for View All")
    public void scrollDownForViewAll() {
        ReusableMethod.scrolldown_DownViewAll();
        ReusableMethod.waitToSee(2);
    }


    @Then("scroll down for More Deal button")
    public void scrollDownForMoreDealButton() {
        ReusableMethod.scrolldown_bypixel_2000();
        ReusableMethod.waitToSee(2);
    }


    @Then("scroll down for Load More")
    public void scrollDownForLoadMore() {
        ReusableMethod.scrolldown_for_Load_More();
        ReusableMethod.waitToSee(2);
    }


    @Then("scroll down to display side bar menu list")
    public void scrollDownToDisplaySideMenuList() {
        ReusableMethod.scrolldown_SideBarMenu();
    }


    @Then("scroll down to see all notifications setting menu")
    public void scrollDownToSeeAllNotificationsSettingMenu() {
        ReusableMethod.scrolldown_NotificationsSettingMenu();
        ReusableMethod.waitToSee(5);
    }


    @And("terminate test")
    public void terminateTest() {
        Driver.quitDriver();
    }

    @Then("navigate page back")
    public void navigatePageBack() {
        ReusableMethod.navigateback();
        ReusableMethod.waitToSee(3);
    }

    @And("scroll down to see Side Bar")
    public void scrollDownToSeeSideBar() {
        ReusableMethod.scrolldown_SideBarMenu();
        //ReusableMethod.waitToSee(2);
    }


    Actions actions = new Actions(Driver.getDriver());

    //-------------------------
    //Scenario: TC_101
    @Then("verify My Account link is visible")
    public void verifyMyAccountLinkIsVisible() {
        Assert.assertTrue(pages.myAccount.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Order Status link is visible")
    public void verifyOrderStatusLinkIsVisible() {
        Assert.assertTrue(pages.orderStatus.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Referral link is visible")
    public void verifyReferralLinkIsVisible() {
        Assert.assertTrue(pages.referral.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify Coupons link is visible")
    public void verifyCouponsLinkIsVisible() {
        Assert.assertTrue(pages.coupons.isDisplayed());
        ReusableMethod.waitToSee(2);
    }


    //Scenario: TC_102


    @Then("verify My Account link navigates to the the relevant page after clicking")
    public void verifyMyAccountLinkNavigatesToTheTheRelevantPageAfterClicking() {
        pages.myAccount.click();
        ReusableMethod.signIn(ConfigReader.getProperty("validEmail_Murat"), ConfigReader.getProperty("validPassword_Murat"));
        String myAccount_actualPageUrl = driver.getCurrentUrl();
        String myAccount_expectedUrl = "https://qa.trendlifebuy.com/profile";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(myAccount_expectedUrl, myAccount_actualPageUrl);
    }

    @Then("verify Order Status link navigates to the the relevant page after clicking")
    public void verifyOrderStatusLinkNavigatesToTheTheRelevantPageAfterClicking() {
        ReusableMethod.waitToSee(5);
        pages.orderStatus.click();
        String orderStatus_actualPageUrl = driver.getCurrentUrl();
        String orderStatus_expectedUrl = "https://qa.trendlifebuy.com/my-purchase-orders";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(orderStatus_expectedUrl, orderStatus_actualPageUrl);
    }

    @Then("verify Referral link navigates to the the relevant page after clicking")
    public void verifyReferralLinkNavigatesToTheTheRelevantPageAfterClicking() {
        ReusableMethod.waitToSee(2);
        pages.referral.click();
        String referral_actualPageUrl = driver.getCurrentUrl();
        String referral_expectedUrl = "https://qa.trendlifebuy.com/profile/referral";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(referral_expectedUrl, referral_actualPageUrl);
    }

    @Then("verify Coupons link navigates to the the relevant page after clicking")
    public void verifyCouponsLinkNavigatesToTheTheRelevantPageAfterClicking() {
        ReusableMethod.waitToSee(2);
        pages.coupons.click();
        String coupons_actualPageUrl = driver.getCurrentUrl();
        String coupons_expectedUrl = "https://qa.trendlifebuy.com/profile/coupons";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(coupons_expectedUrl, coupons_actualPageUrl);
    }


    //Scenario: TC_103
    @Then("verify required links in TC_103 are visible")
    public void verifyRequiredLinksInTC_103AreVisible() {


    }

    @Then("verify About Us link is visible")
    public void verifyAboutUsLinkIsVisible() {
        Assert.assertTrue(pages.aboutUs.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Contact Us link is visible")
    public void verifyContactUsLinkIsVisible() {
        Assert.assertTrue(pages.contactUs.isDisplayed());
        ReusableMethod.waitToSee(2);


    }

    @Then("verify Career link is visible")
    public void verifyCareerLinkIsVisible() {
        Assert.assertTrue(pages.career.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify Refund Policy Us link is visible")
    public void verifyRefundPolicyUsLinkIsVisible() {
        Assert.assertTrue(pages.refundPolicy.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify Terms & Condition link is visible")
    public void verifyTermsConditionLinkIsVisible() {
        Assert.assertTrue(pages.termsCondition.isDisplayed());
        ReusableMethod.waitToSee(2);
    }


    //Scenario: TC_104
    @Then("verify the clicked links in TC_104 navigates to relevant pages")
    public void verifyTheClickedLinksInTC_104NavigatesToRelevantPages() {


    }


    @Then("verify About Us link navigates to the the relevant page after clicking")
    public void verifyAboutUsLinkNavigatesToTheTheRelevantPageAfterClicking() {

        pages.aboutUs.click();
        String aboutUs_actualPageUrl = driver.getCurrentUrl();
        String aboutUs_expectedUrl = "https://qa.trendlifebuy.com/about-us";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(aboutUs_expectedUrl, aboutUs_actualPageUrl);
    }

    @Then("verify Contact Us link navigates to the the relevant page after clicking")
    public void verifyContactUsLinkNavigatesToTheTheRelevantPageAfterClicking() {

        ReusableMethod.waitToSee(2);
        pages.contactUs.click();
        String contactUs_actualPageUrl = driver.getCurrentUrl();
        String contactUs_expectedUrl = "https://qa.trendlifebuy.com/contact-us";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(contactUs_expectedUrl, contactUs_actualPageUrl);
    }

    @Then("verify Career link navigates to the the relevant page after clicking")
    public void verifyCareerLinkNavigatesToTheTheRelevantPageAfterClicking() {
        ReusableMethod.waitToSee(3);
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.career.click();
        String career_actualPageUrl = driver.getCurrentUrl();
        String career_expectedUrl = "https://qa.trendlifebuy.com/career";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(career_expectedUrl, career_actualPageUrl);
    }

    @Then("verify Refund Policy Us link navigates to the the relevant page after clicking")
    public void verifyRefundPolicyUsLinkNavigatesToTheTheRelevantPageAfterClicking() {

        ReusableMethod.waitToSee(2);
        pages.refundPolicy.click();
        String refundPolicy_actualPageUrl = driver.getCurrentUrl();
        String refundPolicy_expectedUrl = "https://qa.trendlifebuy.com/return-exchange";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(refundPolicy_expectedUrl, refundPolicy_actualPageUrl);
    }

    @Then("verify Terms & Condition link navigates to the the relevant page after clicking")
    public void verifyTermsConditionLinkNavigatesToTheTheRelevantPageAfterClicking() {

        ReusableMethod.waitToSee(2);
        pages.termsCondition.click();
        String termsCondition_actualPageUrl = driver.getCurrentUrl();
        String termsCondition_expectedUrl = "https://qa.trendlifebuy.com/terms-condition";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(termsCondition_expectedUrl, termsCondition_actualPageUrl);
    }

    //Scenario: TC_105
    @Then("verify Google Play button is visible")
    public void verifyGooglePlayButtonIsVisible() {
        Assert.assertTrue(pages.googlePlayButton.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Apple Store button is visible")
    public void verifyAppleStoreButtonIsVisible() {
        Assert.assertTrue(pages.appleStoreButton.isDisplayed());
        ReusableMethod.waitToSee(2);
    }


    //Scenario: TC_106
    @Then("verify Google Play and Apple Store buttons navigate to relevant pages after clicking")
    public void verifyGooglePlayAndAppleStoreButtonsNavigateToRelevantPagesAfterClicking() {


        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        driver.navigate().back();
        ReusableMethod.waitToSee(2);


    }


    @Then("verify Google Play button navigates to relevant page after clicking")
    public void verifyGooglePlayButtonNavigatesToRelevantPageAfterClicking() {
        pages.googlePlayButton.click();
        String googlePlayButton_actualPageUrl = driver.getCurrentUrl();
        String googlePlayButton_expectedUrl = "https://play.google.com/store/games";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(googlePlayButton_expectedUrl, googlePlayButton_actualPageUrl);
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Apple Store button navigates to relevant page after clicking")
    public void verifyAppleStoreButtonNavigatesToRelevantPageAfterClicking() {
        pages.appleStoreButton.click();
        String appleStoreButton_actualPageUrl = driver.getCurrentUrl();
        String appleStoreButton_expectedUrl = "https://www.apple.com/app-store/";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(appleStoreButton_expectedUrl, appleStoreButton_actualPageUrl);
    }


    //Scenario: TC_107

    @Then("verify clicking Go To Top button goes top of the home page")
    public void verifyclickingGoToTopButtonGoesTopOfTheHomePage() {


        pages.goToTop.click();
        ReusableMethod.waitToSee(3);
        Assert.assertTrue(pages.searchBox.isDisplayed());


    }

    //Scenario: TC_108
    @Then("verify facebook icon is visible")
    public void verifyFacebookIconIsVisible() {
        Assert.assertTrue(pages.facebookIcon.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify twitter icon is visible")
    public void verifyTwitterIconIsVisible() {
        Assert.assertTrue(pages.twitterIcon.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify linkedin icon is visible")
    public void verifyLinkedinIconIsVisible() {
        Assert.assertTrue(pages.linkedinIcon.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify instagram icon is visible")
    public void verifyInstagramIconIsVisible() {
        Assert.assertTrue(pages.instagramIcon.isDisplayed());
        ReusableMethod.waitToSee(2);
    }


    //Scenario: TC_109
    @Then("verify clicked icons navigate to relevant pages")
    public void verifyClickedIconsNavigateToRelevantPages() {


    }

    @Then("verify facebook icon navigates to relevant page after clicking")
    public void verifyFacebookIconNavigatesToRelevantPageAfterClicking() {
        pages.facebookIcon.click();
        String fb_actualPageUrl = driver.getCurrentUrl();
        String fb_expectedUrl = "https://www.facebook.com/";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(fb_actualPageUrl, fb_expectedUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);
    }

    @Then("verify twitter icon navigates to relevant page after clicking")
    public void verifyTwitterIconNavigatesToRelevantPageAfterClicking() {

        pages.twitterIcon.click();
        String tw_actualPageUrl = driver.getCurrentUrl();
        String tw_expectedUrl = "https://twitter.com/";
        ReusableMethod.waitToSee(3);
        Assert.assertEquals(tw_expectedUrl, tw_actualPageUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);
    }

    @Then("verify linkedin icon navigates to relevant page after clicking")
    public void verifyLinkedinIconNavigatesToRelevantPageAfterClicking() {

        pages.linkedinIcon.click();
        String lnkd_actualPageUrl = driver.getCurrentUrl();
        String lnkd_expectedUrl = "https://www.linkedin.com/";
        ReusableMethod.waitToSee(3);
        Assert.assertEquals(lnkd_expectedUrl, lnkd_actualPageUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);
    }

    @Then("verify instagram icon navigates to relevant page after clicking")
    public void verifyInstagramIconNavigatesToRelevantPageAfterClicking() {

        pages.instagramIcon.click();
        String ins_actualPageUrl = driver.getCurrentUrl();
        String ins_expectedUrl = "https://www.instagram.com/";
        ReusableMethod.waitToSee(3);
        Assert.assertEquals(ins_expectedUrl, ins_actualPageUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_110
    @Then("verify Trending Products link is visible")
    public void verifyTrendingProductsLinkIsVisible() {
        Assert.assertTrue(pages.trendingProducts.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Hot Categories link is visible")
    public void verifyHotCategoriesLinkIsVisible() {
        Assert.assertTrue(pages.hotCategories.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify House Appliances link is visible")
    public void verifyHouseAppliancesLinkIsVisible() {
        Assert.assertTrue(pages.houseAppliances.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Recommendation For You link is visible")
    public void verifyRecommendationForYouLinkIsVisible() {
        Assert.assertTrue(pages.recommendtaionForYou.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Top Brand link is visible")
    public void verifyTopBrandLinkIsVisible() {
        Assert.assertTrue(pages.topBrand.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify Popular Searches link is visible")
    public void verifyPopularSearchesLinkIsVisible() {
        Assert.assertTrue(pages.popularSearches.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Trendlifebuy|ONLINE SHOPPING link is visible")
    public void verifyTrendlifebuyONLINESHOPPINGLinkIsVisible() {
        Assert.assertTrue(pages.trenbuylifeOnlineShopping.isDisplayed());
        ReusableMethod.waitToSee(2);
    }


    //Scenario: TC_111
    @Then("Verify that the View All button redirects to the relevant page")
    public void verifyThatTheViewAllButtonRedirectsToTheRelevantPage() {

        pages.viewAll_trendingProducts.click();
        String viewAll_trendingProducts_actualPageUrl = driver.getCurrentUrl();
        String expected_trend_url = "https://qa.trendlifebuy.com/category/best_deals?item=product";
        ReusableMethod.waitToSee(2);
        Assert.assertTrue(viewAll_trendingProducts_actualPageUrl.contains(expected_trend_url));

    }

    //Scenario: TC_112
    @Then("Verify that the More Deal button redirects to the relevant page")
    public void verifyThatTheMoreDealButtonRedirectsToTheRelevantPage() {
        pages.moreDealsButton.click();
        String moreDeals_actualUrl = driver.getCurrentUrl();
        System.out.println(moreDeals_actualUrl);
        String moreDeals_expectedUrl = "https://qa.trendlifebuy.com/category/furnitures?item=category";
        Assert.assertTrue(moreDeals_expectedUrl.contains(moreDeals_actualUrl));

    }

    //Scenario: TC_113
    @Then("verify that more products are seen as the Load More button is clicked")
    public void verifyThatMoreProductsAreSeenAsTheLoadMoreButtonIsClicked() {

        //System.out.println(pages.loadMoreButton.getLocation());
        int loc1 = ReusableMethod.onlyTakeNumberandParseInteger(String.valueOf(pages.loadMoreButton.getLocation()));
        //System.out.println(loc1);
        ReusableMethod.waitToSee(2);
        pages.loadMoreButton.click();
        ReusableMethod.waitToSee(3);
        //System.out.println(pages.loadMoreButton.getLocation());
        int loc2 = ReusableMethod.onlyTakeNumberandParseInteger(String.valueOf(pages.loadMoreButton.getLocation()));
        //System.out.println(loc2);
        Assert.assertTrue(loc2 > loc1);

    }

    //Scenario: TC_114

    @Then("click log in")
    public void clickLogIn() {
        pages.logInButton.click();
    }

    @Then("verify that after clicking Here link next to Password navigates to relevant page")
    public void verifyThatAfterClickingHereLinkNextToPasswordNavigatesToRelevantPage() {
        pages.clickHereToReset.click();
        Assert.assertTrue(pages.resetPasswordSendButton.isDisplayed());
    }

    //Scenario: TC_115
    @Then("verify that after clicking Sign Up next to next to Don't have an Account? navigates to relevant page")
    public void verifyThatAfterClickingSignUpNextToNextToDonTHaveAnAccountNavigatesToRelevantPage() {
        pages.signUp.click();
        Assert.assertTrue(pages.signUpText.isDisplayed());
    }

    //Scenario: TC_116 to TC_119
    @Then("type valid email")
    public void typeValidEmail() {
        pages.emailBox.sendKeys(ConfigReader.getProperty("validEmail_Murat"));
    }

    @And("type valid password")
    public void typeValidPassword() {
        pages.passwordBox.sendKeys(ConfigReader.getProperty("validPassword_Murat"));
    }

    @Then("click sign in")
    public void clickSignIn() {
        pages.signInButton.click();
        ReusableMethod.waitToSee(3);
    }

    @Then("verify that navigates to Home Page")
    public void verifyThatNavigatesToHomePage() {
        Assert.assertTrue(pages.dashboardLink.isDisplayed());

    }

    @Then("verify that Welcome message is displayed")
    public void verifyThatWelcomeMessageIsDisplayed() {
        Assert.assertTrue(pages.succesMessage.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("type incorrect email")
    public void typeIncorrectEmail() {
        pages.emailBox.sendKeys(ConfigReader.getProperty("incorrectEmail_Murat"));
    }

    @And("type incorrect password")
    public void typeIncorrectPassword() {
        pages.passwordBox.sendKeys(ConfigReader.getProperty("incorrectPassword_Murat"));
    }

    @Then("verify that These credentials do not match our records text is displayed")
    public void verifyThatTheseCredentialsDoNotMatchOurRecordsTextIsDisplayed() {
        Assert.assertTrue(pages.wrongDataText.isDisplayed());
    }

    //Scenario: TC_120
    @Then("Verify that the Remember me checkbox is clickable")
    public void verifyThatTheRememberMeCheckboxIsClickable() {
        pages.rememberMeCheckBox.click();
        // ReusableMethod.waitToSee(2);
        Assert.assertTrue(pages.rememberMeCheckBox1.isSelected());

    }

    @Then("move to product one")
    public void movetoProductOne() {
        actions.moveToElement(pages.product1).perform();
        ReusableMethod.waitToSee(5);
    }

    @Then("click product one")
    public void clickProductOne() {

        pages.product1.click();
        ReusableMethod.scrolldown_DownViewAll();
        ReusableMethod.waitToSee(3);
        pages.compareButtonProductPage.click();
        ReusableMethod.waitToSee(3);
    }

    @Then("click product two")
    public void clickProductTwo() {

        pages.product2.click();
        ReusableMethod.scrolldown_DownViewAll();
        ReusableMethod.waitToSee(1);
        pages.compareButtonProductPage.click();
        ReusableMethod.waitToSee(1);
    }

    @Then("click compare button")
    public void clickCompareButton() {
        pages.compareButtonHomePage.click();
    }

    //--verifies two selected products pictures
    @Then("verify pictures of products are displayed")
    public void verifyPicturesOfProductAreDisplayed() {

        Assert.assertTrue(pages.comparedProduct1.isDisplayed());
        Assert.assertTrue(pages.comparedProduct2.isDisplayed());
    }

    @Then("verify content information of products are displayed")
    public void verifyContentInformationOfProductsAreDisplayed() {
        WebElement contentInfo_product1 = pages.comparisonList1;
        WebElement contentInfo_product2 = pages.comparisonList2;
        String a = contentInfo_product1.getText();
        String b = contentInfo_product2.getText();
        assertFalse(a.isEmpty() & b.isEmpty());

    }


    @Then("all-in-one logIn")
    public void allInOneLogIn() {
        clickLogIn();
        typeValidEmail();
        typeValidPassword();
        clickSignIn();
    }

    @Then("click reset compare button")
    public void clickResetCompareButton() {
        pages.compareReset.click();
        ReusableMethod.waitToSee(2);
    }

    @Then("verify product compare page is empty")
    public void verifyProductComparePageIsEmpty() {
        Assert.assertTrue(pages.compareListEmptyText.isDisplayed());


    }

    //Scenario: TC_123
    @Then("click dashboard button")
    public void clickDashbordButton() {
        pages.dashboardButton.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_123
    @Then("verify dashboard button is displayed")
    public void verifyDashbordButtonIsDisplayed() {
        Assert.assertTrue(pages.dashboardButton.isDisplayed());

    }
    //Scenario: TC_123

    @Then("verify user name is displayed")
    public void verifyUserNameIsDisplayed() {
        Assert.assertTrue(pages.userName.isDisplayed());

    }

    //Scenario: TC_124
    @Then("verify user email is displayed")
    public void verifyUserEmailIsDisplayed() {
        String a = pages.emailofUser.getText();
        Assert.assertTrue(a.contains("@") & a.contains("."));

    }

    //Scenario: TC_125
    @Then("verify All Order board is displayed")
    public void verifyAllOrderBoardIsDisplayed() {
        Assert.assertTrue(pages.allOrder.isDisplayed());
    }

    //Scenario: TC_125
    @Then("verify My Wishlist board is displayed")
    public void verifyMyWishlistBoardIsDisplayed() {
        Assert.assertTrue(pages.myWishlist.isDisplayed());
    }

    //Scenario: TC_125
    @Then("verify Refund Success board is displayed")
    public void verifyRefundSuccessBoardIsDisplayed() {
        Assert.assertTrue(pages.refundSuccess.isDisplayed());
    }

    //Scenario: TC_125
    @Then("verify Product in Cart board is displayed")
    public void verifyProductInCartBoardIsDisplayed() {
        Assert.assertTrue(pages.productInCart.isDisplayed());
    }

    //Scenario: TC_125
    @Then("verify Coupon Used board is displayed")
    public void verifyCouponUsedBoardIsDisplayed() {
        Assert.assertTrue(pages.couponUsed.isDisplayed());
    }

    //Scenario: TC_125
    @Then("verify Completed Order board is displayed")
    public void verifyCompletedOrderBoardIsDisplayed() {
        Assert.assertTrue(pages.completedOrder.isDisplayed());
    }


    //Scenario: TC_126

    @Then("verify Total Balance amount is displayed")
    public void verifyTotalBalanceAmountIsDisplayed() {

        Assert.assertTrue(pages.totalBalance.isDisplayed());

    }


    //Scenario: TC_127
    @Then("click Recharge Wallet button")
    public void clickRechargeWalletButton() {
        pages.rechargeMyWallet.click();


    }
    //Scenario: TC_127
    @Then("enter recharge amount in the recharge amount box")
    public void enterRechargeAmountInTheRechargeAmountBox() {
        String amount = "10";
        pages.rechargeAmountBox.sendKeys(amount);

        String stripageWindowsHandle = driver.getWindowHandle();

    }
    //Scenario: TC_127
    @Then("click Add Fund button")
    public void clickAddAddFund() {
        pages.rechargeAmountAddFundButton.click();
        ReusableMethod.waitToSee(2);
    }
    //Scenario: TC_127
    @Then("click stripe button")
    public void clickStripeButton() {
        pages.stripe_Logo.click();
        ReusableMethod.waitToSee(2);
    }
    //Scenario: TC_127
    @Then("type email for stripe payment")
    public void typeEmailForStripePayment() {
        //driver.switchTo().frame(pages.stripe_Frame);
        driver.switchTo().frame("stripe_checkout_app");
        ReusableMethod.waitToSee(2);
        pages.stripe_Email.sendKeys("addfund@wallet.com");
        ReusableMethod.waitToSee(2);
    }
    //Scenario: TC_127
    @And("type card number for stripe payment")
    public void typeCardNumberForStripePayment() {

        pages.stripe_CardNumber.sendKeys("4242");
        pages.stripe_CardNumber.sendKeys("4242");
        pages.stripe_CardNumber.sendKeys("4242");
        pages.stripe_CardNumber.sendKeys("4242");

    }

    //Scenario: TC_127
    @And("type expiry date for stripe payment")
    public void typeExpiryDateForStripePayment() {
        pages.stripe_CardExpDate.sendKeys("22");
        pages.stripe_CardExpDate.sendKeys("24");
    }

    //Scenario: TC_127
    @And("type cvc for stripe payment")
    public void typeCvcForStripePayment() {

        pages.stripe_Cvc.sendKeys("424");
        ReusableMethod.waitToSee(2);
    }

    //Scenario: TC_127
    @Then("click pay button for stripe payment and verify the amount is added to total balance")
    public void clickPayButtonForStripePaymentAndVerifyTheAmountIsAddedToTotalBalance() {

        driver.switchTo().parentFrame();
        int firstBalance = ReusableMethod.onlyTakeNumberandParseInteger(pages.totalBalance.getText());
        ReusableMethod.waitToSee(3);
        driver.switchTo().frame("stripe_checkout_app");
        pages.stripe_Pay.click();
        ReusableMethod.waitToSee(3);
        driver.switchTo().parentFrame();
        ReusableMethod.waitToSee(3);
        int addedFund = ReusableMethod.onlyTakeNumberandParseInteger(pages.totalBalance_LastTransaction.getText());
        int lastBalance = ReusableMethod.onlyTakeNumberandParseInteger(pages.totalBalance.getText());
        System.out.println();
        System.out.println(addedFund);
        System.out.println(lastBalance);
        int expected_Balance = firstBalance + addedFund;
        int actual_Balance = lastBalance;
        Assert.assertEquals(actual_Balance, expected_Balance);

    }

    //Scenario: TC_128
    @Then("click See All button on Purchase History board")
    public void clickSeeAllButtonOnPurchaseHistoryBoard() {

        pages.seeAll_PurchaseHistory.click();
    }

    //Scenario: TC_128
    @Then("verify Purchase History page is opened")
    public void verifyPurchaseHistoryPageIsOpened() {

        String actual_Url = driver.getCurrentUrl();
        Assert.assertEquals(actual_Url, ReusableMethod.purchaseHistoryPageUrl("url"));
    }

    //Scenario: TC_129
    @Then("click See All button on My Wishlist board")
    public void clickSeeAllButtonOnMyWishlistBoard() {

        pages.seeAll_MyWishList.click();
    }

    //Scenario: TC_129
    @Then("verify My Wishlist page is opened")
    public void verifyMyWishlistPageIsOpened() {
        String actual_Url = driver.getCurrentUrl();
        String expected_Url = "#";
        Assert.assertEquals(actual_Url, expected_Url);

    }

    //Scenario: TC_130
    @Then("scroll down to display See All button of Recent Order")
    public void scrollDownToDisplaySeeAllButtonOfRecentOrder() {
        ReusableMethod.scrolldown_DownViewAll();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_130
    @Then("click See All button on Recent Order board")
    public void clickSeeAllButtonOnRecentOrderBoard() {

        pages.seeAll_RecentOrder.click();
    }

    //Scenario: TC_130
    @Then("verify Recent Order page is opened")
    public void verifyRecentOrderPageIsOpened() {

        String actual_Url = driver.getCurrentUrl();
        Assert.assertEquals(actual_Url, ReusableMethod.myOrderPageUrl("url"));

    }

    //Scenario: TC_131
    @Then("scroll down to display See All button of Product in Cart")
    public void scrollDownToDisplaySeeAllButtonOfProductInCart() {

        ReusableMethod.scrolldown_DownViewAll();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_131
    @Then("click See All button on Product in Cart board")
    public void clickSeeAllButtonOnProductInCartBoard() {

        pages.seeAll_ProductinCart.click();

    }

    //Scenario: TC_131
    @Then("verify Product in Cart page is opened")
    public void verifyProductInCartPageIsOpened() {

        String actual_Url = driver.getCurrentUrl();
        String expected_Url = "https://qa.trendlifebuy.com/cart";
        Assert.assertEquals(actual_Url, expected_Url);

    }

    //Scenario: TC_132----------------------
    @Then("click Purchase History button on the side bar")
    public void clickPurchaseHistoryButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.purchaseHistoryOnSideBar.click();
    }

    //Scenario: TC_132
    @Then("verify that it is navigated to Purchase History page")
    public void verifyThatItIsNavigatedToPurchaseHistoryPage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.purchaseHistoryPageUrl("url"));
        softAssert.assertAll();
    }

    //Scenario: TC_132
    @Then("click My Wishlist button on the side bar")
    public void clickMyWishlistButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.myWishlistOnSideBar.click();

    }

    //Scenario: TC_132
    @Then("verify that it is navigated to Wishlist page")
    public void verifyThatItIsNavigatedToWishlistPage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.myWishlistPageUrl("url"));
    }

    //Scenario: TC_132
    @Then("click My Order button on the side bar")
    public void clickMyOrderButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.myOrderOnSideBar.click();
    }

    //Scenario: TC_132
    @Then("verify that it is navigated to My Order page")
    public void verifyThatItIsNavigatedToMyOrderPage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.myOrderPageUrl("url"));
    }

    //Scenario: TC_132
    @Then("click Giftcard button on the side bar")
    public void clickGiftcardButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.giftCardOnSideBar.click();
    }

    //Scenario: TC_132
    @Then("verify that it is navigated to Giftcard page")
    public void verifyThatItIsNavigatedToGiftcardPage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.giftPageUrl("url"));
    }

    //Scenario: TC_132
    @Then("click My Wallet button on the side bar")
    public void clickMyWalletButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.myWalletOnSideBarOn.click();
    }

    //Scenario: TC_132
    @Then("verify that it is navigated to My Wallet page")
    public void verifyThatItIsNavigatedToMyWalletPage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.myWalletPageUrl("url"));
    }

    //Scenario: TC_132
    @Then("click My Coupons button on the side bar")
    public void clickMyCouponsButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.myCouponsOnSideBar.click();
    }

    //Scenario: TC_132
    @Then("verify that it is navigated to My Coupons page")
    public void verifyThatItIsNavigatedToMyCouponsPage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.myCouponsPageUrl("url"));
    }

    //Scenario: TC_132
    @Then("click Refund & Dispute button on the side bar")
    public void clickRefundDisputeButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.refundDisputeOnSideBar.click();
    }

    //Scenario: TC_132
    @Then("verify that it is navigated to Refund & Dispute page")
    public void verifyThatItIsNavigatedToRefundDisputePage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.refundDisputePageUrl("url"));
    }

    //Scenario: TC_132
    @Then("click My Account button on the side bar")
    public void clickMyAccountButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.myAccountOnSideBar.click();
    }

    //Scenario: TC_132
    @Then("verify that it is navigated to My Account page")
    public void verifyThatItIsNavigatedToMyAccountPage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.myAccountPageUrl("url"));
    }

    //Scenario: TC_132
    @Then("click Digital Products button on the side bar")
    public void clickDigitalProductsButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.digitalProductsOnSideBar.click();
    }

    //Scenario: TC_132
    @Then("verify that it is navigated to Digital Products page")
    public void verifyThatItIsNavigatedToDigitalProductsPage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.digitalProductsPageUrl("url"));
    }

    //Scenario: TC_132
    @Then("click Referral button on the side bar")
    public void clickReferralButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.referrralOnSideBar.click();
    }

    //Scenario: TC_132
    @Then("verify that it is navigated to Referral page")
    public void verifyThatItIsNavigatedToReferralPage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.referralPageUrl("url"));
    }

    //Scenario: TC_132
    @Then("click Support Ticket button on the side bar")
    public void clickSupportTicketButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.supportTicketOnSideBar.click();
    }

    //Scenario: TC_132
    @Then("verify that it is navigated to Support Ticket page")
    public void verifyThatItIsNavigatedToSupportTicketPage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.supportTicketPageUrl("url"));
    }

    //Scenario: TC_134
    @Then("click Notification button on the side bar")
    public void clickNotificationButtonOnTheSideBar() {

        ReusableMethod.waitToSee(2);
        pages.notificationOnSideBar.click();
    }

    //Scenario: TC_134
    @Then("verify that it is navigated to Notification page")
    public void verifyThatItIsNavigatedToNotificationPage() {

        SoftAssert softAssert = new SoftAssert();
        String actual_Url = driver.getCurrentUrl();
        softAssert.assertEquals(actual_Url, ReusableMethod.notificationPageUrl("url"));
    }
    //Scenario: TC_134
    @Then("verify Notifications List elements are displayed")
    public void verifyNotificationsListTableIsDisplayed() {

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(pages.notificationelement_SL.isDisplayed());
        softAssert.assertTrue(pages.notificationelement_Title.isDisplayed());
        softAssert.assertTrue(pages.notificationelement_Date.isDisplayed());
        softAssert.assertTrue(pages.notificationelement_Action.isDisplayed());
        softAssert.assertAll();
    }

    //Scenario: TC_133
    @Then("verify View button of first notification is displayed")
    public void verifyViewButtonOfFirstNotificationIsDisplayed() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.notificationlist_ViewButton.isDisplayed());

    }

    //Scenario: TC_135
    @Then("verify the title and date of Notifications are displayed")
    public void verifyTheTitleAndDateOfNotificationsAreDisplayed() {

        SoftAssert softAssert = new SoftAssert();

        System.out.println(pages.notificationlist_FirstNotificationTitle.getText());
        System.out.println(pages.notificationlist_FirstNotificationDate.getText());

        softAssert.assertTrue(pages.notificationlist_FirstNotificationTitle.isDisplayed());
        softAssert.assertTrue(pages.notificationlist_FirstNotificationDate.isDisplayed());


    }

    //Scenario: TC_136
    @Then("click View button under Action column")
    public void clickViewButtonUnderActionColumn() {

        pages.notificationlist_FirstNotificationView.click();
    }

    //Scenario: TC_136
    @Then("verify My Purchase Order Details Page is opened")
    public void verifyMyPurchaseOrderDetailsPageIsOpened() {

        String actual_Url = driver.getCurrentUrl();
        assertTrue(actual_Url.contains(ReusableMethod.notificationView_PageUrl("url")));
    }

    //Scenario: TC_137
    @Then("click Setting button on the Notification board")
    public void clickSettingButtonOnTheNotificationBoard() {
        pages.notificationsSettingButton.click();
    }

    //Scenario: TC_137
    @Then("verify the relevant page of Setting is opened")
    public void verifyTheRelevantPageOfSettingIsOpened() {
        String actual_Url = driver.getCurrentUrl();

        assertEquals(actual_Url, ReusableMethod.notificationSetting_PageUrl("url"));
    }


    //Scenario: TC_138
    @Then("click Event- Offline recharge, Type- System checkbox")
    public void clickEventOfflineRechargeTypeSystemCheckbox() {

        pages.notificationsSetting_OfflineRecharge_System.click();
        ReusableMethod.waitToSee(3);

    }

    //Scenario: TC_138
    @Then("verify Event- Offline recharge, Type- System checkbox is unchecked")
    public void verifyEventOfflineRechargeTypeSystemCheckboxIsUnchecked() {

        assertFalse(pages.notificationsSetting_OfflineRecharge_System1.isSelected());
        pages.notificationsSetting_OfflineRecharge_System.click();
        ReusableMethod.waitToSee(2);
    }

    //Scenario: TC_138
    @Then("click Event- Order confirmation, Type- System checkbox")
    public void clickEventOrderConfirmationTypeSystemCheckbox() {

        pages.notificationsSetting_OrderConfirmation_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("verify Event- Order confirmation, Type- System checkbox is unchecked")
    public void verifyEventOrderConfirmationTypeSystemCheckboxIsUnchecked() {

        assertFalse(pages.notificationsSetting_OrderConfirmation_System1.isSelected());
        pages.notificationsSetting_OrderConfirmation_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("click Event- Ordered, Type- System checkbox")
    public void clickEventOrderedTypeSystemCheckbox() {

        pages.notificationsSetting_Ordered_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("verify Event- Ordered, Type- System checkbox is unchecked")
    public void verifyEventOrderedTypeSystemCheckboxIsUnchecked() {

        assertFalse(pages.notificationsSetting_Ordered_System1.isSelected());
        pages.notificationsSetting_Ordered_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("click Event- Ordered, Type- Email checkbox")
    public void clickEventOrderedTypeEmailCheckbox() {

        pages.notificationsSetting_Ordered_Email.click();
        ReusableMethod.waitToSee(3);

    }

    //Scenario: TC_138
    @Then("verify Event- Ordered, Type- Email checkbox is unchecked")
    public void verifyEventOrderedTypeEmailCheckboxIsUnchecked() {

        assertFalse(pages.notificationsSetting_Ordered_Email1.isSelected());
        pages.notificationsSetting_Ordered_Email.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("click Event- Processing, Type- System checkbox")
    public void clickEventProcessingTypeSystemCheckbox() {

        pages.notificationsSetting_Processing_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("verify Event- Processing, Type- System checkbox is unchecked")
    public void verifyEventProcessingTypeSystemCheckboxIsUnchecked() {

        assertFalse(pages.notificationsSetting_Processing_System1.isSelected());
        pages.notificationsSetting_Processing_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("click Event- Processing, Type- Email checkbox")
    public void clickEventProcessingTypeEmailCheckbox() {
        pages.notificationsSetting_Processing_Email.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("verify Event- Processing, Type- Email checkbox is unchecked")
    public void verifyEventProcessingTypeEmailCheckboxIsUnchecked() {
        assertFalse(pages.notificationsSetting_Processing_Email1.isSelected());
        pages.notificationsSetting_Processing_Email.click();
        ReusableMethod.waitToSee(2);
    }

    //Scenario: TC_138
    @Then("click Event- Shipped, Type- System checkbox")
    public void clickEventShippedTypeSystemCheckbox() {

        pages.notificationsSetting_Shipped_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("verify Event- Shipped, Type- System checkbox is unchecked")
    public void verifyEventShippedTypeSystemCheckboxIsUnchecked() {

        assertFalse(pages.notificationsSetting_Shipped_System1.isSelected());
        pages.notificationsSetting_Shipped_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("click Event- Shipped, Type- Email checkbox")
    public void clickEventShippedTypeEmailCheckbox() {

        pages.notificationsSetting_Shipped_Email.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("verify Event- Shipped, Type- Email checkbox is unchecked")
    public void verifyEventShippedTypeEmailCheckboxIsUnchecked() {

        assertFalse(pages.notificationsSetting_Shipped_Email1.isSelected());
        pages.notificationsSetting_Shipped_Email.click();
        ReusableMethod.waitToSee(3);

    }

    //Scenario: TC_138
    @Then("click Event- Received, Type- System checkbox")
    public void clickEventReceivedTypeSystemCheckbox() {

        pages.notificationsSetting_Received_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("verify Event- Received, Type- System checkbox is unchecked")
    public void verifyEventReceivedTypeSystemCheckboxIsUnchecked() {

        assertFalse(pages.notificationsSetting_Received_System1.isSelected());
        pages.notificationsSetting_Received_System.click();
        ReusableMethod.waitToSee(3);


    }

    //Scenario: TC_138
    @Then("click Event- Received, Type- Email checkbox")
    public void clickEventReceivedTypeEmailCheckbox() {
        pages.notificationsSetting_Received_Email.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("verify Event- Received, Type- Email checkbox is unchecked")
    public void verifyEventReceivedTypeEmailCheckboxIsUnchecked() {
        assertFalse(pages.notificationsSetting_Received_Email1.isSelected());
        pages.notificationsSetting_Received_Email.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("click Event- Delivered, Type- System checkbox")
    public void clickEventDeliveredTypeSystemCheckbox() {
        pages.notificationsSetting_Delivered_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("verify Event- Delivered, Type- System checkbox is unchecked")
    public void verifyEventDeliveredTypeSystemCheckboxIsUnchecked() {
        assertFalse(pages.notificationsSetting_Delivered_System1.isSelected());
        pages.notificationsSetting_Delivered_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("click Event- Delivered, Type- Email checkbox")
    public void clickEventDeliveredTypeEmailCheckbox() {
        pages.notificationsSetting_Delivered_Email.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("verify Event- Delivered, Type- Email checkbox is unchecked")
    public void verifyEventDeliveredTypeEmailCheckboxIsUnchecked() {

        assertFalse(pages.notificationsSetting_Delivered_Email1.isSelected());
        pages.notificationsSetting_Delivered_Email.click();
        ReusableMethod.waitToSee(3);
    }


    //Scenario: TC_138
    @Then("click Event- New Order, Type- System checkbox")
    public void verifyEventNewOrderTypeSystemCheckbox() {

        pages.notificationsSetting_NewOrder_System.click();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_138
    @Then("verify Event- New Order, Type- System checkbox is unchecked")
    public void verifyEventNewOrderTypeSystemCheckboxIsUnchecked() {

        assertFalse(pages.notificationsSetting_NewOrder_System1.isSelected());
        pages.notificationsSetting_NewOrder_System.click();
        ReusableMethod.waitToSee(3);
    }


}