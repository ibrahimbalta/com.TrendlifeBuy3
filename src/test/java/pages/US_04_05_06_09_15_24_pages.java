package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_04_05_06_09_15_24_pages {

    public US_04_05_06_09_15_24_pages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Home page --> pop up
    @FindBy(css = "#subscriptionModal > div > div.close_modal > i")
    public WebElement PopupExit;

    //Home page --> My Account
    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccount;

    //Home page --> Order Status
    @FindBy(xpath = "//a[text()='Order Status']")
    public WebElement orderStatus;

    //Home page --> Referral
    @FindBy(xpath = "//a[text()='Referral']")
    public WebElement referral;

    //Home page --> Coupons
    @FindBy(xpath = "//a[text()='Coupons']")
    public WebElement coupons;

    //Home page subnemu--> About Us
    @FindBy(xpath = "(//a[text()='About Us'])[3]")
    public WebElement aboutUs;

    //Home page subnemu--> Contact Us link
    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUs;

    //Home page subnemu--> Career  link
    @FindBy(xpath = "//a[text()='Career']")
    public WebElement career;

    //Home page subnemu--> Refund Policy link
    @FindBy(xpath = "//a[text()='Refund Policy']")
    public WebElement refundPolicy;

    //Home page subnemu--> Terms & Condition link
    @FindBy(xpath = "//a[text()='Terms & Condition']")
    public WebElement termsCondition;

    //Home page subnemu--> Google Play button
    @FindBy(xpath = "//a[@class='google_play_box d-flex align-items-center mb_10']")
    public WebElement googlePlayButton;

    //Home page subnemu--> Apple Store button
    @FindBy(xpath = "//*[h4='Apple Store']")
    public WebElement appleStoreButton;

    //Home page subnemu--> Go To Top
    @FindBy(xpath = "//a[@title= 'Go to Top']")
    public WebElement goToTop;

    //Home page --> Search Your Item Box
    @FindBy(xpath = "//input[@class='form-control category_box_input']")
    public WebElement searchBox;

    //Home page subnemu--> facebook icon
    @FindBy(xpath = "//*[@class='fab fa-facebook-f']")
    public WebElement facebookIcon;

    //Home page subnemu--> twitter icon
    @FindBy(xpath = "//*[@class='fab fa-twitter']")
    public WebElement twitterIcon;

    //Home page subnemu--> liknedin icon
    @FindBy(xpath = "//*[@class='fab fa-linkedin']")
    public WebElement linkedinIcon;

    //Home page subnemu--> instagram icon
    @FindBy(xpath = "//*[@class='fab fa-instagram']")
    public WebElement instagramIcon;

    //Home page bodynemu--> Trending Products
    @FindBy(xpath = "//h3[text()='Trending Products']")
    public WebElement trendingProducts;

    //Home page bodynemu--> Hot Categories
    @FindBy(xpath = "//h3[text()='Hot  Categories']")
    public WebElement hotCategories;

    //Home page bodynemu--> House Appliances
    @FindBy(xpath = "//h4[text()='House Appliances']")
    public WebElement houseAppliances;

    //Home page bodynemu-->Recommendation For You
    @FindBy(xpath = "//h4[text()='Recommendation For You']")
    public WebElement recommendtaionForYou;

    //Home page bodynemu-->Top Brand
    @FindBy(xpath = "//h3[text()='Top Brand']")
    public WebElement topBrand;

    //Home page bodynemu-->Popular Searches
    @FindBy(xpath = "//h3[text()='Popular Searches']")
    public WebElement popularSearches;

    //Home page bodynemu-->Trendlifebuy | ONLINE SHOPPING
    @FindBy(xpath = "//h3[text()='Trendlifebuy | ONLINE SHOPPING']")
    public WebElement trenbuylifeOnlineShopping;

    //Home page bodynemu-->Trending products viewAll
    @FindBy(xpath = "(//a[@class='title_link d-flex align-items-center lh-1'])[1]")
    public WebElement viewAll_trendingProducts;

    //Home page bodynemu-->Hot Categories viewAll
    @FindBy(xpath = "(//span[text()='View All'])[2]")
    public WebElement viewAll_hotcategories;

    //Home page subnemu-->More Deals
    @FindBy(xpath = "(//span[@class='title_text'])[3]")
    public WebElement moreDealsButton;

    //Home page subnemu-->Load More
    @FindBy(id = "loadmore")
    public WebElement loadMoreButton;

    //Home page -->LogIn button
    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement logInButton;

    //Home page -->Register Bbutton
    @FindBy(xpath = "//span[@class='d-inline-block lh-1 ']")
    public WebElement registerButton;

    //Home page/login -->Click here
    @FindBy(xpath = "(//a[text()='Click Here'])")
    public WebElement clickHereToReset;

    //Home page/login -->Sign Up
    @FindBy(xpath = "(//a[text()='Sign Up'])")
    public WebElement signUp;

    //Home page/Password -->Reset
    @FindBy(id = "sign_in_btn")
    public WebElement resetPasswordSendButton;

    //Home page/Register --> Sign Up
    @FindBy(xpath = "//h3[text()='Sign Up']")
    public WebElement signUpText;

    //Home page/login --> Email
    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailBox;

    //Home page/login --> Password
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    //Home page/login --> Sign In
    @FindBy(id = "sign_in_btn")
    public WebElement signInButton;

    //Home page/home --> Dashboard
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardLink;

    //Home page/home --> Succesfull message
    @FindBy(css = ".toast-success")
    public WebElement succesMessage;

    //Home page/home --> Wrong data message
    @FindBy(xpath = "//*[text()='These credentials do not match our records.']")
    public WebElement wrongDataText;

    //Home page/login --> Remember me
    @FindBy(xpath = "//label[@class='primary_checkbox d-flex']")
    public WebElement rememberMeCheckBox;

    //Home page/login --> Remember me
    @FindBy(id = "remember")
    public WebElement rememberMeCheckBox1;

    //Home page --> Product select
    @FindBy(xpath = "(//img[@alt='Beautiful single size sofa -0099'])[1]")
    public WebElement product1;
    @FindBy(xpath = "(//img[@alt='Single Seater sofa Premium quality -2021'])[1]")
    public WebElement product2;

    //Home page --> Product page compare
    @FindBy(xpath = "//*[@id='add_to_compare_btn']")
    public WebElement compareButtonProductPage;

    //Home page --> Home page compare
    @FindBy(xpath = "//span[text()='Compare(']")
    public WebElement compareButtonHomePage;

    //Home page/Product Compare --> picture1
    @FindBy(xpath = "(//div[@class='product_thumb_upper'])[1]")
    public WebElement comparedProduct1;

    //Home page/Product Compare --> picture2
    @FindBy(xpath = "(//div[@class='product_thumb_upper'])[2]")
    public WebElement comparedProduct2;

    //Home page/Product Compare --> Content Info1
    @FindBy(xpath = "(//ul[@class='comparison_lists'])[1]")
    public WebElement comparisonList1;

    //Home page/Product Compare --> Content Info1
    @FindBy(xpath = "(//ul[@class='comparison_lists'])[2]")
    public WebElement comparisonList2;

    //Home page/Product Compare --> Reset Compare
    @FindBy(xpath = "//*[text()='Reset Compare']")
    public WebElement compareReset;

    //Home page/Product Compare --> Reset Compare
    @FindBy(xpath = "//h4[text()='Compare list is empty.']")
    public WebElement compareListEmptyText;

    //Home page --> Dashboard button
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardButton;

    //profile/dashboard --> User (name)
    @FindBy(xpath = "//h4[@class='font_20 f_w_700']")
    public WebElement userName;

    //profile/dashboard --> (user) Email
    @FindBy(xpath = "//span[@class='email_text font_14 f_w_400 mute_text position-relative']")
    public WebElement emailofUser;

    //profile/dashboard --> All Order
    @FindBy(xpath = "//span[text()=' All Order']")
    public WebElement allOrder;

    //profile/dashboard --> My Wishlist
    @FindBy(xpath = "//span[text()='My Wishlist']")
    public WebElement myWishlist;

    //profile/dashboard --> Refund Success
    @FindBy(xpath = "//span[text()='Refund Success']")
    public WebElement refundSuccess;

    //profile/dashboard --> Product in Cart
    @FindBy(xpath = "//span[text()=' Product in Cart']")
    public WebElement productInCart;

    //profile/dashboard --> Coupon Used
    @FindBy(xpath = "//span[text()=' Coupon Used']")
    public WebElement couponUsed;

    //profile/dashboard --> Completed Order
    @FindBy(xpath = "//span[text()=' Completed Order']")
    public WebElement completedOrder;

    //profile/dashboard --> Total Balance
    @FindBy(xpath = "//h4[@class='font_30 f_w_700 secondary_text mb_25']")
    public WebElement totalBalance;

    //profile/dashboard --> Recharge My Wallet
    @FindBy(xpath = "//span[@class='font_14 f_w_700 secondary_text text-uppercase']")
    public WebElement rechargeMyWallet;

    //profile/dashboard --> (afterclicking RechargeMyWallet) Recharge Amount
    @FindBy(xpath = "//span[@class='font_14 f_w_700 secondary_text text-uppercase']")
    public WebElement rechargeAmountButton;

    //profile/dashboard --> Recharge wallet
    @FindBy(xpath = "//input[@name='recharge_amount']")
    public WebElement rechargeAmountBox;

    //profile/dashboard --> Amount Add Fund button
    @FindBy(xpath = "//button[@class='amaz_primary_btn style2 text-nowrap']")
    public WebElement rechargeAmountAddFundButton;

    //profile/dashboard --> stripe logo/button
    @FindBy(xpath = "//img[@title='Stripe']")
    public WebElement stripe_Logo;

    //profile/dashboard --> stripe email
    @FindBy(id = "email")
    public WebElement stripe_Email;

    //profile/dashboard --> stripe card number
    @FindBy(id = "card_number")
    public WebElement stripe_CardNumber;

    //profile/dashboard --> stripe card expiry date
    @FindBy(id = "cc-exp")
    public WebElement stripe_CardExpDate;

    //profile/dashboard --> stripe Cvc
    @FindBy(id = "cc-csc")
    public WebElement stripe_Cvc;

    //profile/dashboard --> stripe Pay button
    @FindBy(id = "submitButton")
    public WebElement stripe_Pay;

    //profile/dashboard --> last transaction
    @FindBy(xpath = "//a[@class='amaz_badge_btn ']")
    public WebElement totalBalance_LastTransaction;

    //profile/dashboard --> See all button of Purchase History
    @FindBy(xpath = "//a[@class='amaz_badge_btn2 text-uppercase text-nowrap']")
    public WebElement seeAll_PurchaseHistory;

    //profile/dashboard --> See all button of My Wishlist
    @FindBy(xpath = "(//a[@class='amaz_badge_btn2 text-uppercase'])[1]")
    public WebElement seeAll_MyWishList;

    //profile/dashboard --> See all button of Recent Order
    @FindBy(xpath = "(//a[@class='amaz_badge_btn2 text-uppercase'])[2]")
    public WebElement seeAll_RecentOrder;

    //profile/dashboard --> See all button of Product in Cart
    @FindBy(xpath = "(//a[@class='amaz_badge_btn2 text-uppercase'])[3]")
    public WebElement seeAll_ProductinCart;

    //profile/dashboard --> purchaseHistoryOnSideBar
    @FindBy(xpath = "//a[normalize-space()='Purchase History']")
    public WebElement purchaseHistoryOnSideBar;

    //profile/dashboard --> myWishlistOnSideBar
    @FindBy(xpath = "//a[normalize-space()='My Wishlist']")
    public WebElement myWishlistOnSideBar;

    //profile/dashboard --> myOrderOnSideBar
    @FindBy(xpath = "//a[normalize-space()='My Order']")
    public WebElement myOrderOnSideBar;

    //profile/dashboard --> giftCardOnSideBar
    @FindBy(xpath = "//a[normalize-space()='Giftcard']")
    public WebElement giftCardOnSideBar;

    //profile/dashboard --> myWalletOnSideBar
    @FindBy(xpath = "//a[normalize-space()='My Wallet']")
    public WebElement myWalletOnSideBarOn;

    //profile/dashboard --> myCouponsOnSideBar
    @FindBy(xpath = "//a[normalize-space()='My Coupons']")
    public WebElement myCouponsOnSideBar;

    //profile/dashboard --> refundDisputeOnSideBar  Refund & Dispute
    @FindBy(xpath = "//a[normalize-space()='Refund & Dispute']")
    public WebElement refundDisputeOnSideBar;

    //profile/dashboard --> myAccountOnSideBar
    @FindBy(xpath = "//a[normalize-space()='My Account']")
    public WebElement myAccountOnSideBar;

    //profile/dashboard --> digitalProductsOnSideBar
    @FindBy(xpath = "//a[normalize-space()='Digital Products']")
    public WebElement digitalProductsOnSideBar;

    //profile/dashboard --> referrralOnSideBar
    @FindBy(xpath = "//a[normalize-space()='Referral']")
    public WebElement referrralOnSideBar;

    //profile/dashboard --> supportTicketOnSideBar
    @FindBy(xpath = "//a[normalize-space()='Support Ticket']")
    public WebElement supportTicketOnSideBar;

    //profile/dashboard --> notificationOnSideBar
    @FindBy(xpath = "//a[@class='position-relative d-flex align-items-center'][normalize-space()='Notification']")
    public WebElement notificationOnSideBar;

    //profile/notifications (list) --> element SL
    @FindBy(xpath = "//thead/tr/th[text()='SL']")
    public WebElement notificationelement_SL;

    //profile/notifications (list) --> element Title
    @FindBy(xpath = "//thead/tr/th[text()='Title']")
    public WebElement notificationelement_Title;

    //profile/notifications (list) --> element Date
    @FindBy(xpath = "//thead/tr/th[text()='Date']")
    public WebElement notificationelement_Date;

    //profile/notifications (list) --> element Action
    @FindBy(xpath = "//thead/tr/th[text()='Action']")
    public WebElement notificationelement_Action;

    //profile/notifications (list) --> View button
    @FindBy(xpath = "//a[@class='amaz_badge_btn4 text-nowrap text-capitalize text-center']")
    public WebElement notificationlist_ViewButton;

    //profile/notifications (list) --> FirstNotificationTitle
    @FindBy(xpath = "(//span[@class='font_14 f_w_500 mute_text'])[2]")
    public WebElement notificationlist_FirstNotificationTitle;

    //profile/notifications (list) --> FirstNotificationDate
    @FindBy(xpath = "(//span[@class='font_14 f_w_500 mute_text'])[3]")
    public WebElement notificationlist_FirstNotificationDate;

    //profile/notifications (list) --> FirstNotificationView Button
    @FindBy(xpath = "(//*[text()='View'])[1]")
    public WebElement notificationlist_FirstNotificationView;

    //profile/notifications (list) --> Setting Button
    @FindBy(xpath = "//a[text()='Setting']")
    public WebElement notificationsSettingButton;

    //profile/notifications/setting -->Offline recharge-System
    @FindBy(xpath = "(//span[@class='checkmark mr_15'])[1]")
    public WebElement notificationsSetting_OfflineRecharge_System;

    //profile/notifications/setting -->Offline recharge-System1
    @FindBy(xpath = "//input[@data-value='1613']")
    public WebElement notificationsSetting_OfflineRecharge_System1;

    //profile/notifications/setting -->Order confirmation-System
    @FindBy(xpath = "(//span[@class='checkmark mr_15'])[2]")
    public WebElement notificationsSetting_OrderConfirmation_System;

    //profile/notifications/setting -->Order confirmation-System1
    @FindBy(xpath = "//input[@data-value='1614']")
    public WebElement notificationsSetting_OrderConfirmation_System1;

    //profile/notifications/setting -->Ordered-System
    @FindBy(xpath = "(//span[@class='checkmark mr_15'])[3]")
    public WebElement notificationsSetting_Ordered_System;
    //profile/notifications/setting -->Ordered-System1
    @FindBy(xpath = "(//span[@class='checkmark mr_15'])[3]")
    public WebElement notificationsSetting_Ordered_System1;

    //profile/notifications/setting -->Ordered-Email
    @FindBy(xpath = "(//span[@class='checkmark mr_15'])[4]")
    public WebElement notificationsSetting_Ordered_Email;
    //profile/notifications/setting -->Ordered-Email1
    @FindBy(xpath = "(//input[@data-value='1615'])[2]")
    public WebElement notificationsSetting_Ordered_Email1;

    //profile/notifications/setting -->Processing-System
    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[5]")
    public WebElement notificationsSetting_Processing_System;

    //profile/notifications/setting -->Processing-System1
    @FindBy(xpath = "(//input[@data-value='1616'])[1]")
    public WebElement notificationsSetting_Processing_System1;

    //profile/notifications/setting -->Processing-Email
    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[6]")
    public WebElement notificationsSetting_Processing_Email;

    //profile/notifications/setting -->Processing-Email1
    @FindBy(xpath = "(//input[@data-value='1616'])[2]")
    public WebElement notificationsSetting_Processing_Email1;

    //profile/notifications/setting -->Shipped-Email
    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[7]")
    public WebElement notificationsSetting_Shipped_Email;

    //profile/notifications/setting -->Shipped-Email1
    @FindBy(xpath = "(//input[@class='type check1617'])[1]")
    public WebElement notificationsSetting_Shipped_Email1;

    //profile/notifications/setting -->Shipped-System
    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[8]")
    public WebElement notificationsSetting_Shipped_System;

    //profile/notifications/setting -->Shipped-System1
    @FindBy(xpath = "(//input[@data-value='1617'])[2]")
    public WebElement notificationsSetting_Shipped_System1;

    //profile/notifications/setting -->Received-System
    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[9]")
    public WebElement notificationsSetting_Received_System;

    //profile/notifications/setting -->Received-System1
    @FindBy(xpath = "(//input[@data-value='1618'])[1]")
    public WebElement notificationsSetting_Received_System1;

    //profile/notifications/setting -->Received-Email
    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[10]")
    public WebElement notificationsSetting_Received_Email;

    //profile/notifications/setting -->Received-Email1
    @FindBy(xpath = "(//input[@data-value='1618'])[2]")
    public WebElement notificationsSetting_Received_Email1;

    //profile/notifications/setting -->Delivered-Email
    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[11]")
    public WebElement notificationsSetting_Delivered_Email;

    //profile/notifications/setting -->Delivered-Email1
    @FindBy(xpath = "(//input[@class='type check1619'])[1]")
    public WebElement notificationsSetting_Delivered_Email1;

    //profile/notifications/setting -->Delivered-System
    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[12]")
    public WebElement notificationsSetting_Delivered_System;

    //profile/notifications/setting -->Delivered-System1
    @FindBy(xpath = "(//span[@class='checkmark mr_15'])[12]")
    public WebElement notificationsSetting_Delivered_System1;


    //profile/notifications/setting -->New Order-System
    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[13]")
    public WebElement notificationsSetting_NewOrder_System;


    //profile/notifications/setting -->New Order-System1
    @FindBy(xpath = "(//input[@data-value='1620'])")
    public WebElement notificationsSetting_NewOrder_System1;

}



