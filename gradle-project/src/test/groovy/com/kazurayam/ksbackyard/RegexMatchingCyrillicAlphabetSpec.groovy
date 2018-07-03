package com.kazurayam.ksbackyard

import java.util.regex.Matcher
import java.util.regex.Pattern

import spock.lang.Specification


class RegexMatchingCyrillicAlphabetSpec extends Specification {

    // fixture methods
    def setupSpec() {}
    def setup() {}
    def cleanup() {}
    def cleanupSpec() {}

    // feature methods
    def testMatchingLatinAlphabet() {
        setup:
        String s = ' IVANOV IVAN 123 '
        Pattern p = Pattern.compile(/^[ ][A-Z0-9 ]+[ ]$/)
        when:
        Matcher m = p.matcher(s)
        then:
        m.matches()
    }

    def testMatchingAnyUNICODE() {
        setup:
        String s = 'ИВАНОВ'
        Pattern p = Pattern.compile(/[\p{L}]+/)
        when:
        Matcher m = p.matcher(s)
        then:
        m.matches()
    }

    def testMatchingAnyUNICODE_DIGITS_BLANK() {
        setup:
        String s = 'ИВАНОВ ИВАН 123'
        Pattern p = Pattern.compile(/[\p{L}\p{Digit}\s]+/)
        when:
        Matcher m = p.matcher(s)
        then:
        m.matches()
    }

    def testMatchingCyrillicAlphabet_simple() {
        setup:
        String s = 'ИВАНОВ'
        Pattern p = Pattern.compile(/[\p{InCyrillic}]+/)
        when:
        Matcher m = p.matcher(s)
        then:
        m.matches()
    }

    def testMatchingCyrillicAlphabet_withBlankAndNumber() {
        setup:
        String s = ' ИВАНОВ ИВАН 123 '
        Pattern p = Pattern.compile(/[\s]*[\p{IsCyrillic}\d\s]+[\s]*/)
        when:
        Matcher m = p.matcher(s)
        then:
        m.matches()
    }
}
