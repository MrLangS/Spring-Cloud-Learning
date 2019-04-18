package genericityFactory;

public class AirFilter extends Filter {
    public static class Factory implements genericityFactory.Factory<AirFilter> {
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
