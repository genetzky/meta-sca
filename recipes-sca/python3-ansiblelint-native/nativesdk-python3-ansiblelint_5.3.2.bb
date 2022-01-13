SUMMARY = "Checks playbooks for practices and behaviour that could potentially be improved"
HOMEPAGE = "https://github.com/ansible/ansible-lint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27006a41205763794866943ed14d2493"

DEPENDS += "\
    nativesdk-python3-ansible \
    nativesdk-python3-bcrypt \
    nativesdk-python3-cryptography \
    nativesdk-python3-enrich \
    nativesdk-python3-packaging \
    nativesdk-python3-paramiko \
    nativesdk-python3-pathlib2 \
    nativesdk-python3-pyasn1 \
    nativesdk-python3-pynacl \
    nativesdk-python3-pyyaml \
    nativesdk-python3-rich \
    nativesdk-python3-ruamelyaml \
    nativesdk-python3-ruamelyamlcli \
    nativesdk-python3-scandir \
    nativesdk-python3-setuptools-scm-git-archive \
    nativesdk-python3-six \
    nativesdk-python3-tenacity \
    nativesdk-python3-wcmatch \
    python3-setuptools-scm-native \
    python3-toml-native \
"

SRC_URI[sha256sum] = "9ba886db4c44e59360bc8d668f0beae6193c0a1fcbb9e76127000ca3aced7c28"

PYPI_PACKAGE = "ansible-lint"

inherit pypi

inherit sca-description
inherit sca-setuptools-legacy
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "ansiblelint"
