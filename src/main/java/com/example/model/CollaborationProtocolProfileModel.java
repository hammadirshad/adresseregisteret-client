package com.example.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CollaborationProtocolProfileModel implements Serializable {

    private String name;

    private Integer herId;

    private String cpaId;

    private List<CollaborationProtocolRoleModel> roles;

    private CertificateModel signatureCertificate;

    private CertificateModel encryptionCertificate;
}
