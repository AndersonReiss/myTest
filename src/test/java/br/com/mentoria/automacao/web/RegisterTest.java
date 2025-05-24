package br.com.mentoria.automacao.web;

import br.com.mentoria.automacao.web.commons.Dsl;
import br.com.mentoria.automacao.web.config.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterTest extends Dsl {



    @Test
    public void register(){
super.acessSite("https://demo.automationtesting.in/Register.html");
    //driver.get("https://demo.automationtesting.in/Register.html"); substituido pelo super
        super.writeByXpath("//input[@placeholder='First Name']", "Anderson");
    //driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Anderson");
    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Reis");
    driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Rua Getulio Vargas, n 433 Jardim Belval, Barueri -SP CEP: 06420190");
    driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("anderson@gmail.com");
    driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("11945676543");
    driver.findElement(By.xpath("//input[@value='Male']")).click();
    driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
    driver.findElement(By.id("msdd")).click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)");
    driver.findElement(By.xpath("//a[@class='ui-corner-all' and text()='Portuguese']")).click();
    Select skills = new Select(driver.findElement(By.id("Skills")));
    skills.selectByValue("Java");
        driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement JapanOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Japan']")));
        JapanOption.click();
        Select selectAno = new Select(driver.findElement(By.id("yearbox")));
        Select selectMes = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
        Select selectDia = new Select(driver.findElement(By.id("daybox")));
        selectDia.selectByValue("10");
        selectAno.selectByValue("2000");
        selectMes.selectByValue("November");

        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("1234");
        WebElement segundasenha = driver.findElement(By.id("secondpassword"));
        segundasenha.sendKeys("1234"); //outra forma



        WebElement upload = driver.findElement(By.id("imagesrc"));
        //upload.sendKeys("C:\\Users\\ander\\Desktop\\Escudo-do-palmeiras.jpg");










    }



}
