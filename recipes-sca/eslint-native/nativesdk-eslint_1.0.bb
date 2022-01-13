SUMMARY = "sca definition for eslint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
    nativesdk-npm-eslint \
    nativesdk-npm-eslint-config-airbnb-base \
    nativesdk-npm-eslint-config-google \
    nativesdk-npm-eslint-config-standard \
    nativesdk-npm-eslint-plugin-array-func \
    nativesdk-npm-eslint-plugin-deprecate \
    nativesdk-npm-eslint-plugin-filenames \
    nativesdk-npm-eslint-plugin-fp \
    nativesdk-npm-eslint-plugin-html \
    nativesdk-npm-eslint-plugin-immutable \
    nativesdk-npm-eslint-plugin-import \
    nativesdk-npm-eslint-plugin-jsx-a11y \
    nativesdk-npm-eslint-plugin-no-loops \
    nativesdk-npm-eslint-plugin-no-secrets \
    nativesdk-npm-eslint-plugin-no-use-extend \
    nativesdk-npm-eslint-plugin-node \
    nativesdk-npm-eslint-plugin-promise \
    nativesdk-npm-eslint-plugin-react \
    nativesdk-npm-eslint-plugin-security \
    nativesdk-npm-eslint-plugin-sql \
    nativesdk-npm-eslint-plugin-standard \
    nativesdk-npm-eslint-plugin-this \
    nativesdk-npm-eslint-plugin-unicorn \
    nativesdk-npm-eslint-plugin-vue \
    nativesdk-npm-eslint-plugin-xss \
    nativesdk-npm-getify-eslint-plugin-proper-arrows \
"

SRC_URI = "file://configs/eslint-plain.json"
inherit sca-description
inherit nativesdk
SCA_TOOL_DESCRIPTION = "eslint"
do_install() {
    install -d ${D}/${datadir}/eslint/configs
    for _f in ${WORKDIR}/configs/*; do
        install ${_f} ${D}/${datadir}/eslint/configs/
    done
}
