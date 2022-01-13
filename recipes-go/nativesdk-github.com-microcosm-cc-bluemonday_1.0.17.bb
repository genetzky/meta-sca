SUMMARY = "go.mod: github.com/microcosm-cc/bluemonday"
HOMEPAGE = "https://pkg.go.dev/github.com/microcosm-cc/bluemonday"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-microcosm-cc-bluemonday-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-aymerick-douceur \
    nativesdk-golang.org-x-net \
"
GO_IMPORT = "github.com/microcosm-cc/bluemonday"
inherit gosrc
inherit nativesdk
