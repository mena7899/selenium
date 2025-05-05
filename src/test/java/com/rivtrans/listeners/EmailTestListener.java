////inactive
//
//package com.rivtrans.listeners;
//
//import org.testng.ISuite;
//import org.testng.ISuiteListener;
//
//import java.io.File;
//import java.security.cert.X509Certificate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//import jakarta.mail.*;
//import jakarta.mail.internet.*;
//import java.util.Properties;
//
//import javax.net.ssl.*;
//
//public class EmailTestListener implements ISuiteListener {
//
//    @Override
//    public void onStart(ISuite suite) {
//        System.out.println("Test Suite started: " + suite.getName());
//    }
//
//    @Override
//    public void onFinish(ISuite suite) {
//        System.out.println("Test Suite finished: " + suite.getName());
//
//        // Path to screenshots directory
//        String screenshotDirPath = System.getProperty("user.dir") + "/resources/screenshots";
//        File screenshotDir = new File(screenshotDirPath);
//
//        // Check if folder exists and has files
//        File[] screenshots = screenshotDir.listFiles((dir, name) -> name.endsWith(".png") || name.endsWith(".jpg") || name.endsWith(".jpeg"));
//        if (screenshots != null && screenshots.length > 0) {
//            sendEmailWithAttachments(screenshots);
//        } else {
//            System.out.println("No screenshots found. Email will not be sent.");
//        }
//    }
//
//    private void sendEmailWithAttachments(File[] attachments) {
//        try {
//            // Trust all SSL certificates (not recommended for production)
//            TrustManager[] trustAllCertificates = new TrustManager[]{
//                new X509TrustManager() {
//                    public X509Certificate[] getAcceptedIssuers() { return null; }
//                    public void checkClientTrusted(X509Certificate[] certs, String authType) {}
//                    public void checkServerTrusted(X509Certificate[] certs, String authType) {}
//                }
//            };
//
//            SSLContext sc = SSLContext.getInstance("TLS");
//            sc.init(null, trustAllCertificates, new java.security.SecureRandom());
//            SSLSocketFactory sslSocketFactory = sc.getSocketFactory();
//
//            // Email credentials
//            final String username = "melias@isfpdomain.com";
//            final String password = ""; // Use a secure method for storing this
//            
//            // Format current time
//            LocalDateTime now = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//            String formattedDateTime = now.format(formatter);
//
//            // SMTP properties
//            Properties props = new Properties();
//            props.put("mail.smtp.auth", "true");
//            props.put("mail.smtp.starttls.enable", "true");
//            props.put("mail.smtp.host", "mail.isfpegypt.com");
//            props.put("mail.smtp.port", "587");
//            props.put("mail.smtp.ssl.socketFactory", sslSocketFactory);
//            props.put("mail.smtp.ssl.protocols", "TLSv1.2");
//
//            // Create session
//            Session session = Session.getInstance(props,
//                new Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//            session.setDebug(true); // Optional: helpful to debug TLS handshake
//
//            // Compose message
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("melias@isfpegypt.com"));
//            message.setRecipients(Message.RecipientType.TO,
//                    InternetAddress.parse("melias@isfpegypt.com"));
//
//
//            // Set subject
//            message.setSubject("Bug Screenshots - " + formattedDateTime);
//
//            // Body part
//            BodyPart messageBodyPart = new MimeBodyPart();
//            messageBodyPart.setText("THIS IS AN AUTOMATED EMAIL DO NOT REPLY\nPlease find the attached bug screenshots.");
//
//            // Combine all parts
//            Multipart multipart = new MimeMultipart();
//            multipart.addBodyPart(messageBodyPart);
//
//            // Add attachments
//            for (File file : attachments) {
//                MimeBodyPart attachPart = new MimeBodyPart();
//                attachPart.attachFile(file);
//                multipart.addBodyPart(attachPart);
//            }
//
//            message.setContent(multipart);
//
//            // Send email
//            Transport.send(message);
//            System.out.println("Email sent successfully with screenshots.");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
