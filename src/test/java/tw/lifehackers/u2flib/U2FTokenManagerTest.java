package tw.lifehackers.u2flib;

import org.junit.Test;

import java.util.List;

public class U2FTokenManagerTest {

    @Test
    public void listTokenInfos() {
        List<U2FToken> u2FTokenList = U2FTokenManager.getTokens();
        if (u2FTokenList.size() == 0) {
            System.out.println("no token was found");
        } else {
            for (int i = 0; i < u2FTokenList.size() ; i++) {
                System.out.println(String.format("[%2d] %s", i, u2FTokenList.get(i)));
            }
        }
    }
}
