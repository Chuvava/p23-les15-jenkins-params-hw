package com.aefimov.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    private SelenideElement fullName = $("#userName"),
            email = $("#userEmail"),
            currentAddress = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submit = $("#submit"),
            outputArea = $("#output");

    public TextBoxPage openPage() {
        open("/text-box");
        return this;
    }

    public TextBoxPage setFullName(String value) {
        fullName.setValue(value);
        return this;
    }

    public TextBoxPage setEmail(String value) {
        email.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddress.setValue(value);
        return this;
    }

    public TextBoxPage submit() {
        submit.click();
        return this;
    }

    public TextBoxPage verifyOutputValue(String valueName, String value) {
        outputArea.$(withText(valueName)).shouldHave(Condition.text(value));
        return this;
    }
}
