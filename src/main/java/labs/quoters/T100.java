package labs.quoters;

import javax.annotation.PostConstruct;

/**
 * Created by khudyntsev on 30.07.2014.
 */
public class T100 extends TerminatorQuoter {
    @Override
    @PostConstruct
    public void sayQuote() {
        System.out.println("Я жидкий");
    }
}
