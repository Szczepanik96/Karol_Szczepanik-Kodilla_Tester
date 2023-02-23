package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTest {
    private UserValidator validator;

    @BeforeEach
    public void setUp(){
        validator = new UserValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"_azAZ09-._azAZ09-@azAZ09-.azAZ09-.azAZ", "BC-_45.DeF-_g56@Ij-7.K-l8.Mnasda"})
    public void shouldReturnTrueIfAllAllowedElementsIncluded(String mail) {
        boolean result = validator.validateEmail(mail);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"_a1._b2@c3-.d4-.ef", "it.it@AA.AA", "12.34@56.Aa", "a.a@a.a", "1.2@3.a"})
    public void shouldReturnTrueIfUsedNotAllAvailableElements(String mail) {
        boolean result = validator.validateEmail(mail);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"_Aa12@A-a12.Pl", "a@1.as", "_@-.uj", "1@2.QQ"})
    public void shouldReturnTrueIfUseShorVersionOfEmail(String mail) {
        boolean result = validator.validateEmail(mail);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"_Aa12-<$%.a12@-cY1$.aa", "aa.A!@wx.&", "pl.12@gm#.pL", "Us1@@pa.cA", "a1.2$a@aw.as", "Yu77.Me123@cwx.aa1", "aW1.ad   ad@ta1.pl"})
    public void shouldReturnFalseIfEmailHaveNotAllowedElements(String mail) {
        boolean result = validator.validateEmail(mail);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"_aA12.2Ai.Ca-.aa", "Aw1@aw", "_-Aw12.qq55-@pl", "yT1.Ui12@po12"})
    public void shouldReturnFalseIfNotIncludedRequiredElement(String mail) {
        boolean result = validator.validateEmail(mail);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsEmpty(String mail) {
        boolean result = validator.validateEmail(mail);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Az123.-_","12344","AAAAAA","aaaaaa","-------","______"} )
    public void shouldReturnTrueIfUsernameIsCorrect(String username){
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"AZ123._-!","AAAAA&"})
    public void shouldReturnFalseIfUsernameHaveNotAllowedElements(String username){
        boolean result = validator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"AA","aa","Aa","11",".."})
    public void shouldReturnFalseIfUsernameIsTooShort(String username){
        boolean result = validator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfUsernameIsEmpty(String username){
        boolean result = validator.validateUsername(username);
        assertFalse(result);
    }
}