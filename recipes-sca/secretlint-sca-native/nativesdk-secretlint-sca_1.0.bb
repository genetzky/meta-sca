SUMMARY = "sca definition for secretlint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
    nativesdk-npm-secretlint \
    nativesdk-npm-secretlint-secretlint-rule-no-dotenv \
    nativesdk-npm-secretlint-secretlint-rule-no-homedir \
    nativesdk-npm-secretlint-secretlint-rule-no-k8s-kind-secret \
    nativesdk-npm-secretlint-secretlint-rule-preset-recommend \
    nativesdk-npm-secretlint-secretlint-rule-secp256k1-privatekey \
"
inherit sca-description
inherit nativesdk
SCA_TOOL_DESCRIPTION = "secretlint"
