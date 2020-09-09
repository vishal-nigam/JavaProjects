package com.vishalnigam.googledrive;

public class PlusServiceAccountSample {

//
//        private static final String APPLICATION_NAME = "";
//
//        /**
//         * E-mail address of the service account.
//         */
//        private static final String SERVICE_ACCOUNT_EMAIL = "XXXXXXXX@developer.gserviceaccount.com";
//
//        /**
//         * Global instance of the HTTP transport.
//         */
//        private static HttpTransport httpTransport;
//
//        /**
//         * Global instance of the JSON factory.
//         */
//        private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
//
//
//        public static void main(String[] args) {
//                try {
//                        try {
//                                httpTransport = GoogleNetHttpTransport.newTrustedTransport();
//                                // check for valid setup
//                                if (SERVICE_ACCOUNT_EMAIL.startsWith("Enter ")) {
//                                        System.err.println(SERVICE_ACCOUNT_EMAIL);
//                                        System.exit(1);
//                                }
//                                String p12Content = Files.readFirstLine(new File("XXXXX-privatekey.p12"), Charset.defaultCharset());
//                                if (p12Content.startsWith("Please")) {
//                                        System.err.println(p12Content);
//                                        System.exit(1);
//                                }
//                                // service account credential (uncomment setServiceAccountUser for domain-wide delegation)
//                                GoogleCredential credential = new GoogleCredential.Builder().setTransport(httpTransport)
//                                        .setJsonFactory(JSON_FACTORY)
//                                        .setServiceAccountId(SERVICE_ACCOUNT_EMAIL)
//                                        .setServiceAccountScopes(Collections.singleton(DriveScopes.DRIVE))
//                                        .setServiceAccountPrivateKeyFromP12File(new File("XXXXXXXX-privatekey.p12"))
//
//                                        .build();
//
//
//                                Drive service = new Drive.Builder(httpTransport, JSON_FACTORY, credential).build();
//
//                                com.google.api.services.drive.model.File file = new com.google.api.services.drive.model.File();
//                                file.setTitle("testdd");
//                                file.setMimeType("application/vnd.google-apps.spreadsheet");
//                                Drive.Files.Insert insert = null;
//                                try {
//                                        insert = service.files().create(file);
//                                        file = insert.execute();
//
//
//                                } catch (Exception e) {
//                                        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//                                }
//
//                                com.google.api.services.drive.model.File uploadedDoc = service.files().get("1ZJnkgFXAiUNSBeq3DmhHGqXn7-v37vLg1UsRekRQNjU").execute();
//
//                                System.out.println("Title: " + uploadedDoc.getTitle());
//
//
//                                return;
//                        } catch (IOException e) {
//                                System.err.println(e.getMessage());
//                        }
//                } catch (Throwable t) {
//                        t.printStackTrace();
//                }
//                System.exit(1);
//        }
}