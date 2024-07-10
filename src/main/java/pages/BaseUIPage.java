package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Webdriver;

public class BaseUIPage extends Webdriver {

    public static void clickElement(WebElement element) {
        try {
            if (element.isDisplayed()) {
                element.click();
                System.out.println("Element clicked");
            } else {
                System.out.println("Element not clickable");
            }
        } catch (Exception e) {
            System.out.println("An error occured: "+e.getMessage());
        }
    }

    public static void typeText(WebElement element, String text) {
        try {
            if (element.isDisplayed()) {
                element.clear();
                element.sendKeys(text);
                System.out.println(text+" entered in text box.");
            } else {
                System.out.println("Text not entered");
            }
        } catch (Exception e) {
            System.out.println("An error occured: "+e.getMessage());
        }
    }

    public static void selectDropdownByVisibleText(WebElement element, String text) {
        try {
            if (element.isDisplayed()) {
                Select dropdown = new Select(element);
                dropdown.selectByVisibleText(text);
                System.out.println("Dropdown value selected by visible text successfully.");
            } else {
                System.out.println("Dropdown is not interactable.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void selectDropdownByIndex(WebElement element, int index) {
        try {
            if (element.isDisplayed()) {
                Select dropdown = new Select(element);
                dropdown.selectByIndex(index);
                System.out.println("Dropdown value selected by index successfully.");
            } else {
                System.out.println("Dropdown is not interactable.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void selectDropdownByValue(WebElement element, String value) {
        try {
            if (element.isDisplayed()) {
                Select dropdown = new Select(element);
                dropdown.selectByValue(value);
                System.out.println("Dropdown value selected by value successfully.");
            } else {
                System.out.println("Dropdown is not interactable.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


}
