SUMMARY = "NPM: sshpk"
DESCRIPTION = "A library for finding and using SSH public keys"
HOMEPAGE = "https://github.com/arekinath/node-sshpk#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc"

DEPENDS = "\
    nativesdk-npm-asn1 \
    nativesdk-npm-assert-plus \
    nativesdk-npm-bcrypt-pbkdf \
    nativesdk-npm-dashdash \
    nativesdk-npm-ecc-jsbn \
    nativesdk-npm-getpass \
    nativesdk-npm-jsbn \
    nativesdk-npm-safer-buffer \
    nativesdk-npm-tweetnacl \
"

SRC_URI = "https://registry.npmjs.org/sshpk/-/sshpk-1.17.0.tgz"
SRC_URI[md5sum] = "6f2452a859ddec68aafd428c65966989"
SRC_URI[sha256sum] = "7bab3838aba6583c53caa391c970a0a7595913401bfd284c0451aa8e040158f2"

NPM_PKGNAME = "sshpk"

inherit npmhelper
inherit nativesdk
