SUMMARY = "NPM: request"
DESCRIPTION = "Simplified HTTP request client."
HOMEPAGE = "https://github.com/request/request#readme"

DEPENDS = "\
    nativesdk-npm-aws-sign2 \
    nativesdk-npm-aws4 \
    nativesdk-npm-caseless \
    nativesdk-npm-combined-stream \
    nativesdk-npm-extend \
    nativesdk-npm-forever-agent \
    nativesdk-npm-form-data \
    nativesdk-npm-har-validator \
    nativesdk-npm-http-signature \
    nativesdk-npm-is-typedarray \
    nativesdk-npm-isstream \
    nativesdk-npm-json-stringify-safe \
    nativesdk-npm-mime-types \
    nativesdk-npm-oauth-sign \
    nativesdk-npm-performance-now \
    nativesdk-npm-qs \
    nativesdk-npm-safe-buffer \
    nativesdk-npm-tough-cookie \
    nativesdk-npm-tunnel-agent \
    nativesdk-npm-uuid \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3f8ead5440d1c311b45be065d135d90"

SRC_URI = "https://registry.npmjs.org/request/-/request-2.88.2.tgz"
SRC_URI[md5sum] = "cd83737d819423733fc3fcc875093f10"
SRC_URI[sha256sum] = "e86dae884084b90a300096972f5954c815ebe5877c590df7fd170e8b71724242"

NPM_PKGNAME = "request"

inherit npmhelper
inherit nativesdk
