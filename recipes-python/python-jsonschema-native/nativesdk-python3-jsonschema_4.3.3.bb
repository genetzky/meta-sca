SUMMARY = "An(other) implementation of JSON Schema for Python"
HOMEPAGE = "https://github.com/Julian/jsonschema"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7a60a81c146ec25599a3e1dabb8610a8"

DEPENDS += "\
    nativesdk-python3-attrs \
    nativesdk-python3-importlib-metadata \
    nativesdk-python3-importlib-resources \
    nativesdk-python3-packaging \
    nativesdk-python3-pyrsistent \
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "jsonschema"

SRC_URI[sha256sum] = "f210d4ce095ed1e8af635d15c8ee79b586f656ab54399ba87b8ab87e5bff0ade"

inherit pypi
inherit setuptools3
inherit sca-setuptools-legacy
inherit nativesdk
