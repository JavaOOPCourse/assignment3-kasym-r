public class StreamingService extends Service
        implements PremiumFeature {

    private boolean isPremium;

    public StreamingService(String name, int id) {
        super(name, id);
        isPremium = false;
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println("Streaming service is inactive!");
        }
        System.out.println("Streaming...");
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println("Streaming service is upgraded to Premium!");
    }
}