package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    @Autowired
    Duck5 dick;

    @Override
    public String toString() {
        return ", в зайце утка " + dick.toString();
    }
}
