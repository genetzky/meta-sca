SUMMARY = "NPM: string.prototype.matchall"
DESCRIPTION = "Spec-compliant polyfill for String.prototype.matchAll"
HOMEPAGE = "https://github.com/es-shims/String.prototype.matchAll#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "\
    nativesdk-npm-call-bind \
    nativesdk-npm-define-properties \
    nativesdk-npm-es-abstract \
    nativesdk-npm-get-intrinsic \
    nativesdk-npm-has-symbols \
    nativesdk-npm-internal-slot \
    nativesdk-npm-regexp.prototype.flags \
    nativesdk-npm-side-channel \
"

SRC_URI = "https://registry.npmjs.org/string.prototype.matchall/-/string.prototype.matchall-4.0.6.tgz"
SRC_URI[md5sum] = "0dd7d7e84ce80babca65f0039022aa49"
SRC_URI[sha256sum] = "61b7acbf07ba29554253806871663a21e6a3b6b295f2937518aab16d3617e36f"

NPM_PKGNAME = "string.prototype.matchall"

inherit npmhelper
inherit nativesdk
