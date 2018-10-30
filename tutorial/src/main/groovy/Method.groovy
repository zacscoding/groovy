import javax.xml.transform.Result

/**
 *
 * @author zacconding
 * @Date 2018-10-30
 * @GitHub : https://github.com/zacscoding
 */
class Method {
    static void main(String[] args) {
        DisplayName()
        DisplayName("zaccoding")
        sum(1, 5)
        DefaultParameter("test")
//        Result
//        Display() is called..
//        DisplayName(parameter1) is called.. parameter : zaccoding
//        6
//        DefaultParameter..
//        parameter1 : test
//        parameter2 : 10
//        parameter3 : 0
    }

    static def DisplayName() {
        println("Display() is called..")
    }

    static def DisplayName(parameter1) {
        println("DisplayName(parameter1) is called.. parameter : " + parameter1)
    }

    static void sum(int a, int b) {
        int c = a + b
        println(c)
    }

    static void DefaultParameter(parameter1, parameter2 = 10, parameter3 = 0) {
        println("DefaultParameter..")
        println("parameter1 : " + parameter1)
        println("parameter2 : " + parameter2)
        println("parameter3 : " + parameter3)
    }
}
