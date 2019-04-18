package genericityFactory;

public class FuelFilter extends Filter {
    public static class Factory implements genericityFactory.Factory<FuelFilter>{
        public FuelFilter create(){
            return new FuelFilter();
        }
    }
}
