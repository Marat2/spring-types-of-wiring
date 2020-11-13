package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    Deth8 deth;

    @Autowired
    public Egg6(Deth8 deth) {
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + deth.toString();
    }
}
