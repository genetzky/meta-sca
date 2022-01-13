SUMMARY = "Safety checks your installed dependencies for known security vulnerabilities"
HOMEPAGE = "https://github.com/pyupio/safety"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=558baaefeb02113f2331ea2fd536fa86"

DEPENDS += "\
    nativesdk-python3-click \
    nativesdk-python3-dparse \
    nativesdk-python3-packaging \
    nativesdk-python3-pyparsing \
    nativesdk-python3-requests \
    python3-toml-native \
"

SRC_URI[md5sum] = "d3fcda6267ed49ad8786699b08cd69ef"
SRC_URI[sha256sum] = "30e394d02a20ac49b7f65292d19d38fa927a8f9582cdfd3ad1adbbc66c641ad5"

PYPI_PACKAGE = "safety"

inherit pypi

inherit sca-description
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "safety"
