package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    @Autowired
    private Egg6 e;

    public Duck5(Egg6 e) {
        this.e = e;
    }


    @Override
    public String toString() {
        return ", в утке яйцо " + e.toString();
    }
}
