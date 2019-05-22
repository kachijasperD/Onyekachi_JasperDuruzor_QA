# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class InvalidUserCredentials(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(30)
        self.base_url = "https://www.katalon.com/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_invalid_user_credentials(self):
        driver = self.driver
        driver.get("https://uat.ormuco.com/login")
        driver.find_element_by_id("username").click()
        driver.find_element_by_id("username").clear()
        driver.find_element_by_id("username").send_keys("123456789")
        driver.find_element_by_id("password").clear()
        driver.find_element_by_id("password").send_keys("qwertyuiopas")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Is Caps-lock on?'])[1]/following::button[1]").click()
        driver.find_element_by_id("username").click()
        driver.find_element_by_id("username").clear()
        driver.find_element_by_id("username").send_keys("1234567dfghjk")
        driver.find_element_by_id("password").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='The user or password is incorrect.'])[1]/following::button[1]").click()
        driver.find_element_by_id("username").click()
        driver.find_element_by_id("username").clear()
        driver.find_element_by_id("username").send_keys("sdfghjklkjhg")
        driver.find_element_by_id("password").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='The user or password is incorrect.'])[1]/following::button[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Is Caps-lock on?'])[1]/following::span[1]").click()
        driver.find_element_by_id("username").click()
        driver.find_element_by_id("username").clear()
        driver.find_element_by_id("username").send_keys("@#$%^&**&^%##$%^")
        driver.find_element_by_id("password").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='The user or password is incorrect.'])[1]/following::button[1]").click()
        driver.find_element_by_id("username").click()
        driver.find_element_by_id("username").clear()
        driver.find_element_by_id("username").send_keys("ojasperduruzor@gmail.com")
        driver.find_element_by_id("password").click()
        driver.find_element_by_id("password").clear()
        driver.find_element_by_id("password").send_keys("123456")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='The user or password is incorrect.'])[1]/following::button[1]").click()
        driver.find_element_by_id("password").click()
        driver.find_element_by_id("password").clear()
        driver.find_element_by_id("password").send_keys("asdfg")
        driver.find_element_by_id("username").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='The user or password is incorrect.'])[1]/following::button[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Is Caps-lock on?'])[1]/following::span[1]").click()
        driver.find_element_by_id("username").click()
        driver.find_element_by_id("password").clear()
        driver.find_element_by_id("password").send_keys("asdf1234")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='The user or password is incorrect.'])[1]/following::button[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Is Caps-lock on?'])[1]/following::span[1]").click()
        driver.find_element_by_id("username").click()
        driver.find_element_by_id("password").clear()
        driver.find_element_by_id("password").send_keys("!@#$%^&")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='The user or password is incorrect.'])[1]/following::button[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Is Caps-lock on?'])[1]/following::span[1]").click()
        driver.find_element_by_id("username").click()
        driver.find_element_by_id("username").clear()
        driver.find_element_by_id("username").send_keys("ojasperduruzor@gmail.com")
        driver.find_element_by_id("password").click()
        driver.find_element_by_id("password").clear()
        driver.find_element_by_id("password").send_keys("")
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='The user or password is incorrect.'])[1]/following::button[1]").click()
        driver.find_element_by_xpath("(.//*[normalize-space(text()) and normalize-space(.)='Is Caps-lock on?'])[1]/following::span[1]").click()
        driver.close()
    
    def is_element_present(self, how, what):
        try: self.driver.find_element(by=how, value=what)
        except NoSuchElementException as e: return False
        return True
    
    def is_alert_present(self):
        try: self.driver.switch_to_alert()
        except NoAlertPresentException as e: return False
        return True
    
    def close_alert_and_get_its_text(self):
        try:
            alert = self.driver.switch_to_alert()
            alert_text = alert.text
            if self.accept_next_alert:
                alert.accept()
            else:
                alert.dismiss()
            return alert_text
        finally: self.accept_next_alert = True
    
    def tearDown(self):
        self.driver.quit()
        self.assertEqual([], self.verificationErrors)

if __name__ == "__main__":
    unittest.main()
