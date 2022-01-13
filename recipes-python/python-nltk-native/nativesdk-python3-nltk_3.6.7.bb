SUMMARY = "Natural Language Toolkit"
HOMEPAGE = "https://github.com/nltk/nltk"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d273d63619c9aeaf15cdaf76422c4f87"

DEPENDS += "\
    nativesdk-python3-click \
    nativesdk-python3-joblib \
    nativesdk-python3-regex \
    nativesdk-python3-tqdm \
"

PYPI_PACKAGE = "nltk"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "eaf0a922f6142533b3417f4e29ad83ba"
SRC_URI[sha256sum] = "51bf1aef5304740a708be7c8e683f7798f03dc5c7a7e7feb758be9e95f4585e3"

inherit pypi
inherit setuptools3
inherit nativesdk

do_install:append() {
  # delete pydoc reference
  find ${D} -type f -exec sed -i '/import pydoc/d' {} \;
}