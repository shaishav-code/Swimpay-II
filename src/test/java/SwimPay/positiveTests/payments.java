package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.paymentPage;
import SwimPay.testComponents.baseClass;

public class payments extends baseClass {
	String email1 = "qa3@narola.email";
	String password = "Pass@1234";
	String referenceNum = "A1234B";
	String Currency1 = "AUD";
	String Currency5 = "HKD";
	String Currency2 = "USD";
	String Currency6 = "MXN";
	String Currency3 = "AED";
	String Currency7 = "NZD";
	String Currency4 = "CAD";
	String Currency8 = "EUR";

	// Verify clicking on payments option
	@Test(priority = 1)
	public void paymentsClick() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		Thread.sleep(2000);
		LoginPage.paymentsOption();
		LoginPage.Logout();
	}

	// Verify submit currency & recipient/payee details
	//@Test(priority = 2)
	public void payments_currencyAndRecipient_PayeeDataSubmit() {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency1);
		Payments.enterAmount("20");
		Payments.recipient_payeeName("CKS");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
	}

	// Verify payments payer details submit
//	@Test(priority = 3)
	public void payments_payerDataSubmit() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency1);
		Payments.enterAmount("20");
		Payments.recipient_payeeName("CKS");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.referenceNumberValue(referenceNum);
		Payments.paymentPurpiose("Transfer");
		Payments.reviewPayment();
	}

	// Verify create payments details submit
	//@Test(priority = 4)
	public void payments_createPaymentsSubmit() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency1);
		Payments.enterAmount("10");
		Payments.recipient_payeeName("CKS");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.referenceNumberValue(referenceNum);
		Payments.paymentPurpiose("Transfer");
		Payments.reviewPayment();
		Payments.createPayment();
		Payments.otpData();
		Payments.otpVerify();
		Payments.getMsg();
	}

	// Verify payment by selecting payment purpose as supplier bills
//	@Test(priority = 5)
	public void payments_bySelectPaymentProcessAs_supplierBill() throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency1);
		Payments.enterAmount("10");
		Payments.recipient_payeeName("CKS");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.referenceNumberValue(referenceNum);
		Payments.paymentPurpiose("supplier");
		Payments.reviewPayment();
		Payments.createPayment();
		Payments.otpData();
		Payments.otpVerify();
		Payments.getMsg();

	}

	// Verify payment by selecting payment purpose as Transportation fees for goods
	// option
//	@Test(priority = 6)
	public void payments_bySelectPaymentProcessAs_transportationGoodsOption() throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency1);
		Payments.enterAmount("10");
		Payments.recipient_payeeName("CKS");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.referenceNumberValue(referenceNum);
		Payments.paymentPurpiose("transportation");
		Payments.reviewPayment();
		Payments.createPayment();
		Payments.otpData();
		Payments.otpVerify();
		Payments.getMsg();

	}

	// Verify payment by selecting payment purpose as refunds option
	//@Test(priority = 7)
	public void payments_bySelectPaymentProcessAs_refundsOption() throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency1);
		Payments.enterAmount("10");
		Payments.recipient_payeeName("CKS");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.referenceNumberValue(referenceNum);
		Payments.paymentPurpiose("refund");
		Payments.reviewPayment();
		Payments.createPayment();
		Payments.otpData();
		Payments.otpVerify();
		Payments.getMsg();

	}

	// Verify click on add recipient/payee option when recipient list is not present
	// for selected currency option
//	@Test(priority = 8)
	public void payment_addRecipientPayeeOption() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency3);
		Payments.enterAmount("10");
		Payments.paymentDetailNextBtn();
	}

	// Verify add recipient/payee details when no data displays for recipient/payee
	// option according to selected currency and perform payment process
