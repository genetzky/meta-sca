SUMMARY = "Flake8 plugin to find commented out or dead code"
HOMEPAGE = "https://github.com/sobolevn/flake8-eradicate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

DEPENDS += "\
    nativesdk-python3-attrs \
    nativesdk-python3-eradicate \
    nativesdk-python3-flake8 \
"

PYPI_PACKAGE = "flake8-eradicate"

SRC_URI[md5sum] = "be32bf9be80c8b06a8088e3e5d82ea78"
SRC_URI[sha256sum] = "acaa1b6839ff00d284b805c432fdfa6047262bd15a5504ec945797e87b4de1fa"

inherit pypi
inherit setuptools3
inherit nativesdk
