package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    Egg6 eggs;

    @Autowired
    public void setEggs(Egg6 eggs) {
        this.eggs = eggs;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + eggs.toString();
    }
}
