package MailService;

public class UntrustworthyMailWorker implements MailService {

    private final RealMailService realMailService = new RealMailService();
    private final MailService[] thirdPartyMembers;

    public UntrustworthyMailWorker(final MailService[] thirdPartyMembers) {
        this.thirdPartyMembers = thirdPartyMembers;
    }

    public MailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService member : thirdPartyMembers) {
            mail = member.processMail(mail);
        }
        return realMailService.processMail(mail);
    }
}

