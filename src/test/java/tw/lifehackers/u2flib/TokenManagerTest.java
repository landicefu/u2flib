package tw.lifehackers.u2flib;

import org.junit.Test;

import java.util.List;

public class TokenManagerTest {

    @Test
    public void listTokenInfos() {
        List<Token> tokenList = TokenManager.getTokens();
        if (tokenList.size() == 0) {
            System.out.println("no token was found");
        } else {
            for (int i = 0 ; i < tokenList.size() ; i++) {
                System.out.println(String.format("[%2d] %s", i, tokenList.get(i)));
            }
        }
    }
}
