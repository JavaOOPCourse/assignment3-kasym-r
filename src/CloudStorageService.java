public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    private boolean isPremium;

    public CloudStorageService(String name, int id) {
        super(name, id);
        isPremium = false;
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println("Cloud Storage Service is inactive");
        }
        System.out.println("Cloud Storage is accessed");
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println("Cloud Storage Service is upgraded to Premium!");
    }

    @Override
    public void generateBill() {
        System.out.println("Bill for cloud storage service >>> 10$");
    }
}