//	@Test(priority = 9)
	public void payments_addRecipientPayeeData_whenRecipient_payeeOption_notActiveForSelectedCurrency()
			throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency3);
		Payments.enterAmount("10");
		Payments.paymentDetailNextBtn();
		Payments.recipientPayeeNickname("Robert Tom");
		Payments.recipientPayee_country("Australia");
		Payments.recipientPayee_currency("Australia");
		Payments.AccountHoldersName("Robert Tom");
		Payments.recipientPayee_bankCountry("Australia");
		Payments.recipientPayeesubmit();
		Payments.regularPaymentCheckBox();
		Payments.transit_swiftBsbNumber();
		Payments.accountNumber("036545712");
		Payments.bankName("City Unioun Bank");
		Payments.address("Vibrant Milestone, opp. to KLE Hospital");
		Payments.city("Banglore");
		Payments.postCode("5374");
		Payments.pauseRun2();
		Payments.validate_N_createRecipientPayeeBtn();
		Payments.validate_N_createRecipientPayeeBtn();
		Payments.otpData();
		Payments.otpVerify();
		// Payments.getMessage();
		Payments.payOptClick_after_recipientPayeeAdded();
		Payments.enterAmount("10");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.referenceNumberValue(referenceNum);
		Payments.paymentPurpiose("Transfer");
		Payments.reviewPayment();
		Payments.createPayment();
		Payments.otpData();
		Payments.otpVerify();
	}

	// Verify add recipient/payee details with account type as Individual option
	// selection when no data displays for recipient/payee option according to
	// selected currency and perform payment process
	//@Test(priority = 10)
	public void payments_addRecipientPayeeData_whenRecipient_payeeOption_notActiveForSelectedCurrency_withIndividualAccountType()
			throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency3);
		Payments.enterAmount("10");
		Payments.paymentDetailNextBtn();
		Payments.recipientPayeeNickname("Cornado monika");
		Payments.recipientPayee_country("Canada");
		Payments.recipientPayee_currency("CAD");
		Payments.AccountHoldersName("Monika R Jow");
		Payments.recipientPayee_bankCountry("canada");
		Payments.bankAccountTypeIndividualOption();
		Payments.recipientPayeesubmit();
		Payments.regularPaymentCheckBox();
		Payments.transit_swiftBsbNumber();
		Payments.accountNumber("036545712");
		Payments.bankName("City Unioun Bank");
		Payments.state("Ontario");
		Payments.bankCode("004");
		Payments.address("Vibrant Milestone, opp. to KLE Hospital");
		Payments.city("Banglore");
		Payments.postCode("L4K - M9W");
		Payments.validate_N_createRecipientPayeeBtn();
		Payments.validate_N_createRecipientPayeeBtn();
		Payments.otpData();
		Payments.otpVerify();
		Payments.getMessage();
		Payments.payOptClick_after_recipientPayeeAdded();
		Payments.enterAmount("10");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.referenceNumberValue(referenceNum);
		Payments.paymentPurpiose("Transfer");
		Payments.reviewPayment();
		Payments.createPayment();
		Payments.otpData();
		Payments.otpVerify();

	}



	// Verify add recipient/payee details with selecting "yes" for "SWiM PAY Wallet
	// as Recipient/Payee" when no data displays for recipient/payee option
	// according to selected currency and perform payment process
//	@Test(priority = 11)
	public void payments_addRecipientPayeeData_whenRecipient_payeeOption_notActiveForSelectedCurrency_withSelectingSwimPayWallet_asYes()
			throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency3);
		Payments.enterAmount("10");
		Payments.paymentDetailNextBtn();
		Payments.recipientPayeeNickname("Andrew S Biden");
		Payments.recipientPayee_country("Australia");
		Payments.walletAsRecipientPayee_yesOption();
		Payments.recipientPayee_currency("AUD");
		Payments.swimPayAccountHolderName("NISL ");
		Payments.swimpayBankName("MONOOVA_AU");
		Payments.searchSwimpayAccountBtn();
		Payments.fundingAccountSelection();
		Payments.recipientPayeesubmit();
		Payments.regularPaymentCheckBox();
		Payments.city("Toronto");
		Payments.postCode("0005");
		Payments.validate_N_createRecipientPayeeBtn();
		Payments.validate_N_createRecipientPayeeBtn();
		Payments.otpData();
		Payments.otpVerify();
		Payments.getMessage();
		Payments.payOptClick_after_recipientPayeeAdded();
		Payments.enterAmount("10");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.referenceNumberValue(referenceNum);
		Payments.paymentPurpiose("Transfer");
		Payments.reviewPayment();
		Payments.createPayment();
		Payments.otpData();
		Payments.otpVerify();
	}

	// Verify clicking on Back button from Review details steps
//	@Test(priority = 12)
	public void payment_clickBackBtn_fromReviewProcessStep() {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency3);
		Payments.enterAmount("10");
		Payments.paymentDetailNextBtn();
		Payments.recipientPayeeNickname("Jeeet");
		Payments.recipientPayee_country("Australia");
		Payments.recipientPayee_currency("Australia");
		Payments.AccountHoldersName("Jeeet");
		Payments.recipientPayee_bankCountry("Australia");
		Payments.recipientPayeesubmit();
		Payments.regularPaymentCheckBox();
		Payments.transit_swiftBsbNumber();
		Payments.accountNumber("036545712");
		Payments.bankName("City Unioun Bank");
		Payments.address("Vibrant Milestone, opp. to KLE Hospital");
		Payments.city("Banglore");
		Payments.postCode("5374");
		Payments.validate_N_createRecipientPayeeBtn();
		Payments.backButton();
	}

	// Verify click on back to recipient/Payee list button from recipient/payee
	// details page
//	@Test(priority = 13)
	public void payment_clickBackToRecipientPayeeList_fromRecipientPayeeDetailsStep() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency3);
		Payments.enterAmount("10");
		Payments.paymentDetailNextBtn();
		Payments.scrollBy();
		Payments.backButton();
	}

	// Verify click on back to recipient/Payee list button from recipient/payee
	// details page when data provided in fields
//	@Test(priority = 14)
	public void payment_clickBackToRecipientPayeeList_fromRecipientPayeeDetailsStep_withDataProvided() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments = LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency3);
		Payments.enterAmount("10");
		Payments.paymentDetailNextBtn();
		Payments.recipientPayeeNickname("Jeeet");
		Payments.recipientPayee_country("Australia");
		Payments.recipientPayee_currency("Australia");
		Payments.AccountHoldersName("Jeeet");
		Payments.recipientPayee_bankCountry("Australia");
		// Payments.scrollBy();
		Payments.backBtn();
		Payments.yesAction();
	}

}
