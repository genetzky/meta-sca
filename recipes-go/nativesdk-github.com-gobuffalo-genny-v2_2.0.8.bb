SUMMARY = "go.mod: github.com/gobuffalo/genny/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/genny/v2"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-genny-v2-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-gobuffalo-logger \
    nativesdk-github.com-gobuffalo-packd \
    nativesdk-github.com-gobuffalo-plush-v4 \
    nativesdk-github.com-markbates-oncer \
    nativesdk-github.com-markbates-safe \
    nativesdk-github.com-sirupsen-logrus \
    nativesdk-golang.org-x-tools \
"
GO_IMPORT = "github.com/gobuffalo/genny/v2"
inherit gosrc
inherit nativesdk
