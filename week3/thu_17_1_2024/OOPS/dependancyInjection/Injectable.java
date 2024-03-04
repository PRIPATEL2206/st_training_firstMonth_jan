package dependancyInjection;

// Interface for components that can be injected
interface Injectable {
    void injectDependencies(DependencyContainer container);
}
