public class ConsultationService extends Service
        implements Billable {

    public ConsultationService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println("Consultation is inactive now.");
        }
        System.out.println("Consultation is being used...");
    }

    @Override
    public void generateBill() {
        System.out.println("Bill for consultation service >>> 5$");

    }
}