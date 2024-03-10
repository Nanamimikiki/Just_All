package MailService;

import static MailService.Main.BANNED_SUBSTANCE;
import static MailService.Main.WEAPONS;

public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage mailPackage) {
            if (mailPackage.getContent().getContent().contains(WEAPONS) || mailPackage.getContent().getContent().contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            } else if (mailPackage.getContent().getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
