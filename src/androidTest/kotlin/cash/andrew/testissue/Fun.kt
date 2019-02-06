package cash.andrew.testissue

import cash.andrew.test.test
import org.junit.Test

class Fun {
    @Test fun do_fun_stuff() {
        test() // loads lib 2 and prints `Test Lib 2: Hello from test lib 2` to logcat
        funStuff() // lib 2 is already loaded, prints `Test Lib 2: Hello from test lib 2` to logcat
    }

    @Test fun do_other_fun_stuff() {
        funStuff()
        test()
    }
}