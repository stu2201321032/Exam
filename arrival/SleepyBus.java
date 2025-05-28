package arrival;

public class SleepyBus implements ArrivalStrategy {
    @Override
    public String arrive() {
        return "след спане в автобус!";
    }
}
