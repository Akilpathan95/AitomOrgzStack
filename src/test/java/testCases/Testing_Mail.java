package testCases;

import org.testng.annotations.Test;
import testBase.BaseClass;
import java.util.*;
import javax.mail.*;
import javax.mail.search.SubjectTerm;

public class Testing_Mail extends BaseClass {

    @Test

    public class TempEmail {
        public class ReadEmail {
            public static void main(String[] args) throws Exception {
                String host = "imap.gmail.com";  // IMAP server
                String username = "akilp1995@gmail.com";
                String password = "Naziya@7086"; // App password if 2FA enabled

                Properties properties = new Properties();
                properties.put("mail.store.protocol", "imaps");

                Session session = Session.getDefaultInstance(properties);
                Store store = session.getStore("imaps");
                store.connect(host, username, password);

                Folder inbox = store.getFolder("INBOX");
                inbox.open(Folder.READ_ONLY);

                Message[] messages = inbox.search(new SubjectTerm("Verification Code"));

                for (Message message : messages) {
                    System.out.println("Subject: " + message.getSubject());
                    System.out.println("Content: " + message.getContent());
                }

                inbox.close(false);
                store.close();
            }
        }

    }
}
