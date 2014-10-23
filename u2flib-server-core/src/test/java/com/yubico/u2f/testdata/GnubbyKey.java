package com.yubico.u2f.testdata;

import com.yubico.u2f.TestUtils;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;

import static com.yubico.u2f.TestUtils.fetchCertificate;


public class GnubbyKey {

  public static final X509Certificate ATTESTATION_CERTIFICATE =
          fetchCertificate(GnubbyKey.class.getResourceAsStream("gnubby/attestation-certificate.der"));

  public static final PrivateKey ATTESTATION_CERTIFICATE_PRIVATE_KEY =
          TestUtils.parsePrivateKey(GnubbyKey.class.getResourceAsStream("gnubby/attestation-certificate-private-key.hex"));
}
