SUMMARY = "Python type inferencer"
HOMEPAGE = "https://google.github.io/pytype/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a2cfaba162d74b289e2cac209dfa88"

DEPENDS += "\
    cmake-native \
    nativesdk-python3-attrs \
    nativesdk-python3-importlab \
    nativesdk-python3-libcst \
    nativesdk-python3-ninja \
    nativesdk-python3-pybind11 \
    nativesdk-python3-pylint \
    nativesdk-python3-pyyaml \
    nativesdk-python3-six \
    nativesdk-python3-tabulate \
    nativesdk-python3-typed-ast \
    python3-scikit-build-native \
"

SRC_URI[md5sum] = "9b9a606e2f6538f749bfffd24386f338"
SRC_URI[sha256sum] = "c824d09dd463165ee47dd78f7ca30941353c2095361aadb57165c4211c148901"

PYPI_PACKAGE = "pytype"

inherit pypi
inherit sca-description
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "pytype"
do_configure:prepend() {
    sed -i "/ninja/d" ${S}/setup.cfg
}
