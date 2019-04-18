package genericityFactory;

public class GeneratorBelt extends Belt {
    public static class Factory implements genericityFactory.Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
