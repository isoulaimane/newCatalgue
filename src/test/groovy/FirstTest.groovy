import spock.lang.Specification

class FirstTest extends Specification {



    def 'is should marche'(){
        given:
        def a =10
        when:
        def b= a+a
        then:
        b == 20
    }
}
