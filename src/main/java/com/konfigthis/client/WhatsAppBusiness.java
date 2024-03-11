package com.konfigthis.client;

import com.konfigthis.client.api.ApplicationApi;
import com.konfigthis.client.api.BackupRestoreApi;
import com.konfigthis.client.api.BusinessProfileApi;
import com.konfigthis.client.api.CertificatesApi;
import com.konfigthis.client.api.ContactsApi;
import com.konfigthis.client.api.GroupsApi;
import com.konfigthis.client.api.HealthApi;
import com.konfigthis.client.api.MediaApi;
import com.konfigthis.client.api.MessagesApi;
import com.konfigthis.client.api.ProfileApi;
import com.konfigthis.client.api.RegistrationApi;
import com.konfigthis.client.api.TwoStepVerificationApi;
import com.konfigthis.client.api.UsersApi;

public class WhatsAppBusiness {
    private ApiClient apiClient;
    public final ApplicationApi application;
    public final BackupRestoreApi backupRestore;
    public final BusinessProfileApi businessProfile;
    public final CertificatesApi certificates;
    public final ContactsApi contacts;
    public final GroupsApi groups;
    public final HealthApi health;
    public final MediaApi media;
    public final MessagesApi messages;
    public final ProfileApi profile;
    public final RegistrationApi registration;
    public final TwoStepVerificationApi twoStepVerification;
    public final UsersApi users;

    public WhatsAppBusiness() {
        this(null);
    }

    public WhatsAppBusiness(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.application = new ApplicationApi(this.apiClient);
        this.backupRestore = new BackupRestoreApi(this.apiClient);
        this.businessProfile = new BusinessProfileApi(this.apiClient);
        this.certificates = new CertificatesApi(this.apiClient);
        this.contacts = new ContactsApi(this.apiClient);
        this.groups = new GroupsApi(this.apiClient);
        this.health = new HealthApi(this.apiClient);
        this.media = new MediaApi(this.apiClient);
        this.messages = new MessagesApi(this.apiClient);
        this.profile = new ProfileApi(this.apiClient);
        this.registration = new RegistrationApi(this.apiClient);
        this.twoStepVerification = new TwoStepVerificationApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
    }

}
