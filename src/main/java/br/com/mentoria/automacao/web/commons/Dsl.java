package br.com.mentoria.automacao.web.commons;

import br.com.mentoria.automacao.web.config.BaseTest;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Dsl extends BaseTest {

    /**
     * Acessar uma URL
     * @param url Inserir URL desejada
     */
    public void acessSite(String url) {

        driver.get(url);
    }

    /**
     *
     * @param xpath Insira o elemento Xpath
     * @param text Insira o texto que deseja escrever
     */
    public void writeByXpath(String xpath, String text){
        driver.findElement(By.xpath(xpath)).sendKeys(text);

}

}


