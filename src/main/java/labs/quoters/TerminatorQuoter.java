package labs.quoters;

import javax.annotation.PostConstruct;

/**
 * Created by khudyntsev on 24.07.2014.
 */
@Profiling
@DeprecatedClass(newImpl = T100.class)
public class TerminatorQuoter implements Quoter {
    //@InjectRandomInt(min = 2, max = 7)
    private int repeat;

    @PostConstruct
    public void init(){
        System.out.println("Init");
    }

    public TerminatorQuoter(){
        System.out.println("Constructor");
    }

    private String message;

    @Override
    @PostConstruct
    @PostProxy
    public void sayQuote() {
        System.out.println("message " + message);
        for (int i = 0; i < repeat; i++) {
            System.out.println("message " + i + " = " + message);
            
        }
        //System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
