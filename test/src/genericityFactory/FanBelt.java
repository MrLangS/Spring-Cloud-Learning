package genericityFactory;

public class FanBelt extends Part {
    public static class Factory implements genericityFactory.Factory<FanBelt> {
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
