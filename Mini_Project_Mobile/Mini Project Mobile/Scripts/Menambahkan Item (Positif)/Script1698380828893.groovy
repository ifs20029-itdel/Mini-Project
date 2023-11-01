import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\QE Alterra\\Mini Project\\mobile-app\\app-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/Klik Tombol Tambah'), 0)

Mobile.tap(findTestObject('Object Repository/Klik Form Nama'), 0)

Mobile.setText(findTestObject('Object Repository/Masukkan Nama'), 'Cyclonee', 0)

Mobile.tap(findTestObject('Object Repository/Klik Form Quantity'), 0)

Mobile.clearText(findTestObject('Object Repository/Hapus Quantity'), 0)

Mobile.setText(findTestObject('Object Repository/Masukkan Jumlah Quantity'), '100', 0)

Mobile.tap(findTestObject('Object Repository/Klik Jenis Item'), 0)

Mobile.tap(findTestObject('Object Repository/Pilih Salah Satu Jenis Item'), 0)

Mobile.tap(findTestObject('Object Repository/Klik Add Item'), 0)

Mobile.takeScreenshot('D:\\QE Alterra\\Mini Project Mobile\\Bukti\\screenshot.png')

Mobile.closeApplication()

