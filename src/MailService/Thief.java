package MailService;

public class Thief implements MailService {
    private int minPrice = 0;
    private int stolenValue = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage mailPackage) {
            if (mailPackage.getContent().getPrice() > minPrice) {
                this.stolenValue += mailPackage.getContent().getPrice();
                return new MailPackage(mail.getFrom(), mailPackage.getTo(),
                        new Package("stones instead of " + mailPackage.getContent().getContent(), 0));
            }
        }
        return mail;
    }
}
