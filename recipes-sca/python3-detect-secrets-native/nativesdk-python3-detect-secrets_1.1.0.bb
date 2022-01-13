SUMMARY = "An enterprise friendly way of detecting and preventing secrets in code"
HOMEPAGE = "https://github.com/Yelp/detect-secrets"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c3c8615794b2f159ecd80b4c32f2f8f"

DEPENDS += "\
    nativesdk-python3 \
    nativesdk-python3-pyyaml \
    nativesdk-python3-requests \
"

SRC_URI = "git://github.com/Yelp/detect-secrets.git;branch=master;protocol=https"
SRCREV = "d7803997edac16c09d8cfe7a9c30305dada392ff"
S = "${WORKDIR}/git"
inherit sca-description
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "detectsecrets"
do_install:append() {
    # Remove the requests from the requires.txt, as this isn't working
    # for whatever reasons, no matter if requests is available or not
    find ${D} -name "requires.txt" -exec sed -i "/requests/d" {} +
}
